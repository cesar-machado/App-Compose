package com.cmac.aprendendocompose.model

import java.math.BigDecimal

class Product(
    val name : String,
    val price : BigDecimal,
//    @DrawableRes val image: Int
    val image: String? = null
)
