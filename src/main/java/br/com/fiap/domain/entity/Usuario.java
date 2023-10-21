package br.com.fiap.petshop.domain.entity.animal;



import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "TB_USUARIO",
uniqueConstraints = {
        @UniqueConstraint(name = "UK_NOME_USUARIO", columnNames = "NOME_USUARIO")
})

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_USUARIO")
    @Column(name = "ID_USUARIO")
    private Long id;

    @Column(name = "NOME_USUARIO")
    private String nome;

    @Column(name = "EMAIL_USUARIO" )
    private String email;

    @Column(name = "SENHA_USUARIO")
    private String senha;

    @Column(name = "CNPJ_USUARIO")
    private String cnpj;

    @Column(name = "CEP_USUARIO")
    private String cep;

    @Column(name = "RUA_USUARIO")
    private String rua;

