package SwingControl;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextPanel extends JPanel{
	JLabel lable = new JLabel();
	JLabel lable1 = new JLabel();
public TextPanel() {
	setLayout(null);
	setBackground(Color.white);
	setMaximumSize(new Dimension(810, 110));
	setMinimumSize(new Dimension(810, 110));
	setPreferredSize(new Dimension(810, 110));
	
	lable.setText("<html>Welcome to City Tech's Prospect Interest Page <br> </html>");
	lable.setBounds(10, -60, 800, 150);
	
	lable.setFont(new Font("Arial, Helvetica, sans-serif", Font.BOLD,12));
	lable1.setText("<html><br> We appreciate your interest in City Tech and want to learn more about you. Please answer the questions on this page to help us customize our communications with you. All questions marked with an asterisk (*) are required."
	+ "<br> <br> By creating a user name and password you can access your own personalized VIP page that is customized to your specific interests. Be sure to click on the \"Submit Information\" button at the bottom of the page when you have answered all questions.</html>");
	lable1.setBounds(10, 5, 800, 100);
	lable1.setFont(new Font("Arial, Helvetica, sans-serif", Font.BOLD,11));
	
	add(lable);
	add(lable1);
}
}
