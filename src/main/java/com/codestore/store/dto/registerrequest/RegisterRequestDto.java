package com.codestore.store.dto.registerrequest;

import lombok.Data;

@Data
public class RegisterRequestDto {
    private String username;
    private String email;
    private String password;
    private String role;
}
