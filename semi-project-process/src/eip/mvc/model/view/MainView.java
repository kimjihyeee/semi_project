package eip.mvc.model.view;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import eip.mvc.model.dto.ProblemVO;
import eip.mvc.problemController.ProblemController;


public class MainView {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("------------------- 선택 -------------------");
			System.out.println("1. 문제등록 2. 문제풀기 3. 문제키워드검색, 4. 문제삭제하기, 5. 공지사항, 6. 나가기");
			int menu = Integer.parseInt(sc.nextLine());

			switch(menu) { 
			
			// 컨트롤러에게 요청
			case 1: viewInsert();break;
			case 2: selectAll();     break;
			case 3: keyWord(); break;
			case 4: break;
			case 5: break;
			case 6: 
				System.out.println("프로그램 종료");
				System.exit(0);
			}// switch
		}// while
	}
	public static void viewInsert() {
        
	      ProblemVO problem = new ProblemVO();
	      problem.setKind(prompt("문제유형을 등록해주세요 1. DB, 2. 전자계산기구조, 3. 운영체제 4. SW공학, 5. 데이타통신"));
	      problem.setProblem(prompt("문제를 등록해주세요"));
	      problem.setAnswer(Integer.parseInt(prompt("답을 입력해주세요")));
	      problem.setExplain(prompt("해설을 입력하세요"));
	      problem.setKeyword(prompt("키워드를 입력해주세요"));
	      ProblemController.insertProblem(problem);
	   }


	public static String prompt(String prompt) {
	      System.out.println(prompt);
	      return sc.nextLine();
	   }
	public static void selectAll() {
		
		List<ProblemVO> list = ProblemController.selectAll();
		
		
	}
	
	public static void keyWord() {
		List<ProblemVO> list = ProblemController.keyWord(prompt("키워드를 입력하세요: "));
	}
}







