package com.rmercadojr.aamvabarcode

data class AamvaBarcode(private val rawBarcode: String) {
    companion object {
        private const val DESIGNATOR_START = 21
        private const val DESIGNATOR_SIZE = 10
    }

    val header: Header = parseHeader()
    val subfiles: List<Subfile> = parseSubfiles(header.numberOfEntries)

    private fun parseHeader() = Header(rawBarcode.substring(0 until DESIGNATOR_START))

    private fun parseSubfiles(numberOfEntries: Int): List<Subfile> {
        fun parseSubfileDesignators(numberOfEntries: Int): List<SubfileDesignator> {
            fun getRawSubfileDesignator(entryNum: Int): String {
                return rawBarcode.substring(
                    DESIGNATOR_START + entryNum * DESIGNATOR_SIZE,
                    DESIGNATOR_START + entryNum * DESIGNATOR_SIZE + DESIGNATOR_SIZE
                )
            }

            return (0 until numberOfEntries).map { SubfileDesignator(getRawSubfileDesignator(it)) }
        }

        fun getRawSubfile(subfileDesignator: SubfileDesignator): String {
            return this.rawBarcode.substring(
                subfileDesignator.offset,
                subfileDesignator.offset + subfileDesignator.length
            )
        }

        val subfileDesignators = parseSubfileDesignators(numberOfEntries)
        return subfileDesignators.map { Subfile(getRawSubfile(it), it) }
    }
}
