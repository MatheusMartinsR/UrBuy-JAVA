<<<<<<< HEAD
package br.com.fiap;

import br.com.fiap.domain.entity.Author;
import br.com.fiap.domain.entity.Book;
import br.com.fiap.domain.entity.PessoaFisica;
import br.com.fiap.domain.entity.PessoaJuridica;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory( "oracle", getProperties() );
        EntityManager manager = factory.createEntityManager();


        manager.getTransaction().begin();
        manager.persist( holding );
        manager.persist( livro );
        manager.getTransaction().commit();

        System.out.println( holding );
        System.out.println( livro );

        manager.close();
        factory.close();

    }

    private static Map<String, Object> getProperties() {
        Map<String, String> env = System.getenv();
        Map<String, Object> properties = new HashMap<>();

        for (String chave : env.keySet()) {
            if (chave.contains( "USER_FIAP" )) {
                properties.put( "jakarta.persistence.jdbc.user",  env.get( chave ) );
            }
            if (chave.contains( "PASSWORD_FIAP" )) {
                properties.put( "jakarta.persistence.jdbc.password",  env.get( chave ) );
            }
            // Outras configurações de propriedade ....
        }
        return properties;
    }


}
=======
>>>>>>> 789dcbcb5b5a7972dfedbdfe6258b9969fdc0162
