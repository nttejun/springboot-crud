<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link type="text/css" rel="stylesheet" href="/css/common.css">
    <title>사용자 목록</title>
</head>
<body>
<div id class="btn-frame">
    <div class="waves-effect waves-light btn" id="btnCreate">Create</div>
</div>
<table class="table">
    <thead>
    <tr>
        <th>사용자명</th>
        <th>사용자 이메일</th>
        <th>사용자 휴대번호</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach var="users" items="${users}">
        <tr class="inline-user" id="userDetailInfo" userAlias="${users.userAlias}">
            <td>${users.username}</td>
            <td>${users.email}</td>
            <td>${users.phonenum}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
<!-- Compiled and minified JavaScript -->
<script type="text/javascript" href="/js/config.js"></script>
<script type="text/javascript">


    function checkLogin() {
        if("${users}" == ""){
            document.location = "/user";
        }
    }

    window.addEventListener("DOMContentLoaded", checkLogin());

    const findUser = function() {
        const userAlias = this.getAttribute("userAlias");
        document.location = "/user/"+userAlias;
    }

    const createUser = function(){
        document.location = "/user/page/createUser";
    }


    const inlineUser = document.getElementsByClassName("inline-user");
    for (var i = 0; i < inlineUser.length; i++) {
        inlineUser[i].addEventListener('click', findUser, false);
    }

    const btnCreate = document.getElementById("btnCreate");
    btnCreate.addEventListener('click', createUser, false);

</script>
</html>
