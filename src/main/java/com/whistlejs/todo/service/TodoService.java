package com.whistlejs.todo.service;

import com.whistlejs.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    TodoRepository repository;
}
