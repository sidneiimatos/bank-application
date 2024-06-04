package io.github.sidneiimatos.bank_application.controllers;

import io.github.sidneiimatos.bank_application.dtos.AccountDTO;
import io.github.sidneiimatos.bank_application.models.AccountModel;
import io.github.sidneiimatos.bank_application.repositorys.AccountRepository;
import io.github.sidneiimatos.bank_application.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(value = "/api")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/account", method = RequestMethod.POST)
    public AccountDTO requestCreateAccount(@RequestBody AccountDTO requestAccount) {
        accountService.createNewAccount(requestAccount);
        return requestAccount;
    }

}
