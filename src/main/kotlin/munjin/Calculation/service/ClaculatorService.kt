package munjin.Calculation.service

import munjin.Calculation.domain.Num
import munjin.Calculation.repository.MemoryClaculator

class ClaculatorService {
    val claculator = MemoryClaculator();

    fun plus(num : Num) : Num {
        val result = claculator.plus(num);
        return result
    }

    fun minus(num : Num) : Num {
        val result = claculator.minus(num);
        return result
    }

    fun div(num : Num) : Num {
        val result = claculator.div(num);
        return result
    }

    fun mul(num : Num) : Num {
        val result = claculator.mul(num);
        return result
    }
}