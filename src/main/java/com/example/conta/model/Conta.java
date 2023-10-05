package com.example.conta.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoConta;
    private String numeroConta;
    private Date dataAberturaConta;
    private double saldoDolar;
    private double saldoReal;
    private String status;
    @OneToMany(mappedBy = "conta", cascade = CascadeType.ALL)
    private Set<TitularConta> titulares = new HashSet<>();
}
