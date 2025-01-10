package com.universalbackend.core

import java.util.*

abstract class AbstractCRUDService<T : Any, ID : Any>(
    private val repository: AbstractCRUDRepository<T, ID>
) {
    fun findAll(): List<T> = repository.findAll()

    fun findById(id: ID): Optional<T> = repository.findById(id)

    fun save(entity: T): T = repository.save(entity)

    fun deleteById(id: ID) = repository.deleteById(id)
}
