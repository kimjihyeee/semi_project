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
			System.out.println("------------------- ���� -------------------");
			System.out.println("1. ������� 2. ����Ǯ�� 3. ����Ű����˻�, 4. ���������ϱ�, 5. ��������, 6. ������");
			int menu = Integer.parseInt(sc.nextLine());

			switch(menu) { 
			
			// ��Ʈ�ѷ����� ��û
			case 1: viewInsert();break;
			case 2: selectAll();     break;
			case 3: keyWord(); break;
			case 4: break;
			case 5: break;
			case 6: 
				System.out.println("���α׷� ����");
				System.exit(0);
			}// switch
		}// while
	}
	public static void viewInsert() {
        
	      ProblemVO problem = new ProblemVO();
	      problem.setKind(prompt("���������� ������ּ��� 1. DB, 2. ���ڰ��ⱸ��, 3. �ü�� 4. SW����, 5. ����Ÿ���"));
	      problem.setProblem(prompt("������ ������ּ���"));
	      problem.setAnswer(Integer.parseInt(prompt("���� �Է����ּ���")));
	      problem.setExplain(prompt("�ؼ��� �Է��ϼ���"));
	      problem.setKeyword(prompt("Ű���带 �Է����ּ���"));
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
		List<ProblemVO> list = ProblemController.keyWord(prompt("Ű���带 �Է��ϼ���: "));
	}
}







