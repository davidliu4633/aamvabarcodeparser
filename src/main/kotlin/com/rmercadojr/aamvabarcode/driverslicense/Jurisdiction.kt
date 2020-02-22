package com.rmercadojr.aamvabarcode.driverslicense

class Jurisdiction(allFields: Map<String, String>) {
    val vehicleClass: String =
        allFields.getOrElse("DCA") { throw AamvaBarcodeMandatoryFieldMissingException("DCA - Jurisdiction-specific vehicle class") }
    val restrictionCodes: String =
        allFields.getOrElse("DCB") { throw AamvaBarcodeMandatoryFieldMissingException("DCB - Jurisdiction-specific restriction codes") }
    val endorsementCodes: String =
        allFields.getOrElse("DCD") { throw AamvaBarcodeMandatoryFieldMissingException("DCD - Jurisdiction-specific endorsement codes") }

    val vehicleClassificationDescription: String = allFields.getOrDefault("DCP", "")
    val endorsementCodeRestriction: String = allFields.getOrDefault("DCQ", "")
    val restrictionCodeDescription: String = allFields.getOrDefault("DCR", "")
}
