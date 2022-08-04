package IVAF_JAVA_정광원_Week4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyApp5 extends JFrame{
	// Warring 없애기.
	private static final long serialVersionUID = 1L;
	JLabel lb = new JLabel("0");
	int control = 0;
	MyApp5(){
		setTitle("Java Swing 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String click = Integer.toString(e.getClickCount()%10);
				lb.setText(click);
			}
		});
		
		c.add(lb);
		
		setSize(300,300);
		setVisible(true);
	}
}

public class Week4_5 {

	public static void main(String[] args) {
		new MyApp5();
	}

}
