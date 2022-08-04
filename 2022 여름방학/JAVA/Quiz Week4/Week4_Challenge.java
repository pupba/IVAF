package IVAF_JAVA_정광원_Week4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyApp extends JFrame{
	// Warring 없애기.
	private static final long serialVersionUID = 1L;
	JButton btn[] = new JButton[6];
	MyApp(){
		setTitle("나는 로봇이다.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c1 = getContentPane();
		JPanel c2 = new JPanel();
		c1.setLayout(new BorderLayout());
		String body[] = {"머리","왼쪽 팔","몸통","오른쪽 팔","왼쪽 다리","오른쪽 다리"};
		String location[] = {BorderLayout.NORTH,BorderLayout.WEST,BorderLayout.CENTER,
				BorderLayout.EAST,BorderLayout.SOUTH};
		int idx=0;
		for(JButton i : btn) {
			i = new JButton(body[idx]);
			if(idx==4) {
				c1.add(c2,location[idx]);
				c2.setLayout(new GridLayout(1,2));
				c2.add(i);
			}
			else if(idx>4) {
				c2.add(i);
			}
			else {
				c1.add(i,location[idx]);
			}
			i.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String txt = "'"+e.getActionCommand()+"'입니다.";
					JOptionPane.showMessageDialog(new MyApp(), 
							txt,e.getActionCommand(),JOptionPane.INFORMATION_MESSAGE);
				}
			});
			idx++;
		}
		
		setSize(300,300);
		setVisible(true);
	}
}

public class Week4_Challenge {

	public static void main(String[] args) {
		new MyApp();
	}

}
