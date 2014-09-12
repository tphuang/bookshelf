<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ include file="../header.jsp" %>
<div class="center">
    <h2>Add Book</h2>

    <form:form method="POST" commandName="book" modelAttribute="book"
               action="${pageContext.request.contextPath}/books/add">
        <table>
            <tbody>
            <tr>
                <td>Title:</td>
                <td class="input-control"><form:input path="title"></form:input></td>
            </tr>
            <tr>
                <td>ImagePath:</td>
                <td class="input-control"><form:input path="imagePath"></form:input></td>
            </tr>
            <tr>
                <td>Author:</td>
                <td class="input-control"><form:input path="author"></form:input></td>
            </tr>
            <tr>
                <td>ISBN:</td>
                <td class="input-control"><form:input path="ISBN"></form:input></td>
            </tr>
            <tr>
                <td><input type="submit" value="Add"></td>
                <td></td>
            </tr>
            </tbody>
        </table>
    </form:form>
</div>
<%@ include file="../footer.jsp" %>