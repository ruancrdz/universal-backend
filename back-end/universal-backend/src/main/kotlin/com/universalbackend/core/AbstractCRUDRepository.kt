package com.universalbackend.core

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface AbstractCRUDRepository<T, ID> : JpaRepository<T, ID>
