<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.reci.join.controller.userDao" %>
<%@ page import="java.io.PrintWriter" %>
<%@ request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="user" class="com.reci.join.controller.UserVo" scope="page" />
<jsp:setProperty name="user" property="userId" />
<jsp:setProperty name="user" property="userPwd" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>

</head>
<body>
	<%
		userDao userDAO = new userDao();
		int result = userDAO.login(user.getUserId(), user.getUserPwd());
		if (result == 1) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("location.href = './home'");
			script.println("</script>");
		} else if (result == 0) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('비밀번호가 틀렸습니다.')");
			script.println("history.back()");
			script.println("</script>");
		} else if (result == -1) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('존재하지 않는 아이디입니다.')");
			script.println("history.back()");
			script.println("</script>");
		} else if (result == -2) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('데이터베이스 오류 발생')");
			script.println("history.back()");
			script.println("</script>");
		}
	%>
</body>
</html>