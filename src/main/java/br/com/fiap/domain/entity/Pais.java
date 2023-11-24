package br.com.fiap.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_PAIS")

public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PAIS")
    @Column(name = "ID_PAIS")
    private Long id;

    @Column(name = "NOME_PAIS")
    private String nome;

    public Long getId() {
        return id;
    }

    public Pais setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Pais setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
