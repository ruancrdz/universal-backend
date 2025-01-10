package com.universalbackend.modules.client.repository

import com.universalbackend.core.AbstractCRUDRepository
import com.universalbackend.modules.client.domain.Client
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository : AbstractCRUDRepository<Client, Long>
