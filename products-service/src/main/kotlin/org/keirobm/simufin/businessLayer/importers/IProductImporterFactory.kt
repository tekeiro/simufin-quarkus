package org.keirobm.simufin.businessLayer.importers

import org.keirobm.simufin.businessLayer.catalog.models.enums.ProductImporterSource

/**
 * Factory pattern to retrieve
 * implementation of [IProductImporter]
 */
interface IProductImporterFactory {
    fun of(source: ProductImporterSource): IProductImporter
}
