package org.student;

import org.department.Department;

public class Student extends Department{

	String studName=" Test";
	String studDept="CSE";
	int studId=78;
	public void studentName() {
		System.out.println("Student Name:" + studName);
	}
	public void studentDept() {
		System.out.println("Student Dept:" + studDept);
	}
	public void studentId() {
		System.out.println("Student Name:" + studId);
	}
	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
		
		
	}
}

