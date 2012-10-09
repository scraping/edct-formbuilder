<%--
Copyright (c) 2012 HealthCare It, Inc.
All rights reserved. This program and the accompanying materials
are made available under the terms of the BSD 3-Clause license
which accompanies this distribution, and is available at
http://directory.fsf.org/wiki/License:BSD_3Clause

Contributors:
    HealthCare It, Inc - initial API and implementation
--%>
<%@ include file="/WEB-INF/includes/taglibs.jsp" %>

<%@ page import="com.healthcit.cacure.utils.Constants"%>
<%@ page import="com.healthcit.cacure.web.controller.question.ContentElementEditController"%>
<script type="text/javascript">
function checkFields() {
	var val = $('#description').val();
	if(val == null || jQuery.trim(val).length == 0) {
		alert('Content is required.');
		return false;
	}
	return true;
}
</script>
<div>
     
   <c:set var="action" value="content.edit"/>
   <c:if test="${lookupData.isLink}">
      <c:set var="action" value="link.edit" />
   </c:if>
   
    <form:form onsubmit="var doSubmit = checkFields(); event.returnValue=doSubmit; return doSubmit;" commandName="<%=ContentElementEditController.COMMAND_NAME%>"  action="${action}?formId=${questionCmd.form.id}&id=${questionCmd.id}">
   <table>
   	<tr>
		<td><b>Type:</b></td>
    	<td>
    		<form:select path="type">
    			<c:forEach items="${questionCmd.contentTypes}" var="contentType">
	    			<form:option value="${contentType.value}" label="${contentType.label}"/>
    			</c:forEach>
    		</form:select>
    	</td>
   	</tr>
   	<tr>
		<td><b>Text:</b></td>
		<td>
			<form:textarea path="description" id="description" cols="75" rows="4" disabled="${!isEditable}"/>
			<form:hidden path="ord" id="ord" />
		</td>
   	</tr>
    	<c:if test="${isEditable}">
    		<tr>
    			<td>&nbsp;</td>
    			<td><input name="submit" type="submit" value="Save" /></td>
    		</tr>
    	</c:if>
	</table>
	</form:form>
</div>
