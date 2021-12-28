<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
    body {
        box-sizing: border-box;
        margin: auto;
        background-color: cornsilk;
    }
    
    #wrap {
    	width: 1200px;
    	margin: 1rem auto;
    	background-color: white;
    	text-align: center;
    	padding: 1rem;
    }
    
    
</style>
</head>
<body>

	<%@ include file="/WEB-INF/views/common/header.jsp"%>
	

    <div id=wrap class="row">
            
            <div class="col-lg-2 container list-group">
			  <a href="support" class="list-group-item active list-group-item-action">공지사항</a>
			  <a href="qna" class="list-group-item list-group-item-action">고객문의</a>
			  <a href="report" class="list-group-item list-group-item-action">신고</a>
			</div>
    
            <div class="col-lg-10">
                <table class="table">
	                <thead>
	                    <tr>
		                    <th>번호</th>
		                    <th>제목</th>
		                    <th>작성자</th>
		                    <th>등록일</th>
		                    <th>조회수</th>
	                    </tr>
	                </thead>
	                <tbody>
	                	 <tr>
	                        <td>05</td>
	                        <td><a href="#">12/22 서비스 점검 안내</a></td>
	                        <td>admin1</td>
	                        <td>2021.12.22</td>
	                        <td>10</td>
	                    </tr>
	                    <tr>
	                        <td>04</td>
	                        <td><a href="#">업그레이드 안내 공지</a></td>
	                        <td>admin1</td>
	                        <td>2021.12.11</td>
	                        <td>10</td>
	                    </tr>
	                    <tr>
	                         <td>03</td>
	                         <td><a href="#">서비스 개편 및 이용안내</a></td>
	                         <td>admin2</td>
	                         <td>2021.12.10</td>
	                         <td>20</td>
	                    </tr>
	                    <tr>
	                        <td>02</td>
	                        <td><a href="#">서비스 이용약관 개정 안내</a></td>
	                        <td>admin1</td>
	                        <td>2021.12.04</td>
	                        <td>30</td>
	                    </tr>
	                	 <tr>
	                        <td>01</td>
	                        <td><a href="#">레시피토리 오픈 안내</a></td>
	                        <td>admin1</td>
	                        <td>2021.12.01</td>
	                        <td>10</td>
	                    </tr>
	               	</tbody>
                </table>
                <br>
                <ul class="pagination justify-content-center">
					  <li class="page-item"><a class="page-link" href="#"><</a></li>
					  <li class="page-item"><a class="page-link" href="#">1</a></li>
					  <li class="page-item"><a class="page-link" href="#">2</a></li>
					  <li class="page-item"><a class="page-link" href="#">3</a></li>
					  <li class="page-item"><a class="page-link" href="#">></a></li>
				</ul>
          	</div>    
    </div>

	<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>