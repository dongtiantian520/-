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
	<script type="text/javascript">
		function page(cpage){
			$("name='cpage'").val(cpage);
			$("form").submit();
		}
		function plsc(){
			$.post("checkbox:checked").map(function(obj){
				var pids = $("name=''");
				if (obj) {
					alert("批量删除成功!")
				}
			}).get().join(",");
		}
	
	</script>
</head>
<body>
	<form action="list.do" method="post">
		<input type="hidden" name="cpage">
	</form>
	<input type="button" onclick="plsc()" value="批量删除">
	<table>
		<tr>
			<td>编号</td>
			<td>商品名称</td>
			<td>商品价格</td>
			<td>商品类型</td>
			<td>商品发布时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="l">
		<tr>
			<td>${l.gid}</td>
			<td>${l.gname}</td>
			<td>${l.gprice}</td>
			<td>${l.gdate}</td>
			<td>${l.bid}</td>
			<td>${l.gdid}</td>
		</tr>
		</c:forEach>
		<tr>
			<td>
				<input type="button" onclick="page('${1}')" value="首页">
				<input type="button" onclick="page('${page.pageNum-1}')" value="上一页">
				<input type="button" onclick="page('${page.pageNum+1}')" value="下一页">
				<input type="button" onclick="page('${page.pages}')" value="尾页">
			</td>
		</tr>
	</table>








</body>
</html>