package com.rmercadojr.aamvabarcode

enum class SubfileType {
    DL, ID, OTHER;

    companion object {
        fun of(name: String) = when (name) {
            "DL" -> DL
            "ID" -> ID
            else -> OTHER
        }
    }
}