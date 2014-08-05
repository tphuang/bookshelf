<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Sample Application</title>
</head>
<body>
<h1>Hello, ${name}!</h1>

<p>The path: <%= request.getRealPath("/images")%></p>


<table class="table table-images">
    <c:forEach var="imageFile" items="${imageFiles}" varStatus="row">
        <tr>
            <td>/images/${imageFile.name}</td>
            <td><img src="<c:out value="${fn:substringAfter(imageFile.path, contextPath)}"/>"
                     alt="${imageFile.name}" title="${imageFile.name}"></td>
        </tr>
    </c:forEach>
</table>


</body>
</html>





