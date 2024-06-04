package io.github.sidneiimatos.bank_application.dtos;

import io.github.sidneiimatos.bank_application.models.enums.AccountTypeEnum;

public class AccountDTO {
    private String name;
    private String email;
    private String cpf;
    private AccountTypeEnum accountType;

    public AccountDTO(String name, String email, String cpf, AccountTypeEnum accountType) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.accountType = accountType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public AccountTypeEnum getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountTypeEnum accountType) {
        this.accountType = accountType;
    }
}
