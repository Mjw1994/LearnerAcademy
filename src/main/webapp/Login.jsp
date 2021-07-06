<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<title>Learners Academy</title>
</head>
<style>
        body {
        background-image: url("imge/BB - Copy.jpg");
        background-color: #cccccc;
        }

      p span {
        display: block;
     }
     .block {
      height: 430px;
     }
     .inner-block {
     height: 180px;
      }
      .top-text {
        line-height: 200px;
        font-size: 1.9em;
        text-align: center;
        border-bottom: 2px;
      }
      .bg-image { 
     background: #fff url('imge/BB - Copy.jpg') no-repeat;
	    -webkit-background-size: cover;
	    -o-background-size: cover;
	    -moz-background-size: cover;
     background-size: cover;
     margin-top: 10px;
        }
    </style>
<body>
 
        <br>
                <hr class="red_line mt300 mb300"/>
                <div class='container d-flex justify-content-center card-header' >
                   <span><img src='imge/UserA.png' style=' display: block;  margin-left: auto;  margin-right: auto;  width: 30%;'>
                      
                       <form method="post" action="Login">                        
                            <label style=" display: block;  margin-left: auto;  margin-right: auto;  width: 16%;"><b>Login</b></label>
                                 <p><label style="color: red;"><b>Username:
                                       </b><input name="username" type="text" size="25" Required class="form-control" />
                                    </label>
                                 </p>
                                 <p><label style="color: red;"><b>Password :
                                       </b><input name="password" type="password" size="25" Required class="form-control"  />
                                    </label>
                                 </p>       
                                 <p>
                                     <input name="lo" class="btn btn-primary  btn-lg" type="submit" value="Create Account" style=" display: block;  margin-left: auto;  margin-right: auto;  width: 40%;" />
                                
                                 </p>    
                        </form>
                </div>
             <br>
            </div>                 
        <br> <br>
</body>
</html>