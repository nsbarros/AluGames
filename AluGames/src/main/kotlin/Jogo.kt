package org.example

import com.google.gson.annotations.SerializedName

class Jogo(
    val titulo: String,
    val capa: String,
) {

    val descricao: String = ""

    override fun toString(): String {
        return "Jogo(titulo='$titulo', capa='$capa', descricao='$descricao')"
    }

}