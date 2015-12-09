<!DOCTYPE html>
<html>
	<head>

		<title>Form</title>
	</head>
	<body>
  <g:form name="signupForm" url="[controller:'questionaire', action:'savestep1']">
    <g:hiddenField name="fid" value="${fid.id}" />
    <g:textField name="firstname_1" placeholder="firstname" value="${fid.firstname_1}" />
    <g:textField name="lastname_1" placeholder="lastname" value="${fid.lastname_1}"/>

    <g:submitButton name="save" value="step2" />
  </g:form>
	</body>
</html>
