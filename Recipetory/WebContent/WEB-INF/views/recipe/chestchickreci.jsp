<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>닭가슴살 레시피</title>
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
    </style>
</head>
<body>
    <%@ include file="/WEB-INF/views/common/header.jsp" %>

    <div class="wrap">
        <div class="board_list_wrap">
            <div class="board_list">
                <div class="board_list_head">
                    <span>
                        <h4>닭가슴살 레시피</h4>
                    </span>                
                </div>
                <p>작성자 : 관리자</p>
                
            </div>
        </div>
    </div>






    <%@ include file="/WEB-INF/views/common/footer.jsp" %>
</body>
</html>