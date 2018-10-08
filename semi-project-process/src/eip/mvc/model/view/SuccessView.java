package eip.mvc.model.view;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import eip.mvc.model.dto.ProblemVO;
import eip.mvc.problemController.ProblemController;

public class SuccessView {
	static Scanner sc = new Scanner(System.in);
	public static void successMessage(String message){
		   System.out.println(message);
	   }
	public static void printSelect(List<ProblemVO> list) {
		Iterator<ProblemVO> it = list.iterator();
		while(it.hasNext()) {
			ProblemVO pro = it.next();
			System.out.println(pro.getProblem());
			//답을 입력받는다
			System.out.println("답을 입력해주세요 : " );
			int an = Integer.parseInt(sc.nextLine());
			//오답인지 비교한다
			if(an == pro.getAnswer()) {
				System.out.println("★★★★★★★★★정답!!!★★★★★★★★★★");
			}else
				System.out.println("♨♨♨♨♨♨♨♨♨오답입니다♨♨♨♨♨♨♨♨♨");
			//정답이면 정답출력 
			
		}
	}
	public static void printKeyword(List<ProblemVO> list) {
		ProblemVO problem = new ProblemVO();
		System.out.println("**********문제검색*************");
		printSelect(list);
	}
	
}
