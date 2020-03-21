package mn.kotlin.infra.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Board(
    @Id
    @GeneratedValue
    val id: Long,
    val name: String,
    val description: String
)
