package eip.mvc.problemController;

import java.util.List;

import eip.mvc.model.dto.ProblemVO;
import eip.mvc.model.service.ProblemService;
import eip.mvc.model.service.ProblemServiceImpl;
import eip.mvc.model.view.FailView;
import eip.mvc.model.view.SuccessView;

public class ProblemController {

	private static ProblemService problemService = new ProblemServiceImpl();
	
	public static List<ProblemVO> selectAll() {
		//서비스 호출
		   List<ProblemVO> list = null;
				try {
				  list = problemService.selectAll();
				  SuccessView.printSelect(list);
				}catch (Exception e) {
					e.printStackTrace();
					FailView.errorMessage(e.getMessage());
				}
				return list;
	}
	
	public static int insertProblem(ProblemVO problem) {
		int result=0;
		try {
			result = problemService.insertProblem(problem);
			SuccessView.successMessage(problem.getNo()+"번 문제가 추가 되었습니다.");
		}catch(Exception e) {
			FailView.errorMessage(e.getMessage());
		}
		return result;
	}
	
	public static List<ProblemVO> keyWord(String Keyword){
		 List<ProblemVO> list = null;
			try {
			  list = problemService.keyWord(Keyword);
			  SuccessView.printKeyword(list);
			}catch (Exception e) {
				e.printStackTrace();
				}
			return list;
	}
}
