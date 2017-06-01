<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/5/31
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>信息添加页面</title>
</head>
<body>
<s:form action="emp_save" method="POST">
    <table>
        <tr>
            <td>员工名：</td>
            <td><s:textfield name="empName"/></td>
        </tr>
        <tr>
            <td>日期：</td>
            <td><s:textfield name="workDate"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <s:submit value="保存员工"></s:submit>
            </td>
        </tr>
    </table>
</s:form>
</body>
</html>
