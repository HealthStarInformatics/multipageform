<!DOCTYPE html>
<html>
	<head>

		<title>Form</title>
	</head>
	<body>
  <g:form name="signupForm" url="[controller:'questionaire', action:'savestep2']">
		<g:hiddenField name="fid" value="${fid}" />
    <g:textField name="occupation_2" placeholder="occupation" />
    <g:textField name="employer_2" placeholder="employer" />
		<a href="<g:createLink action="startform" id="${fid}" />">prev</a>
    <g:submitButton name="save" value="save" />
  </g:form>
	</body>
</html>
