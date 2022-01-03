——————————————————————————————————————————————
——————화면 form jsp
——————————————————————————————————————————————
——————
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
<div class="register_product">

 <form action="registerProduct" method="POST"
onsubmit="return registerCheck();" id="registerForm"
enctype="multipart/form-data">
 <table>
 <tr>
 <th>카테고리</th>
 <td>
 <select name="productCategory"
id="productCategory" required="required">
 <!-- 카테고리 테이블에 있는 카테고리
불러오기 -->
 <% int c = 1; %>
 <c:forEach items="$
{categoryList}" var="c">
 <option
value="<%=c%>">${c.categoryName}</option>
 <% c++; %>
 </c:forEach>
 </select>
 </td>
 </tr>
<tr>
 <th>태그 등록</th>
 <td>
 <!-- 태그 테이블에 있는 태그 불러오기 -->
 <select name="productTag1"
id="productTag1">
 <% int t1 = 1; %>
 <option value="0">----</
option>
 <c:forEach items="${tagList}"
var="t">
 <option
value="<%=t1%>">${t.tagName}</option>
 <% t1++; %>
 </c:forEach>
 </select>
<select name="productTag2"
id="productTag2">
 <% int t2 = 1; %>
 <option value="0">----</
option>
 <c:forEach items="${tagList}"
var="t">
 <option
value="<%=t2%>">${t.tagName}</option>
 <% t2++; %>
 </c:forEach>
 </select>
<select name="productTag3"
id="productTag3">
 <% int t3 = 1; %>
 <option value="0">----</
option>
 <c:forEach items="${tagList}"
var="t">
 <option
value="<%=t3%>">${t.tagName}</option>
 <% t3++; %>
 </c:forEach>
 </select>
 </td>
 </tr>
<tr>
 <th>제품명</th>
 <td><input type="text"
name="productName" id="productName" required></td>
 </tr>
<tr>
 <th>가격</th>
 <td><input type="number"
name="productPrice" id="productPrice" required min="0"></td>
 </tr>
<tr>
 <th>재고 수량</th>
 <td><input type="number"
name="productAmount" id="productAmount" required min="0"></td>
 </tr>
<tr>
 <th>제품 설명</th>
 <td></td>
 </tr>
<tr>
 <td colspan="2">
 <textarea name="productContents"
id="productContents" cols="120" rows="30" required
style="resize: none;"></textarea>
 </td>
 </tr>
<tr>
 <th>제품 이미지</th>
 <td>
<label>제품 정면 사진 :
 <input type="file" name="f"
class="productImg" required="required">
 </label>
 <label>제품 후면 사진 :
 <input type="file" name="f"
class="productImg" required="required">
 </label>
 </tr>
<tr>
 <th colspan="2" style="border: none;">
 <button type="submit"
class="rp_btn">
 <span>제품 등록 </span>
 <i class="fas fa-edit"></i>
 </button>
<button class="rp_btn rp_cancle">
 <span><a href="manageProduct"
style="text-decoration:none; color:rgb(250, 174, 88);">돌아 가기
</a></span>
 <i class="far fa-windowclose"></i>
 </button>
 </th>
 </tr>
 </table>
 </form>
 </div>
