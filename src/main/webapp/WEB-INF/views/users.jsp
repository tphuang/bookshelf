<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>

<table class="users-container center">
    <thead class="users-title">
        <tr>
            <td>userName</td>
            <td>passWord</td>
        </tr>
    </thead>
    <tbody class="users-content">
        <c:forEach var="user" items="${users}" varStatus="i">
            <tr>
                <td>${user.userName}</td>
                <td>${user.passWord}</td>
            </tr>
        </c:forEach>
    </tbody>

</table>

<%@ include file="footer.jsp" %>