<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Douban Book</title>
</head>
    <style type="text/css">
        .douban-title {
            padding: 10px 10px 0px 0px;
            text-shadow: 0 1px 0 white, 1px 2px 2px #AAA;
            font-weight: bold;
            font-size: 24px;
        }

        .douban-list a {
            padding: 10px 10px 10px 0px;
        }
    </style>
    <link rel="stylesheet" href="<c:url value='/style/main.css' />" type="text/css"/>
    <script type="text/javascript" src="<c:url value='/scripts/jquery-1.10.2.js' />"></script>
    <script type="text/javascript" src="<c:url value='/scripts/bootstrap.js' />"></script>
    <script type='text/javascript' src='/scripts/jquery-1.4.2.js'></script>
    <script type="text/javascript" src="/scripts/dbapi_beta1_20120316.js"></script>
</head>
<body>
<script>
    var _defaults = {
        user: "justin79",
        api: ""
    }
    dbapi.show(_defaults);
</script>

<a href="${imagePath}"><img src="${imagePath}"/> </a>

<p> ${title}</p>


<table class="table Douban-images">
    <c:forEach var="bookInfo" items="${bookInfos}" varStatus="i">

        <c:if test="${i.index % 3 eq 0}">
            <tr>
        </c:if>
        <td>
            <div>${i.index}</div>
            <div><img src="<c:out value="${bookInfo.imagePath}" /> "/></div>
            <div><c:out value="${bookInfo.title}"/></div>
        </td>

        <c:if test="${(i.index+1) eq 0}">
            </tr>
        </c:if>
    </c:forEach>
</table>

<p><a href="${pageContext.request.contextPath}/home"> Back</a></p>
</body>
</html>
