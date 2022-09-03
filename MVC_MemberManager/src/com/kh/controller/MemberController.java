package com.kh.controller;


import java.util.ArrayList;

import com.kh.model.vo.Member;

public class MemberController {
	
	private ArrayList<Member> memberList = new ArrayList<>();
	
	public int idCheck(String userId) {
		
		int result = 0;
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).getUserId().equals(userId)) {
				result++;
			}
		}
		
		return result;
	}
	
	
	public int insertMember(String userId, String userPwd, String userName, 
			 int age, char gender, String email, String phone) {
		
		int before = memberList.size(); 
		
		int lastNo = 0;

		if(memberList.size() == 0) {			
			lastNo = 1;
		} 
		else {
			lastNo = memberList.get(memberList.size() - 1).getUserNo() + 1;
		}
		
		memberList.add(new Member(lastNo, userId, userPwd, userName, age, gender, email, phone));
				
		return memberList.size() - before;
	}
	
	public ArrayList<Member> selectMemberList(){
		return memberList;
	}
	
	public Member searchMemberById(String userId) {
		
		Member mem = null;
		
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).getUserId().equals(userId)) {
				mem = memberList.get(i);
			}
		}
		
		return mem;
	}
	
	public ArrayList<Member> searchMemberByName(String keyword) {
		
		ArrayList<Member> searchList = new ArrayList<>();
		
		for(Member m : memberList) {
			if(m.getUserName().contains(keyword)) {
				searchList.add(m);
			}
		}
		
		return searchList;
	}
	
	public int initMemberPwd(String userId) {
		
		int result = 0;
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).getUserId().equals(userId)) {
				memberList.get(i).setUserPwd("passwordKH@123");
				result++;
			}
		}
		
		return result;
	}
	
	public int deleteMember(String userId) {
		
		int result = 0;
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).getUserId().equals(userId)) {
				memberList.remove(i);
				result++;
			}
		}
		
		return result;
	}
	
	
}
