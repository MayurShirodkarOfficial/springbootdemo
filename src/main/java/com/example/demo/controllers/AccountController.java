package com.example.demo.controllers;
import com.example.demo.entities.Account;
import com.example.demo.services.AccountService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Inject
    AccountService accountService;

    @GetMapping
    public List<Account> list() {
        return accountService.getAllAccounts();
    }

    @GetMapping("{id}")
    public Account getAccountById(@PathVariable("id") long id) {
        return accountService.getAccountById(id);
    }

    @PostMapping
    public Account create(@RequestBody Account account){

        return accountService.saveAccount(account);
    }

    @PutMapping("{id}")
    public Account update(@RequestBody Account account , @PathVariable("id") long id){
        return accountService.updateAccount(account,id);
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable("id") long id){
        accountService.deleteAccount(id);
        return "Account deleted successfully if exists";
    }

}