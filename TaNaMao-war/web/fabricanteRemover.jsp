<%@include file="_header.jsp" %>
			
<h1 id="title">Remover Fabricante</h1>
<hr/>

<form action="fabricanteserv" method="get">
	<input type="hidden" name="comando" value="remover" />
	<input type="hidden" name="origem" value="formulario" />
	Id: <input type="text" name="id" /> <br />
	<br />
	<input type="submit" value="Remover" />
</form>

<c:if test="${param.msg != null}">
	<hr/>
	<h3> <c:out value="${param.msg}" /> </h3>
</c:if>
<% 
	/* SUBSTITUÍDO POR JSTL
	String mensagem = request.getParameter("msg");

	if (mensagem != null)
	{
		out.write("<hr/>");
		out.write("<h3>"+mensagem+"</h3>");
	}
	*/
%>

<%@include file="_footer.jsp" %>