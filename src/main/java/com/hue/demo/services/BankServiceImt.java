package com.hue.demo.services;

import com.hue.demo.dao.models.Bank;
import com.hue.demo.dto.BankDTO;
import com.hue.demo.repository.BankRepository;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImt implements BankService {
    private BankRepository bankRepository;

    public BankServiceImt(BankRepository bankRepository){
        this.bankRepository = bankRepository;
    }
    @Override
    public void addBank(BankDTO bankDTO) {
        Bank bank = new Bank();
        bank.setBankname(bankDTO.getBankname());
        bank.setBankaccount(bankDTO.getBankaccount());
        bank.setUsername(bankDTO.getBankname());
        bankRepository.save(bank);
    }
}
