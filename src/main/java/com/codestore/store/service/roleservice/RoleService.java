package com.codestore.store.service.roleservice;

import com.codestore.store.entity.RoleEntity;

import java.util.List;

public interface RoleService {
    List<RoleEntity>getAllRoles();
    RoleEntity addRole(RoleEntity role);
    void deleteRole(Long id);

}
