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
			//���� �Է¹޴´�
			System.out.println("���� �Է����ּ��� : " );
			int an = Integer.parseInt(sc.nextLine());
			//�������� ���Ѵ�
			if(an == pro.getAnswer()) {
				System.out.println("�ڡڡڡڡڡڡڡڡ�����!!!�ڡڡڡڡڡڡڡڡڡ�");
			}else
				System.out.println("�͢͢͢͢͢͢͢͢Ϳ����Դϴ٢͢͢͢͢͢͢͢͢�");
			//�����̸� ������� 
			
		}
	}
	public static void printKeyword(List<ProblemVO> list) {
		ProblemVO problem = new ProblemVO();
		System.out.println("**********�����˻�*************");
		printSelect(list);
	}
	
}
