package com.rmercadojr.aamvabarcode

import java.util.stream.Collectors.joining

data class Subfile(val rawSubfile: String, val subfileDesignator: SubfileDesignator) {
    val type: SubfileType = SubfileType.of(rawSubfile.substring(0, 2))
    var fields: Map<String, String> = parseFields(rawSubfile.substring(2))

    private fun parseFields(rawSubfileFields: String): Map<String, String> {
        fun createField(rawField: String): Pair<String, String> {
            val key = rawField.substring(0..2)
            val value = rawField.substring(3).trim()
            return Pair(key, value)
        }

        return rawSubfileFields.split("\n")
            .filter { it.isNotBlank() }
            .map { createField(it) }
            .toMap()
    }

    override fun toString(): String {
        return fields.keys.stream()
            .map { "$it=" + fields[it] }
            .collect(joining(", ", "{", "}"))
    }
}
