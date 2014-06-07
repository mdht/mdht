<%--
 Copyright (c) 2006, 2010 IBM Corporation and others.
 All rights reserved. This program and the accompanying materials 
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 
 Contributors:
     IBM Corporation - initial API and implementation
--%>
<%@ include file="header.jsp"%>

<% 
	RequestData data = new RequestData(application, request, response);
	WebappPreferences prefs = data.getPrefs();
%>

<html lang="<%=ServletResources.getString("locale", request)%>">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><%=ServletResources.getString("Loading", request)%></title>

<script language="JavaScript">
	function onloadHandler() { 
		location.href="<%=UrlUtil.JavaScriptEncode(request.getParameter("href"))%>";
	}
</script>

<style type="text/css">
	<%@ include file="deferredView.css"%>
</style> 
</head>

<body dir="<%=direction%>" onload="onloadHandler()">
	<%=ServletResources.getString("Loading", request)%>
</body>
</html>
