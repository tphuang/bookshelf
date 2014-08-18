<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- 定义分页风格：普通风格 --%>
<pg:index>
    <pg:first>
        <a href="${pageUrl}">First</a>
    </pg:first>
    <pg:prev>
        <a href="${pageUrl}">Prev</a>
    </pg:prev>
    <pg:pages>
        <c:choose>
            <%--当循环页码是当前页码，则该页码不可以导航，并显示为红色--%>
            <c:when test="${currentPageNumber eq pageNumber}">
                <span style="color: red; ">[${pageNumber}]</span>
            </c:when>

            <%-- 当循环页码不是当前页码，则该页码可以导航 --%>
            <c:otherwise>
                <a href="${pageUrl}">[${pageNumber}]</a>
            </c:otherwise>
        </c:choose>
    </pg:pages>
    <pg:next>
        <a href="${pageUrl}">Next</a>
    </pg:next>
    <pg:last>
        <a href="${pageUrl}">Last</a>
    </pg:last>
</pg:index>