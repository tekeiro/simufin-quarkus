package org.keirobm.simufin.businessLayer.catalog.models

import org.keirobm.simufin.businessLayer.catalog.models.enums.ProductType

data class Product(
    val id: String,
    val type: ProductType,
    val isin: String,
    val name: String,
    val importation: ProductImportationSource
)
