<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Sample Application</title>
</head>
<body>
    <h1>Hello, ${name}!</h1>
    <p><img src="images/bg1.png"><br></p>
    <p><img src="images/folder1/bg2.png"><br></p>
    <p><img src="images/folder1/folder1.1/bg1.1.1.png"><br></p>
    <p><img src="images/Folder1/bg4.png"><br></p>
    <p>${imageFiles}</p>
    nihao1

    <c:forEach var="imageFile" items="${imageFiles}" varStatus="row">
        <p>/images/${imageFile.name}</p>
        <P> <img src="/bookshelf/images/${imageFile.name}"/> </P>
    </c:forEach>

    <%--<table class="table table-images">--%>
        <%--<tr>nihao1</tr>--%>
        <%--<tr>${imageFiles}</tr>--%>

        <%--<c:forEach var="imageFile" items="${imageFiles}" varStatus="row">--%>
            <%--<tr>nihao2</tr>--%>
            <%--<tr>--%>
                <%--&lt;%&ndash;<td><c:out value="${imageFile}"/></td>&ndash;%&gt;--%>
                <%--<td><img src="<c:out value="${imageFile}"/>"/></td>--%>
                <%--<td>Nihao3!</td>--%>
            <%--</tr>--%>
        <%--</c:forEach>--%>
    <%--</table>--%>



</body>
</html>





