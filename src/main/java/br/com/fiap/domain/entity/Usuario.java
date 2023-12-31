package br.com.fiap.domain.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "TB_USUARIO",
        uniqueConstraints = {
                @UniqueConstraint(name = "UK_EMAIL_USUARIO", columnNames = "EMAIL_USUARIO")
        })

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_USUARIO")
    @Column(name = "ID_USUARIO")
    private Long id;

    @Column(name = "NOME_USUARIO")
    private String nome;

    @Column(name = "EMAIL_USUARIO")
    private String email;

    @Column(name = "SENHA_USUARIO")
    private String senha;

    @Column(name = "CNPJ_USUARIO")
    private String cnpj;

    @Column(name = "CEP_USUARIO")
    private String cep;

    @Column(name = "RUA_USUARIO")
    private String rua;

    @Column(name = "TIPO_USUARIO")
    private String tipo;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Endereco> enderecos;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Set<ItemDeCompra> compras = new LinkedHashSet<>();

    // Adicione um construtor para inicializar as listas
    public Usuario() {
        this.enderecos = new ArrayList<>();
        // Inicialize outras listas ou conjuntos, se houver
    }

    // Restante do código

    public void adicionarEndereco(Endereco endereco) {
        if (enderecos == null) {
            // Inicializa a lista se ainda não foi feito
            enderecos = new ArrayList<>();
        }
        enderecos.add(endereco);
        endereco.setUsuario(this);
    }

    public Long getId() {
        return id;
    }

    public Usuario setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Usuario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Usuario setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public Usuario setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Usuario setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public String getCep() {
        return cep;
    }

    public Usuario setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public String getRua() {
        return rua;
    }

    public Usuario setRua(String rua) {
        this.rua = rua;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public Usuario setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", cep='" + cep + '\'' +
                ", rua='" + rua + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
