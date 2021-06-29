<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>

<head>

<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="resources/style.css">
</head>



<body>

<header> Forum
<input type="submit" value="Home"> </header>



<content>



<div class="ForumList">
<h2> To jest lista </h2>
<h3>Post</h3>
<h4>description</h4>
<p>content</p>




<h4>Add comment</h4>
<form action="/action_page.php" id="usrform">
  Name: <input type="text" name="usrname">


<br>
<br>

<textarea rows="4" cols="40" name="comment" form="usrform">
Enter text here...</textarea>

  <br><br>
  <input type="submit" value="Submit">
</form>

</div>
</content>

<footer></footer>

</body>

</html>