package com.rmercadojr.aamvabarcode

data class IdField(val name: String, val abbreviation: String, val description: String)

val fields = arrayOf(
    IdField("DAA", "fullName", "Full Name"),
    IdField("DAB", "lastName", "Last Name"),
    IdField("DAB", "familyName", "Family Name"),
    IdField("DAC", "firstName", "First Name"),
    IdField("DAC", "givenName", "Given Name"),
    IdField("DAD", "middleNameOrInitial", "Middle Name or Initial"),
    IdField("DAD", "middleName", "Middle Name"),
    IdField("DAE", "nameSuffix", "Name Suffix"),
    IdField("DAF", "namePrefix", "Name Prefix"),
    IdField("DAG", "mailingStreetAddress1", "Mailing Street Address1"),
    IdField("DAH", "mailingStreetAddress2", "Mailing Street Address2"),
    IdField("DAI", "mailingCity", "Mailing City"),
    IdField(
        "DAJ",
        "mailingJurisdictionCode",
        "Mailing Jurisdiction Code"
    ),
    IdField("DAK", "mailingPostalCode", "Mailing Postal Code"),
    IdField(
        "DAL",
        "residenceStreetAddress1",
        "Residence Street Address1"
    ),
    IdField(
        "DAM",
        "residenceStreetAddress2",
        "Residence Street Address2"
    ),
    IdField("DAN", "residenceCity", "Residence City"),
    IdField(
        "DAO",
        "residenceJurisdictionCode",
        "Residence Jurisdiction Code"
    ),
    IdField("DAP", "residencePostalCode", "Residence Postal Code"),
    IdField("DAQ", "licenseOrIdNumber", "License or ID Number"),
    IdField(
        "DAR",
        "licenseClassificationCode",
        "License Classification Code"
    ),
    IdField(
        "DAS",
        "licenseRestrictionCode",
        "License Restriction Code"
    ),
    IdField(
        "DAT",
        "licenseEndorsementsCode",
        "License Endorsements Code"
    ),
    IdField("DAU", "heightInFtIn", "Height in FT_IN"),
    IdField("DAV", "heightInCm", "Height in CM"),
    IdField("DAW", "weightInLbs", "Weight in LBS"),
    IdField("DAX", "weightInKg", "Weight in KG"),
    IdField("DAY", "eyeColor", "Eye Color"),
    IdField("DAZ", "hairColor", "Hair Color"),
    IdField("DBA", "licenseExpirationDate", "License Expiration Date"),
    IdField("DBB", "dateOfBirth", "Date of Birth"),
    IdField("DBC", "sex", "Sex"),
    IdField(
        "DBD",
        "licenseOrIdDocumentIssueDate",
        "License or ID Document Issue Date"
    ),
    IdField("DBE", "issueTimestamp", "Issue Timestamp"),
    IdField("DBF", "numberOfDuplicates", "Number of Duplicates"),
    IdField("DBG", "medicalIndicatorCodes", "Medical Indicator Codes"),
    IdField("DBH", "organDonor", "Organ Donor"),
    IdField("DBI", "nonResidentIndicator", "Non-Resident Indicator"),
    IdField(
        "DBJ",
        "uniqueCustomerIdentifier",
        "Unique Customer Identifier"
    ),
    IdField("DBK", "socialSecurityNumber", "Social Security Number"),
    IdField("DBL", "dateOfBirth", "Date Of Birth"),
    IdField("DBM", "socialSecurityNumber", "Social Security Number"),
    IdField("DBN", "fullName", "Full Name"),
    IdField("DBO", "lastName", "Last Name"),
    IdField("DBO", "familyName", "Family Name"),
    IdField("DBP", "firstName", "First Name"),
    IdField("DBP", "givenName", "Given Name"),
    IdField("DBQ", "middleName", "Middle Name"),
    IdField("DBQ", "middleNameOrInitial", "Middle Name or Initial"),
    IdField("DBR", "suffix", "Suffix"),
    IdField("DBS", "prefix", "Prefix"),
    IdField("DCA", "virginiaSpecificClass", "Virginia Specific Class"),
    IdField(
        "DCB",
        "virginiaSpecificRestrictions",
        "Virginia Specific Restrictions"
    ),
    IdField(
        "DCD",
        "virginiaSpecificEndorsements",
        "Virginia Specific Endorsements"
    ),
    IdField(
        "DCE",
        "physicalDescriptionWeightRange",
        "Physical Description Weight Range"
    ),
    IdField("DCF", "documentDiscriminator", "Document Discriminator"),
    IdField(
        "DCG",
        "countryTerritoryOfIssuance",
        "Country territory of issuance"
    ),
    IdField(
        "DCH",
        "federalCommercialVehicleCodes",
        "Federal Commercial Vehicle Codes"
    ),
    IdField("DCI", "placeOfBirth", "Place of birth"),
    IdField("DCJ", "auditInformation", "Audit information"),
    IdField(
        "DCK",
        "inventoryControlNumber",
        "Inventory Control Number"
    ),
    IdField("DCL", "raceEthnicity", "Race Ethnicity"),
    IdField(
        "DCM",
        "standardVehicleClassification",
        "Standard vehicle classification"
    ),
    IdField(
        "DCN",
        "standardEndorsementCode",
        "Standard endorsement code"
    ),
    IdField(
        "DCO",
        "standardRestrictionCode",
        "Standard restriction code"
    ),
    IdField(
        "DCP",
        "jurisdictionSpecificVehicleClassificationDescription",
        "Jurisdiction specific vehicle classification description"
    ),
    IdField("DCQ", "jurisdiction-fieldName", "Jurisdiction-specific"),
    IdField(
        "DCR",
        "jurisdictionSpecificRestrictionCodeDescription",
        "Jurisdiction specific restriction code description"
    ),
    IdField("DCS", "familyName", "Family Name"),
    IdField("DCS", "lastName", "Last Name"),
    IdField("DCT", "givenName", "Given Name"),
    IdField("DCT", "firstName", "First Name"),
    IdField("DCU", "suffix", "Suffix"),
    IdField("DDA", "complianceType", "Compliance Type"),
    IdField("DDB", "cardRevisionDate", "Card Revision Date"),
    IdField(
        "DDC",
        "hazmatEndorsementExpiryDate",
        "HazMat Endorsement Expiry Date"
    ),
    IdField(
        "DDD",
        "limitedDurationDocumentIndicator",
        "Limited Duration Document Indicator"
    ),
    IdField("DDE", "familyNameTruncation", "Family Name Truncation"),
    IdField("DDF", "firstNamesTruncation", "First Names Truncation"),
    IdField("DDG", "middleNamesTruncation", "Middle Names Truncation"),
    IdField("DDH", "under18Until", "Under 18 Until"),
    IdField("DDI", "under19Until", "Under 19 Until"),
    IdField("DDJ", "under21Until", "Under 21 Until"),
    IdField("DDK", "organDonorIndicator", "Organ Donor Indicator"),
    IdField("DDL", "veteranIndicator", "Veteran Indicator"),
    IdField(
        "PAA",
        "permitClassificationCode",
        "Permit Classification Code"
    ),
    IdField("PAB", "permitExpirationDate", "Permit Expiration Date"),
    IdField("PAC", "permitIdentifier", "Permit Identifier"),
    IdField("PAD", "permitIssueDate", "Permit IssueDate"),
    IdField("PAE", "permitRestrictionCode", "Permit Restriction Code"),
    IdField("PAF", "permitEndorsementCode", "Permit Endorsement Code"),
    IdField("ZVA", "courtRestrictionCode", "Court Restriction Code")
)
