<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" trimDirectiveWhitespaces="true" %>
<%@taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@taglib prefix="page" uri="http://www.opensymphony.com/sitemesh/page" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html lang="en">
<head>
	<title><decorator:title default="Struts Starter"/></title>
    <link href="<s:url value='/styles/main.css'/>" rel="stylesheet" type="text/css" media="all"/>
    <decorator:head/>
</head>
<body id="page-home">
    <div id="page">
        <div id="header">
            <span>
            0x08: CRUD Sample. Struts 7 , Spring 6 and Java 21
            </span>
        </div>

        <div id="content" >
            <div id="main">
            	<decorator:body/>
            </div>
        </div>
    </div>
</body>
</html>
