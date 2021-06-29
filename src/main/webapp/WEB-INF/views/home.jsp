<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>

<head>

<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="resources/style.css">
</head>



<body>

<header> Forum </header>


<content>

<div class="ForumList">
<h3> To jest lista </h3>


  <select name="" id="cars">



   <c:forEach var= "post" items="${listPosts}">

     <option value="${post.title}">"${post.title}"</option>
     </c:forEach>

  </select>





  <br><br>
  <input type="submit" value="Submit">
</form>

</div>
</content>

<footer></footer>

</body>

</html>
