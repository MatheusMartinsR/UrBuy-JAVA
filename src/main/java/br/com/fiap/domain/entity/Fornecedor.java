package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "TB_FORNECEDOR",
uniqueConstraints = {
        @UniqueConstraint(name = "UK_NOME_FORNECEDOR", columnNameas = "NOME_FORNECEDOR")
})
public class Fornecedor
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_FORNECEDOR")
    @Column(name = "ID_FORNECEDOR")
    private Long id;

    @Column(name = "NOME_FORNECEDOR")
    private String nome;

    @Column(name = "EMAIL_FORNECEDOR")
    private String email;

    @Column(name = "SENHA_FORNECEDOR")
    private String senha;

    @OneToMany(mappedBy = "fornecedor", cascade = CascadeType.ALL)
    private Set<Produtos> produtos = new LinkedHashSet<>();
}








