<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" import="java.util.*" %>
<table align="center" border="1" cellspacing="0">
    <tr>
        <td>id</td>
        <td>username</td>
        <td>password</td>
        <td>createtime</td>
        <td>lastmodifytime</td>
        <td>mobile</td>
        <td>email</td>
        <td>nickname</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${users}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td>${c.username}</td>
            <td>${c.password}</td>
            <td><fmt:formatDate value="${c.createtime}" pattern="yyyy-MM-dd  HH:mm:ss" /></td>
            <td><fmt:formatDate value="${c.lastmodifytime}" pattern="yyyy-MM-dd  HH:mm:ss"/></td>
            <td>${c.mobile}</td>
            <td><c:if test="${not empty c.email}">${c.email}</c:if></td>
            <td><c:if test="${not empty c.nickname}">${c.nickname}</c:if> </td>
            <td><a href="/user/EditUser?id=${c.id}">edit</a> </td>
            <td><a href="/user/DeleteUser?id=${c.id}">delete</a></td>
        </tr>
    </c:forEach>
</table>