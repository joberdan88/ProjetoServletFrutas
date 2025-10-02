import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/CalcSer")
public class CalcSer extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        String visor = request.getParameter("txtnum1") != null ? request.getParameter("txtnum1") : "";
        String botao = request.getParameter("btnsubmit");

        if (botao.equals("+") || botao.equals("-") || botao.equals("*")) {
            session.setAttribute("num1", Integer.parseInt(visor));
            session.setAttribute("operacao", botao);
            response.sendRedirect("Calculadora.jsp?txtnum1=");
        } else if (botao.equals("=")) {
            int num1 = (int) session.getAttribute("num1");
            String operacao = (String) session.getAttribute("operacao");
            int num2 = Integer.parseInt(visor);
            int resultado = 0;

            switch (operacao) {
                case "+": resultado = num1 + num2; break;
                case "-": resultado = num1 - num2; break;
                case "*": resultado = num1 * num2; break;
            }

            response.sendRedirect("Calculadora.jsp?txtnum1=" + resultado);
        } else {
            // Botão numérico
            visor += botao;
            response.sendRedirect("Calculadora.jsp?txtnum1=" + visor);
        }
    }
}