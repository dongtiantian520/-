<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- ("[name = 'cpage']").val(cpage) ("form").submit()  var ids=(":checkbox:checked").map(function() {return (this).val();}).get().join(",");alert(ids) 
.post("deleteAll.do",{"ids":ids},function(data){
if (data) {alert("")location="list.do";}}) -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath()%>/css/index2.css" rel="stylesheet">
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.3.js">
	</script>
<title>Insert title here</title>
</head>
<body>

	<form action="add.do" method="post">
		<table>
			<tr>
				<td>商品名称</td>
				<td>
					<input type="text" name="gname">
				</td>
			</tr>
			<tr>
				<td>商品价格</td>
				<td>
					<input type="text" name="gprice">
				</td>
			</tr>
			<tr>
				<td>单价</td>
				<td>
					<input type="date" name="gdate">
				</td>
			</tr>
			<tr>
				<td>数量</td>
				<td>
					<input type="type" name="gdate">
				</td>
			</tr>
			<tr>
				<td>标签</td>
				<td>
					<input type="text" name="gdate">
				</td>
			</tr>
			<tr>
				<td>
					<input type="button" value="提交">
				</td>
			</tr>
		</table>		
	</form>








</body>
</html>