package com.biz.input;

import java.util.ArrayList;
import java.util.List;

import com.biz.input.service.GradeService;
import com.biz.input.vo.GradeVO;

public class GradeExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scanner = new Scanner(System.in);
//		List<GradeVO> gradeList = new ArrayList();
	
		List<GradeService> gradeList = new ArrayList();
		
		for(int i = 0; i < 2 ; i++){
			
			System.out.println("현재위치" + i);
			GradeService gS = new GradeService();
			// if(gS.gradeInput() ==false){라고 하는것과 같다. 
			// 앞에 느낌표가 붙여지면 참이 아니면, 트루가 아니면 이라는 말과 같음
			if(! gS.gradeInput()) {
				i--;
				continue;
			}
			gS.makeSumAndAvg();
			gradeList.add(gS);
		} //for end
		
		for(GradeService s : gradeList) {
			System.out.println(s.gVO.toString());
		}

	}

}
