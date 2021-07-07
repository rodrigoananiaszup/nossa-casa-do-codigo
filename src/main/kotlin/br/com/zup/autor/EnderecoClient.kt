package br.com.zup.autor

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.client.annotation.Client

@Client("https://viacep.com.br/ws")
interface EnderecoClient {

    @Get(consumes = [MediaType.APPLICATION_XML])
    fun consulta(@PathVariable cep:String) : HttpResponse<EnderecoResponse>
}