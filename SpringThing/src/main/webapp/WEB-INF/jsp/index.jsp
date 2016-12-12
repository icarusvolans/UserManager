<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>INDEX JSP</title>
</head>
<body>
<h1>Please type a sentence.</h1>
<form name="sentenceForm" action="/jspCount">
    <table>
        <tr><td>
        <input type="text" name="userSentence">
        </td></tr>
        <input id="insert" type="submit" value="Submit">
    </table>
</form>
</body>
</html>
