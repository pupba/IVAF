package IVAF_JAVA_정광원_Week4;

import javax.swing.*;
import java.awt.*;

class MyApp2 extends JFrame{
	// Warring 없애기.
	private static final long serialVersionUID = 1L;

	MyApp2(){
		setTitle("Java Swing 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(5,1));
		JLabel lb = new JLabel("나는 JLabel이에요.");
		c.add(lb);
		lb.setHorizontalAlignment(JLabel.CENTER);
		c.add(new JButton("나는 버튼이에요"));
		c.add(new JButton("나는 버튼이에요"));
		c.add(new JButton("나는 버튼이에요"));
		c.add(new JButton("나는 버튼이에요"));
		
		setSize(300,300);
		setVisible(true);
	}
}

public class Week4_2 {

	public static void main(String[] args) {
		new MyApp2();
	}

}
