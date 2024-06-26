package io.github.sidneiimatos.bank_application.repositorys;

import io.github.sidneiimatos.bank_application.models.AccountModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccountRepository extends JpaRepository<AccountModel, UUID> {
}
