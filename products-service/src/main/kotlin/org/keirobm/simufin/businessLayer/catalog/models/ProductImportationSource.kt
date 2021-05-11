package org.keirobm.simufin.businessLayer.catalog.models

import org.keirobm.simufin.businessLayer.catalog.models.enums.ProductImporterSource
import java.time.ZonedDateTime

data class ProductImportationSource(
    val source: ProductImporterSource,
    val externalId: String,
    val importedAt: ZonedDateTime
)
