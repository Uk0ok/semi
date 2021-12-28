<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<style>
	.div_wrap{
    width:100%;
    height:500px;
    margin:0px auto;
    padding:0px; 
    overflow:hidden;
    text-align: center;
}
.title{
    border:1px solid black;
    width:1120px; 
    height:315px;
    margin:24px auto;
    padding:0px;
    overflow:hidden;
    text-align:center;
}
    
.title:after {content:""; clear:both; display:block;}
    
.title > div { 
    float:left;
    color:black;
    width:50%; 
    height:100%;
    padding: 10px;
    text-align: center;
    box-sizing:border-box;    
    border:3px solid gray; 
}
#m_title_1{
	height: 85%;
}
#m_title_2{
	height: 15%;
	background-color: gray;
	
}
</style>
<body>
	<%@ include file="/WEB-INF/views/common/header.jsp"%>
	
	<p align="middle" style="margin-top: 20px;">
		<iframe width="560" height="315" src="https://www.youtube.com/embed/SJ1ZxX2hN00?start=3" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
		<iframe width="560" height="315" src="https://www.youtube.com/embed/2Xv6cIhtyno?start=3" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
	</p>
    <div class="div_wrap">
		<div>
			<div>
                    <div class="title">
                        <div style="border: 1px solid black">
                            <div id="m_title_1">매거진 사진</div>
                            <div id="m_title_2">메거진 늬우스~</div>
                        </div>
                        <div style="border: 1px solid black">
                            <table class="table table-hover">
                                <thead>
                                <tr>
                                    <th>주요 메거진 뉴스</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>밥</td>
                                </tr>
                                <tr>
                                    <td>식빵</td>
                                </tr>
                                <tr>
                                    <td style="width: 100%;">냠냠</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
			</div>
 		</div>
    </div>
    <%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>