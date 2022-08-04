package IVAF_JAVA_정광원_Week4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyApp3 extends JFrame{
	// Warring 없애기.
	private static final long serialVersionUID = 1L;
	
	JLabel lb[] = new JLabel[2];
	String s[] = {"버튼을 누르면 텍스트가 바뀝니다.","어떻게 바뀔까요?","메롱!!","나는 버튼이에요","누르면 원상태로 돌아가요"};
	MyApp3(){
		setTitle("Java Swing 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(5,1));
		
		for(int i=0;i<2;i++) {
			this.lb[i] = new JLabel(this.s[i]);
			c.add(lb[i]);
			lb[i].setHorizontalAlignment(JLabel.CENTER);
		}
		JButton btn = new JButton(this.s[3]);
		c.add(btn);
		btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(lb[1].getText().equals(s[1])){
					lb[1].setText(s[2]);
					btn.setText(s[4]);
				}
				else {
					lb[1].setText(s[1]);
					btn.setText(s[3]);
				}
			}
		});
		
		
		setSize(300,300);
		setVisible(true);
	}
}

public class Week4_3 {

	public static void main(String[] args) {
		new MyApp3();
	}

}
