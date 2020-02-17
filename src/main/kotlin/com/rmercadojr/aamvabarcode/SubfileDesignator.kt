package com.rmercadojr.aamvabarcode

class SubfileDesignator(val rawSubfileDesignator: String) {
    var type = rawSubfileDesignator.substring(0, 2)
    var offset = rawSubfileDesignator.substring(2, 6).toInt()
    var length = rawSubfileDesignator.substring(6, 10).toInt()
}
