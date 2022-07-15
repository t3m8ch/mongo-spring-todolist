package io.github.t3m8ch.mongospringtodolist.services

import io.github.t3m8ch.mongospringtodolist.dto.CreateUpdateTodoDTO
import io.github.t3m8ch.mongospringtodolist.models.TodoModel
import io.github.t3m8ch.mongospringtodolist.repositories.TodoRepository
import org.springframework.stereotype.Service

interface TodoService {
    fun getAll(): List<TodoModel>
    fun create(todo: CreateUpdateTodoDTO): TodoModel
}

@Service
class TodoServiceImpl(private val todoRepo: TodoRepository) : TodoService {
    override fun getAll() = todoRepo.findAll().toList()
    override fun create(todo: CreateUpdateTodoDTO) = todoRepo.save(
        TodoModel(text = todo.text, isCompleted = todo.isCompleted)
    )
}
