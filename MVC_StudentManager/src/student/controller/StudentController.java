package student.controller;

import java.util.ArrayList;

import student.model.vo.Student;

public class StudentController {
	
	ArrayList<Student> studentList = new ArrayList<>();
	
	
	public ArrayList<Student> selectAll() {
		return studentList;
	}
	
	public Student selectOne(int classNumber) {
		
		Student st = new Student();
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getClassNumber() == classNumber) {
				st = studentList.get(i);
			}
		}
		return st;
	}
	
	public void insertStudent(Student s) {
		
		studentList.add(s);
	}
	
	public void updateStudent(int oldClassNumber, Student newStudent) {
		
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getClassNumber() == oldClassNumber) {
				studentList.set(i, newStudent);
			}
		}
	}
	
	public void deleteStudent(int classNumber) {
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getClassNumber() == classNumber) {
				studentList.remove(i);
			}
		}
	}
	
}
