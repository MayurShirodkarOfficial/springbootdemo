package com.example.demo.services;

import com.example.demo.entities.Account;

import java.util.List;

public interface AccountService {
    Account saveAccount(Account account);
    List<Account> getAllAccounts();
    Account getAccountById(long id);
    Account updateAccount(Account account,long id);
    void deleteAccount(long id);
}
