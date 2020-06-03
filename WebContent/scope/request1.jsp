<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//info.jsp에서 넘긴 값 가져오기( forward 방식으로 넘어올 때만 가능 )
    	request.setCharacterEncoding("utf-8");
    	String id = request.getParameter("userid");
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 	<h2>User ID : <%=id %></h2>--%>
<h1>session 값 가져오기 : <%=session.getAttribute("userid") %></h1>
</body>
</html>