<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="pageTitle" scope="request" value="Home"/>

<%@ include file="header.jsp" %>
<div class="content-container clear">
<div class="content home-pages">
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
                <div> <c:out value="${imageFile.name}"/> </div>
                <a href="${pageContext.request.contextPath}/download?fileRelativePath=${fileRelativePath}">DownLoad</a>
            </td>

            <c:if test="${(i.index+1) eq 0}">
                </tr>
            </c:if>
        </c:forEach>
    </table>

    <p><a href="${pageContext.request.contextPath}/get-douban-book">Get DoubanBook</a></p>
    <p><a href="${pageContext.request.contextPath}/get-douban-collections-brief">Get Douban Brief Collections</a></p>
    <p><a href="${pageContext.request.contextPath}/get-douban-collections-full">Get Douban Full Collections</a></p>
    <p><a href="${pageContext.request.contextPath}/shelves">Get Shelves</a></p>
</div>
</div>

<%@ include file="footer.jsp" %>