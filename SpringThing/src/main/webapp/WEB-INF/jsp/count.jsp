<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>COUNT JSP</title>
</head>
<body>
<h1>What happened to your sentence?</h1>
<table>
    <tr>
        <td>Your sentence: </td>
        <td>${userSentence}</td></tr>
    <tr>
        <td>Number of words in your sentence: </td>
        <td>${wordCount}</td>
    </tr>
    <tr>
        <td>Number of characters: </td>
        <td>${length}</td>
    </tr>
    <tr>
        <td>Your sentence in reverse: </td>
        <td>${reverse}</td>
    </tr>
    <tr>
        <td>Pig Latin:</td>
        <td>${pigLatin}</td>
    </tr>
    <tr>
        <td>Google search your sentence:</td>
        <td><a href=”http://www.google.com/search?q=${googleEach}">${googleEach}</a></td>
    </tr>

</table>

</body>
</html>
