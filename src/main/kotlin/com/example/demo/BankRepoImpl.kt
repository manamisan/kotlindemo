package com.example.demo

import com.example.demo.model.Bank
import com.example.demo.repository.BankRepository

class BankRepoImpl : BankRepository{
    override fun getBanks() : Collection<Bank> = Collection<Bank>()
    override fun getBank(bankId : Int) : Bank = Bank("aaa",1.1,1)
}