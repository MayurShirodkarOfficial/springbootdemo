package com.example.demo.services;
import com.example.demo.Dao.AccountRepository;
import com.example.demo.entities.Account;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImplementation implements AccountService {

    @Inject
    AccountRepository accountRepository;
    @Override
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountById(long id) {
        Optional<Account> account = accountRepository.findById(id);
        return account.get();
    }

    @Override
    public Account updateAccount(Account account, long id) {
        Account existingAccount = accountRepository.findById(id).get();
        existingAccount.setName(account.getName());
        existingAccount.setBalance(account.getBalance());
        accountRepository.save(existingAccount);
        return existingAccount;
    }

    @Override
    public void deleteAccount(long id) {

        Optional<Account> account = accountRepository.findById(id);
        if(account.isPresent()){
            accountRepository.deleteById(id);
        }
    }
}
