package com.rmercadojr.aamvabarcode

data class SubfileDesignator(val rawSubfileDesignator: String) {
    var type: SubfileType = SubfileType.of(rawSubfileDesignator.substring(0, 2))
    var offset: Int = rawSubfileDesignator.substring(2, 6).toInt()
    var length: Int = rawSubfileDesignator.substring(6, 10).toInt()
}
