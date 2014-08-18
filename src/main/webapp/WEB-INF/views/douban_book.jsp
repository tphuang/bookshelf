<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib uri="http://jsptags.com/tags/navigation/pager" prefix="pg" %>
<html>
<head>
    <title>Douban Book</title>
</head>
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

<pg:pager url="${pageContext.request.contextPath}/get-douban-collections" maxPageItems="${maxPageItems}"
          maxIndexPages="10" export="offset,currentPageNumber=pageNumber" isOffset="false" index="half-full">
    <table class="table Douban-images">
        <c:forEach var="bookInfo" items="${bookInfos}" varStatus="i">
            <pg:item>
                <tr>
                    <td>
                        <div>${i.index + 1}</div>
                        <div><img src="<c:out value="${bookInfo.imagePath}" /> "/></div>
                        <div><c:out value="${bookInfo.title}"/></div>
                    </td>
                </tr>
           </pg:item>
        </c:forEach>
    </table>
    <div class="pagination" style="margin-left:42%">
        <%@ include file="pagination_common.jsp" %>
    </div>
</pg:pager>

<p><a href="${pageContext.request.contextPath}/home"> Back</a></p>
</body>
</html>
