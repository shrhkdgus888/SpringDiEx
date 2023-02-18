package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;


//DI�� ���� ������
//	- inline���¿� gird���� �Ѵ� ������ �ּ�ó�������� �ٲ� �����ִ�. ��, InlineExamConsole(exam)�� GridExamConsole(exam)��
//	   �ڵ�� �ܺ�ȯ��(�������̽�, �����ͱ���Ŭ����)�� �������ƾ� �ҽ��ڵ� ������� DI�� �����ϴ�. 
//	   �ʿ��� ��ǰ(EX. inline, grid����)�� �ٲ㳢�� ������ ����� Spring�� ���ش�.
public class Program {

	public static void main(String[] args) {
		
		//Exam(��������)�� NewlecExam(��ü����)�� ���� ���ƾ� �Ǵµ�, �� ������ ���谡 �θ��ڽ��̶�� ���������,
		//Exam�� �ܼ��θ� �ƴ϶�, �������̽� ��ϴ��, NewlecExam�� ������ ������ü ���
		Exam exam = new NewlecExam();
		//��´��
		//�����͸� ���� ���·� ����ؾ� �Ǳ⶧���� new ExamConsole(������)�� ���� �����͸� �����־� �������ش�.
		//	- ExamConsole console : �������̽� ����
		//  - new ExamConsole(exam) : 1.���ٷ� ���(new InlineExamConsole(exam);)	
		//							  2.grid ���·� ���
//		ExamConsole console = new InlineExamConsole(exam); //DI
		ExamConsole console = new GridExamConsole(exam);
		console.print();
	}

}
