package IVAF_JAVA_정광원_Week4;

import javax.swing.*;
import java.awt.*;

class MyApp1 extends JFrame{
	// Warring 없애기.
	private static final long serialVersionUID = 1L;

	MyApp1(){
		setTitle("Java Swing 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("나는 JLabel이에요."));
		
		setSize(300,300);
		setVisible(true);
	}
}

public class Week4_1 {

	public static void main(String[] args) {
		new MyApp1();
	}

}
