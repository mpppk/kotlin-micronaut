package mn.kotlin

import io.micronaut.runtime.Micronaut
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Contact
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.info.License

@OpenAPIDefinition(
        info = Info(
                title = "mn-kotlin",
                version = "0.0",
                description = "mn-kotlin api",
                license = License(name = "Apache 2.0", url = "https://github.com/mpppk/mn-kotlin"),
                contact = Contact(url = "https://twitter.com/mpppk", name = "niboshi", email = "niboshiporipori@gmail.com")
        )
)
object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("mn.kotlin")
                .mainClass(Application.javaClass)
                .start()
    }
}