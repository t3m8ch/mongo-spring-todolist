package io.github.t3m8ch.mongospringtodolist.controllers

import io.github.t3m8ch.mongospringtodolist.dto.CreateUpdateTodoDTO
import io.github.t3m8ch.mongospringtodolist.services.TodoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("todos")
class TodoController(private val todoService: TodoService) {
    @GetMapping
    fun getAll() = todoService.getAll()

    @PostMapping
    fun create(@RequestBody todo: CreateUpdateTodoDTO) = todoService.create(todo)
}
