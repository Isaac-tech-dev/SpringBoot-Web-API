package com.example.WebAPI.account;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryAccountService implements AccountService{

    private final InMemoryAccountDao _dao;

    public InMemoryAccountService(InMemoryAccountDao dao) {
        _dao = dao;
    }

    @Override
    public Account save(Account a){
        return _dao.save(a);
    }

    @Override
    public List<Account> findAllAccount(){
        return _dao.findAllAccount();
    }
}
