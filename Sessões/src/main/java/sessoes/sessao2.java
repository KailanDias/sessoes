package sessoes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sessao2")

public class sessao2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws 
	     ServletException,IOException {	
			try{
				String login = request.getParameter("login");
				String pessoais = request.getParameter("pessoais");
				String acdemicas = request.getParameter("academicas");
				String profissionais = request.getParameter("profissionais");
				
				
				PrintWriter writer = response.getWriter();
				writer.append( " <HTML>  <BODY> <h1> dados salvos <h1> " );
				
				writer.append( "</BODY>  </HTML>" );
				
			} catch (IOException e){
				e.printStackTrace();
			}
		}   

}
