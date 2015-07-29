<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des Utilisateurs</title>
</head>
<body>

	<form method="post">
		<div>
			<input type="text" name="inputLastNameSearch" /> <input type="text"
				name="inputFirstNameSearch" /> <input type="submit"
				value="rechercher" name="actionSearch" />
		</div>
		<div>
			<input type="submit" value="créer manager" name="actionCreateManager" />
		</div>
	</form>
	<table>
		<tr>
			<th>nom</th>
			<th>prenom</th>
			<th>mail</th>
			<th>métier</th>
			<th>actions</th>
		</tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<td><c:out value="${user.lastName}"></c:out></td>
				<td><c:out value="${user.firstName}"></c:out></td>
				<td><c:out value="${user.mail}"></c:out></td>
				<td><c:out value="${user.job}"></c:out></td>
				<td>
					<form method="post">
						<input type="hidden" value="${user.id}" name="inputId" /> <input
							type="submit" value="Editer" name="actionEdit" /> <input
							type="submit" value="Supprimer" name="actionDelete" />
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>