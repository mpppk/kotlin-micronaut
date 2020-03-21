package mn.kotlin.controller

import io.micronaut.http.annotation.*
import mn.kotlin.domain.Board
import mn.kotlin.infra.repository.BoardRepository
import javax.inject.Inject

@Controller("/boards")
class BoardController {
    @Inject
    private lateinit var boardRepository: BoardRepository

    @Get
    fun list(): List<Board> {
        return listOf(Board(id=1, name="test board", description = "test description"))
    }

    @Post
    fun post(@Body board: Board): Board {
        return board.copy(id=1)
    }

    @Get("/{boardId}")
    fun get(@PathVariable boardId: Long): Board {
        val boardEntity = boardRepository.findById(boardId).orElseThrow()
        println(boardEntity)
        return Board(
            id = boardEntity.id,
            name = boardEntity.name,
            description = boardEntity.description
        )
    }

    @Put("/{boardId}")
    fun put(@PathVariable boardId: Long, @Body board: Board): Board {
        return Board(id=boardId, name="test board", description = "test description")
    }

    @Delete("/{boardId}")
    fun delete(@PathVariable boardId: Long): Board {
        return Board(id=boardId, name="test board", description = "test description")
    }
}
