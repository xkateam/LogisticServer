<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<body>
<h2>请输入你想查看的用户编号</h2>
<form action="<%=basePath%>/user/selected" method="post">
    <input type="text" placeholder="请输入用户编号" id="userId" name="userId">
    <input type="submit" value="查询">
</form>
</body>
</html>
