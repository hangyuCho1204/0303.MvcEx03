<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${memberModel!=null }">
	<%=request.getParameter("id") %>
	<%=request.getParameter("password") %>
	<%=request.getParameter("email") %>
	
	${memberModel.id}
	${memberModel.password}
	${memberModel.email}
	</c:if>
	
	<c:if test="${product!=null }">
	���� �帳�ϴ�. �Է��Ͻ� ������ ��ϵǾ����ϴ�.<br><br>
	�Է��Ͻ� �����<br>
	��ǰid : ${product.pid}<br>
	��ǰ�� : ${product.pname}<br>
	��ǰ���� : ${product.price}<br>
	��ǰ����� : ${product.pdate}<br>
	������ : ${product.content}<br>
	</c:if>	
</body>
</html>