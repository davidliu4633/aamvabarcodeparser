package com.rmercadojr.aamvabarcode

class Subfile(val rawSubfile: String, val subfileDesignator: SubfileDesignator) {
    companion object {
        private val DL_ID_TYPES = arrayOf("DL", "ID")
    }

    val type = rawSubfile.substring(0, 2)
    var fields = parseFields(rawSubfile.substring(2))

    public fun isDlOrId(): Boolean = type in DL_ID_TYPES

    private fun parseFields(rawSubfileFields: String): Map<String, String> {
        fun createField(rawField: String): Pair<String, String> {
            val key = rawField.substring(0..2)
            val value = rawField.substring(3)
            return Pair(key, value)
        }

        return rawSubfileFields.split("\n")
            .filter { it.isNotBlank() }
            .map { createField(it) }
            .toMap()
    }
}
