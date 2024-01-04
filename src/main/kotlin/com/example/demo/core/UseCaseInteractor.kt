package com.example.demo.core

import com.example.demo.core.usecase.NumberTriviaUseCase
import com.example.demo.core.entity.NumberTrivia
import com.example.demo.core.repository.NumberTriviaRepository
import org.springframework.stereotype.Service
import java.util.concurrent.Future

@Service
class UseCaseInteractor : NumberTriviaUseCase{

    private lateinit var repository : NumberTriviaRepository

    override fun getConcreteNumberTrivia(inputData : ConcreteNumberTriviaInput) : Future<NumberTrivia>
    = repository.getConcreteNumberTrivia(inputData.number)

    override fun getRandomNumberTrivia(inputData: RandomNumberTriviaInput) : Future<NumberTrivia>
    = repository.getRandomNumberTrivia()
}