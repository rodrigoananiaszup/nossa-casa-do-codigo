package br.com.zup.autor

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import javax.validation.Valid

@Validated
@Controller("/autores")
class AutorController (val autorRepository: AutorRepository) {

    @Post
    fun cadastra(@Body @Valid request: NovoAutorRequest){
        println( "Requisição => ${request}")

        val autor= request.paraAutor()
        autorRepository.save(autor)

        println("Autor => ${autor.nome}")
    }
}