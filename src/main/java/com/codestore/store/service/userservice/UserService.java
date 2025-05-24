package com.codestore.store.service.userservice;

import com.codestore.store.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getAllUsers();
    void deleteUser(Long id);
    UserEntity getUserById(Long id);
    UserEntity createUser(UserEntity user);
}
