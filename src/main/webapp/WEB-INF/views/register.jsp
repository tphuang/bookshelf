<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>

<form class="form-horizontal center" name='f' action="<c:url value='/user/register' />" method="post">
    <div class="control-group">
        <label class="control-label" for="username">Username*</label>

        <div class="controls">
            <input class="form-control" type='text' id="username" name='username' placeholder="Username"/>
        </div>
    </div>
    <div class="control-group">
        <label class="control-label" for="password">Password*</label>

        <div class="controls">
            <input class="form-control" type="password" id="password" name="password" placeholder="Password"/>
        </div>
    </div>
    <div class="control-group">
        <div class="controls">
            <button type="submit" class="btn btn-primary">Register</button>
        </div>
    </div>

    Have an account, please login! <a href='<c:url value="/login" />'>Click here to login</a>
</form>

<%@ include file="footer.jsp" %>