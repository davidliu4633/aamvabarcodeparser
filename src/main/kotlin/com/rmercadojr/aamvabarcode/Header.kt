package com.rmercadojr.aamvabarcode

class Header(val rawHeader: String) {
    val complianceIndicator = rawHeader.substring(0, 1)
    val dataElementSeparator = rawHeader.substring(1, 2)
    val recordSeparator = rawHeader.substring(2, 3)
    val segmentTerminator = rawHeader.substring(3, 4)
    val fileType = rawHeader.substring(4, 9)
    val issuerIdentificationNumber = rawHeader.substring(9, 15)
    val aamvaVersionNumber = rawHeader.substring(15, 17)
    val jurisdictionVersionNumber = rawHeader.substring(17, 19)
    val numberOfEntries = rawHeader.substring(19, 21).toInt()
}
