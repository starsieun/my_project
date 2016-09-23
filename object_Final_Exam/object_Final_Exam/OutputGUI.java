package object_Final_Exam;

import java.awt.*;
import java.awt.event.*;

public class OutputGUI extends Dialog{
	private TextField[] numberField;
	private TextField oddPlusField, evenPlusField, oddMiddleField, evenMiddleField, monthField;
	
	public OutputGUI(Frame owner) {
		super(owner, "출력창", true);
		createGUI();
	}
	
	public void createGUI() {
		setLayout(null);
		setSize(700, 300);
		
		numberField = new TextField[10];
		
		Label inputResult = new Label("입력자료");
		Label oddPlusResult = new Label("홀수 합계 : ");
		Label evenPlusResult = new Label("짝수 합계 : ");
		Label oddMiddleResult = new Label("홀수 중간수 : ");
		Label evenMiddleResult = new Label("짝수 중간수 : ");
		Label monthResult = new Label("월 날수 : ");
		
		for (int i = 0; i < numberField.length; i ++) {
			numberField[i] = new TextField(5);
		}
		
		oddPlusField = new TextField(10);
		evenPlusField = new TextField(10);
		oddMiddleField = new TextField(10);
		evenMiddleField = new TextField(10);
		monthField = new TextField(10);
				
		inputResult.setBounds(50, 50, 70, 20);
		oddPlusResult.setBounds(50, 90, 70, 20);
		evenPlusResult.setBounds(240, 90, 70, 20);
		oddMiddleResult.setBounds(50, 150, 70, 20);
		evenMiddleResult.setBounds(240, 150, 70, 20);
		monthResult.setBounds(50, 190, 70, 20);
		
		for (int i = 0; i < numberField.length; i ++) {
			numberField[i].setBounds(120 + 40*i, 50, 40, 20);
		}
		
		oddPlusField.setBounds(140, 90, 50, 20);
		evenPlusField.setBounds(330, 90, 50, 20);
		oddMiddleField.setBounds(140, 150, 50, 20);
		evenMiddleField.setBounds(330, 150, 50, 20);
		monthField.setBounds(140, 190, 50, 20);
		
		add(inputResult); add(oddPlusResult); add(evenPlusResult);
		add(oddMiddleResult); add(evenMiddleResult); add(monthResult);
		for (int i = 0; i < numberField.length; i ++) {
			add(numberField[i]);
		}
		
		add(oddPlusField); add(evenPlusField);
		add(oddMiddleField); add(evenMiddleField); add(monthField);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
	}
	
	public void setTexting(int[] array, int oddPlusResult, int evenPlusResult, int oddMiddleNum, int evenMiddleNum, int monthDate) {
		String[] arrayS = new String[array.length];
		String oddPlusResultS, evenPlusResultS, oddMiddleNumS, evenMiddleNumS, monthDateS;
		
		for (int i = 0; i < array.length; i++) {
			arrayS[i] = Integer.toString(array[i]);
		}
		
		oddPlusResultS = Integer.toString(oddPlusResult); evenPlusResultS = Integer.toString(evenPlusResult); oddMiddleNumS = Integer.toString(oddMiddleNum);
		evenMiddleNumS = Integer.toString(evenMiddleNum); monthDateS = Integer.toString(monthDate);
		
		for (int i = 0; i < numberField.length; i ++) {
			numberField[i].setText(arrayS[i]);
		}
		
		oddPlusField.setText(oddPlusResultS); evenPlusField.setText(evenPlusResultS); oddMiddleField.setText(oddMiddleNumS);
		evenMiddleField.setText(evenMiddleNumS); monthField.setText(monthDateS); //각 textfield에 값 할당
	}
}
