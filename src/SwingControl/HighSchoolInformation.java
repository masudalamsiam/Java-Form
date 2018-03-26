package SwingControl;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

public class HighSchoolInformation extends JPanel{
	JPanel panel = new JPanel();
	JLabel lable = new JLabel();
	JLabel lable1 = new JLabel();
	JTextField SchoolName = new JTextField();
	JTextField SchoolCity = new JTextField();
	JTextField SchoolState = new JTextField();
	JTextField SAT = new JTextField();
	JTextField ACT = new JTextField();
	JRadioButton yes = new JRadioButton();
	JRadioButton no = new JRadioButton();

	public HighSchoolInformation() {
		setLayout(null);
		setBackground(Color.white);
		setMaximumSize(new Dimension(810, 310));
		setMinimumSize(new Dimension(810, 310));
		setPreferredSize(new Dimension(810, 310));
		
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel.setBackground(Color.black);
		panel.setBounds(10, 0, 790, 25);
		panel.setMaximumSize(new Dimension(700,25));
		lable.setText("HighSchool Information");
		lable.setFont(new Font("Arial, Helvetica, sans-serif", Font.BOLD,12));
		lable.setForeground(Color.WHITE);
		
	    	lable1.setText("<html>Click here to find your High School. If you cannot find your high school, click here to type in your information by hand. If you have completed your GED please search for GED in the School Name and select the first option of Access GED M356.</html>");
	    	lable1.setBounds(10,20,810,50);
	    	lable1.setFont(new Font("Arial, Helvetica, sans-serif", Font.BOLD,11));
        
		String ContactInformationLabel[] = {"","","High School Name *","High School City *","High School State *","High School Graduation Date *","SAT Score","ACT Score (Composite)","Have you been awarded a GED?"};
		
		
        for (int i = 1; i<9;i++) {
        	JLabel Lable3 = new JLabel();
        	Lable3.setBounds(10,i*35,200,20);
        	Lable3.setFont(new Font("Arial, Helvetica, sans-serif", Font.BOLD,11));
        Lable3.setText(ContactInformationLabel[i]);
        add(Lable3);
        }
        
        SchoolName.setBounds(250,70,350,20);
        SchoolCity.setBounds(250,105,350,20);
        SchoolState.setBounds(250,140,350,20);
        
		String[] months = {"Month", "January","February","March","April","May","June","July","August","September","October","November","December"};
		JComboBox<String> month = new JComboBox<String>(months);
		month.setBounds(250,175,90,20);
		
		String[] years = {"Year", "2017","2016","2015","2014","2013","2012","2011","2010"};
		JComboBox<String> year = new JComboBox<String>(years);
		year.setBounds(340,175,85,20);
		
		SAT.setBounds(250,210,80,20);
		ACT.setBounds(250,245,80,20);
		
        yes.setText("Yes");
        yes.setBounds(250,280,250,20);
        no.setText("NO");
        no.setBounds(350,280,250,20);

        
		add(panel);
		panel.add(lable);
		add(lable1);
		add(SchoolName);
		add(SchoolCity);
		add(SchoolState);
		add(month);
		add(year);
		add(SAT);
		add(ACT);
		add(yes);
		add(no);
		setVisible(true);
	}

}
