package dev.stm.taskmanager.service;

import java.util.List;

import dev.stm.taskmanager.model.Role;

public interface RoleService {
    Role createRole(Role role);

    List<Role> findAll();
}
