package com.biz.input;

import java.util.Scanner;

public class SystemIn05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int[] arrNum = new int[5];
		
		for(int i = 0 ; i < arrNum.length ;i++) {
			System.out.print(i);
			System.out.print("��° ����>> ");
			String in = scanner.nextLine();
			in = in.trim();
			try {
				// Exception�� �߻��� Ȯ���� 0.000001%��
				// �ִ� �ڵ带 �ۼ��ϴ� ��
				arrNum[i] = Integer.valueOf(in);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.print(i);
				System.out.println("��° �Է��� ���� �˼� ���� ���ڿ� ����");
				System.out.println("�ٽ� �Է��� �ּ���");
				i--;
				continue;
			}
			// ����
		}
		for(int i = 0 ; i < arrNum.length ; i++) {
			System.out.println(arrNum[i]);
		}
	}
}
