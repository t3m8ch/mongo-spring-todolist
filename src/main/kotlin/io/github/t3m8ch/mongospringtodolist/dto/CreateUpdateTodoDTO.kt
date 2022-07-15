package io.github.t3m8ch.mongospringtodolist.dto

data class CreateUpdateTodoDTO(
    val text: String,
    val isCompleted: Boolean = false,
)
