package object_Final_Exam;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;


public class InputGUI extends Dialog implements ActionListener{
	private TextField[] numberField;
	private String[] tmpArray;
	private int[] array;
	private Button seeResult;
	
	public InputGUI(Frame owner) {
		super(owner, "입력창", true);
		createGUI();
		tmpArray = new String[10];
		array = new int[10];
	}
	
	public void createGUI() {
		setLayout(null);
		setSize(200, 600);
		
		Label inputGuide = new Label("두 자리 정수를 입력하세요!");
		
		numberField = new TextField[10];
		
		for (int i = 0; i < 10; i++) {
			numberField[i] = new TextField(10);
		}
		
		seeResult = new Button("결  과");
		
		inputGuide.setBounds(20, 50, 300, 20);
		
		add(inputGuide);
		
		for (int i = 0; i < 10; i++) {
			numberField[i].setBounds(50, 80 + 40 * i, 50, 20);
			
			add(numberField[i]);
		}
		
		seeResult.setBounds(50, 520, 50, 20);
		
		add(seeResult);
		seeResult.addActionListener(this);

		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
				System.exit(0);
			}
		});
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if ("결  과".equals(ae.getActionCommand())) {
			for (int i = 0; i < numberField.length; i++) {
				tmpArray[i] = numberField[i].getText();
				array[i] = Integer.parseInt(tmpArray[i]);
				
				if (array[i] > 99) {
					JOptionPane.showMessageDialog(null, "2자리 정수를 초과한 숫자를 입력하셨습니다", "에러!!", JOptionPane.ERROR_MESSAGE);
					System.exit(0); //에러메세지 출력(2자리 정수 초과 시 에러메세지 출력 후 종료)
				}
			} //결과보기 클릭시 textfield에 입력된 값들을 String > int로 형변환 후 배열에 저장
			
		 setVisible(false);
		}
	}
	
	public int[] getArray() {
		return array;
	}
}