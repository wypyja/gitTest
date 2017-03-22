<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="converter" method="post">
		<s:textfield name="isbn" label="请输入ISBN"></s:textfield>
		<s:textfield name="isbn2" label="请输入ISBN2"></s:textfield>
		<s:textfield name="isbn3" label="请输入ISBN3"></s:textfield>
		<s:submit>提交</s:submit>
	</s:form>
</body>
</html>