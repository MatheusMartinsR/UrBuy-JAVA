package br.com.fiap;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.time.LocalDateTime;

import br.com.fiap.domain.entity.DataDeCompra;
import br.com.fiap.domain.entity.Fornecedor;
import br.com.fiap.domain.entity.Produtos;
import br.com.fiap.domain.entity.Usuario;


public class Main {
    public static void main(String[] args) {
        // Configuração do EntityManagerFactory
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracle");
        EntityManager em = emf.createEntityManager();

        // Criando instâncias das entidades
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Nome do Fornecedor");
        // ... outras configurações do fornecedor

        Produtos produto = new Produtos();
        produto.setNome("Nome do Produto");
        produto.setFornecedor(fornecedor);
        // ... outras configurações do produto

        Usuario usuario = new Usuario();
        usuario.setNome("Nome do Usuário");
        // ... outras configurações do usuário

        DataDeCompra compra = new DataDeCompra();
        compra.setUsuario(usuario);
        compra.setProduto(produto);
        compra.setDataCompra(LocalDateTime.now());

        // Iniciando a transação e persistindo os dados
        em.getTransaction().begin();
        em.persist(fornecedor);
        em.persist(produto);
        em.persist(usuario);
        em.persist(compra);
        em.getTransaction().commit();

        // Fechando o EntityManager e o EntityManagerFactory
        em.close();
        emf.close();
    }
}
