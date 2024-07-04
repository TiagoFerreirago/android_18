package com.uninter.aula06project.todo.domain.abstractions

import com.uninter.aula06project.todo.domain.entity.ToDo

interface IToDoMemoryRepository {


    fun add(todo : ToDo): List<ToDo>

    fun getAll() : List<ToDo>

    fun delete(title : String)
}