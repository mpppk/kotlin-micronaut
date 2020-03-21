package mn.kotlin.infra.repository

import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import mn.kotlin.infra.entity.Board

@JdbcRepository(dialect= Dialect.POSTGRES)
interface BoardRepository : CrudRepository<Board, Long> {
    fun find(name: String): Board
}