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
public class Produtos {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Produtos{" +
                "id=" + id +
                ", fornecedor=" + fornecedor +
                ", nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", disponivel=" + disponivel +
                ", estado='" + estado + '\'' +
                '}';
    }
}






