package com.example.spring_security_boot.service;

import com.example.spring_security_boot.model.Role;

import java.util.Set;

public interface RoleService {
    public Set<Role> getAllRoles();

    public void saveRole(Role role);

    public Role getRole(String name);

    public void deleteRole(String name);
}