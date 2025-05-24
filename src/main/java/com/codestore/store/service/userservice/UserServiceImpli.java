package com.codestore.store.service.userservice;

import com.codestore.store.entity.UserEntity;
import com.codestore.store.repository.UserRepository;
import jakarta.persistence.Entity;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpli implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpli(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    @Override
    public UserEntity getUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }

    public UserEntity createUser(UserEntity user){
        return userRepository.save(user);
    }

}
