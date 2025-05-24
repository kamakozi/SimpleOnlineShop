package com.codestore.store.service.roleservice;

import com.codestore.store.entity.RoleEntity;
import com.codestore.store.repository.RoleRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpli implements RoleService{

    public final RoleRepository roleRepository;

    public RoleServiceImpli(RoleRepository roleRepository){
        this.roleRepository = roleRepository;
    }

    @Override
    public List<RoleEntity>getAllRoles(){
        return roleRepository.findAll();
    }
    @Override
    public RoleEntity addRole(RoleEntity role){
        return roleRepository.save(role);
    }
    @Override
    public void deleteRole(Long id){
        roleRepository.deleteById(id);
    }
}
