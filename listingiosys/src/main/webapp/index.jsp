<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>
<header>
  <div class = "nav">
    <h3>listing.io</h3>
    <ul>  
      <li><a href="#">Home</a></li>
      <li><a href = "https://www.linkedin.com/in/reymar-dela-paz-0a26a0196/">About</a></li>
      <li><a href = "https://www.linkedin.com/in/reymar-dela-paz-0a26a0196/">Help</a></li>
    </ul>
  </div>  
</header>
<div class = "flex">  
<div class="welcome">
  <h3>Hi! What would you like to do today?</h3>
</div>
<div class="opt-container">  
  <div class = "opt-1">
    <a href="prodform"><button>ADD PRODUCTS</button></a>
  </div>
  <div class ="opt-2">
    <a href="viewprod"><button>VIEW PRODUCTS</button></a>
  </div>
</div>  
</div>
</body>
</html>
