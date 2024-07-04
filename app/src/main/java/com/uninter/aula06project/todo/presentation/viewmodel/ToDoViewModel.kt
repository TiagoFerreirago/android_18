package com.uninter.aula06project.todo.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.uninter.aula06project.todo.domain.entity.ToDo
import com.uninter.aula06project.todo.domain.usecase.ToDoUseCase
import com.uninter.aula06project.todo.domain.usecase.interfaces.IToDoUseCase

class ToDoViewModel : ViewModel() {

    private val useCase : IToDoUseCase = ToDoUseCase();//conectando com o usecase
    var todos = MutableLiveData<List<ToDo>>();//atualiza a lista de forma dinamica



    init{
        Thread(Runnable {    LoadTodo(); }).start()// o método e atualizado em tempo real sem travar a tela

    }
    fun LoadTodo(){
        todos.postValue(useCase.getAll())// esta carregando a lista

    }
//pegando a lista de toDoo e adicionando um novo item no layout
    fun addToDo(){
        var todo =  (ToDo("Novo Item", false));
        todos.postValue(useCase.add(todo));//esta inserindo um objeto ToDoo e retornando uma lista na tela
    }
}