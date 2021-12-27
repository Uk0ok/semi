<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HOME</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<style>
    body {
        box-sizing: border-box;
        min-width: 1240px;
        margin: auto;
        background-color: cornsilk;
    }
    
    section {
    	height: 1400px;
    }
</style>
</head>
<body>

	<%@ include file="common/header.jsp"%>
	
    <section>
        <div class="container"> TOP10
        </div>
        <div class="container"> 새로운레시피
        </div>
        <div class="container"> 오늘의 쉐프
        </div>

    </section>

	<%@ include file="common/footer.jsp"%>
</body>
</html>