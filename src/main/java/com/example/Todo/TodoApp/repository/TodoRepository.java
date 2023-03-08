package com.example.Todo.TodoApp.repository;

import com.example.Todo.TodoApp.Model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Integer> {


}
