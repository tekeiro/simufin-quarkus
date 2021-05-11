package org.keirobm.simufin.externalConnections.finect.api

data class Response<T>(
    val code: Int,
    val data: T?
)
