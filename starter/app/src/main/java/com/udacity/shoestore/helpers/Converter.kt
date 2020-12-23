package com.udacity.shoestore.helpers

import android.widget.EditText
import androidx.databinding.InverseMethod

object Converter {
    @InverseMethod("stringToDouble")
    @JvmStatic fun doubleToString(
        value: Double
    ): String = value.toString()

    @JvmStatic fun stringToDouble(
        value: String
    ): Double = value.toDouble()
}