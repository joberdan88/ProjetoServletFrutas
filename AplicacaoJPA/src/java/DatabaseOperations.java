import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DatabaseOperations {
    private static final String PERSISTENCE_UNIT_NAME = "AplicacaoJPAPU";
    private static EntityManager entityManager = 
        Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
    private static EntityTransaction transacao = entityManager.getTransaction();

    @SuppressWarnings("unchecked")
    public static List<AlunoEntityManager> getDetalhesAlunos() {
        Query queryObj = entityManager.createQuery("SELECT s FROM AlunoEntityManager s");
        List<AlunoEntityManager> listaAluno = queryObj.getResultList();
        return (listaAluno != null && !listaAluno.isEmpty()) ? listaAluno : null;
    }

    public static String cadastraNovoAluno(String nome) {
        if (!transacao.isActive()) {
            transacao.begin();
        }

        AlunoEntityManager novoAluno = new AlunoEntityManager();
        novoAluno.setNome(nome); // ID será gerado automaticamente
        entityManager.persist(novoAluno);
        transacao.commit();

        return "listaalunos.xhtml?faces-redirect=true";
    }

    public static String deleteAluno(int alunoId) {
        if (!transacao.isActive()) {
            transacao.begin();
        }

        AlunoEntityManager aluno = entityManager.find(AlunoEntityManager.class, alunoId);
        if (aluno != null) {
            entityManager.remove(aluno);
        }

        transacao.commit();
        return "listaalunos.xhtml?faces-redirect=true";
    }

    public static String atualizarDadosAluno(int alunoID, String atualizarNomeAluno) {
        if (!transacao.isActive()) {
            transacao.begin();
        }

        if (alunoID != 0 && atualizarNomeAluno != null && !atualizarNomeAluno.trim().isEmpty()) {
            Query query = entityManager.createQuery(
                "UPDATE AlunoEntityManager a SET a.nome = :nome WHERE a.id = :id"
            );
            query.setParameter("id", alunoID);
            query.setParameter("nome", atualizarNomeAluno);

            int updateCount = query.executeUpdate();

            if (updateCount > 0) {
                FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage("Aluno com ID " + alunoID + " atualizado com sucesso."));
            } else {
                FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage("Nenhum aluno encontrado com ID " + alunoID + "."));
            }
        }

        transacao.commit();
        return "listaalunos.xhtml?faces-redirect=true";
    }
}