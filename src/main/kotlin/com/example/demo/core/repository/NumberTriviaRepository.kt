package com.example.demo.core.repository

import com.example.demo.core.entity.NumberTrivia
import java.util.concurrent.Future

interface NumberTriviaRepository {
    fun getConcreteNumberTrivia(number:Int): Future<NumberTrivia>

    fun getRandomNumberTrivia():Future<NumberTrivia>
}