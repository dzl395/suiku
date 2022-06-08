<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ page import="com.dong.util.Constants" %>
<%@ page import="com.dong.pojo.User" %>
<%@include file="/jsp/common/head.jsp"%>

<div class="right">
    <img class="wColck" src="${pageContext.request.contextPath}/images/gl1.png" alt=""/>
    <div class="wFont">
        <h2>${ userSession.userName }</h2>
        <p>欢迎来到华水水库管理系统!</p>
    </div>
</div>
</section>
<%@include file="/jsp/common/foot.jsp" %>
