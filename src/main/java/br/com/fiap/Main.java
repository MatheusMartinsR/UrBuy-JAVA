package br.com.fiap;

import br.com.fiap.domain.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {
            emf = Persistence.createEntityManagerFactory("oracle");
            em = emf.createEntityManager();

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

            Endereco endereco = new Endereco();
            endereco.setLogradouro("Logradouro do Usuário");
            endereco.setNumero("123");
            endereco.setCep("12345-678");


            endereco.setUsuario(usuario);

            em.getTransaction().begin();

            em.persist(fornecedor);
            em.persist(usuario);
            em.persist(produto);
            em.persist(itemDeCompra);
            em.persist(endereco);

            em.getTransaction().commit();

        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }
    }
}

