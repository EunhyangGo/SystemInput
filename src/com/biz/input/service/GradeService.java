package com.biz.input.service;

import java.util.Scanner;

import com.biz.input.vo.GradeVO;

public class GradeService {

	public GradeVO gVO;
	private Scanner scanner ;
	
	public GradeService() {
		this.gVO = new GradeVO();
	    this.scanner = new Scanner(System.in);	
	}
	public boolean gradeInput() {
		
		boolean inputOk = true;
		
		System.out.print("�й�>> ");
		String strNum = scanner.nextLine();
		
		System.out.print("�л��̸�>> ");
		String strName = scanner.nextLine();
		
		System.out.print("����>> ");
		String strKor = scanner.nextLine();
		
		System.out.print("����>> ");
		String strEng = scanner.nextLine();
		
		System.out.print("����>> ");
		String strMath = scanner.nextLine();
	
		try {
			this.gVO.setIntNum(Integer.valueOf(strNum));
			this.gVO.setStrName(strName);
			this.gVO.setIntKor(Integer.valueOf(strKor));
			this.gVO.setIntEng(Integer.valueOf(strEng));
			this.gVO.setIntMath(Integer.valueOf(strMath));
		} catch (NumberFormatException e) {
			// TODO: handle exception
			// e.printStackTrace();
		
			inputOk = false;
			
		}
		
		return inputOk;
		
	} //gradeInput end
	
	public void makeSumAndAvg() {
		int intSum = this.gVO.getIntKor();
		intSum += this.gVO.getIntEng();
		intSum += this.gVO.getIntMath();
	
		this.gVO.setIntSum(intSum);
		
		float floatAvg = intSum / 3.0f;
		this.gVO.setFloatAvg(floatAvg);
	}
	
}
