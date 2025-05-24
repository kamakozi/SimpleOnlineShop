package com.codestore.store.Controller.rolecontroller;

import com.codestore.store.entity.RoleEntity;
import com.codestore.store.service.roleservice.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    public final RoleService roleService;

    public RoleController(RoleService roleService){
        this.roleService = roleService;
    }

    @GetMapping
    public List<RoleEntity>getAllRoles(){
        return roleService.getAllRoles();
    }

    @PostMapping()
    public RoleEntity addRole(@RequestBody RoleEntity role){
        return roleService.addRole(role);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Long id) {
        roleService.deleteRole(id);
    }


}
