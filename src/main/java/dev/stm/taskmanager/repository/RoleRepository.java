package dev.stm.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.stm.taskmanager.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByRole(String user);
}
