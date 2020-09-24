package com.whistlejs.todo.controller;

import com.whistlejs.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/todo")
@RestController
public class TodoController {
    @Autowired
    TodoService service;
}
