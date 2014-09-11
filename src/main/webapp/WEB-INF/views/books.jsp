<%@ include file="header.jsp" %>

<table class="table center">
    <c:forEach var="book" items="${books}" varStatus="i">

        <c:if test="${i.index % 3 eq 0}">
            <tr>
        </c:if>
        <td>
            <div>${book.id}</div>
            <div class="book-image-large"><img src="<c:out value="${book.imagePath}"/>"
                alt="${book.title}" title="${book.title}"></div>
            <div class="action-delete"><a href="books/edit/${book.id}">Edit</a></div>
            <div class="action-delete"><a href="books/delete/${book.id}">Del</a></div>
            <div> <c:out value="${book.title}"/> </div>
            <div> <c:out value="${book.author}"/> </div>
            <div> <c:out value="${book.ISBN}"/> </div>
        </td>

        <c:if test="${(i.index+1) eq 0}">
            </tr>
        </c:if>
    </c:forEach>
</table>

<p><a href="${pageContext.request.contextPath}/books/add">Add Book</a></p>
<p><a href="${pageContext.request.contextPath}/get-douban-book">Get DoubanBook</a></p>
<p><a href="${pageContext.request.contextPath}/get-douban-collections">Get DoubanCollections</a></p>
<p><a href="${pageContext.request.contextPath}/get-douban-collections-css">Get DoubanCollectionsWithCSS</a></p>

<%@ include file="footer.jsp" %>




