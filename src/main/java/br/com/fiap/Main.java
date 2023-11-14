package br.com.fiap;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.time.LocalDateTime;

import br.com.fiap.domain.entity.ItemDeCompra;
import br.com.fiap.domain.entity.Produto;
import br.com.fiap.domain.entity.Usuario;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracle");
        EntityManager em = emf.createEntityManager();


        Usuario usuario = new Usuario();
        usuario.setNome("Nome do Usuário");

        Produto produto = new Produto();
        produto.setNome("Nome do Produto");

        ItemDeCompra itemDeCompra = new ItemDeCompra();
        itemDeCompra.setUsuario(usuario);
        itemDeCompra.setProduto(produto);
        itemDeCompra.setItem("Item de Compra");


        em.getTransaction().begin();
        em.persist(usuario);
        em.persist(produto);
        em.persist(itemDeCompra);
        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}
