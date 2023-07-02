package com.example.WebAPI.account;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryAccountDao {

    private List<Account> ACCOUNT = new ArrayList<>();

    public Account save(Account s) {
        ACCOUNT.add(s);
        return s;
    }

    public List<Account> findAllAccount(){
        return ACCOUNT;
    }
}
