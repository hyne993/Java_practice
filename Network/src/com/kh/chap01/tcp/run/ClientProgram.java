package com.kh.chap01.tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientProgram {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		String serverIP = "127.0.0.1";
		int port = 4000; 
		
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			
			socket = new Socket(serverIP, port);
			
			if(socket != null) { 
				
				System.out.println("������ ���� ����!");
				
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				while(true) {
					
					System.out.print("�������� ���� �޽��� : ");
					String sendMessage = sc.nextLine();
					pw.println(sendMessage);
					pw.flush();
					
					String message = br.readLine();
					System.out.println("�����κ��� ���޹��� �޽��� : " + message);
					
				}
				
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				pw.close();
				br.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
