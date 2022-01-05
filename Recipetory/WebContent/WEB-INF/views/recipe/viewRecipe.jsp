<%@page import="java.util.ArrayList"%>
<%@page import="com.reci.recipe.vo.registerRecipeVo"%>
<%@page import="com.reci.recipe.vo.recipeImgVo"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
List<recipeImgVo> fnlist = (List<recipeImgVo>) request.getAttribute("imgdata"); // attribute는 object라서 ArrayList로 형변환
for (recipeImgVo riv : fnlist) {
	System.out.println(riv);
}
%>
<!DOCTYPE html>
<html lang="ko">
<head>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/viewRecipe.css">

</head>

<body>
	<%@ include file="/WEB-INF/views/common/header.jsp"%>

	<div class="board_wrap">
		<div class="board_title">
			<h3>[레시피]</h3>
		</div>
		<div class="board_view_wrap">
			<div class="board_view">
				<div class="title">${viewRecipe.rpostName}</div>
				<div class="info">
					<dl>
						<dt>번호</dt>
						<dd>${viewRecipe.rpostNo}</dd>
					</dl>
					<dl>
						<dt>글쓴이</dt>
						<dd>${viewRecipe.userNo}</dd>
					</dl>
					<dl>
						<dt>작성일</dt>
						<dd>${viewRecipe.rbegDate}</dd>
					</dl>
					<dl>
						<dt>조회</dt>
						<dd></dd>
					</dl>
				</div>

				<%
				int idx = 0;
				%>
				<c:forEach var="riv" items="${imgdata}">
					<div class="cont">
						<img
							src="${pageContext.request.contextPath}/img/recipeBoard/${riv.mfileName}"
							width="600px">
						<p><%=((List) request.getAttribute("rpostContentlist")).get(idx++)%></p>
					</div>
				</c:forEach>
			</div>
			<%-- <div class="cont">
					<img src="${pageContext.request.contextPath}/img/recipeBoard/${(fnList)[1].mfileName}" width="600px">
					<p>${viewRecipe.rpostContent2}</p>
				</div>
				<div class="cont">
					<img src="${pageContext.request.contextPath}/img/recipeBoard/${(fnList)[2].mfileName}" width="600px">
					<p>${viewRecipe.rpostContent3}</p>
				</div>
				<div class="cont">
					<img src="${pageContext.request.contextPath}/img/recipeBoard/${(fnList)[3].mfileName}" width="600px">
					<p>${viewRecipe.rpostContent4}</p>
				</div>
				<div class="cont">
					<img src="${pageContext.request.contextPath}/img/recipeBoard/${(fnList)[4].mfileName}" width="600px">
					<p>${viewRecipe.rpostContent5}</p>
				</div> --%>

			<!-- <div class="media border p-3"></div> -->


			<a type="button" href="javascript:history.back();"
				class="btn btn-primary write"
				style="background-color: darkolivegreen; border-color: darkolivegreen;">뒤로가기</a>
			<a type="button" href="edit" class="btn btn-primary write"
				style="background-color: darkolivegreen; border-color: darkolivegreen;">수정하기</a>
		</div>
	</div>

	<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>

</html>