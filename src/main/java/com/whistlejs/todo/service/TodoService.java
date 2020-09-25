package com.whistlejs.todo.service;

import com.whistlejs.todo.model.entity.TodoEntity;
import com.whistlejs.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {
    @Autowired
    TodoRepository repository;

    public TodoEntity create(TodoEntity todo) {
        return repository.save(todo);
    }

    public List<TodoEntity> findAll() {
        return repository.findAll().stream()
                .filter(item -> item.getDeletedAt() == null)
                .collect(Collectors.toList());
    }

    public TodoEntity findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoResultException("No result Id : " + id));
    }

    public TodoEntity deleteById(Long id) {
        TodoEntity todo = this.findById(id);
        todo.setDeletedAt(LocalDateTime.now());

        repository.save(todo);

        return todo;
    }
}
