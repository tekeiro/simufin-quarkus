package org.keirobm.simufin.businessLayer.importers

import org.keirobm.simufin.businessLayer.catalog.models.Product
import org.keirobm.simufin.businessLayer.catalog.models.enums.ProductImporterSource
import java.math.BigDecimal
import java.time.LocalDate
import java.util.*

/**
 * Service to retrieve a [org.keirobm.simufin.businessLayer.catalog.models.Product]
 * from an external source
 */
interface IProductImporter {

    val source: ProductImporterSource

    /**
     * Import [Product] information
     * by [isin]
     */
    fun importProductInfo(isin: String): Product

    /**
     * Retrieve historical values
     * for a [Product] given its [isin]
     * between [from] and [to] date
     */
    fun importHistoricalValues(
        isin: String,
        from: LocalDate, to: LocalDate
    ): SortedMap<LocalDate, BigDecimal>

}
