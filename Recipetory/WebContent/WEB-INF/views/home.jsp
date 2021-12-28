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
        margin: auto;
        background-color: cornsilk;
    }
    
     .container {
       min-width: 1200px;
       margin: 1rem auto;
    }
    
      dl {
       height: 400px;
       background-color: white;
    }

</style>
</head>
<body>

	<%@ include file="common/header.jsp"%>
	
    <div class="container">
        <dl> 
        	<dt>
        		<h1>TOP10</h1>
       		</dt>
       		<dd></dd>
        </dl>
        <dl> 
        	<dt>
        		<h1>새로운레시피</h1>
       		</dt>
        </dl>
        <dl> 
        	<dt>
        		<h1>오늘의쉐프</h1>
        	</dt>
        </dl>
    </div>

	<%@ include file="common/footer.jsp"%>
</body>
</html>