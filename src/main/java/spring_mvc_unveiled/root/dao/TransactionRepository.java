package spring_mvc_unveiled.root.dao;

import org.springframework.stereotype.Repository;

@Repository
public class TransactionRepository {
    public String someTransaction() {
        return "Some transaction";
    }
}
