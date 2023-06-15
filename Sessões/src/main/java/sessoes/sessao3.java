package sessoes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sessao3")

public class sessao3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
	     ServletException,IOException {	
			try{
				PrintWriter writer = response.getWriter();
				writer.append( " <HTML>  <BODY> " );
				writer.append("<h1> Numeros de acessos excedidos ");
				writer.append( "</BODY>  </HTML>" );

				
				
			} catch (IOException e){
				e.printStackTrace();
			}
		}   

}
