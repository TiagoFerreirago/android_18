package com.uninter.aula06project.todo.presentation.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uninter.aula06project.R
import com.uninter.aula06project.todo.data.repository.ToDoMemoryRepository
import com.uninter.aula06project.todo.domain.entity.ToDo
import com.uninter.aula06project.todo.presentation.viewmodel.ToDoViewModel

class ToDoListActivity : AppCompatActivity() {

    lateinit var rcToDoList :RecyclerView
    val viewModel by lazy{
        ViewModelProvider(this).get(ToDoViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_do_list)

        rcToDoList = findViewById<RecyclerView>(R.id.rcToDo)
//verificar se tem atualização na lista e instancia o load
        viewModel.todos.observe(this){
            rcToDoList.layoutManager = LinearLayoutManager(this)
            rcToDoList.adapter = ToDoListAdapter(it)
        }



    }
}