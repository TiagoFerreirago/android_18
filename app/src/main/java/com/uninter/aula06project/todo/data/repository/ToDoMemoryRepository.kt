package com.uninter.aula06project.todo.data.repository

import com.uninter.aula06project.todo.domain.entity.ToDo

object ToDoMemoryRepository {

    private var toDoList = listOf(
        ToDo("Harry Potter",true),
        ToDo("Animais Fantasticos e Onde Habitam",true),
        ToDo("Chapeleiro Maluco",false)
    )

    fun add(todo : ToDo)
    {
        toDoList.plus(todo);
    }

    fun  getAll(): List<ToDo>
    {
        return toDoList;
    }
    fun delete(title : String)
    {
        toDoList = toDoList.filter{it -> it.title != title}
    }
}