package munjin.Calculation.repository

import munjin.Calculation.domain.Num
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

class MemoryClaculatorTest : DescribeSpec({
    val claculator = MemoryClaculator();

    describe("계산기 테스트") {
        it("더하기") {
            val number = Num(1,2,0)
            val result = claculator.plus(number);
            result.result shouldBe 3
        }

        it("빼기") {
            val number = Num(1,2,0)
            val result = claculator.minus(number);
            result.result shouldBe -1
        }

        it("나누기") {
            val number = Num(4,2,0)
            val result = claculator.div(number);
            result.result shouldBe 2
        }

        it("곱하기") {
            val number = Num(1,2,0)
            val result = claculator.mul(number);
            result.result shouldBe 2
        }

    }

})