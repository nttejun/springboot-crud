<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link type="text/css" rel="stylesheet" href="/css/common.css">
    <title>로그인</title>
</head>
<body>
<table class="table">
    <tbody>
        <tr>
            <td>아이디</td>
            <td><input type="text" id="userid" placeholder="사용하실 아이디를 입력해주세요."></td>
        </tr>
        <tr>
            <td>비밀번호</td>
            <td><input type="text" id="unidentifiedPassword"></td>
        </tr>
    </tbody>
</table>
<div id class="btn-frame">
    <div class="waves-effect waves-light btn" id="btnLogin">로그인</div>
    <div class="waves-effect waves-light btn" id="btnCreate">회원가입</div>
</div>
</body>
<!-- Compiled and minified JavaScript -->
<script type="text/javascript" href="/js/config.js"></script>
<script type="text/javascript">

    const createUser = function(){
        document.location = "/user/page/createUser";
    }

    const btnCreate = document.getElementById("btnCreate");
    btnCreate.addEventListener('click', createUser, false);

</script>
</html>
