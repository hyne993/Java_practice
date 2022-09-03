package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.MemberController;
import com.kh.model.vo.Member;

public class MemberView {
	
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController ();
	
	public void mainMenu() {
		
		System.out.println("=== 로그인 화면 ===");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
			
		if(id.equals("admin") && pwd.equals("P@s$W0rd!")) {
			while(true) {
				System.out.println("===== 메뉴 구성 =====");
				System.out.println("1. 회원 추가");
				System.out.println("2. 회원 전체 조회");
				System.out.println("3. 회원 아이디 검색");
				System.out.println("4. 회원 이름 키워드 검색");
				System.out.println("5. 회원 비밀번호 초기화");
				System.out.println("6. 회원 삭제");
				System.out.println("0. 프로그램 로그아웃");
				
				System.out.print("메뉴 입력 : ");
				int menu = sc.nextInt(); 
				sc.nextLine();
				
				switch(menu) {
				case 1 : insertMember(); break;
				case 2 : selectMemberList(); break;
				case 3 : searchMemberById(); break;
				case 4 : searchMemberByName(); break;
				case 5 : initMemberPwd(); break;
				case 6 : deleteMember(); break;
				case 0 : System.out.println("로그아웃되었습니다."); return;
				}
			}
		}
		else {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
		}
	}
	
	public void insertMember() {
		
		System.out.println("=== 회원 추가 ===");
		
		while(true) {
			
			System.out.print("아이디 : ");
			String userId = sc.nextLine();
			
			if(mc.idCheck(userId) == 1) {
				System.out.println("이미 사용중인 아이디입니다. 다시 입력하세요.");
			} 
			else {
				System.out.print("비밀번호 : ");
				String userPwd = sc.nextLine();
				System.out.print("이름 : ");
				String userName = sc.nextLine();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("성별 : ");
				char gender = sc.nextLine().charAt(0);
				System.out.print("이메일 : ");
				String email = sc.nextLine();
				System.out.print("휴대폰번호 : ");
				String phone = sc.nextLine();
				
				int result = mc.insertMember(userId, userPwd, userName, age, gender, email, phone);
				
				if(result > 0 ) {
					System.out.println("회원 추가에 성공헸습니다.");
				}
				else System.out.println("회원 추가에 실패했습니다.");
				
				 break;
			}
		}

		System.out.println();
	}
	
	
	public void selectMemberList() {
		
		System.out.println("=== 회원 전체 조회 ===");
		ArrayList<Member> memberList = mc.selectMemberList();
		
		if(memberList.isEmpty()) {
			System.out.println("회원 정보가 존재하지 않습니다.");
		}
		else {
			System.out.println("전체 회원 : " + memberList.size() + "명" );
			for(Member m : memberList) {
				System.out.println("회원번호 : " + m.getUserNo());
				System.out.println("아이디 : " + m.getUserId());
				System.out.println("비밀번호 : " + m.getUserPwd());
				System.out.println("이름 : " + m.getUserName());
				System.out.println("나이 : " + m.getAge());
				System.out.println("성별 : " + m.getGender());
				System.out.println("이메일 : " + m.getEmail());
				System.out.println("전화번호 : " + m.getPhone());
				System.out.println();
			}
		}
	}
	
	
	public void searchMemberById() {
		
		System.out.println("=== 회원 아이디 검색 ===");
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		
		Member mem = mc.searchMemberById(userId);
		
		if(mem == null) {
			System.out.println("검색 결과가 없습니다.");
		}
		else {
			System.out.println("회원번호 : " + mem.getUserNo());
			System.out.println("아이디 : " + mem.getUserId());
			System.out.println("비밀번호 : " + mem.getUserPwd());
			System.out.println("이름 : " + mem.getUserName());
			System.out.println("나이 : " + mem.getAge());
			System.out.println("성별 : " + mem.getGender());
			System.out.println("이메일 : " + mem.getEmail());
			System.out.println("전화번호 : " + mem.getPhone());
			System.out.println();
		}
	}
	
	
	public void searchMemberByName() {
		
		System.out.println("=== 회원 이름 키워드 검색 ===");
		System.out.print("이름의 키워드 : ");
		String keyword = sc.nextLine();
		
		ArrayList<Member> searchList = mc.searchMemberByName(keyword);
		
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}
		else {
			System.out.println("조회된 회원 : " +  searchList.size() +"명");
			for(Member m : searchList) {
				System.out.println("회원번호 : " + m.getUserNo());
				System.out.println("아이디 : " + m.getUserId());
				System.out.println("비밀번호 : " + m.getUserPwd());
				System.out.println("이름 : " + m.getUserName());
				System.out.println("나이 : " + m.getAge());
				System.out.println("성별 : " + m.getGender());
				System.out.println("이메일 : " + m.getEmail());
				System.out.println("전화번호 : " + m.getPhone());
				System.out.println();
			}
		}
		
	}
	
	public void initMemberPwd() {
		
		System.out.println("=== 회원 비밀번호 초기화 ===");
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		
		int result = mc.initMemberPwd(userId);
		if(result > 0) {
			System.out.println("비밀번호 초기화에 성공했습니다.");
		}
		else {
			System.out.println("비밀번호 초기화에 실패했습니다.");
		}
		System.out.println();
	}
	
	public void deleteMember() {
		
		System.out.println("=== 회원 삭제 ===");
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		System.out.print("삭제 후 복구할 수 없습니다. 정말 삭제하시겠습니까? : ");
		char ans = sc.nextLine().toUpperCase().charAt(0);
		
				
		if(ans == 'Y') {
			int result = mc.deleteMember(userId);
			
			if(result > 0) {
				System.out.println("회원 삭제에 성공했습니다.");
			}
			else {
				System.out.println("회원 삭제에 실패했습니다.");
			}
			System.out.println();
		}
		
	}
	
}
