<%@page import="java.util.Calendar"%><!-- import 단축키: Ctrl+SpaceBar -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cal: Today</title>
</head>
<body>
<%
Calendar cal = Calendar.getInstance();
int y = cal.get(Calendar.YEAR);
int m = cal.get(Calendar.MONTH);
int d = cal.get(Calendar.DATE);
%>

<%=y %>년 <%=m+1 %>월 <%=d %>일
</body>
</html>