package com.example.WebAPI.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    private AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @PostMapping
    public Account save(
           @RequestBody Account account
    ){
        return service.save(account);
    }

    @GetMapping
    public  List<Account> findAllAccounts(){
        return service.findAllAccount();
    }
}
