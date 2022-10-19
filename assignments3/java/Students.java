package assignments3.java;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student id :" + id);
		
	}
	public void getStudentInfo(int id , String name) {
		System.out.println("Student id :" + id);
		System.out.println("Student Name :" + name);
	}
	public void getStudentInfo(String email , int phno) {
		System.out.println("Student Email :" + email);
		System.out.println("Student PhoneNum :" + phno);
	}
	public static void main(String[] args) {
		Students stud= new Students();
		stud.getStudentInfo(3);
		stud.getStudentInfo(7,"Test");
		stud.getStudentInfo("test@gmail.com",988879779);
		
	}
}
//Create multiple getStudentInfo() method by passing id argument alone,
//by id & name, by email & phoneNumber
