package io.github.t3m8ch.mongospringtodolist

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MongoSpringTodolistApplication

fun main(args: Array<String>) {
    runApplication<MongoSpringTodolistApplication>(*args)
}
