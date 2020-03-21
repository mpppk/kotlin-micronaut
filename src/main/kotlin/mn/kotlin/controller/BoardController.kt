package mn.kotlin.controller

import io.micronaut.http.annotation.*
import mn.kotlin.domain.Board

@Controller("/boards")
class BoardController {

    @Get
    fun list(): List<Board> {
        return listOf(Board(id=1, name="test board", description = "test description"))
    }

    @Post
    fun post(@Body board: Board): Board {
        return board.copy(id=1)
    }

    @Get("/{boardId}")
    fun get(@PathVariable boardId: Int): Board {
        return Board(id=boardId, name="test board", description = "test description")
    }

    @Put("/{boardId}")
    fun put(@PathVariable boardId: Int, @Body board: Board): Board {
        return Board(id=boardId, name="test board", description = "test description")
    }

    @Delete("/{boardId}")
    fun delete(@PathVariable boardId: Int): Board {
        return Board(id=boardId, name="test board", description = "test description")
    }
}
