package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "TB_PRODUTOS",
uniqueConstraints = {
        @UniqueConstraint(name = "UK_NOME_PRODUTO", columnNames = "NOME_PRODUTO")
})
public class Produtos
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PRODUTOS")
    @Column(name = "ID_PRODUTO")
    private Long id;

    @ManyToOne
    @Column(name = "ID_FORNECEDOR", nullable = false)
    private Fornecedor fornecedor;

    @Column(name = "NOME_PRODUTO", nullable = false)
    private String nome;

    @Column(name = "MARCA_PRODUTO")
    private String marca;

    @Column(name = "MODELO_PRODUTO")
    private String modelo;

    @Column(name = "DESC_PRODUTO")
    private String descricao;

    @Column(name = "PRECO_PRODUTO")
    private double preco;

    @Column(name = "DISP_PRODUTO")
    private boolean disponivel = false;

    @Column(name = "ESTADO_PRODUTO")
    private String estado;







