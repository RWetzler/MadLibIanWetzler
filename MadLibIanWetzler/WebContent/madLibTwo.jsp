<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Driving Test</title>
</head>
<body>
<form action ="drivingServlet" method = "post">
Enter your word choices
<h1> </h1>
Adjective #1
<input type="text" name ="adjectiveOne" size="10">
<h1> </h1>
Adjective #2
<input type="text" name ="adjectiveTwo" size="10">
<h1> </h1>
Adjective #3
<input type="text" name ="adjectiveThree" size="10">
<h1> </h1>
Adverb
<input type="text" name ="specialCase" size="10">
<h1> </h1>
Noun #1
<input type="text" name ="nounOne" size="10">
<h1> </h1>
Noun #2
<input type="text" name ="nounTwo" size="10">
<h1> </h1>
Noun #3
<input type="text" name ="nounThree" size="10">
<h1> </h1>
Noun #4
<input type="text" name ="nounFour" size="10">
<h1> </h1>
Noun #5
<input type="text" name ="nounFive" size="10">
<h1> </h1>
Noun #6
<input type="text" name ="nounSix" size="10">
<h1> </h1>
Plural Noun
<input type="text" name ="pluralNounOne" size="10">
<h1> </h1>
<input type="submit" value="Calculate MadLib" />
</form>
</body>
</html>