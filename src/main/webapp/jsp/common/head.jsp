<%@ page import="com.dong.util.Constants" %>
<%@ page import="com.dong.pojo.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%--<!DOCTYPE html>--%>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>华水水库管理系统</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/public.css" />
</head>
<body>


<!--头部-->
<header class="publicHeader">
    <h1>华水水库管理系统</h1>

</header>
<!--时间-->
<section class="publicTime">
    <span id="time" ></span>
    <a href="#"></a>
</section>
<!--主体内容-->
<section class="publicMian ">
    <div class="left">
        <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
        <nav>
            <ul class="list">
                <li ><a href="${pageContext.request.contextPath}/jsp/bill.do?method=query">水库管理</a></li>

                <li><a href="${pageContext.request.contextPath }/jsp/provider.do?method=query">承包商管理</a></li>

            </ul>
        </nav>
    </div>
    <%-- </section>这是主体的一部分 另外的section结束标签在 其他主体的结束位置--%>
    <input type="hidden" id="path" name="path" value="${pageContext.request.contextPath }"/>
    <input type="hidden" id="referer" name="referer" value="<%=request.getHeader("Referer")%>"/>
</body>
</html>
