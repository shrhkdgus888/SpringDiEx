package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;


//DI에 대한 설명예제
//	- inline형태와 gird형태 둘다 간단한 주석처리만으로 바꿔 쓸수있다. 즉, InlineExamConsole(exam)와 GridExamConsole(exam)의
//	   코드는 외부환경(인터페이스, 데이터구현클래스)로 꺼내놓아야 소스코드 변경없이 DI가 가능하다. 
//	   필요한 부품(EX. inline, grid형태)을 바꿔끼는 도구의 기능을 Spring이 해준다.
public class Program {

	public static void main(String[] args) {
		
		//Exam(참조형식)과 NewlecExam(객체형식)은 서로 같아야 되는데, 둘 사이의 관계가 부모자식이라면 상관없지만,
		//Exam이 단순부모가 아니라, 인터페이스 등록당담, NewlecExam은 데이터 구현객체 담당
		Exam exam = new NewlecExam();
		//출력담당
		//데이터를 가진 상태로 출력해야 되기때문에 new ExamConsole(데이터)와 같이 데이터를 끼워넣어 삽입해준다.
		//	- ExamConsole console : 인터페이스 구현
		//  - new ExamConsole(exam) : 1.한줄로 출력(new InlineExamConsole(exam);)	
		//							  2.grid 형태로 출력
//		ExamConsole console = new InlineExamConsole(exam); //DI
		ExamConsole console = new GridExamConsole(exam);
		console.print();
	}

}
