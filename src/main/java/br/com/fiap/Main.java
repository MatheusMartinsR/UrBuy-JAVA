package br.com.fiap;

import br.com.fiap.domain.entity.Fornecedor;
import br.com.fiap.domain.entity.Produto;
import br.com.fiap.domain.entity.ItemDeCompra;
import br.com.fiap.domain.entity.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracle");
        EntityManager em = emf.createEntityManager();


        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Nome do Fornecedor");
        fornecedor.setEmail("fornecedor@example.com");
        fornecedor.setSenha("senhaFornecedor");


        Produto produto = new Produto();
        produto.setNome("Nome do Produto");
        produto.setFornecedor(fornecedor);


        Usuario usuario = new Usuario();
        usuario.setNome("Nome do Usuário");


        ItemDeCompra itemDeCompra = new ItemDeCompra();
        itemDeCompra.setUsuario(usuario);
        itemDeCompra.setProduto(produto);
        itemDeCompra.setItem("Item de Compra");

        em.getTransaction().begin();
        em.persist(fornecedor);
        em.persist(usuario);
        em.persist(produto);
        em.persist(itemDeCompra);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
