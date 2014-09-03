<%@ include file="header.jsp" %>

<table class="table table-images">
    <c:forEach var="book" items="${books}" varStatus="i">

        <c:if test="${i.index % 3 eq 0}">
            <tr>
        </c:if>
        <td>
            <div>${i.index}</div>
            <div><img src="<c:out value="${book.imagePath}"/>"
                alt="${book.title}" title="${book.title}"></div>
            <div> <c:out value="${book.title}"/> </div>
            <div> <c:out value="${book.author}"/> </div>
            <div> <c:out value="${book.ISBN}"/> </div>
        </td>

        <c:if test="${(i.index+1) eq 0}">
            </tr>
        </c:if>
    </c:forEach>
</table>

<p><a href="${pageContext.request.contextPath}/get-douban-book">Get DoubanBook</a></p>
<p><a href="${pageContext.request.contextPath}/get-douban-collections">Get DoubanCollections</a></p>
<p><a href="${pageContext.request.contextPath}/get-douban-collections-css">Get DoubanCollectionsWithCSS</a></p>

<%@ include file="footer.jsp" %>





