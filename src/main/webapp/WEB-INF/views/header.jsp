<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>BookShelf Application</title>
    <link rel="stylesheet" href="<c:url value='/style/main.css' />" type="text/css"/>
    <link rel="stylesheet" href="<c:url value='/style/douban.css' />" type="text/css"/>
    <script type="text/javascript" src="<c:url value='/scripts/jquery-1.10.2.js' />"></script>
    <script type="text/javascript" src="<c:url value='/scripts/bootstrap.js' />"></script>
</head>

<body>
<div class="header">
    <div class="navbar">
        <a class="brand" href="<c:url value='/home' />" class="nav_link">
            TW BookShelf
        </a>
        <c:set var="userName" value="${sessionScope.userName}" scope="session"></c:set>
        <ul class="nav">
            <li>
                <a href="<c:url value='/home' />">Home</a>
            </li>
            <li>
                <a href="<c:url value='/books' />">Books</a>
            </li>
            <li>
                <a href="<c:url value='/shelves' />">Shelves</a>
            </li>
            <li>
                <a href="<c:url value='/users' />">Users</a>
            </li>
            <c:if test="${userName != null}">
                <li>
                    Welcome <a href="<c:url value='#' />">${userName}</a>!
                </li>
            </c:if>
            <li>
                <a href="<c:url value='/login' />">Login</a>
            </li>
            <li>
                <a href="<c:url value='/logout' />">Logout</a>
            </li>

        </ul>

    </div>
</div>
