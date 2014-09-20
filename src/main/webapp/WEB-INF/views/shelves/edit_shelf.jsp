<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ include file="../header.jsp" %>
<div class="center">
    <h2>Update Shelf</h2>
    <form:form method="POST" commandName="shelf" modelAttribute="shelf"
               action="${pageContext.request.contextPath}/shelves/update">
        <table>
            <tbody>
            <tr>
                <td>Id:</td>
                <td class="input-control"><form:input path="id" readonly="true"></form:input></td>
            </tr>
            <tr>
                <td>Capacity:</td>
                <td class="input-control"><form:input path="capacity"></form:input></td>
            </tr>
            <tr>
                <td>position:</td>
                <td class="input-control"><form:input path="position"></form:input></td>
            </tr>
            <tr>
                <td><input type="submit" value="Update"></td>
                <td></td>
            </tr>
            </tbody>
        </table>
    </form:form>
</div>
<%@ include file="../footer.jsp" %>