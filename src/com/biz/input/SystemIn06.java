package com.biz.input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemIn06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		
		int intNum = 0;
		while(true) {
			System.out.print(++intNum);
			System.out.print("��° ���� >> ");
			
			String strNum = scanner.nextLine();
			if(strNum.equals("--END")) {
				System.out.println("�Է� ����...");
				break;
			}
			
			try {
				int intScore = Integer.valueOf(strNum);
				intList.add(intScore);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.print(intNum);
				System.out.println("��° ����");
				System.out.println(intNum + "�ٽ��Է�");
				intNum --;
				continue;
			}
		} // while end
		System.out.println(intList);
	}
}
