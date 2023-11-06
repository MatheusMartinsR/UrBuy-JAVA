package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "TB_ENDERECO_FORNECEDOR")

public class ENDERECO_FORNECEDOR {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_FORNECEDOR")
    @Column(name = "ID_ENDERECO_FORNECEDOR")
    private Long id;

    @Column(name = "LOGRADOURO_FORNECEDOR")
    private String logradouro;

    @Column(name = "NUMERO_FORNECEDOR")
    private String numero;

    @Column(name = "CEP_FORNECEDOR")
    private String cep;

    @ManyToOne
    @JoinColumn(name = "ID_FORNECEDOR")
    private Fornecedor fornecedor;

    public Long getId() {
        return id;
    }

    public ENDERECO_FORNECEDOR setId(Long id) {
        this.id = id;
        return this;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public ENDERECO_FORNECEDOR setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public ENDERECO_FORNECEDOR setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public String getCep() {
        return cep;
    }

    public ENDERECO_FORNECEDOR setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public ENDERECO_FORNECEDOR setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
        return this;
    }

    @Override
    public String toString() {
        return "ENDERECO_FORNECEDOR{" +
                "id=" + id +
                ", logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", cep='" + cep + '\'' +
                ", fornecedor=" + fornecedor +
                '}';
    }
}