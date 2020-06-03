<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 내장객체 : pageContext : 다른 내장객체에 접근 할 수 있는 객체 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// 포함 할 페이지
		pageContext.include("header.jsp");
	%>
	<h2>pageContext 페이지</h2>
	<%
		// 포함 할 페이지
		pageContext.include("footer.jsp");	
	%>
</body>
</html>

5F0B8B562693EAB3358D980F61A7B069