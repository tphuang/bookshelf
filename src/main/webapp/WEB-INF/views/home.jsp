<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ include file="header.jsp" %>

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
            <a href="${pageContext.request.contextPath}/download?fileRelativePath=${fileRelativePath}">DownLoad</a>
        </td>

        <c:if test="${(i.index+1) eq 0}">
            </tr>
        </c:if>
    </c:forEach>
</table>

<p><a href="${pageContext.request.contextPath}/get-douban-book">Get DoubanBook</a></p>
<p><a href="${pageContext.request.contextPath}/get-douban-collections">Get DoubanCollections</a></p>

<%@ include file="footer.jsp" %>





