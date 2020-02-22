package com.rmercadojr.aamvabarcode

import com.rmercadojr.aamvabarcode.driverslicense.AamvaBarcodeMandatoryFieldMissingException
import java.time.LocalDate

open class DlAndIdFields(fields: Map<String, String>) {
    // region ========== MANDATORY DATA ELEMENTS
    val documentExpirationDate: String =
        fields.getOrElse("DBA") { throw AamvaBarcodeMandatoryFieldMissingException("DBA - Document Expiration Date") }
    val customerFamilyName: String =
        fields.getOrElse("DCS") { throw AamvaBarcodeMandatoryFieldMissingException("DCS - Customer Family Name") }
    val customerFirstName: String =
        fields.getOrElse("DAC") { throw AamvaBarcodeMandatoryFieldMissingException("DAC - Customer First Name") }
    val customerMiddleName: String =
        fields.getOrElse("DAD") { throw AamvaBarcodeMandatoryFieldMissingException("DAD - Customer Middle Name(s)") }
    val documentIssueDate: String =
        fields.getOrElse("DBD") { throw AamvaBarcodeMandatoryFieldMissingException("DBD - Document Issue Date") }
    // TODO
    val dateOfBirth: LocalDate? = convertDateOfBirth(fields)

    private fun convertDateOfBirth(fields: Map<String, String>): LocalDate? {

        val dob: String =
            fields.getOrElse("DBB") { throw AamvaBarcodeMandatoryFieldMissingException("DBB - Date of Birth") }

        val day = dob.substring(2, 4).toInt()
        val month = dob.substring(0, 2).toInt()
        val year = dob.substring(4).toInt()

        return LocalDate.of(year, month, day)
    }

    // TODO
    val physicalDescriptionSex: String =
        fields.getOrElse("DBC") { throw AamvaBarcodeMandatoryFieldMissingException("DBC - Physical Description - Sex") }
    // TODO
    val physicalDescriptionEyeColor: String =
        fields.getOrElse("DAY") { throw AamvaBarcodeMandatoryFieldMissingException("DAY - Physical Description - Eye Color") }
    // TODO
    val physicalDescriptionHeight: String =
        fields.getOrElse("DAU") { throw AamvaBarcodeMandatoryFieldMissingException("DAU - Physical Description - Height") }
    val addressStreet1: String =
        fields.getOrElse("DAG") { throw AamvaBarcodeMandatoryFieldMissingException("DAG - Address - Street 1") }
    val addressCity: String =
        fields.getOrElse("DAI") { throw AamvaBarcodeMandatoryFieldMissingException("DAI - Address - City") }
    val addressJurisdictionCode: String =
        fields.getOrElse("DAJ") { throw AamvaBarcodeMandatoryFieldMissingException("DAJ - Address - Jurisdiction Code") }
    val addressPostalCode: String =
        fields.getOrElse("DAK") { throw AamvaBarcodeMandatoryFieldMissingException("DAK - Address - Postal Code") }
    val customerIdNumber: String =
        fields.getOrElse("DAQ") { throw AamvaBarcodeMandatoryFieldMissingException("DAQ - Customer ID Number") }
    val documentDiscriminator: String =
        fields.getOrElse("DCF") { throw AamvaBarcodeMandatoryFieldMissingException("DCF - Document Discriminator") }
    val countryIdentification: String =
        fields.getOrElse("DCG") { throw AamvaBarcodeMandatoryFieldMissingException("DCG - Country Identification") }
    // TODO
    val familyNameTruncation: String =
        fields.getOrElse("DDE") { throw AamvaBarcodeMandatoryFieldMissingException("DDE - Family name truncation") }
    // TODO
    val firstNameTruncation: String =
        fields.getOrElse("DDF") { throw AamvaBarcodeMandatoryFieldMissingException("DDF - First name truncation") }
    // TODO
    val middleNameTruncation: String =
        fields.getOrElse("DDG") { throw AamvaBarcodeMandatoryFieldMissingException("DDG - Middle name truncation") }
    // endregion

    // region ========== OPTIONAL DATA ELEMENTS
    val addressStreet2: String = fields.getOrDefault("DAH", "")
    val hairColor: String = fields.getOrDefault("DAZ", "")
    val placeOfBirth: String = fields.getOrDefault("DCI", "")
    val auditInformation: String = fields.getOrDefault("DCJ", "")
    val inventoryControlNumber: String = fields.getOrDefault("DCK", "")
    val aliasFamilyName: String = fields.getOrDefault("DBN", "")
    val aliasGivenName: String = fields.getOrDefault("DBG", "")
    val aliasSuffixName: String = fields.getOrDefault("DBS", "")
    val nameSuffix: String = fields.getOrDefault("DCU", "")
    val physicalDescriptionWeightRange: String = fields.getOrDefault("DCE", "")
    val race: String = fields.getOrDefault("DCL", "")
    val complianceType: String = fields.getOrDefault("DDA", "")
    val cardRevisionDate: String = fields.getOrDefault("DDB", "")
    val limitedDurationDocumentIndicator: String = fields.getOrDefault("DDD", "")
    val weightPoints: String = fields.getOrDefault("DAW", "")
    val weightKilograms: String = fields.getOrDefault("DAX", "")
    val under18Until: String = fields.getOrDefault("DDH", "")
    val under19Until: String = fields.getOrDefault("DDI", "")
    val under21Until: String = fields.getOrDefault("DDJ", "")
    val organDonorIndicator: String = fields.getOrDefault("DDK", "")
    val veteranIndicator: String = fields.getOrDefault("DDL", "")
    // endregion
}
