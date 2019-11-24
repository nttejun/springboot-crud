<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link type="text/css" rel="stylesheet" href="/css/common.css">
    <title>회원가입</title>
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
            <td><input type="text" id="unidentifiedPassword" placeholder="비밀번호를 입력해주세요."></td>
        </tr>
        <tr>
            <td>비밀번호 확인</td>
            <td><input type="text" id="confirmPassword" placeholder="비밀번호를 확인해주세요."></td>
        </tr>
        <tr>
            <td>사용자명</td>
            <td><input type="text" id="username" placeholder="사용자명을 입력해주세요."></td>
        </tr>
        <tr>
            <td>이메일</td>
            <td><input type="text" id="email" placeholder="자신의 이메일 계정을 입력해주세요."></td>
        </tr>
        <tr>
            <td>연락처</td>
            <td><input type="text" id="phonenum" placeholder="연락처를 입력해주세요."></td>
        </tr>
    </tbody>
</table>
<div id class="btn-frame">
    <div class="waves-effect waves-light btn" id="btnCreate">Create</div>
</div>
</body>
<!-- Compiled and minified JavaScript -->
<script type="text/javascript" href="/js/config.js"></script>
<script type="text/javascript">
</script>
</html>
