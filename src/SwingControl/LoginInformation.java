package SwingControl;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

public class LoginInformation extends JPanel {
	JPanel panel = new JPanel();
	JLabel lable = new JLabel();
	JLabel lable1 = new JLabel();
	JLabel Username = new JLabel("Username *");
	JLabel Password = new JLabel("Password *");
	JLabel instraction = new JLabel();
	JLabel ConfirmPassword = new JLabel("Confirm Password *");
	JTextField UsernameTF = new JTextField();
	JTextField PasswordTF = new JTextField();
	JTextField ConfirmPasswordTF = new JTextField();
	JButton button = new JButton("Submit Information");

	public LoginInformation() {
		
		setLayout(null);
		setBackground(Color.white);
		setMaximumSize(new Dimension(810, 250));
		setMinimumSize(new Dimension(810, 250));
		setPreferredSize(new Dimension(810, 250));
		
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel.setBackground(Color.black);
		panel.setBounds(10, 0, 790, 25);
		panel.setMaximumSize(new Dimension(700,25));
		lable.setText("Login Information");
		lable.setFont(new Font("Arial, Helvetica, sans-serif", Font.BOLD,12));
		lable.setForeground(Color.WHITE);
		
	    	lable1.setText("<html>Please create your user name and password for your personalized VIP page.</html>");
	    	lable1.setBounds(10,9,810,50);
	    	lable1.setFont(new Font("Arial, Helvetica, sans-serif", Font.BOLD,10));
	    	
	    	Username.setBounds(10,70,200,20);
	    	Username.setFont(new Font("Arial, Helvetica, sans-serif", Font.BOLD,11));
	    	Password.setBounds(10,100,200,20);
	    	Password.setFont(new Font("Arial, Helvetica, sans-serif", Font.BOLD,11));
	    	
	    	instraction.setText("<html>Passwords must be between 8-30 characters, contain at least 1 uppercase letter (A-Z), 1 lowercase letter (a-z), 1 number (0-9), and 1 of the following special characters: !@#$%^&*()_+|~-=\\`{}[]:\";<>?,./ Spaces are not allowed.</html>");
	    	instraction.setBounds(10,120,810,50);
	    	instraction.setFont(new Font("Arial, Helvetica, sans-serif", Font.BOLD,11));
	    	
	    	
        
	    	ConfirmPassword.setBounds(10,170,200,20);
	    	ConfirmPassword.setFont(new Font("Arial, Helvetica, sans-serif", Font.BOLD,11));
	    	
	    	UsernameTF.setBounds(250,70,350,20);
	    	PasswordTF.setBounds(250,100,350,20);
	    	ConfirmPasswordTF.setBounds(250,170,350,20);
	    	button.setBounds(10,220,140,20);
		

		add(panel);
		panel.add(lable);
		add(lable1);
		add(Username);
		add(Password);
		add(instraction);
		add(ConfirmPassword);
		add(UsernameTF);
		add(PasswordTF);
		add(ConfirmPasswordTF);
		add(button);
		setVisible(true);
	}

}
