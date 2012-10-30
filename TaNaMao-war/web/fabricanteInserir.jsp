<%@include file="_header.jsp" %>
			
<h1 id="title">Inserir Fabricante</h1>
<hr/>

<form action="fabricanteserv" method="get">
	<input type="hidden" name="comando" value="inserir" /> 
	Nome: <input type="text" name="nome" /> <br />
	<input type="submit" value="Inserir" />
</form>

<c:if test="${param.msg != null}">
	<hr/>
	<h3> <c:out value="${param.msg}" /> </h3>
</c:if>
<% 
	/* SUBSTITUIDO POR JSTL
	String mensagem = request.getParameter("msg");

	if (mensagem != null)
	{
		out.write("<hr/>");
		out.write("<h3>"+mensagem+"</h3>");
	}
	*/
%>

<%@include file="_footer.jsp" %>