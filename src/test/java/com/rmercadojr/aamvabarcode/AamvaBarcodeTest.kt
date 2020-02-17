package com.rmercadojr.aamvabarcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AamvaBarcodeTest {
    @Test
    fun `header and subfiles aren't null`() {
        val aamvaBarcode = AamvaBarcode(tnLicenseTest)
        assertThat(aamvaBarcode.header).isNotNull
        assertThat(aamvaBarcode.subfiles).hasSize(2)
    }
}
