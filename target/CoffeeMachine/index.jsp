<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>

<%!
String getFormattedDate(){
    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
    return sdf.format(new Date());
}
%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>CoffeeMachine</title>
</head>
    <body>
        <h2>
            Hello CoffeeMachine! <br/>
            <i>Сегодня <%= getFormattedDate() %></i>
        </h2>

        <br/>
        <a href="${pageContext.request.contextPath}/coffee/login">Please log in</a>
        <br>
        <br/>
        <a href="${pageContext.request.contextPath}/coffee/exception">Exception</a>
        <br>

    </body>
</html>
