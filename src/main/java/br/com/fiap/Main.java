package br.com.fiap;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.time.LocalDateTime;

import br.com.fiap.domain.entity.DataDeCompra;
import br.com.fiap.domain.entity.Fornecedor;
import br.com.fiap.domain.entity.Produto;
import br.com.fiap.domain.entity.Usuario;


public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracle");
        EntityManager em = emf.createEntityManager();


        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Nome do Fornecedor");


        Produto produto = new Produto();
        produto.setNome("Nome do Produto");
        produto.setFornecedor(fornecedor);


        Usuario usuario = new Usuario();
        usuario.setNome("Nome do Usuário");


        DataDeCompra compra = new DataDeCompra();
        compra.setUsuario(usuario);
        compra.setProduto(produto);
        compra.setDataCompra(LocalDateTime.now());


        em.getTransaction().begin();
        em.persist(fornecedor);
        em.persist(produto);
        em.persist(usuario);
        em.persist(compra);
        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}
