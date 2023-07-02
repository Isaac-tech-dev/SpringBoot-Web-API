package com.example.WebAPI.account;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {

    Account save(Account a);

    List<Account> findAllAccount();

    Account findByEmail (String email);
    Account update(Account a);

}
