package com.biz.input;

import java.io.InputStream;
import java.util.Scanner;

/*
 * Ű���忡�� ���ڳ� ���ڸ� �Է¹޾Ƽ�
 * (�)������ ������ ��
 * ����� console�� ǥ���ϴ� �ڵ� �ۼ�
 */
public class SystemIn01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 30�̶�� ���� �����ҿ� (�ܼ���)�����϶�
		int intNum1 = 30;
		
		// 30�̶�� ���� console�� ǥ���϶�� ���
		System.out.println(30);

		// Ű���忡�� � ��(���ڿ�, ����)�� �б�
		
		//1. �Է���ġ�� �����ϴ� ��ü(input)����
		InputStream input = System.in;
		
		//2. �Է���ġ �߿��� Ű���忡�� ���� �Է��� �ϸ�
		//  Ű���� ���ۿ��� ���� �б� ���� ��ü ����
		Scanner scanner = new Scanner(input);
		
		//3. Ű���� ���ۿ� ���ڿ��� ä������ ����
		//   Ű���� ���۸� ����
		System.out.println("Ű���� ���� ���� ����....");
		String strKeyInput = scanner.nextLine();
		System.out.println("Ű���� ���ۿ��� �� ����....");
		System.out.println(strKeyInput);
		
		
	}
}
