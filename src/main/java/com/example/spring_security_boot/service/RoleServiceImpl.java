package com.example.spring_security_boot.service;


import com.example.spring_security_boot.dao.RoleDAO;
import com.example.spring_security_boot.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService{

    private final RoleDAO roleDAO;

    @Autowired
    public RoleServiceImpl(RoleDAO roleDAO) {
        this.roleDAO = roleDAO;
    }

    @Override
    @Transactional
    public Set<Role> getAllRoles() {
        return roleDAO.getAllRoles();
    }

    @Override
    @Transactional
    public void saveRole(Role role) {
        roleDAO.saveRole(role);
    }

    @Override
    @Transactional
    public Role getRole(String name) {
        return roleDAO.getRole(name);
    }

    @Override
    @Transactional
    public void deleteRole(String name) {
        roleDAO.deleteRole(name);
    }
}