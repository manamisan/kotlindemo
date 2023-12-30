package com.example.demo.repository

import com.example.demo.model.Bank

interface BankRepository {
    fun getBanks():Collection<Bank>
    fun getBank(bank:Int):Bank
}