import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Usuario {
    private String nome;
    private String email;

    public Usuario() {}

    public boolean salvar() {
        int result = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver atualizado
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jsfpersistencia", "root", "sua_senha"
            );
            PreparedStatement stmt = con.prepareStatement(
                "INSERT INTO usuario(nome, email) VALUES (?, ?)"
            );
            stmt.setString(1, this.getNome());
            stmt.setString(2, this.getEmail());
            result = stmt.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result == 1;
    }

    public String submit() {
        return salvar() ? "resposta" : "index";
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
