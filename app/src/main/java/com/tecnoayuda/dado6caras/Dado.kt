package com.tecnoayuda.dado6caras

import kotlin.random.Random

class Dado {
    fun cambiarCara(): Int {
        val result = Random.nextInt(1, 7)
        return when (result) {
            1 -> R.drawable.cara_1
            2 -> R.drawable.cara_2
            3 -> R.drawable.cara_3
            4 -> R.drawable.cara_4
            5 -> R.drawable.cara_5
            else -> R.drawable.cara_6
        }
    }
}
