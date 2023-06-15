<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ page  import = "java.util.*"%>
<%
HttpSession sessao = request.getSession(true);	

			Integer acessos = (Integer) sessao.getAttribute("Numero_acessos");
			if (acessos == null) { acessos = 1;
			}else { acessos = acessos + 1; }
			sessao.setAttribute("Numero_acessos", acessos);	
			
			if(acessos == 100){	
				response.sendRedirect("sessao3");
			}
			
			
			
			

%>
<html>
<head>
<meta charset="UTF-8">
<title> Exemplo de Sessão </title>
</head>
<body>

<h1><% out.println(acessos); %></h1>

<form action="sessao2" method="post" >
	<input type="text" name="login"> <br>
	<input type="text" name="pessoais"><br>
	<input type="text" name="academicas"><br>
	<input type="text" name="profissionais"><br>
	<input type="submit"><br>
</form>

</body>
</html>