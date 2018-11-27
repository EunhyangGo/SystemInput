package com.biz.input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.input.vo.GradeVO;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		List<GradeVO> gradeList = new ArrayList();
		
		for(int i = 0; i < 5 ; i++){
			System.out.println((i+1)+"�� �̸� >>");
			String strName = scanner.nextLine();
			
			System.out.println("����>>");
			String strKor = scanner.nextLine();
			
			System.out.println("����>>");
			String strEng = scanner.nextLine();
			
			System.out.println("����>>");
			String strMath = scanner.nextLine();
			
			GradeVO vo = new GradeVO();
			vo.setIntNum(i+1);
			vo.setStrName(strName);
			try {
				// ���ڿ��� �Է¹��� ������ ���������� ��ȯ 
				int intKor = Integer.valueOf(strKor);
				int intEng = Integer.valueOf(strEng);
				int intMath = Integer.valueOf(strMath);
				
				vo.setIntKor(intKor);
				vo.setIntEng(intEng);
				vo.setIntMath(intMath);
				
				
			} catch (Exception e) {
				// TODO: handle exception
				// ���ߴܰ迡�� try�� ������ ������ �߻��ϸ� ��𿡼� � ������ �߻��ߴ°�
				// �����ؼ� �˷��ִ� ��� ����
				// ������ �Ϸ���� �����Ҷ��� �����ص� �ȴ�.
				e.printStackTrace();
				
				System.out.println((i+1)+"�л� ���� ����");
				System.out.println((i+1)+"�� �ٽ� �Է�");
				i--;
				continue;
			}
			gradeList.add(vo);
		} //for end
		
		for(GradeVO vo: gradeList) {
			System.out.println(vo.toString());
		}

	}

}
