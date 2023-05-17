<%
	Integer id = (Integer) session.getAttribute("id");

	if (id >0) {
		
		// Remove o atributo da sessão
        session.removeAttribute("id");
		response.sendRedirect("../Login/login.jsp");
	}
	%>