<%@include file="_header.jsp" %>

<%@page import="java.util.ArrayList" %>

<h1 id="title">Listagem de Fabricantes</h1>
<hr/>

<table border="1">
<tr>
	<td>Nome</td>
	<td>Nota</td>
	<td>Excluir</td>
</tr>

<c:forEach items="${requestScope.lista}" var="a" >
	<tr>
		<td> <c:out value="${a.nome}"/>  </td>
		<td> <a href="notaInserir.jsp?idfabricante=<c:out value='${a.id}'/>"> Registrar </a> </td>
		<td> <a href="fabricanteserv?comando=remover&origem=lista&id=<c:out value='${a.id}'/>"> Excluir </a> </td>
	</tr>
</c:forEach>

</table>

<%
	/*
	// 1. Recuperar a lista empacotada na requisição
	ArrayList lista = (ArrayList)request.getAttribute("lista");

	// 2. Iterar sobre a lista imprimindo todos os fabricantes
	for (int i=0;i<lista.size();i++)
	{
		// 2.1. Lê o fabricante da lista
		Fabricante a = (Fabricante)lista.get(i);

		// 2.2. Imprime os dados na tela
		out.write("Nome: "+a.getNome()+" Matr:"+a.getMatricula());
	}
	*/
%>



<%@include file="_footer.jsp" %>




