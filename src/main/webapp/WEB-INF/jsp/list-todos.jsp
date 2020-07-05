<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
<title>Todo's for ${name}</title>
</head>

<body>
<center>
<H1>Your Todos</H1>
<table>
<caption>Your Todos Are </caption>
<thead>
<tr>
<th>Description</th>
<th>Target Date</th>
<th>Is it Done?</th>

</tr>
</thead>

<tbody>
<c:forEach items="${todos}" var="todo">
<tr>
<td>${todo.desc}</td>
<td>${todo.targetDate}</td>
<td>${todo.done}</td>
</tr>

</c:forEach>

</tbody>
</table>
<br>

<a href="/add-todo">Add a todo</a></center>

</body>

</html>