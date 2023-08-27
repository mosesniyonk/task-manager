package dev.stm.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.stm.taskmanager.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
