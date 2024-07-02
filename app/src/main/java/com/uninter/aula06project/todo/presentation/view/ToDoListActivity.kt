package com.uninter.aula06project.todo.presentation.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uninter.aula06project.R
import com.uninter.aula06project.todo.data.repository.ToDoMemoryRepository
import com.uninter.aula06project.todo.domain.entity.ToDo

class ToDoListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_do_list)


        var rcToDoList = findViewById<RecyclerView>(R.id.rcToDo)
        rcToDoList.layoutManager = LinearLayoutManager(this)
        rcToDoList.adapter = ToDoListAdapter(ToDoMemoryRepository.getAll())
    }
}