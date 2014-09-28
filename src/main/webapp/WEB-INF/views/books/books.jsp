<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="pageTitle" scope="request" value="Books"/>

<%@ include file="../header.jsp" %>
<table class="table center">
    <c:forEach var="book" items="${books}" varStatus="i">

        <c:if test="${i.index % 3 eq 0}">
            <tr>
        </c:if>
        <td>
            <div>${book.id}</div>
            <div class="book-image-large"><img src="<c:out value="${book.imagePath}"/>"
                                               alt="${book.title}" title="${book.title}"></div>
            <%--<div class="action-item"><a class="action-delete" href="javascript:void(0);" onclick="deleteBook('${book.id}');">Del</a></div>--%>
            <div class="action-item"><a class="action-delete" href="books/delete/${book.id}">Del</a></div>
            <div class="action-item"><a class="action-edit" href="books/edit/${book.id}">Edit</a></div>
            <div><c:out value="${book.title}"/></div>
            <div><c:out value="${book.author}"/></div>
            <div><c:out value="${book.ISBN}"/></div>
        </td>

        <c:if test="${(i.index+1) eq 0}">
            </tr>
        </c:if>
    </c:forEach>
</table>

<p><a id="add-book" href="${pageContext.request.contextPath}/books/new">Add Book</a></p>
<p><a href="${pageContext.request.contextPath}/get-douban-book">Get DoubanBook</a></p>
<p><a href="${pageContext.request.contextPath}/get-douban-collections-brief">Get Douban Brief Collections</a></p>
<p><a href="${pageContext.request.contextPath}/get-douban-collections-full">Get Douban Full Collections</a></p>

<script type="text/javascript">
    function deleteBook(bookId) {
        var isConfirmed = confirm("Are you sure to delete this book?");
        if (isConfirmed) {
            var $deleteBookById = $("#deleteBookById");
            $deleteBookById.attr("action", "books/delete/" + bookId);
            $deleteBookById.submit();
        }
    }
</script>
<form id="deleteBookById" method="post" action=''>
    <input type="hidden" id="bookIdToDel" name="bookIdToDel" value=""/>
    <%--<input type="submit" id="bookToDelBtn" name="bookToDelBtn" value="Del"/>--%>
</form>

<%@ include file="../footer.jsp" %>





