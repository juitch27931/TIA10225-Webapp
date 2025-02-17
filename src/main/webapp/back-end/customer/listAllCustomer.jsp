<%@ page contentType="text/html; charset=UTF-8" pageEncoding="Big5"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<%@ page import="com.customer.model.*"%>
<%-- 此頁練習採用 EL 的寫法取值 --%>

<%
    CustomerService customerSvc = new CustomerService();
    List<CustomerVO> list = customerSvc.getAll();
    pageContext.setAttribute("list",list);
%>


<html>
<head>
<title>所有員工資料 - listAllEmp.jsp</title>

<style>
table#table-1 {
	background-color: #CCCCFF;
	border: 2px solid black;
	text-align: center;
}

table#table-1 h4 {
	color: red;
	display: block;
	margin-bottom: 1px;
}

h4 {
	color: blue;
	display: inline;
}
</style>

<style>
table {
	width: 800px;
	background-color: white;
	margin-top: 5px;
	margin-bottom: 5px;
}

table, th, td {
	border: 1px solid #CCCCFF;
}

th, td {
	padding: 5px;
	text-align: center;
}
</style>

</head>
<body bgcolor='white'>

	<h4>此頁練習採用 EL 的寫法取值:</h4>
	<table id="table-1">
		<tr>
			<td>
				<h3>所有員工資料 - listAllCustomer.jsp</h3>
				<h4>
					<a href="select_page.jsp"><img src="images/back1.gif"
						width="100" height="32" border="0">回首頁</a>
				</h4>
			</td>
		</tr>
	</table>

	<table>
		<tr>
			<th>留言ID</th>
			<th>客戶姓名</th>
			<th>客戶信箱</th>
			<th>客戶行動電話</th>
			<th>留言主旨</th>
			<th>留言內容</th>
			<th>留言建立時間</th>
			<th>修改</th>
			<th>刪除</th>			
		</tr>
			<%@ include file="page1.file"%> 
			<c:forEach var="customerVO" items="${list}" begin="<%=pageIndex%>" end="<%=pageIndex+rowsPerPage-1%>">

				<tr>
					<td>${customerVO.customer_id}</td>
					<td>${customerVO.customer_name}</td>
					<td>${customerVO.customer_email}</td>
					<td>${customerVO.customer_phone}</td>
					<td>${customerVO.customer_subject}</td>
					<td>${customerVO.customer_message}</td> 
					<td>${customerVO.customer_time}</td>
					<td>
					  <FORM METHOD="post" ACTION="customer.do" style="margin-bottom: 0px;">
					     <input type="submit" value="修改">
					     <input type="hidden" name="customer_id"  value="${customerVO.customer_id}">
 					     <input type="hidden" name="action"	value="getOne_For_Update"></FORM>  <!-- 單一查詢 -->
					</td>
					<td>
					  <FORM METHOD="post" ACTION="customer.do" style="margin-bottom: 0px;">
					     <input type="submit" value="刪除">
					     <input type="hidden" name="customer_id"  value="${customerVO.customer_id}">
					     <input type="hidden" name="action" value="delete"></FORM>
					</td>
				</tr>
			</c:forEach>
	</table>
	<%@ include file="page2.file" %>

</body>
</html>