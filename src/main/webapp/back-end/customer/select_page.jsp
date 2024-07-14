<%@ page contentType="text/html; charset=UTF-8" pageEncoding="Big5"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>IBM Customer: Home</title>

<style>
table#table-1 { /*�̤W�赵����*/
	width: 450px;
	background-color: #CCCCFF;
	margin-top: 5px;
	margin-bottom: 10px;
	border: 3px ridge Gray;
	height: 80px;
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

</head>
<body bgcolor='white'>

	<table id="table-1">
		<tr>
			<td><h3>IBM Customer: Home</h3>
				<h4>( MVC )</h4></td>
		</tr>
	</table>

	<p>This is the Home page for IBM Customer: Home</p>

	<h3>��Ƭd��:</h3>

<!-- 	���~��C -->
		<c:if test="${not empty errorMsgs}">
			<font style="color:red">�Эץ��H�U���~:</font>
			<ul>
			    <c:forEach var="message" items="${errorMsgs}">
					<li style="color:red">${message}</li>
				</c:forEach>
			</ul>
		</c:if>

	<ul>
		<li><a href='listAllCustomer.jsp'>List</a> all Customers. <br>
			<br></li>


		<li>
			<FORM METHOD="post" ACTION="customer.do">
				<b>��J�d��ID:</b> <input type="text" name="customer_id"> <input
					type="hidden" name="action" value="getOne_For_Display"> <input
					type="submit" value="�e�X">
			</FORM>
		</li>

			<jsp:useBean id="customerSvc" scope="page" class="com.customer.model.CustomerService" />

		<li>
			<FORM METHOD="post" ACTION="customer.do">
				<b>��ܯd��ID:</b> <select size="1" name="customer_id">
					<c:forEach var="customerVO" items="${customerSvc.all}">
						<option value="${customerVO.customer_id}">${customerVO.customer_id}
					</c:forEach>
				</select> <input type="hidden" name="action" value="getOne_For_Display">
				<input type="submit" value="�e�X">
			</FORM>
		</li>

		<li>
			<FORM METHOD="post" ACTION="customer.do">
				<b>��ܫȤ�W�r:</b> <select size="1" name="customer_id">
					<c:forEach var="customerVO" items="${customerSvc.all}">
						<option value="${customerVO.customer_id}">${customerVO.customer_name}
					</c:forEach>
				</select> <input type="hidden" name="action" value="getOne_For_Display">
				<input type="submit" value="�e�X">
			</FORM>
		</li>

	</ul>

	<h3>�Ȥ�޲z</h3>

	<ul>
		<li><a href='addCustomer.jsp'>Add</a> a new Customer.</li>
	</ul>

</body>
</html>