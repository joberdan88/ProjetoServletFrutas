import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "alunoBean")
@RequestScoped
public class AlunoBean {
    private int id;
    private String nome;
    private String editIdAluno;

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEditIdAluno() { return editIdAluno; }
    public void setEditIdAluno(String editIdAluno) { this.editIdAluno = editIdAluno; }

    // Métodos de integração com DatabaseOperations
    public List<AlunoEntityManager> listaAlunosBD() {
        return DatabaseOperations.getDetalhesAlunos();
    }

    public String cadastraNovoAluno() {
        return DatabaseOperations.cadastraNovoAluno(this.nome);
    }

    public String deletaAlunoPeloId(int alunoId) {
        return DatabaseOperations.deleteAluno(alunoId);
    }

    public String atualizarAluno() {
        return DatabaseOperations.atualizarDadosAluno(this.id, this.nome);
    }

    public String editarAlunoPeloId() {
        this.id = Integer.parseInt(this.editIdAluno);
        return "editaraluno.xhtml?faces-redirect=true";
    }
}
