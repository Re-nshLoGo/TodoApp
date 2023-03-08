package com.example.Todo.TodoApp.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Todo {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
   private int id;

   private String title;

   private Boolean status;
   private Timestamp dates;
}
