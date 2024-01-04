package com.example.demo

import com.example.demo.core.ConcreteNumberTriviaInput
import com.example.demo.core.UseCaseInteractor
import com.example.demo.core.usecase.NumberTriviaUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class NumberTriviaController {

    private lateinit var usecase : NumberTriviaUseCase
    @GetMapping("/hello")
    fun hello():String="Hello Kettle Spring"

    @GetMapping("/aaa")
    fun fetchConcreteNumberTrivia(inputData : ConcreteNumberTriviaInput) : String
    = usecase.getConcreteNumberTrivia(inputData).toString()
}