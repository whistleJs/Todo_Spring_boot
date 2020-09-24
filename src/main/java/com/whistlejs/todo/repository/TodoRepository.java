package com.whistlejs.todo.repository;

import com.whistlejs.todo.model.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
}
