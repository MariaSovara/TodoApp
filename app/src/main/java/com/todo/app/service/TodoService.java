package com.todo.app.service;

import com.todo.app.model.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {
    List<Todo> getAllTodo();
    void createTodo(Todo todo);
    Todo getTodoById(Todo todo);
    void updateTodo(Long id, Todo todo);
    void deleteTodo(Long id);

}
