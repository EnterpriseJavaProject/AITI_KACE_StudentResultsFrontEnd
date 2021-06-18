<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
<title>csd1_1</title>
</head>



<body>






<form action="saveCsd1_1Student" method="post">

							<div class="modal-body">
							
						

								<div class="form-group">
									<label>STUDENT ID</label> 
									<input name="student_id" type="text" class="form-control" id="student_id" value="" required>
									<span id="student_id_error_message" style="color:red;"></span>
								</div>
								
								

								<div class="form-group">
									<label>STUDENT NAME</label> <input name="student_name"
										type="text" class="form-control" id="student_name" value="" required>
										<span id ="student_name_error_message" style="color:red;"></span>
								</div>
								

								<div class="form-group">
									<label>COURSE</label> 
									<select class="form-control" name="course">
										<option value="Certificate in Software Development(CSD1.1)">Certificate in Software Development(CSD1.1)</option>
									</select>
								</div>


								<div class="form-group">
									<label>EMAIL</label> <input name="email" type="email"
										class="form-control" id="email" value="" placeholder="example@play.com" required>
										<span id ="email_error_message" style="color:red;"></span>
								</div>
								


								<div class="form-group">
									<label>PHONE</label> <input name="phone" type="text"
										class="form-control" id="phone" value="" required>
										<span id ="phone_error_message" style="color:red;"></span>
								</div>
								

								<div class="form-group">
									<label>GENDER</label> 
									<select class="form-control" name="gender">
										<option>Select</option>
										<option value="Male">Male</option>
										<option value="Female">Female</option>
									</select>
								</div>


								<div class="modal-footer">
								    <button type="submit" class="btn btn-primary" onclick="return validate()" id="alert">Add</button>
									<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
								</div>
							</div>

						</form>










<!-- 


						<form:form action="" method="GET" ModelAttribute="csd1_1StudentIdRetrival">

							<div class="modal-body">
							
						

								<div class="form-group">
								
									<label>STUDENT ID</label> 
									
									<form:input path="student_id" class="form-control" value="${csd1_1StudentIdRetrival.student_id }" />
									
								</div>
								
			
							</div>

						</form:form>
			 -->
</body>
</html>