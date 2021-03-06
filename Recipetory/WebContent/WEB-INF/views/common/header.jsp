<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Header</title>

<style>
    body {
        box-sizing: border-box;
        min-width: 1240px;
        margin: auto;
    }

    header{
        background-color: rgb(175, 187, 175);
    }

    #h_head {
        padding-top: 40px;
        height: 130px;
        width: 1200px;
        margin: 0 auto;
    }

    #h_title {
        float: left;
        padding-left: 50px;
    }

    #nav {
        width: 1200px;
        margin: auto;
    }
    
    div > a, .nav-link{
    	color: #000;
    }

</style>
</head>
<body>

	<%@ include file="/WEB-INF/views/common/w3s.jsp"%>
	
	<header>
		<div id="h_head" class="row">
			<a href="/Recipetory/home" id="h_title" class="col-9">
				<img src="${pageContext.request.contextPath}/img/home/logo1.png" width="350px">
			</a>
			
			<div id="h_content" class="col-3">
				<c:if test="${empty loginUser}">
					<div id="h_join">
						<a href="login">로그인</a>
						<a href="join">회원가입</a>
					</div>
				</c:if>
				<c:if test="${!empty loginUser }">
					${loginUser.userId}
					<a href="userLogout">로그아웃</a>
				</c:if>
	            <form id="h_search">
	                <input type="search" name="search" placeholder="레시피찾기">
	                <button type="submit"><i class="fas fa-search"></i></button>
	            </form>
	        </div>
		</div>
	
		<div id="h_menu" class="container">  
			<ul id="nav" class="nav nav-tabs nav-justified">
				<li class="nav-item">
					<a class="nav-link" href="/Recipetory/recipe">레시피</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="/Recipetory/challenge">챌린지</a>
				</li>
			<!--<li class="nav-item">
	              <a class="nav-link" href="#">식단코칭</a>
	            </li> -->
	            <li class="nav-item">
					<a class="nav-link" href="/Recipetory/magazine">매거진</a>
				</li>
				<li class="nav-item">
	                <a class="nav-link" href="/Recipetory/mypage">마이페이지</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="/Recipetory/support">고객센터</a>
				</li>
			</ul>
		</div>
	</header>
	
</body>
</html>