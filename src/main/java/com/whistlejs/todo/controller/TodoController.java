package com.whistlejs.todo.controller;

import com.whistlejs.todo.model.entity.TodoEntity;
import com.whistlejs.todo.service.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/todo")
@RestController
public class TodoController {
    @Autowired
    TodoService service;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping
    public ResponseEntity<TodoEntity> create(@RequestBody TodoEntity todo) {
        logger.info(todo.getContent(), todo.getTitle());
        return new ResponseEntity<TodoEntity>(service.create(todo), HttpStatus.OK);
    }
}
