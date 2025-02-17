<%@ page contentType="text/html; charset=UTF-8" pageEncoding="Big5"%>
<%@ page import="com.customer.model.*"%>
<%-- 此頁暫練習採用 Script 的寫法取值 --%>

<%
CustomerVO customerVO = (CustomerVO) request.getAttribute("customerVO"); //EmpServlet.java(Concroller), 存入req的empVO物件
%>

<html>
<head>
<title>客戶資料 - listOneCustomer.jsp</title>

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
	width: 600px;
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

<h4>此頁暫練習採用 Script 的寫法取值:</h4>
<table id="table-1">
	<tr><td>
		 <h3>客戶資料 - listOneCustomer.jsp</h3>
		 <h4><a href="select_page.jsp"><img src="images/back1.gif" width="100" height="32" border="0">回首頁</a></h4>
	</td></tr>
</table>

<table>
	<tr>
		<th>留言ID</th>
		<th>客戶姓名</th>
		<th>客戶信箱</th>
		<th>客戶行動電話</th>
		<th>留言主旨</th>
		<th>留言內容</th>
<!-- 		<th>留言建立時間</th> -->
	</tr>
	<tr>
		<td><%=customerVO.getCustomer_id()%></td>
		<td><%=customerVO.getCustomer_name()%></td>
		<td><%=customerVO.getCustomer_email()%></td>
		<td><%=customerVO.getCustomer_phone()%></td>
		<td><%=customerVO.getCustomer_subject()%></td>
		<td><%=customerVO.getCustomer_message()%></td>
<%-- 		<td><%=customerVO.getCustomer_time()%></td> --%>
	</tr>
</table>

</body>
</html>