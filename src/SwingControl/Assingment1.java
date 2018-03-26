package SwingControl;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class Assingment1 {
	JFrame frame = new JFrame();
	JPanel contaner = new JPanel();
	TextPanel textpanel = new TextPanel();
	ContactInformation panel1 = new ContactInformation();
	Demographic panel2 = new Demographic();
	Academic panel3 = new Academic();
	HighSchoolInformation panel4 = new HighSchoolInformation();
	LoginInformation panel5 = new LoginInformation();
	public Assingment1() {
		frame.setLayout(new BorderLayout());
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		

        JScrollPane scrollPane = new JScrollPane(contaner);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(350, 0, 815, 855);
        scrollPane.getVerticalScrollBar().setUnitIncrement(10);
        scrollPane.setBackground(Color.gray);
  
		contaner.setLayout(new BoxLayout(contaner,BoxLayout.PAGE_AXIS));
		contaner.setPreferredSize(new Dimension(810, 1580));
		contaner.setBackground(Color.gray);
		
		frame.add(scrollPane,BorderLayout.CENTER);
		contaner.add(textpanel);
		contaner.add(panel1);
		contaner.add(panel2);
		contaner.add(panel3);
		contaner.add(panel4);
		contaner.add(panel5);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Assingment1();
			}
		});
	}
}
