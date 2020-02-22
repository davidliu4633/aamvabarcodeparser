package com.rmercadojr.aamvabarcode.driverslicense

import com.rmercadojr.aamvabarcode.DlAndIdFields

class DriversLicense(fields: Map<String, String>) : DlAndIdFields(fields) {
    // region ========== MANDATORY DL SPECIFIC DATA ELEMENTS
    val jurisdictionSpecificVehicleClass: String =
        fields.getOrElse("DCA") { throw AamvaBarcodeMandatoryFieldMissingException("DCA - Jurisdiction-specific vehicle class") }
    val jurisdictionSpecificRestrictionCodes: String =
        fields.getOrElse("DCB") { throw AamvaBarcodeMandatoryFieldMissingException("DCB - Jurisdiction-specific restriction codes") }
    val jurisdictionSpecificEndorsementCodes: String =
        fields.getOrElse("DCD") { throw AamvaBarcodeMandatoryFieldMissingException("DCD - Jurisdiction-specific endorsement codes") }
    // endregion

    // region ========== OPTIONAL DL SPECIFIC DATA ELEMENTS
    val standardVehicleClassification: String = fields.getOrDefault( "DCM", "" )
    val standardEndorsementCode: String = fields.getOrDefault( "DCN", "" )
    val standardRestrictionCode: String = fields.getOrDefault( "DCO", "" )
    val jurisdictionSpecificVehicleClassificationDescription: String = fields.getOrDefault("DCP", "")
    val jurisdictionSpecificEndorsementCodeRestriction: String = fields.getOrDefault("DCQ", "")
    val jurisdictionSpecificRestrictionCodeDescription: String = fields.getOrDefault("DCR", "")
    val hazmatEndorsementExpirationDate: String = fields.getOrDefault( "DDC", "" )
    // endregion
}