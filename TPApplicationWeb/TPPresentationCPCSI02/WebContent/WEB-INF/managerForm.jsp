<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post">
		<div>
			<label for="inputNom"> nom </label> <input type="text"
				name="inputNom" id="inputNom" value="${manager.lastName}" />
		</div>
		<div>
			<label for="inputPrenom"> prenom </label> <input type="text"
				name="inputPrenom" id="inputPrenom" value="${manager.firstName}" />
		</div>
		<div>
			<label for="inputMail"> mail </label> <input type="text"
				name="inputMail" id="inputMail" value="${manager.mail}" />
		</div>
		<div>
			<label for="inputPassw"> mot de pass </label> <input type="password"
				name="inputPassw" id="inputPassw" value="${manager.password}" />
		</div>
		<div>
			<input type="hidden" name="inputId" id="inputId" />
		</div>
		<div>
			<c:choose>
			<c:when test="${empty manager}">
				<input type="submit" name="actionCreate" value="Créer"/>
			
			</c:when>
			<c:otherwise>
				<input type="submit" name="actionEdit" value="Editer"/>
			
			</c:otherwise>
			</c:choose>
			
		</div>
	</form>
</body>
</html>