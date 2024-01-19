package com.todo.app.service;

import com.todo.app.model.Todo;
import com.todo.app.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{
    @Autowired
    private TodoRepo todoRepo;

    @Override
    public List<Todo> getAllTodo() {
        return null;
    }

    @Override
    public void createTodo(Todo todo) {

    }

    @Override
    public Todo getTodoById(Todo todo) {
        return null;
    }

    @Override
    public void updateTodo(Long id, Todo todo) {

    }

    @Override
    public void deleteTodo(Long id) {

    }
}
