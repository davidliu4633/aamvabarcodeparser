package com.rmercadojr.aamvabarcode

data class Header(val rawHeader: String) {
    val complianceIndicator: String = rawHeader.substring(0, 1)
    val dataElementSeparator: String = rawHeader.substring(1, 2)
    val recordSeparator: String = rawHeader.substring(2, 3)
    val segmentTerminator: String = rawHeader.substring(3, 4)
    val fileType: String = rawHeader.substring(4, 9)
    val issuerIdentificationNumber: String = rawHeader.substring(9, 15)
    val aamvaVersionNumber: String = rawHeader.substring(15, 17)
    val jurisdictionVersionNumber: String = rawHeader.substring(17, 19)
    val numberOfEntries: Int = rawHeader.substring(19, 21).toInt()
}
