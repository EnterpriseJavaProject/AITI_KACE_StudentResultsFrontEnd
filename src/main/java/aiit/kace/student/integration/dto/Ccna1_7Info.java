package aiit.kace.student.integration.dto;

public class Ccna1_7Info{
	




private int id;
private String student_id;
private String student_name;
private String course;
private String email;
private String phone;
private String gender;








public Ccna1_7Info() {
	super();
}




public Ccna1_7Info(int id, String student_id, String student_name, String course, String email, String phone,
		String gender) {
	super();
	this.id = id;
	this.student_id = student_id;
	this.student_name = student_name;
	this.course = course;
	this.email = email;
	this.phone = phone;
	this.gender = gender;
}




public int getId() {
	return id;
}




public void setId(int id) {
	this.id = id;
}




public String getStudent_id() {
	return student_id;
}




public void setStudent_id(String student_id) {
	this.student_id = student_id;
}




public String getStudent_name() {
	return student_name;
}




public void setStudent_name(String student_name) {
	this.student_name = student_name;
}




public String getCourse() {
	return course;
}




public void setCourse(String course) {
	this.course = course;
}




public String getEmail() {
	return email;
}




public void setEmail(String email) {
	this.email = email;
}




public String getPhone() {
	return phone;
}




public void setPhone(String phone) {
	this.phone = phone;
}




public String getGender() {
	return gender;
}




public void setGender(String gender) {
	this.gender = gender;
}




@Override
public String toString() {
	return "Csd1_1Info [id=" + id + ", student_id=" + student_id + ", student_name=" + student_name + ", course="
			+ course + ", email=" + email + ", phone=" + phone + ", gender=" + gender + "]";
}






}
