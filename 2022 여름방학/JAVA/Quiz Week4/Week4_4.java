package IVAF_JAVA_정광원_Week4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class MyApp4 extends JFrame{
	// Warring 없애기.
	private static final long serialVersionUID = 1L;
	JLabel lb;
	int control = 0;
	MyApp4(){
		setTitle("Java Swing 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		lb = new JLabel(" ");
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					lb.setText(" ");
				}
				lb.setText((String)(lb.getText()+e.getKeyChar()));	
			}
		});
		c.add(lb);
		
		setSize(300,300);
		setVisible(true);
	}
}

public class Week4_4 {

	public static void main(String[] args) {
		new MyApp4();
	}

}
