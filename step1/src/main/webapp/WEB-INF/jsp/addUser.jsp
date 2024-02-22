<%@ taglib uri="/struts-tags" prefix="s" %>

<html lang="en">
<head>
    <title>New User</title>
    <s:head/>
</head>
<body>
<div class="content">
    <s:if test="%{user.id != null}">
        <h1>Update User</h1>
    </s:if>
    <s:else>
        <h1>Add New User</h1>
    </s:else>
    <s:form action="saveUser" theme="css_xhtml">
        <s:if test="%{user.id != null}">
            <s:hidden name="user.id"/>
        </s:if>
        First Name:<s:textfield name="user.firstName" maxlength="20" id="user.firstName"/>
        <br/>
        Last Name:<s:textfield name="user.lastName" maxlength="20" id="user.lastName"/>
        <br/>
        <input type="submit" title="Save User" value="Save User"/>
    </s:form>
    <br/>
</div>
</body>
</html>