package io.github.sidneiimatos.bank_application.models;


import io.github.sidneiimatos.bank_application.models.enums.AccountTypeEnum;
import jakarta.persistence.*;

import java.util.UUID;


@Entity
@Table(name = "contas")
public class AccountModel {
    @Id
    @GeneratedValue(generator="uuid-sequence")
    private UUID uuid;
    @Column(name = "name")
    private String name;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "cpf", unique = true)
    private String cpf;
    @Column(name = "balance")
    private double balance;
    @Column(name = "accountType")
    private AccountTypeEnum accountType;


    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountTypeEnum getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountTypeEnum accountType) {
        this.accountType = accountType;
    }
}
