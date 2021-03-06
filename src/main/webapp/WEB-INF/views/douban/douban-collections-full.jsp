<%@ page pageEncoding="UTF-8" %>
<%@ include file="../header.jsp" %>

<script type="text/javascript" src="<c:url value='/scripts/jquery-1.4.2.js' />"></script>
<script type="text/javascript" src="<c:url value='/scripts/jquery-1.10.2.js' />"></script>
<script type="text/javascript" src="<c:url value='/scripts/pagination.js' />"></script>
<div class="douban-collections-page">
    <a href="${imagePath}"><img src="${imagePath}"/> </a>

    <p> ${title}</p>
    <input type='hidden' id='current_page' />
    <input type='hidden' id='items_per_page' />

    <table class="table douban-images center douban-collections">
        <c:forEach var="bookInfo" items="${bookInfos}" varStatus="i">
            <c:if test="${i.index % 3 eq 0}">
                <tr class="douban-collections-row">
            </c:if>
            <td class="douban-collection">
                <div class="collection-image-container">
                    <a href="${bookInfo.alt}"><img class="collection-image" src="${bookInfo.imagePath}"/></a>

                    <div class="collection-info">
                        <div class="suspension-box">
                            <c:out value="${bookInfo.summary}"/>
                        </div>
                    </div>
                </div>
                <div class="collection-title"><a href="${bookInfo.alt}">${bookInfo.title}</a></div>
                <div class="collection-title">${bookInfo.author}</div>

            </td>
            <c:if test="${(i.index+1) eq 0}">
                </tr>
            </c:if>
        </c:forEach>
    </table>
    <div id='page_navigation'></div>
    <p><a href="${pageContext.request.contextPath}/home"> Back</a></p>
</div>

<script type="text/javascript">
    $(function () {
        $(".collection-image-container").mouseover(function () {
            $(this).children(".collection-info").show();
        });
        $(".collection-image-container").mouseout(function () {
            $(this).children(".collection-info").hide();
        });

    });
</script>
<%@ include file="../footer.jsp" %>
