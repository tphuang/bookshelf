<%@ include file="../header.jsp" %>
<div class="douban-book center">
    <a href="${bookInfo.imagePath}"><img src="${bookInfo.imagePath}"/> </a>

    <p> ${bookInfo.title}</p>
</div>
<p><a href="${pageContext.request.contextPath}/home"> Back</a></p>
<%@ include file="../footer.jsp" %>
