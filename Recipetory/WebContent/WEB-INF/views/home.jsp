<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>HOME</title>

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

            /* Make the image fully responsive */
            .carousel-inner img {
                width: 100%;
                height: 100%;
            }
        </style>
    </head>

    <body>

        <%@ include file="common/header.jsp" %>

            <div id="demo" class="carousel slide" data-ride="carousel">

                <!-- Indicators -->
                <ul class="carousel-indicators">
                    <li data-target="#demo" data-slide-to="0" class="active"></li>
                    <li data-target="#demo" data-slide-to="1"></li>
                    <li data-target="#demo" data-slide-to="2"></li>
                    <li data-target="#demo" data-slide-to="3"></li>
                </ul>

                <!-- The slideshow -->
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="../../img/home/main.jpg" width="1100" height="500">
                    </div>
                    <div class="carousel-item">
                        <img src="../../img/home/main2.jpg" width="1100" height="500">
                    </div>
                    <div class="carousel-item">
                        <img src="../../img/home/main3.jpg" width="1100" height="500">
                    </div>
                    <div class="carousel-item">
                        <img src="../../img/home/main4.jpg" width="1100" height="500">
                    </div>
                </div>

                <!-- Left and right controls -->
                <a class="carousel-control-prev" href="#demo" data-slide="prev">
                    <span class="carousel-control-prev-icon"></span>
                </a>
                <a class="carousel-control-next" href="#demo" data-slide="next">
                    <span class="carousel-control-next-icon"></span>
                </a>
            </div>

            <%@ include file="common/footer.jsp" %>
    </body>

    </html>