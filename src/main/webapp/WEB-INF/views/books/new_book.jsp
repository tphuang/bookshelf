<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="pageTitle" scope="request" value="NewBook"/>

<%@ include file="../header.jsp" %>
<div class="center">
    <h2>Create Book</h2>

    <form:form method="POST" commandName="book" modelAttribute="book"
               action="${pageContext.request.contextPath}/books/create">
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
                <td id="create-book"><input type="submit" value="Create"></td>
                <td></td>
            </tr>
            </tbody>
        </table>
    </form:form>
</div>
<%@ include file="../footer.jsp" %>