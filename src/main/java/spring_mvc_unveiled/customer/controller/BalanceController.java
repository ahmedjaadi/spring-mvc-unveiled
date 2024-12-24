package spring_mvc_unveiled.customer.controller;

import spring_mvc_unveiled.root.dao.AccountRepository;
import java.text.MessageFormat;
import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller is scanned by the {@link  spring_mvc_unveiled.customer.CustomerAppServlet.CustomerAppApplicationContext CustomerAppApplicationContext}
 * class, that is why it is handled by customerAppServlet, a
 * {@link org.springframework.web.servlet.DispatcherServlet DispatcherServlet}
 * registered by the {@link jakarta.servlet.annotation.WebServlet  @WebServlet } annotation
 **/
@RestController
/*
 This Path is relative to the root path /customer
 Requests to paths /customer/balance/* will be handled here
*/
@RequestMapping("balance")
public class BalanceController {

    private static final Random RANDOM = new Random();
    private final AccountRepository accountRepository;

    public BalanceController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @GetMapping
    public String balance() {
        return MessageFormat.format("{0}, Your balance is {1}", accountRepository.getAccountName(), RANDOM.nextInt());
    }
}
