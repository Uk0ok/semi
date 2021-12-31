<%@page import="java.util.List"%>
<%@page import="com.reci.recipe.vo.RBoardVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% 
	List<RBoardVo> rdatalist = (List<RBoardVo>)request.getAttribute("data");
	for(RBoardVo rb : rdatalist) {
		
		System.out.println(rb);
		System.out.println("zzzzz : " + rb.getRbegDate());//swy
	}
%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>레시피 게시판</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

        <style>
            a {
                text-decoration: none;
                color: inherit;
            }

            .board_list_wrap {
                padding: 50px;
                margin-left: 18%;
		        margin-right: 18%;
            }

            .board_list_head,
            .board_list_body .item {
                padding: 10px 0;
                font-size: 0;
            }

            .board_list_head {
                border-top: 2px solid green;
                border-bottom: 1px solid #ccc;
            }

            .board_list_body .item {
                border-bottom: 1px solid #ccc;
            }

            .board_list_head>div,
            .board_list_body .item>div {
                display: inline-block;
                text-align: center;
                font-size: 14px;
            }

            .board_list_head>div {
                font-weight: 600;
            }

            .board_list .num {
                width: 10%;
            }

            .board_list .tit {
                width: 60%;
            }

            .board_list_body div.tit {
                text-align: left;
            }

            .board_list_body div.tit a:hover {
                text-decoration: underline;
            }

            .board_list .date {
                width: 15%;
            }

            .board_list .review {
                width: 10%;
            }

            .writing {
                position: relative;
                top: -130px;
                left: 1450px;
            }

            /* paging */
            .paging {
                margin-top: 30px;
                text-align: center;
            }

            .paging a {
                display: inline-block;
                vertical-align: middle;
            }

            .paging a.bt {
                width: 30px;
                height: 30px;
                background-color: #ccc;
                background-image: url(../img/page_bt.png);
                background-repeat: no-repeat;
                border-radius: 100px;
                text-indent: -1000px;
                overflow: hidden;
            }

            .paging a.bt:hover {
                background-color: #999;
            }

            .paging a.first {
                background-position: 10px -40px;
            }

            .paging a.prev {
                margin-right: 5px;
                background-position: 10px 10px;
            }

            .paging a.next {
                margin-left: 5px;
                background-position: -40px 10px;
            }

            .paging a.last {
                background-position: -40px -40px;
            }

            .paging a.num {
                margin: 0 5px;
            }

            .paging a.num.on {
                color: green;
            }

            .paging a.num:hover {
                text-decoration: underline;
            }

            .board_page {
                margin-top: 30px;
                text-align: center;
                font-size: 0;
            }

            .board_page a {
                display: inline-block;
                width: 32px;
                height: 32px;
                box-sizing: border-box;
                vertical-align: middle;
                border: 1px solid #ddd;
                border-left: 0;
                line-height: 100%;
            }

            .board_page a.bt {
                padding-top: 10px;
                font-size: 1.2rem;
                letter-spacing: -1px;
            }

            /* 페이지 */

            .board_page {
                padding-bottom: 20px;
            }

            .board_page a.num {
                padding-top: 4px;
                font-size: 1.4rem;
            }

            .board_page a.num.on {
                border-color: rgb(175, 187, 175);
                background: rgb(175, 187, 175);
                color: black;
            }

            .board_page a:first-child {
                border-left: 1px solid #ddd;
            }
        </style>
    </head>

    <body>
        <%@ include file="/WEB-INF/views/common/header.jsp" %>

            <body>
                <div class="wrap">

                    <head>
                        <title>레시피 게시판 목록</title>
                    </head>

                    <body>
                        <div class="board_list_wrap">
                            <div class="board_list">
                                <div class="board_list_head">
                                    <div class="num">번호</div>
                                    <div class="tit">레시피 이름</div>
                                    <div class="parti">작성자</div>
                                    <div class="date">작성일</div>
                                    <div class="review">리뷰수</div>
                                </div>
                                <div class="board_list_body">
                                	                                
                                <c:forEach items="${data}" var="rb">
                                	<div class="item">
                                        <div class="num">${rb.rpostNo}</div>
                                        <div class="tit"> 
                                            <a href="chickchest">
                                            <img
                                                src="${pageContext.request.contextPath}${rb.rthumbnail}" width="200" height="150">
                                            ${rb.rpostName}
                                            </a>
                                        </div>
                                        <div class="writer">${rb.userNo}</div>
                                        <div class="date">${rb.rbegDate}</div>
                                        <div class="review"><a href="#">${rb.rreviewNum}</a></div>
                                    </div>
                                </c:forEach>
                                
                                
                            	</div>
                        	</div>
                		</div>
                <div class="board_page">
                    <a href="#" class="bt first"><<</a>
                    <a href="#" class="bt prev"><</a>
                    <a href="#" class="num on">1</a>
                    <a href="#" class="num">2</a>
                    <a href="#" class="num">3</a>
                    <a href="#" class="num">4</a>
                    <a href="#" class="num">5</a>
                    <a href="#" class="bt next">></a>
                    <a href="#" class="bt last">>></a>
                </div>
                ><a href="writing" class="writing">글쓰기</a>
                </div>
                </div>

                <%@ include file="/WEB-INF/views/common/footer.jsp" %>
            </body>

    </body>

    </html>