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
			System.out.println("== �л��������α׷� ==");
			System.out.println("1. �л� ��ü ���� ���");
			System.out.println("2. �л� ���� ��ȸ(�й�)");
			System.out.println("3. �л� ���� �Է�");
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �л� ����");
			System.out.println("0. ���α׷� ����");
			System.out.println("=================");
			
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : selectAll(); break;
			case 2 : selectOne(); break;
			case 3 : insertStudent(); break;
			case 4 : updateStudent(); break;
			case 5 : deleteStudent(); break;
			case 0 : System.out.println("���α׷��� ����Ǿ����ϴ�."); return;
			default : System.out.println("�߸� �Է��߽��ϴ�. �޴� �Է� :");
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
		System.out.print("��ȸ�� �л��� �й� : ");
		int classNum = sc.nextInt();
		sc.nextLine();
		
		System.out.println(stc.selectOne(classNum));
	}
	
	public void insertStudent() {
		System.out.print("�й� : ");
		int classNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		System.out.print("���� : ");
		double grade = sc.nextDouble();
		sc.nextLine();
		
		Student s = new Student(classNumber, name, age, address, grade);
		stc.insertStudent(s);
	}
	
	public void updateStudent() {
		
		System.out.print("������ ������ �л��� �й� : ");
		int oldClassNumber = sc.nextInt();
		sc.nextLine();

		System.out.print("�й� : ");
		int classNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		System.out.print("���� : ");
		double grade = sc.nextDouble();
		sc.nextLine();
		
		Student newStudent = new Student(classNumber, name, age, address, grade);
		
		stc.updateStudent(oldClassNumber, newStudent);
	}
	
	public void deleteStudent() {
		
		System.out.print("������ ������ �л��� �й� : ");
		int classNumber = sc.nextInt();
		sc.nextLine();
		
		stc.deleteStudent(classNumber);
	}
	
}
