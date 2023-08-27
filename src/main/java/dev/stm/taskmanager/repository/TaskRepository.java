package dev.stm.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.stm.taskmanager.model.Task;
import dev.stm.taskmanager.model.User;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByOwnerOrderByDateDesc(User user);
}