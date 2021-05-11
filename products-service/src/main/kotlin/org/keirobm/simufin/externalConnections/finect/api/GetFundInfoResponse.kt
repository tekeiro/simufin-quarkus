package org.keirobm.simufin.externalConnections.finect.api

import java.time.ZonedDateTime

data class GetFundInfoResponse(
    val id: String,
    val name: String,
    val available: ZonedDateTime,
    val description: String,
    val isin: String
)
