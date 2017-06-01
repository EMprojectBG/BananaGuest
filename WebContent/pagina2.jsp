<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Log in</title>
    <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="style1.css">
</head>
<c:set var="errorclass" value="${mierror?"has-error":""}" />
<body>
<<<<<<< HEAD:WebContent/pagina2.jsp
=======

>>>>>>> 45c077519f0d2b3205655dae37f6dbdc9956efc5:WebContent/WEB-INF/pagina2.jsp
    <!--Welcome Back-->
    <div class="containerlogin">
        <div class="row">
            <div class="col-md-offset-5 col-md-3">
                <div class="form-login">
                    <h3>Welcome back.</h3>
                    <form action="login" method="POST" id='form_login' >
                        <label for="userName" class="control-label">User</label>
<<<<<<< HEAD:WebContent/pagina2.jsp
                    <input type="email" name="email" id="userName" class="form-control input-sm chat-input ${errorclass}" placeholder="User" value='@l.es' required/>
=======
                    <input type="email" name="email" id="userName" class="form-control input-sm chat-input ${errorclass}" placeholder="Email" value='@l.es'  required/>
>>>>>>> 45c077519f0d2b3205655dae37f6dbdc9956efc5:WebContent/WEB-INF/pagina2.jsp
                    </br>
                    <label for="userPassword" class="control-label">Password</label>
                    <input type="password" name="password" id="userPassword" class="form-control input-sm chat-input ${errorclass}" placeholder="Pass" required />
                    </br>

                    <div class="wrapper">
                        <span class="group-btn">     
                <a id="btn_login" href="paginaprincipal" class="btn">login <i class="fa fa-sign-in"></i></a>
                <div id='errores'></div>
            </span>
            </form>
                    </div>
                </div>

            </div>
        </div>
    </div>


</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src= 'scripts/bananaguest.js'></script>

</html>