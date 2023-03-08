package com.example.Todo.TodoApp.Service;

import com.example.Todo.TodoApp.Model.Todo;
import com.example.Todo.TodoApp.exception.RecordNotFound;
import com.example.Todo.TodoApp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoService {
//    private static List<Todo> todos = new ArrayList<>();
    @Autowired
    TodoRepository todoRepository;
    public List<Todo> findAll(){
        return todoRepository.findAll();
    }

    public Todo findbyid(int id) {
        Todo todo = todoRepository.findById(id).get();
            return todo;
    }

    public void addTodo(Todo todo){
        todoRepository.save(todo);
    }

    public void deletetodo(int id){
      todoRepository.deleteById(id);
    }

    public void updatetodo(int id , Todo newtodo){
        Todo todo = todoRepository.findById(id).get();
        todo.setId(newtodo.getId());
        todo.setStatus(newtodo.getStatus());
        todo.setTitle(newtodo.getTitle());
        todoRepository.save(todo);
    }

}
