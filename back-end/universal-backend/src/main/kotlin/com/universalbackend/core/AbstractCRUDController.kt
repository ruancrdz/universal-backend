package com.universalbackend.core

import com.universalbackend.common.ApiResponse
import com.universalbackend.common.ErrorMessages
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.responses.ApiResponse as SwaggerResponse
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Tag(name = "CRUD Operations", description = "Operações básicas de CRUD")
abstract class AbstractCRUDController<T : Any, ID : Any>(
    private val service: AbstractCRUDService<T, ID>
) {

    @Operation(
        summary = "Recuperar todos os registros",
        description = "Retorna uma lista de todos os registros disponíveis.",
        responses = [
            SwaggerResponse(responseCode = "200", description = "Lista recuperada com sucesso"),
            SwaggerResponse(responseCode = "500", description = "Erro interno no servidor", content = [Content()])
        ]
    )
    @GetMapping
    fun getAll(): ResponseEntity<ApiResponse<List<T>>> {
        val data = service.findAll()
        return ResponseEntity.ok(ApiResponse(success = true, data = data))
    }

    @Operation(
        summary = "Recuperar registro por ID",
        description = "Retorna um registro específico com base no ID fornecido.",
        responses = [
            SwaggerResponse(
                responseCode = "200",
                description = "Registro encontrado",
                content = [Content(mediaType = "application/json")]
            ),
            SwaggerResponse(responseCode = "404", description = "Registro não encontrado", content = [Content()])
        ]
    )
    @GetMapping("/{id}")
    fun getById(@PathVariable id: ID): ResponseEntity<ApiResponse<T>> {
        val result = service.findById(id)
        return if (result.isPresent) {
            ResponseEntity.ok(ApiResponse(success = true, data = result.get()))
        } else {
            ResponseEntity.status(404).body(ApiResponse(success = false, message = ErrorMessages.ENTITY_NOT_FOUND))
        }
    }

    @Operation(
        summary = "Criar novo registro",
        description = "Cria um novo registro com os dados fornecidos.",
        responses = [
            SwaggerResponse(
                responseCode = "201",
                description = "Registro criado com sucesso",
                content = [Content(mediaType = "application/json")]
            ),
            SwaggerResponse(responseCode = "400", description = "Requisição inválida", content = [Content()])
        ]
    )
    @PostMapping
    fun create(@RequestBody entity: T): ResponseEntity<ApiResponse<T>> {
        val savedEntity = service.save(entity)
        return ResponseEntity.status(201).body(ApiResponse(success = true, data = savedEntity))
    }

    @Operation(
        summary = "Atualizar registro por ID",
        description = "Atualiza os dados de um registro existente com base no ID fornecido.",
        responses = [
            SwaggerResponse(
                responseCode = "200",
                description = "Registro atualizado com sucesso",
                content = [Content(mediaType = "application/json")]
            ),
            SwaggerResponse(responseCode = "404", description = "Registro não encontrado", content = [Content()])
        ]
    )
    @PutMapping("/{id}")
    fun update(@PathVariable id: ID, @RequestBody entity: T): ResponseEntity<ApiResponse<T>> {
        val existingEntity = service.findById(id)
        return if (existingEntity.isPresent) {
            val updatedEntity = service.save(entity)
            ResponseEntity.ok(ApiResponse(success = true, data = updatedEntity))
        } else {
            ResponseEntity.status(404).body(ApiResponse(success = false, message = ErrorMessages.ENTITY_NOT_FOUND))
        }
    }

    @Operation(
        summary = "Excluir registro por ID",
        description = "Exclui um registro com base no ID fornecido.",
        responses = [
            SwaggerResponse(responseCode = "200", description = "Registro excluído com sucesso"),
            SwaggerResponse(responseCode = "404", description = "Registro não encontrado", content = [Content()])
        ]
    )
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: ID): ResponseEntity<ApiResponse<Void>> {
        return if (service.findById(id).isPresent) {
            service.deleteById(id)
            ResponseEntity.ok(ApiResponse(success = true, message = "Entity deleted successfully"))
        } else {
            ResponseEntity.status(404).body(ApiResponse(success = false, message = ErrorMessages.ENTITY_NOT_FOUND))
        }
    }
}
