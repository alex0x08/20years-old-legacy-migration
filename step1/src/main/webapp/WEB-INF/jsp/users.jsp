<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <!-- TODO - Give relevant name -->
    <title>Struts-Hibernate CRUD App - Reeves</title>
    <s:head />
</head>
<body>
<div class="content">
    <h1>List Of Users</h1>

    <div class="data">
        <s:a action="newUser" cssClass="add">Add New User</s:a>
        <br/><br/>
        <table border="0" cellpadding="4" cellspacing="0">
            <thead>
                <th>Id</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th class="actionBtn">Edit</th>
                            <th class="actionBtn">Delete</th>

            </thead>
            <tbody>
            <s:iterator value="users"  var="user">
                <tr>
                    <td><s:property value="%{#user.id}"/></td>
                    <td><s:property value="%{#user.firstName}"/></td>
                    <td><s:property value="%{#user.lastName}"/></td>
                    <td class="actionBtn"><s:a action="newUser?user.id=%{#user.id}" cssClass="edit"></s:a></td>
                    <td class="actionBtn"><s:a action="deleteUser?user.id=%{#user.id}" cssClass="delete"></s:a></td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
        <br/>
    </div>
</body>
</html>