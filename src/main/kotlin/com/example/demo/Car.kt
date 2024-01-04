package com.example.demo

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class Car(
    var fuel:Double,
    val engine : Engine
) {

    fun turnOn(){
        fuel-=0.5

        CoroutineScope(Dispatchers.Main).launch {
            engine.turnOn().collect {temperature ->
                print(temperature)
            }
        }
    }
}