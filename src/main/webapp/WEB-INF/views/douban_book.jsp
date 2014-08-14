<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<style type="text/css">
    .douban-title {
        padding: 10px 10px 0px 0px;
        text-shadow: 0 1px 0 white, 1px 2px 2px #AAA;
        font-weight: bold;
        font-size: 24px;
    }

    .douban-list a {
        padding: 10px 10px 10px 0px;
    }
</style>
<script type='text/javascript' src='/scripts/jquery-1.4.2.js'></script>
<script type="text/javascript" src="/scripts/dbapi_beta1_20120316.js"></script>
</head>
<body>
<script>
    var _defaults = {
        user: "justin79",
        api: ""
    }
    dbapi.show(_defaults);
</script>

<a href="${imagePath}"><img src="${imagePath}"/> </a>
<p> ${title}</p>

<p><a href="${pageContext.request.contextPath}/home"> Back</a></p>
</body>
</html>
