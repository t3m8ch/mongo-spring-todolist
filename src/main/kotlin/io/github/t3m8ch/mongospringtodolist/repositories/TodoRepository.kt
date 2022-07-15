package io.github.t3m8ch.mongospringtodolist.repositories

import io.github.t3m8ch.mongospringtodolist.models.TodoModel
import org.bson.types.ObjectId
import org.springframework.data.repository.CrudRepository

interface TodoRepository : CrudRepository<TodoModel, ObjectId>
