package com.example.WebAPI.account;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

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

    public Account findByEmail(String email) {
        return ACCOUNT.stream().filter(s -> email.equals(s.getEmail())).findFirst().orElse(null);
    }

    public Account update(Account s) {
        var studentIndex = IntStream.range(0, ACCOUNT.size()).filter(index -> ACCOUNT.get(index).getEmail().equals(s.getEmail())).findFirst().orElse(-1);
        if(studentIndex > -1){
            ACCOUNT.set(studentIndex, s);
            return s;
        }
        return null;
    }
}
