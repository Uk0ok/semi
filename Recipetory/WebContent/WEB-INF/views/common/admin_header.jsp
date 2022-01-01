<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file = "/WEB-INF/views/common/w3s.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	body {
        box-sizing: border-box;
        min-width: 1240px;
        margin: auto;
    }
  
	#header {
    	padding: 1rem 2rem;
    }
    
	.navbar {
		padding: 0 30px;
		background-color: rgb(175, 187, 175); 
	}
	
	.navbar-brand {
		font-size:small;
	}
	
	#nav_wrap {
    	padding: 0;
    	background-color: rgb(175, 187, 175);
    	width:100%;
    }
	
</style>
</head>
<body>

	
	<div id="header">
		<h3> 관리자 페이지</h3>
	</div>
	
	<div id="nav_wrap">
		<nav class="navbar navbar-expand-sm navbar-light">
	       	<span class="navbar-text">
	           	${loginUser.adminId}   
	           	<a class="navbar-brand" href="logout">로그아웃</a>
			</span>
			
			<form action="board" method="get">
				<ul class="navbar-nav">
					<li class="nav-item">
						<a class="nav-link" href="#">회원관리</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="mAdmin">관리자관리</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="mReport">신고관리</a>
					</li>
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">게시글관리</a>
						<div  class="dropdown-menu">
							<a class="dropdown-item" href="./mNoti">공지사항</a>
							<a class="dropdown-item" href="./mMag">매거진</a>
						</div>
					</li>
				</ul>
			</form>
		</nav>
	</div>
    
	
</body>
</html>