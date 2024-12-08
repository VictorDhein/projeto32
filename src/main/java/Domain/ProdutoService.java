package Domain;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProdutoService {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("produtoPU");
    private static final EntityManager em = emf.createEntityManager();

    public static void salvarProduto(Produto produto) {
        em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();
    }

    public static Produto buscarProduto(Long id) {
        return em.find(Produto.class, id);
    }

    public static void fechar() {
        em.close();
        emf.close();
    }
}

