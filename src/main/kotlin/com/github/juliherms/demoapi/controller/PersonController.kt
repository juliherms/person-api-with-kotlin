package com.github.juliherms.demoapi.controller

import com.github.juliherms.demoapi.domain.Person
import com.github.juliherms.demoapi.repository.PersonRepository
import org.springframework.web.bind.annotation.*

/**
 * This class responsible to provide Person endpoint
 */
@RestController
@RequestMapping("/persons")
class PersonControlle(private val repository: PersonRepository) {

    @GetMapping("/{id}")
    fun findById(@PathVariable id:Int): Person? = repository.findById(id)

    @GetMapping
    fun findAll(): MutableList<Person> = repository.findAll()

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int) = repository.delete(id)

    @PutMapping
    fun update(@RequestBody person: Person) = repository.update(person)

    @PostMapping
    fun add(@RequestBody person: Person) = repository.add(person)
}