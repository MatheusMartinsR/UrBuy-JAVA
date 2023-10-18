package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "TB_ENDERECO")

public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PESSOA")
    @Column(name = "ID_ENDERECO")
    private Long id;

    @OneToOne(mappedBy = "fornecedor")
    private Endereco endereco;

    @Column(name = "LOGRADOURO")
    private String logradouro;

    @Column(name = "NUMERO_ENDE")
    private int numero;

    @Column(name = "CEP")
    private int cep;

    @Column(name = "CIDADE_ENDE")
    private String cidade;

    @Column(name = "PAIS_ENDE")
    private String pais;





