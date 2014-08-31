<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>

<form class="form-horizontal center" name='f' action="<c:url value='login-validation' />" method="post">
    <div class="sucess-message"> <b>${successMessage}</b></div>
    <div class="control-group">
        <label class="control-label" for="username">Username</label>

        <div class="controls">
            <input class="form-control" type='text' id="username" name='username' placeholder="Username"/>
        </div>
    </div>
    <div class="control-group">
        <label class="control-label" for="password">Password</label>

        <div class="controls">
            <input class="form-control" type="password" id="password" name="password" placeholder="Password"/>
        </div>
    </div>
    <div class="control-group">
        <div class="controls">
            <button type="submit" class="btn btn-primary">Login</button>
        </div>
    </div>

    Don't have an account? <a href='<c:url value="/user/create" />'>Click here to register one!</a>
</form>

<%@ include file="footer.jsp" %>