<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/5/31
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>员工列表展示</title>
</head>
<body>
<table border="1" align="center">
    <tr>
        <th>序号</th>
        <th>编号</th>
        <th>员工名称</th>
        <th>日志日期</th>
        <th>操作</th>
    </tr>
    <%--1.先判断，2.在迭代--%>
    <s:if test="#request.listEmp != null ">
        <s:iterator var="emp" value="#request.listEmp" status="st">
            <tr>
                <td><s:property value="#st.count"/></td>
                <td><s:property value="#emp.id"/></td>
                <td><s:property value="#emp.empName"/></td>
                <td><s:property value="#emp.workDate"/></td>
                <td>
                    <s:a href="/emp_viewUpdate?id=%{#emp.id}">修改</s:a>
                </td>
            </tr>
        </s:iterator>
    </s:if>
    <s:else>
        <tr>
            <td colspan="5">对不起！没有你要显示的数据</td>
        </tr>
    </s:else>

</table>
</body>
</html>
