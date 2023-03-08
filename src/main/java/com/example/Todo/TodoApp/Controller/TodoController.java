package com.example.Todo.TodoApp.Controller;

import com.example.Todo.TodoApp.Model.Todo;
import com.example.Todo.TodoApp.Service.TodoService;
import com.example.Todo.TodoApp.exception.RecordNotFound;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;
@RestController
@RequestMapping("/api/v1/todo-app")
public class TodoController {
    @Autowired
    private TodoService todoService;
    @PostMapping("/add-todo")
    public ResponseEntity<String> createTodo(@RequestBody String todoreq) {
        Todo todo = setTodo(todoreq);
        todoService.addTodo(todo);
        return new ResponseEntity<>("Saved", HttpStatus.CREATED);
    }

    private Todo setTodo(String todoreq) {
        JSONObject json = new JSONObject(todoreq);
        Todo todo = new Todo();
        todo.setTitle(json.getString("title"));
        todo.setStatus(json.getBoolean("status"));
        Timestamp times = new Timestamp(System.currentTimeMillis());
        todo.setDates(times);
        return todo;
    }

    @GetMapping("/find-todo/id/{id}")
    public Todo getTodobyid(@PathVariable String id) {
        return todoService.findbyid(Integer.valueOf(id));

    }
    @GetMapping("/find-all")
    public List<Todo> findAllTodos() {
        return todoService.findAll();

    }
    @PutMapping("/update-todo/id/{id}")
    public void updateTodo(@PathVariable int id , @RequestBody Todo todo){
        todoService.updatetodo(id,todo);

    }
    @DeleteMapping("delete-todo/id/{id}")
    public void deleteTodo(@PathVariable int id){
        todoService.deletetodo(id);
    }

}