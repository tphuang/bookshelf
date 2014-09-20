<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ include file="../header.jsp" %>
<div class="center">
    <h2>Create Book</h2>

    <form:form method="POST" commandName="shelf" modelAttribute="shelf"
               action="${pageContext.request.contextPath}/shelves/create">
        <table>
            <tbody>
            <tr>
                <td>Capacity:</td>
                <td class="input-control"><form:input path="capacity"></form:input></td>
            </tr>
            <tr>
                <td>position:</td>
                <td class="input-control"><form:input path="position"></form:input></td>
            </tr>
            <tr>
                <td><input type="submit" value="Create"></td>
                <td></td>
            </tr>
            </tbody>
        </table>
    </form:form>
</div>
<%@ include file="../footer.jsp" %>