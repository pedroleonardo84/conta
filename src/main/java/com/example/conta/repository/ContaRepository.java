package com.example.conta.repository;

import com.example.conta.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {
    Conta findByNumeroConta (String numeroConta);
}
