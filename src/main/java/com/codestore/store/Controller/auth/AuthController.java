package com.codestore.store.Controller.auth;

import com.codestore.store.dto.registerrequest.RegisterRequestDto;
import com.codestore.store.entity.RoleEntity;
import com.codestore.store.entity.UserEntity;
import com.codestore.store.repository.RoleRepository;
import com.codestore.store.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;
    private final UserRepository userRepository;

    public AuthController(PasswordEncoder passwordEncoder, RoleRepository roleRepository, UserRepository userRepository) {
        this.passwordEncoder = passwordEncoder;
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/register")
    public String showRegisterForm() {
        return "register";
    }

    @PostMapping("/api/auth/register")
    public String registerUser(@ModelAttribute RegisterRequestDto registerDto) {
        UserEntity user = new UserEntity();
        user.setUsername(registerDto.getUsername());
        user.setEmail(registerDto.getEmail());
        user.setPasswordHash(passwordEncoder.encode(registerDto.getPassword()));
        user.setPoints(0);

        RoleEntity defaultRole = roleRepository.findByName("USER").orElseThrow(() -> new RuntimeException("Default role USER not found"));

        user.getRoles().add(defaultRole);

        userRepository.save(user);
        return "redirect:/register?success=true";
    }
}