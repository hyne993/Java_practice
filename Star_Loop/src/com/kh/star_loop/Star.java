package com.kh.star_loop;

import java.util.Scanner;

public class Star {
	
	public static void main(String[] args) {
		
		Star s = new Star();
		
		s.method1();
		
		System.out.println();
		
		s.method2();
		
		System.out.println();
		
		s.method3();
	}
	
	
	public void method1() {
			
		//	   *  1 5432'1'
		//    **  2 543'21'
		//   ***  3 54'321'
		//  ****  4 5'4321'
		// *****  5 '54321'
			
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j>= 1; j--) {
				if(j > i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}	
		
	}
	
	
	public void method2() {
		
		//	   *      1  1234'5'6789  
		//	  ***     2  123'456'789 
		// 	 *****    3  12'34567'89 
		//	*******   4  1'2345678'9 
		// *********  5  '123456789'
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 1+2*(i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	public void method3() {
		
		//    *      1   12'3'45
		//   ***     2   1'234'5 
		//  *****    3   '12345'
		//   ***     4   1'234'5
		//    *      5   12'3'45
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("홀수를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				
				if(i <= num/2 ) { 
					if(i + j <= num/2 + 1) { // 왼쪽 공백
						System.out.print(" ");
					}
					else if(j - i >= num/2 + 1 ) { // 오른쪽 공백
						System.out.print(" ");
					}
					else {
						System.out.print("*"); // 별찍기
					}
				}
				else if(i > num/2 + 1) { 
					if(i - j > num/2) { // 왼쪽 공백
						System.out.print(" "); 
					}
					else if(i + j >= (num/2+1) * 3) { // 오른쪽 공백
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
	}
	
}
