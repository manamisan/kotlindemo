package com.example.demo.core.usecase

import com.example.demo.core.ConcreteNumberTriviaInput
import com.example.demo.core.RandomNumberTriviaInput
import com.example.demo.core.entity.NumberTrivia
import java.util.concurrent.Future

interface NumberTriviaUseCase {
    fun getConcreteNumberTrivia(input : ConcreteNumberTriviaInput) : Future<NumberTrivia>

    fun getRandomNumberTrivia(input : RandomNumberTriviaInput) : Future<NumberTrivia>
}