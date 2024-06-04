package io.github.sidneiimatos.bank_application.services;

import io.github.sidneiimatos.bank_application.dtos.AccountDTO;
import io.github.sidneiimatos.bank_application.exceptions.RequestException;
import io.github.sidneiimatos.bank_application.exceptions.constants.Constants;
import io.github.sidneiimatos.bank_application.models.AccountModel;
import io.github.sidneiimatos.bank_application.repositorys.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public void createNewAccount(AccountDTO requestAccount) {
        try {
            if (!(accountRepository.equals(DTOtoAccountModel(requestAccount)))) {
                accountRepository.save(
                        DTOtoAccountModel(
                                requestAccount
                        )
                );
            }

        } catch (RuntimeException e) {
            throw new RequestException(Constants.ACCOUNT_EXISTS, HttpStatus.BAD_REQUEST);
        }
    }
    public void update() {

    }
    public void save() {

    }

    public AccountModel DTOtoAccountModel(AccountDTO requestAccount) {
        AccountModel accountModel = new AccountModel();
        accountModel.setUuid(UUID.randomUUID());
        accountModel.setName(requestAccount.getName());
        accountModel.setEmail(requestAccount.getEmail());
        accountModel.setCpf(requestAccount.getCpf());
        accountModel.setBalance(0.0D);
        accountModel.setAccountType(requestAccount.getAccountType());
        return accountModel;
    }
}
