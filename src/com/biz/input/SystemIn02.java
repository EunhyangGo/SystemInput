package com.biz.input;

import java.io.InputStream;
import java.util.Scanner;

public class SystemIn02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream input = System.in;
		Scanner scanner = new Scanner(input);
		
		// prompt :
		// 	nextLine()�� �����ϱ� ����
		// 	���� �ؾ����� �˷��ִ� �޽����� ���� ����϶�
		System.out.println("�����ڿ��� �Է��� Enter..");
		String strInput = scanner.nextLine();
		System.out.println(strInput);


	}

}
