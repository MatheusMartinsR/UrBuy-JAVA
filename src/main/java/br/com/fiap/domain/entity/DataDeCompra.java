package br.com.fiap.petshop.domain.entity;



import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "TB_DataDeCompra")

public class DataDeCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DATA_COMPRA")
    @Column(name = "ID_COMPRA")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColum(name = "ID_PRODUTO", nullable = false)
    private Produtos produto;

    @Column(name = "DATA_COMPRA")
    private LocalDateTime dataCompra;

    public Long getId() {
        return id;
    }

    public DataDeCompra setId(Long id) {
        this.id = id;
        return this;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public DataDeCompra setUsuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }

    public Produtos getProduto() {
        return produto;
    }

    public DataDeCompra setProduto(Produtos produto) {
        this.produto = produto;
        return this;
    }

    public LocalDateTime getDataCompra() {
        return dataCompra;
    }

    public DataDeCompra setDataCompra(LocalDateTime dataCompra) {
        this.dataCompra = dataCompra;
        return this;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "DataDeCompra{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", produto=" + produto +
                ", dataCompra=" + dataCompra +
                '}';
    }
}

