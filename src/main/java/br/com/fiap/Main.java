import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Criar um EntityManagerFactory para o banco de dados Oracle
        EntityManagerFactory emfOracle = Persistence.createEntityManagerFactory("oracle");

        // Obter um EntityManager para Oracle
        EntityManager emOracle = emfOracle.createEntityManager();

        try {
            // Iniciar uma transação para Oracle
            emOracle.getTransaction().begin();

            // Exemplo: Consultar todos os fornecedores no banco de dados Oracle
            List<Fornecedor> fornecedoresOracle = emOracle.createQuery("SELECT f FROM Fornecedor f", Fornecedor.class).getResultList();
            for (Fornecedor fornecedor : fornecedoresOracle) {
                System.out.println("Fornecedor Oracle: " + fornecedor.getNome());
            }

            // Commitar a transação para Oracle
            emOracle.getTransaction().commit();
        } catch (Exception e) {
            // Se ocorrer algum erro, fazer rollback da transação para Oracle
            if (emOracle.getTransaction().isActive()) {
                emOracle.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            // Fechar o EntityManager para Oracle
            if (emOracle != null && emOracle.isOpen()) {
                emOracle.close();
            }
            // Fechar o EntityManagerFactory para Oracle
            if (emfOracle != null && emfOracle.isOpen()) {
                emfOracle.close();
            }
        }
    }
}
