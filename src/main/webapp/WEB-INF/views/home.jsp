<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>BookShelf Application</title>
    <link rel="stylesheet" href="<c:url value='/style/main.css' />" type="text/css"/>
    <script type="text/javascript" src="<c:url value='/scripts/jquery-1.10.2.js' />"></script>
    <script type="text/javascript" src="<c:url value='/scripts/bootstrap.js' />"></script>
</head>
<body>
<h1>Hello, ${name}!</h1>

<p><br>The path: <%= request.getRealPath("/images")%>
</p>

<table class="table table-images">
    <c:forEach var="imageFile" items="${imageFiles}" varStatus="i">

        <c:if test="${i.index % 3 eq 0}">
            <tr>
        </c:if>
        <td>
            <div>${i.index}</div>
            <div><img src="<c:out value="${fn:substringAfter(imageFile.path, contextPath)}"/>"
                      alt="${imageFile.name}" title="${imageFile.name}"></div>
            <%--<c:set target="${imageFile}" property="fileRelativePath" value="<c:out value='${fn:substringAfter(imageFile.path, contextPath)}'/>"/>--%>
            <c:set var="fileRelativePath"  value="${fn:substringAfter(imageFile.path, contextPath)}" scope="session"/>
            <div> <c:out value="${fileRelativePath}"/> </div>
            <a href="${pageContext.request.contextPath}/download/${imageFile.name}">DownLoad</a>
        </td>

        <c:if test="${(i.index+1) eq 0}">
            </tr>
        </c:if>
    </c:forEach>
</table>


</body>
</html>





