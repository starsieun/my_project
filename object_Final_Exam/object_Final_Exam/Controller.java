package object_Final_Exam;

import java.awt.*;
public class Controller extends Frame {//부모 프레임
	private InputGUI input;
	private Calculate cal;
	private OutputGUI output;
	
	public Controller() {
		input = new InputGUI(this);
		cal = new Calculate();
		output = new OutputGUI(this);
	}
	
	public void control () {
		int oddPlusResult, evenPlusResult, oddMiddleNum, evenMiddleNum, monthDate;
		input.setVisible(true); //입력창 띄우기
	
		cal.divideArray(input.getArray());
		cal.calculate();
		
		oddPlusResult = cal.getOddPlusResult(); 
		evenPlusResult = cal.getEvenPlusResult();
		oddMiddleNum = cal.getOddMiddleNum();
		evenMiddleNum = cal.getEvenMiddleNum();
		monthDate = cal.getMonthDate();
		
		output.setTexting(input.getArray(), oddPlusResult, evenPlusResult, oddMiddleNum, evenMiddleNum, monthDate);
		output.setVisible(true); //출력창 띄우기
	}
	
	public static void main(String[] args) {
		Controller Con = new Controller();
		Con.control();
	}
}