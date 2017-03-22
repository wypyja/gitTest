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
ISBN:<br>
	城市:<s:property value="isbn.country"/><br>
	出版社:<s:property value="isbn.press"/><br>
	书序码:<s:property value="isbn.id"/><br>
	校验码<s:property value="isbn.code"/><br>
ISBN2:<br>	
	城市:<s:property value="isbn2.country"/><br>
	出版社:<s:property value="isbn2.press"/><br>
	书序码:<s:property value="isbn2.id"/><br>
	校验码<s:property value="isbn2.code"/><br>
ISBN3:<br>	
	城市:<s:property value="isbn3.country"/><br>
	出版社:<s:property value="isbn3.press"/><br>
	书序码:<s:property value="isbn3.id"/><br>
	校验码<s:property value="isbn3.code"/>
</body>
</html>