package student.view;

import java.util.ArrayList;
import java.util.Scanner;

import student.controller.StudentController;
import student.model.vo.Student;

public class StudentView {
	
	private Scanner sc = new Scanner(System.in);
	private StudentController stc = new StudentController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("== 학생관리프로그램 ==");
			System.out.println("1. 학생 전체 정보 출력");
			System.out.println("2. 학생 정보 조회(학번)");
			System.out.println("3. 학생 정보 입력");
			System.out.println("4. 학생 정보 변경");
			System.out.println("5. 학생 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.println("=================");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : selectAll(); break;
			case 2 : selectOne(); break;
			case 3 : insertStudent(); break;
			case 4 : updateStudent(); break;
			case 5 : deleteStudent(); break;
			case 0 : System.out.println("프로그램이 종료되었습니다."); return;
			default : System.out.println("잘못 입력했습니다. 메뉴 입력 :");
			}
		}
		
	}
	
	public void selectAll() {
		ArrayList<Student> list = stc.selectAll();
		
		for(Student s : list) {
			System.out.println(s);
		}
	}
	
	public void selectOne() {
		System.out.print("조회할 학생의 학번 : ");
		int classNum = sc.nextInt();
		sc.nextLine();
		
		System.out.println(stc.selectOne(classNum));
	}
	
	public void insertStudent() {
		System.out.print("학번 : ");
		int classNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();
		System.out.print("학점 : ");
		double grade = sc.nextDouble();
		sc.nextLine();
		
		Student s = new Student(classNumber, name, age, address, grade);
		stc.insertStudent(s);
	}
	
	public void updateStudent() {
		
		System.out.print("정보를 변경할 학생의 학번 : ");
		int oldClassNumber = sc.nextInt();
		sc.nextLine();

		System.out.print("학번 : ");
		int classNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();
		System.out.print("학점 : ");
		double grade = sc.nextDouble();
		sc.nextLine();
		
		Student newStudent = new Student(classNumber, name, age, address, grade);
		
		stc.updateStudent(oldClassNumber, newStudent);
	}
	
	public void deleteStudent() {
		
		System.out.print("정보를 삭제할 학생의 학번 : ");
		int classNumber = sc.nextInt();
		sc.nextLine();
		
		stc.deleteStudent(classNumber);
	}
	
}
