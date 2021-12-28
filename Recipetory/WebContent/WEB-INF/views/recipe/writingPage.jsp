<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="ko">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>레시피 게시물 작성 페이지</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </head>
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

        .writing-title {
            text-align: center;
        }

        .writing-area {
            text-align: center;
        }

        .textarea_uk {
            width: 60%;
            height: 1000px;
            resize: none;
        }

        .write {
            position: relative;
            left: 930px;
        }

       

    </style>

    <body>
        <%@ include file="/WEB-INF/views/common/header.jsp" %>

            <div class="wrap">
                <div class="board_list_wrap">
                    <div class="board_list">
                        <div class="board_list_head">
                            <span>
                                <h4 style="text-align: center;">글 작성 페이지</h4>
                            </span>
                            
                        </div>
                        <br>
                        <div class="writing-title">
                            <input type="text"  class="form-control" placeholder="제목을 입력해주세요.">
                        </div>
                        <br>
                        <div class="writing-area">
                            <textarea class="form-control textarea_uk" placeholder="내용을 입력해주세요." rows="40" cols="80"></textarea>
                        </div>
                        <br>
                        <input type="file" name="file">
                        <br>
                        <button type="button" class="btn btn-primary write">뒤로가기</button>
                        <input type="submit" class="btn btn-primary write" value="작성하기"></input>
                    </div>
                </div>
            </div>

            <%@ include file="/WEB-INF/views/common/footer.jsp" %>
    </body>

    </html>