package org.example
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

fun main() {

    //chamadaRede()

    val meuJogo = Jogo()

    meuJogo.capa = "Lorem Capa"
    meuJogo.titulo = "Estudo Desenvolvimento"
    meuJogo.descricao = "Lorem description"

    println(meuJogo)

}

private fun chamadaRede() {
    try {
        val url: String = "https://www.cheapshark.com/api/1.0/games?id=146"
        val client: HttpClient = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())

        val json = response.body()

        println(json)
    } catch (e: Exception) {
        println(e.message)
    }
}
