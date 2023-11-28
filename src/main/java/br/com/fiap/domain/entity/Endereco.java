package br.com.fiap.domain.entity;


import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.C;


@Entity
@Table(name = "TB_ENDERECO")

public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ENDERECO")
    @Column(name = "ID_ENDERECO")
    private Long id;

    @Column(name = "Logradouro")
    private String logradouro;

    @Column(name = "Numero_endereco")
    private String numero;

    @Column(name = "CEP_ENDERECO")
    private String cep;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO", nullable = true) // nome da coluna na tabela TB_ENDERECO
    private Usuario usuario;


    public Long getId() {
        return id;
    }

    public Endereco setId(Long id) {
        this.id = id;
        return this;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public Endereco setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public Endereco setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public String getCep() {
        return cep;
    }

    public Endereco setCep(String cep) {
        this.cep = cep;
        return this;
    }


    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }

    public void setUsuario(Usuario usuario) {
        if (this.usuario == null || this.usuario != usuario) {
            this.usuario = usuario;
            if (usuario != null) {
                usuario.adicionarEndereco(this);
            }
        }
    }
}

