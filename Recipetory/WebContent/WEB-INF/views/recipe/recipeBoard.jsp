<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- <link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script> -->
<title>Document</title>
</head>
<style>
.div_wrap {
	width: 85%;
	height: 1000px;
	text-align: center;
}

section {
	width: 85%;
	height: 1000px;
	float: left;
}

aside {
	width: 10%;
	height: 1000px;
	background-color: darkkhaki;
	text-align: center;
	float: right;
}

.list_cap {
    margin: auto;
}

.card {
    position:relative;
    display:-ms-flexbox;
    display:flex;
    -ms-flex-direction:column;
    flex-direction:column;
    min-width:0;
    word-wrap:break-word;
    background-color:#fff;
    background-clip:border-box;
    border:1px solid rgba(0,0,0,.125);
    border-radius:.25rem}
</style>
<body>
	<%@ include file="/WEB-INF/views/common/header.jsp"%>

	<div class="div_wrap">
		<section>
			<div class="list_cap">
				<div class="card" style="width: 200px">
					<img class="card-img-top" src="../../../img/recipeBoard/chickchest.jpg" alt="Card image" style="width: 100%">
					<div class="card-body">
						<h4 class="card-title">닭가슴살</h4>
						<p class="card-text"></p>
						<a href="#" class="btn btn-primary">See Profile</a>
					</div>
				</div>
            </div>

            <div class="list_cap">
				<div class="card" style="width: 200px">
					<img class="card-img-top" src="../../../img/recipeBoard/sweetpotato.jpg" alt="Card image" style="width: 100%">
					<div class="card-body">
						<h4 class="card-title">고구마 샐러드</h4>
						<p class="card-text"></p>
						<a href="#" class="btn btn-primary">See Profile</a>
					</div>
				</div>
            </div>
            <br>
		</section>
		<aside>

        </aside>
	</div>










	<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>