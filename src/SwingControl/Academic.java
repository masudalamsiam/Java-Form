package SwingControl;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

public class Academic extends JPanel{
	JPanel panel = new JPanel();
	JLabel lable = new JLabel();
	JLabel lable1 = new JLabel();
	public Academic() {
		
		setLayout(null);
		setBackground(Color.white);
		setMaximumSize(new Dimension(810, 330));
		setMinimumSize(new Dimension(810, 330));
		setPreferredSize(new Dimension(810, 330));
		
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel.setBackground(Color.black);
		panel.setBounds(10, 0, 790, 25);
		panel.setMaximumSize(new Dimension(700,25));
		lable.setText("Academic Information");
		lable.setFont(new Font("Arial, Helvetica, sans-serif", Font.BOLD,12));
		lable.setForeground(Color.WHITE);
        
		String ContactInformationLabel[] = {"","I will be entering college as a *", "Entry Term *","Primary Major of Interest *","Secordary Major of Interest"};
		
        for (int i = 0; i<5;i++) {
        	JLabel Lable3 = new JLabel();
        	Lable3.setBounds(10,i*35,200,20);
        	Lable3.setFont(new Font("Arial, Helvetica, sans-serif", Font.BOLD,11));
        Lable3.setText(ContactInformationLabel[i]);
        	add(Lable3);
        }
        
        	String[] enteringCollegeAsAs = {"Select One"};
        	JComboBox<String> enteringCollegeAsA = new JComboBox<String>(enteringCollegeAsAs);
    		enteringCollegeAsA.setBounds(250,35,250,20);
        	
        	String[] EntryTerms = {"Select One"};
        	JComboBox<String> EntryTerm = new JComboBox<String>(EntryTerms);
    		EntryTerm.setBounds(250,70,150,20);
    		
        	String[] PrimaryMajorofInterests = {"Select One"};
        	JComboBox<String> PrimaryMajorofInterest = new JComboBox<String>(PrimaryMajorofInterests);
        	PrimaryMajorofInterest.setBounds(250,105,400,20);
    		
        	String[] SecordaryyMajorofInterests = {"Select One"};
        	JComboBox<String> SecordaryyMajorofInterest = new JComboBox<String>(SecordaryyMajorofInterests);
        	SecordaryyMajorofInterest.setBounds(250,140,400,20);
        	
        	lable1.setText("I am interested in learning more about...");
        	lable1.setFont(new Font("Arial, Helvetica, sans-serif", Font.BOLD,11));
        	lable1.setBounds(10,175,400,20);
        	
        	String checkBoxarray[] = {"Athletics, Intrumarals, and Recreation","COPE","Counseling","Financial Aid","Our Children Center","Scholarships","SEEK Program","Student Goverment","Student Life and Development","Student Support Services (Disabilities)","Student Wellness Center"};
            
        	for (int i = 0; i<1;i++) {
            	int count = 22;
            	int count2 = 22;
            	
        		for (int j = 0; j<6;j++) {
                JCheckBox checkBox2 = new JCheckBox();
                	checkBox2.setBounds(10,count+173,400,15);
                	count= (count+22);
                	checkBox2.setText(checkBoxarray[j]);
                	checkBox2.setFont(new Font("Arial, Helvetica, sans-serif", Font.BOLD,11));
                	add(checkBox2);
        		}
        		
        		for (int j = 6; j<11;j++) {
                    JCheckBox checkBox2 = new JCheckBox();
                    	checkBox2.setBounds(300,count2+173,400,15);
                    	count2= (count2+22);
                    	checkBox2.setText(checkBoxarray[j]);
                    	checkBox2.setFont(new Font("Arial, Helvetica, sans-serif", Font.BOLD,11));
                    	add(checkBox2);
            		}

           }
		
		add(panel);
		panel.add(lable);
		add(enteringCollegeAsA);
		add(EntryTerm);
		add(PrimaryMajorofInterest);
		add(SecordaryyMajorofInterest);
		add(lable1);
		setVisible(true);
	}
	
}
