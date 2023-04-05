package munjin.Calculation.repository

import munjin.Calculation.domain.Num
import munjin.Calculation.repository.Calculator

class MemoryClaculator : Calculator {

    override fun plus(num : Num) : Num {
        num.result = num.num1 + num.num2
        return num
    }

    override fun minus(num : Num) : Num {
        num.result = num.num1 - num.num2
        return num
    }

    override fun div(num : Num) : Num {
        num.result = num.num1 / num.num2
        return num
    }

    override fun mul(num : Num) : Num {
        num.result = num.num1 * num.num2
        return num
    }
}