——————————————————————————————————————————————
——————form으로 받은 데이터 처리하는 servlet
——————————————————————————————————————————————
——————
@MultipartConfig(
maxFileSize = 1024 * 1024 * 50,
maxRequestSize = 1024 * 1024 * 50 * 5
)
@WebServlet("/registerProduct")
public class RegisterProduct extends HttpServlet{
}
@Override
protected void doPost(HttpServletRequest req,
HttpServletResponse resp) throws ServletException, IOException
{
// 제품 등록
String categoryNum =
req.getParameter("productCategory");
String productName = 
req.getParameter("productName");
String productPrice =
req.getParameter("productPrice");
String productAmount =
req.getParameter("productAmount");
String productContents =
req.getParameter("productContents");
ProductVo pv = new ProductVo();
pv.setCategoryNo(Integer.parseInt(categoryNum));
pv.setProductName(productName);
pv.setPrice(Integer.parseInt(productPrice));
pv.setInventory(Integer.parseInt(productAmount));
pv.setProductContents(productContents);
// 태그
int tagNo1 =
Integer.parseInt(req.getParameter("productTag1"));
int tagNo2 =
Integer.parseInt(req.getParameter("productTag2"));
int tagNo3 =
Integer.parseInt(req.getParameter("productTag3"));
int resultTag = 0;
if(tagNo1 != tagNo2 && tagNo1 != tagNo3 && tagNo2 !=
tagNo3) {
resultTag = new
ServiceProduct().registerProductTag(pv, tagNo1, tagNo2,
tagNo3);
} else if(tagNo1 == 0 || tagNo2 == 0 || tagNo3 == 0)
{
resultTag = new
ServiceProduct().registerProductTag(pv, tagNo1, tagNo2,
tagNo3);
}
System.out.println("resultTag : " + resultTag);
// 다중 파일 업로드
List<ProductImgVo> pImgList = new ArrayList<>();
Collection<Part> parts = req.getParts(); // 모든 part
들을 가져옴
ProductImgVo pImg = null;
if(resultTag == 3) {
for(Part file : parts) {
if(!file.getName().equals("f"))
continue; // name이 f인 경우에 실행
// 사용자가 업로드한 파일 이름 알아오기
String originName =
file.getSubmittedFileName();
// 사용자가 업로드한 파일에 input 스트림 연결
InputStream fis = file.getInputStream();
// 파일 이름 변경
String changeName = "Z" +
UUID.randomUUID();
String ext =
originName.substring(originName.lastIndexOf("."),
originName.length());
// 저장할 경로
String realPath =
req.getServletContext().getRealPath("/upload/product");
// 파일 경로
String filePath = realPath +
File.separator + changeName + ext;
// 파일 저장
FileOutputStream fos = new
FileOutputStream(filePath);
byte[] buf = new byte[1024];
int size = 0;
while((size = fis.read(buf)) != -1) {
fos.write(buf, 0, size);
}
fis.close();
fos.close();
pImg = new ProductImgVo();
pImg.setProductImgName(changeName + ext);
pImgList.add(pImg);
}
}
int resultImg = new
ServiceProduct().registerProductImg(pImgList); // 이미지테이블에
이미지 인서트하는 메소
System.out.println("resultImg : " + resultImg);
if(resultTag == 3) {
req.setAttribute("msg", "제품 등록을 성공했습니다.");
req.getRequestDispatcher("/WEB-INF/views/
product/registerSuccessProduct.jsp").forward(req, resp);
} else {
req.setAttribute("msg", "제품 등록을 실패하였습니다. 
태그 중복을 확인해주세요.");
req.getRequestDispatcher("/WEB-INF/views/
product/registerErrorProduct.jsp").forward(req, resp);
}
}
——————————————————————————————————————————————
——————데이터 db에 넣는 dao
——————————————————————————————————————————————
——————
// 제품 등록하고 태그 등록
public int registerProductTag1(Connection conn, ProductVo
pv, int tagNo1, int tagNo2, int tagNo3) {
PreparedStatement pstmt = null;
String sql1 = "INSERT INTO PRODUCT VALUES
(SEQ_PRODUCTNO.NEXTVAL, ?, ?, DEFAULT, ?, DEFAULT,
DEFAULT, ?, ?)";
int result1 = 0;
try {
pstmt = conn.prepareStatement(sql1);
pstmt.setString(1, pv.getProductName());
pstmt.setInt(2, pv.getPrice());
pstmt.setString(3, pv.getProductContents());
pstmt.setInt(4, pv.getInventory());
pstmt.setInt(5, pv.getCategoryNo());
result1 = pstmt.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
} finally {
close(pstmt);
}
int result2 = 0;
int result3 = 0;
int result4 = 0;
if(tagNo1 != 0) {
String sql2 = "INSERT INTO TAG "
+ "VALUES(?, "
+ "(SELECT PRODUCT_NO FROM (SELECT
ROWNUM AS RNUM, p.* FROM PRODUCT p ORDER BY P.PRODUCT_NO DESC)
WHERE ROWNUM = 1), "
+ "'N')";
if(result1 > 0) {
try {
pstmt = conn.prepareStatement(sql2);
pstmt.setInt(1, tagNo1);
result2 = pstmt.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
} finally {
close(pstmt);
}
}
} else {
result2 = 1;
}
if(tagNo2 != 0) {
result3 = registerProductTag2(conn, pv,
tagNo2);
} else {
result3 = 1;
}
if(tagNo3 != 0) {
result4 = registerProductTag3(conn, pv,
tagNo3);
} else {
result4 = 1;
}
System.out.println("result2 : " + result2);
System.out.println("result3 : " + result3);
System.out.println("result4 : " + result4);
return result2 + result3 + result4;
}
public int registerProductTag2(Connection conn, ProductVo
pv, int tagNo2) {
PreparedStatement pstmt = null;
String sql = "INSERT INTO TAG VALUES(?, (SELECT
PRODUCT_NO FROM (SELECT ROWNUM AS RNUM, p.* FROM PRODUCT p
ORDER BY P.PRODUCT_NO DESC) WHERE ROWNUM = 1), 'N')";
int result = 0;
try {
pstmt = conn.prepareStatement(sql);
pstmt.setInt(1, tagNo2);
result = pstmt.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
} finally {
close(pstmt);
}
return result;
}
public int registerProductTag3(Connection conn, ProductVo
pv, int tagNo3) {
PreparedStatement pstmt = null;
String sql = "INSERT INTO TAG "
+ "VALUES(?, "
+ "(SELECT PRODUCT_NO FROM (SELECT ROWNUM
AS RNUM, p.* FROM PRODUCT p ORDER BY P.PRODUCT_NO DESC) WHERE
ROWNUM = 1), "
+ "'N')";
int result = 0;
try {
pstmt = conn.prepareStatement(sql);
pstmt.setInt(1, tagNo3);
result = pstmt.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
} finally {
close(pstmt);
}
return result;
}
// 이미지 등록
public int registerProductImg(Connection conn,
List<ProductImgVo> pImgList) {
PreparedStatement pstmt = null;
String sql = "INSERT INTO PRODUCT_IMG VALUES"
+ "(SEQ_PRODUCT_IMG_NO.NEXTVAL, "
+ "(SELECT PRODUCT_NO FROM (SELECT ROWNUM
AS RNUM, p.* FROM PRODUCT p ORDER BY P.PRODUCT_NO DESC) WHERE
ROWNUM = 1), "
+ "?, "
+ "SYSDATE, 'N')";
int result = 0;
for(int i = 0; i < pImgList.size(); i++) {
try {
pstmt = conn.prepareStatement(sql);
pstmt.setString(1, 
pImgList.get(i).getProductImgName());
result = pstmt.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
} finally {
close(pstmt);
}
}
System.out.println("이미지이름 1: " +
pImgList.get(0).getProductImgName());
System.out.println("이미지이름 2: " +
pImgList.get(1).getProductImgName());
return result;
}