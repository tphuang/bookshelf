<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="pageTitle" scope="request" value="Users"/>

<%@ include file="../header.jsp" %>
<div class="content-container clear">
    <div class="content user-pages">
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
    </div>
</div>

<%@ include file="../footer.jsp" %>