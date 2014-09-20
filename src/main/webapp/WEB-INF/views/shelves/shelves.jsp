<%@ include file="../header.jsp" %>
<div class="content-container clear">
    <div class="content">
        <table class="table center">
            <tr>
                <td>ShelfId</td>
                <td>Capacity</td>
                <td>Position</td>
                <td>Action</td>
            </tr>
            <c:forEach var="shelf" items="${shelves}" varStatus="i">
                <tr>
                    <td><c:out value="${shelf.id}"/></td>
                    <td><c:out value="${shelf.capacity}"/></td>
                    <td><c:out value="${shelf.position}"/></td>
                    <td>
                        <a href="shelves/edit/${shelf.id}">Edit</a>
                        <a href="shelves/delete/${shelf.id}">Del</a>
                    </td>
                </tr>
            </c:forEach>
        </table>

        <div><a href="shelves/new">Add a shelf</a></div>
    </div>
</div>
<%@ include file="../footer.jsp" %>
