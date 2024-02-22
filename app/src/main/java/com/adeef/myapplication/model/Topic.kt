package com.adeef.myapplication.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    val value: Int,
    @DrawableRes val imageResourceId: Int

)
