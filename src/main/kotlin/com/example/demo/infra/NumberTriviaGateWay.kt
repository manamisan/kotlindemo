package com.example.demo.infra

import com.example.demo.core.entity.NumberTrivia
import com.example.demo.core.repository.NumberTriviaRepository
import java.util.concurrent.Future

class NumberTriviaGateWay : NumberTriviaRepository {
    override fun getConcreteNumberTrivia(number: Int): Future<NumberTrivia> {
        TODO("Not yet implemented")
    }

    override fun getRandomNumberTrivia(): Future<NumberTrivia> {
        TODO("Not yet implemented")
    }
}