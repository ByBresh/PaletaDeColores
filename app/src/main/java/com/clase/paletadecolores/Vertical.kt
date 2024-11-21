package com.clase.paletadecolores

import android.content.Context
import androidx.annotation.ColorInt
import androidx.core.content.ContextCompat.getColor

class Vertical(var colorName: Color, private val opacity: Opacity, var text: String) {

    enum class Color {
        WHITE,
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        CYAN,
        BLUE,
        VIOLET,
        BLACK
    }

    enum class Opacity {
        O20,
        O35,
        O50,
        O65,
        O80
    }

    @ColorInt
    fun getColor(context: Context): Int {
        return when (colorName) {
            Color.WHITE -> when (opacity) {
                Opacity.O20 -> getColor(context, R.color.white20)
                Opacity.O35 -> getColor(context, R.color.white35)
                Opacity.O50 -> getColor(context, R.color.white50)
                Opacity.O65 -> getColor(context, R.color.white65)
                Opacity.O80 -> getColor(context, R.color.white80)
            }
            Color.RED -> when (opacity) {
                Opacity.O20 -> getColor(context, R.color.red20)
                Opacity.O35 -> getColor(context, R.color.red35)
                Opacity.O50 -> getColor(context, R.color.red50)
                Opacity.O65 -> getColor(context, R.color.red65)
                Opacity.O80 -> getColor(context, R.color.red80)
            }
            Color.ORANGE -> when (opacity) {
                Opacity.O20 -> getColor(context, R.color.orange20)
                Opacity.O35 -> getColor(context, R.color.orange35)
                Opacity.O50 -> getColor(context, R.color.orange50)
                Opacity.O65 -> getColor(context, R.color.orange65)
                Opacity.O80 -> getColor(context, R.color.orange80)
            }
            Color.YELLOW -> when (opacity) {
                Opacity.O20 -> getColor(context, R.color.yellow20)
                Opacity.O35 -> getColor(context, R.color.yellow35)
                Opacity.O50 -> getColor(context, R.color.yellow50)
                Opacity.O65 -> getColor(context, R.color.yellow65)
                Opacity.O80 -> getColor(context, R.color.yellow80)
            }
            Color.GREEN -> when (opacity) {
                Opacity.O20 -> getColor(context, R.color.green20)
                Opacity.O35 -> getColor(context, R.color.green35)
                Opacity.O50 -> getColor(context, R.color.green50)
                Opacity.O65 -> getColor(context, R.color.green65)
                Opacity.O80 -> getColor(context, R.color.green80)
            }
            Color.CYAN -> when (opacity) {
                Opacity.O20 -> getColor(context, R.color.cyan20)
                Opacity.O35 -> getColor(context, R.color.cyan35)
                Opacity.O50 -> getColor(context, R.color.cyan50)
                Opacity.O65 -> getColor(context, R.color.cyan65)
                Opacity.O80 -> getColor(context, R.color.cyan80)
            }
            Color.BLUE -> when (opacity) {
                Opacity.O20 -> getColor(context, R.color.blue20)
                Opacity.O35 -> getColor(context, R.color.blue35)
                Opacity.O50 -> getColor(context, R.color.blue50)
                Opacity.O65 -> getColor(context, R.color.blue65)
                Opacity.O80 -> getColor(context, R.color.blue80)
            }
            Color.VIOLET -> when (opacity) {
                Opacity.O20 -> getColor(context, R.color.violet20)
                Opacity.O35 -> getColor(context, R.color.violet35)
                Opacity.O50 -> getColor(context, R.color.violet50)
                Opacity.O65 -> getColor(context, R.color.violet65)
                Opacity.O80 -> getColor(context, R.color.violet80)
            }
            Color.BLACK -> when (opacity) {
                Opacity.O20 -> getColor(context, R.color.black20)
                Opacity.O35 -> getColor(context, R.color.black35)
                Opacity.O50 -> getColor(context, R.color.black50)
                Opacity.O65 -> getColor(context, R.color.black65)
                Opacity.O80 -> getColor(context, R.color.black80)
            }
        }
    }

}