package munjin.Calculation.controller

import munjin.Calculation.domain.Num
import munjin.Calculation.service.ClaculatorService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class NumController {

    val calculatorService = ClaculatorService();

    @GetMapping("/")
    fun main(model: Model) : String {
        model["title"] = "testTitle" //model.addAttribute("title", "test")
        return "number/createMemberForm"
    }

    @PostMapping("/members/plus")
    @ResponseBody
    fun plus(form: NumForm): String {
        val member = Num(form.num1.toInt(), form.num2.toInt(), 0)
        val answer : String = calculatorService.plus(member).result.toString()
        return "result : ${answer}"
    }

    @PostMapping("/members/minus")
    @ResponseBody
    fun minus(form: NumForm) : String {
        val member = Num(form.num1.toInt(), form.num2.toInt(), 0)
        val answer : String = calculatorService.minus(member).result.toString()
        return "result : ${answer}"
    }

    @PostMapping("/members/mul")
    @ResponseBody
    fun mul(form: NumForm) : String {
        val member =  Num(form.num1.toInt(), form.num2.toInt(), 0)
        val answer : String = calculatorService.mul(member).result.toString()
        return "result : ${answer}"
    }

    @PostMapping("/members/div")
    @ResponseBody
    fun div(form: NumForm) : String {
        val member =  Num(form.num1.toInt(), form.num2.toInt(), 0)
        val answer : String = calculatorService.div(member).result.toString()
        return "result : ${answer}"
    }
}