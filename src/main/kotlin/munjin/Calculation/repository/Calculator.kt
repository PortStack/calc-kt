package munjin.Calculation.repository

import munjin.Calculation.domain.Num

interface Calculator {
    fun plus(num : Num): Num;
    fun minus(num : Num): Num;
    fun div(num : Num): Num;
    fun mul(num : Num): Num;
}