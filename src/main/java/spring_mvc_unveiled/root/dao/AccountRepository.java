package spring_mvc_unveiled.root.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {
    public String getAccountName() {
        return "John Doe";
    }
}
