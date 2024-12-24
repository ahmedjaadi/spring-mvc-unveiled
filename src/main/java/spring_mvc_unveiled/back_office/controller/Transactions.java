package spring_mvc_unveiled.back_office.controller;

import spring_mvc_unveiled.root.dao.TransactionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*
 This Path is relative to the root path /back_office
 Requests to paths /back_office/transactions/* will be handled here
*/
@RequestMapping ("transactions")
public class Transactions {
    private final TransactionRepository transactionRepository;

    public Transactions(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }
    @GetMapping
    public String getTransaction() {
       return  transactionRepository.someTransaction();
    }
}
