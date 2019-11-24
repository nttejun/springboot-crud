<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link type="text/css" rel="stylesheet" href="/css/common.css">
    <title>사용자 상세정보</title>
</head>
<body>
<table class="table">
    <thead>
    <tr>
        <th>사용자명</th>
        <th>사용자 이메일</th>
        <th>사용자 휴대번호</th>
        <th>사용자 비밀번호 만료일</th>
        <th>등록일</th>
        <th>변경일</th>
    </tr>
    </thead>

    <tbody>
    <tr class="inline" id="userDetailInfo">
        <td><input type="text" id="username" readonly="readonly" value="${user.username}"></td>
        <td><input type="text" id="email" value="${user.email}"/></td>
        <td><input type="text" id="phonenum" value="${user.phonenum}"></td>
        <td><input type="text" id="passwordExp" readonly="readonly" value="${user.passwordExp}"></td>
        <td><input type="text" id="regDttm" readonly="readonly" value="${user.regDttm}"></td>
        <td><input type="text" id="uptDttm" readonly="readonly" value="${user.uptDttm}"></td>
    </tr>
    </tbody>
</table>
<div id class="btn-frame">
    <div class="waves-effect waves-light btn" id="btnUpdate">Update</div>
    <div class="waves-effect waves-light btn" id="btnDelete">Delete</div>
</div>
</body>
<!-- Compiled and minified JavaScript -->
<script type="text/javascript" href="/js/config.js"></script>
<script type="text/javascript">

    const deleteUser = document.getElementById("btnDelete");
    deleteUser.addEventListener("click", function () {
        const xhr = new XMLHttpRequest();
        const data = {
            "userAlias": "${user.userAlias}"
        };
        xhr.onload = function () {
            if (xhr.status === 200 || xhr.status === 201) {
                alert("사용자 정보가 삭제되었습니다.");
                document.location = "/user";
            } else {
                alert("잠시 후 다시 시도해 주세요");
            }
        }
        xhr.open("DELETE", "/user");
        xhr.setRequestHeader("Content-Type", "application/json");
        xhr.send(JSON.stringify(data));
    });

    const updateuser = document.getElementById("btnUpdate");
    updateuser.addEventListener("click", function () {
        const xhr = new XMLHttpRequest();
        const data = {
            "userAlias": "${user.userAlias}",
            "email": document.getElementById("email").value,
            "phonenum": document.getElementById("phonenum").value
        };
        xhr.onload = function () {
            if (xhr.status === 200 || xhr.status === 201) {
                alert("사용자 정보가 변경되었습니다.");
                document.location = "/user/${user.userAlias}";
            } else {
                alert("잠시 후 다시 시도해 주세요");
            }
        }
        xhr.open("PUT", "/user");
        xhr.setRequestHeader("Content-Type", "application/json");
        xhr.send(JSON.stringify(data));
    });



</script>
</html>
