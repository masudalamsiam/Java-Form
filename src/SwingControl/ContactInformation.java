package SwingControl;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

public class ContactInformation extends JPanel {
	JPanel panellabel = new JPanel();
	JPanel panel = new JPanel();
	JLabel lable = new JLabel();
	JPanel namepanel = new JPanel();
	JTextField firstname = new JTextField();
	JTextField miname = new JTextField();
	JTextField lastname = new JTextField();
	JTextField address1 = new JTextField();
	JTextField address2 = new JTextField();
	JTextField city = new JTextField();
	JTextField zip = new JTextField();
	JTextField primary = new JTextField();
	JTextField primary1 = new JTextField();
	JTextField primary2 = new JTextField();
	JTextField email1 = new JTextField();
	JTextField email2 = new JTextField();
	JRadioButton phonetypecell = new JRadioButton();
	JRadioButton phonetypehome = new JRadioButton();
	JRadioButton phonetypework = new JRadioButton();
	JLabel Lable3 = new JLabel();
	
	
	public ContactInformation() {

		setLayout(null);
		setBackground(Color.white);
		setMaximumSize(new Dimension(810, 450));
		setMinimumSize(new Dimension(810, 450));
		setPreferredSize(new Dimension(810, 450));
		
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel.setBackground(Color.black);
		panel.setBounds(10, 0, 790, 25);
		panel.setMaximumSize(new Dimension(700,25));
		lable.setText("Contact Information");
		lable.setFont(new Font("Arial, Helvetica, sans-serif", Font.BOLD,12));
		lable.setForeground(Color.WHITE);

		

		
		String ContactInformationLabel[] = {"Full Name", "Address 1 *","Address 2","City *","State/Province *","Zip Code *","Country *","Primary Phone *","Phone Type *","Date of Birth *","Email Address *","Verify Email Address * *"};
		int count = 0;
        for (int i = 0; i<12;i++) {
        	JLabel Lable3 = new JLabel();
        	Lable3.setBounds(10,count+35,150,20);
        	count= count + 35;
        	Lable3.setFont(new Font("Arial, Helvetica, sans-serif", Font.BOLD,11));
        Lable3.setText(ContactInformationLabel[i]);
        	add(Lable3);

        	}
        
		firstname.setBounds(250,35,200,20);
		miname.setBounds(450,35,50,20);
		lastname.setBounds(500,35,200,20);
		address1.setBounds(250,70,350,20);
		address2.setBounds(250,105,350,20);
		city.setBounds(250,140,350,20);
		zip.setBounds(250,210,80,20);
		email1.setBounds(250,385,350,20);
		email2.setBounds(250,420,350,20);
		phonetypecell.setBounds(250,315,250,20);
		phonetypecell.setText("cell");
		phonetypehome.setBounds(310,315,250,20);
		phonetypehome.setText("Home");
		phonetypework.setBounds(380,315,250,20);
		phonetypework.setText("Work");
		
		
		String[] states = {"Seclect One","Alaska", "Alabama", "Arkansas", "American Samoa", "Arizona", "California", "Colorado", "Connecticut", "District of Columbia", "Delaware", "Florida", "Georgia", "Guam", "Hawaii", "Iowa", "Idaho", "Illinois", "Indiana", "Kansas", "Kentucky", "Louisiana", "Massachusetts", "Maryland", "Maine", "Michigan", "Minnesota", "Missouri", "Mississippi", "Montana", "North Carolina", "North Dakota", "Nebraska", "New Hampshire", "New Jersey", "New Mexico", "Nevada", "New York", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Puerto Rico", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Virginia", "Virgin Islands", "Vermont", "Washington", "Wisconsin", "West Virginia", "Wyoming"};
		JComboBox<String> state = new JComboBox<String>(states);
		state.setBounds(250,175,250,20);
		
		String[] countrys = {"USA","Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegowina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo", "Congo, the Democratic Republic of the", "Cook Islands", "Costa Rica", "Cote d'Ivoire", "Croatia (Hrvatska)", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands (Malvinas)", "Faroe Islands", "Fiji", "Finland", "France", "France Metropolitan", "French Guiana", "French Polynesia", "French Southern Territories", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard and Mc Donald Islands", "Holy See (Vatican City State)", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran (Islamic Republic of)", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, Democratic People's Republic of", "Korea, Republic of", "Kuwait", "Kyrgyzstan", "Lao, People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia, The Former Yugoslav Republic of", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of", "Moldova, Republic of", "Monaco", "Mongolia", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Seychelles", "Sierra Leone", "Singapore", "Slovakia (Slovak Republic)", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "Spain", "Sri Lanka", "St. Helena", "St. Pierre and Miquelon", "Sudan", "Suriname", "Svalbard and Jan Mayen Islands", "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic", "Taiwan, Province of China", "Tajikistan", "Tanzania, United Republic of", "Thailand", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom","United States Minor Outlying Islands", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (British)", "Virgin Islands (U.S.)", "Wallis and Futuna Islands", "Western Sahara", "Yemen", "Yugoslavia", "Zambia", "Zimbabwe"};
		JComboBox<String> country = new JComboBox<String>(countrys);
		country.setBounds(250,245,250,20);

		String[] months = {"Month", "January","February","March","April","May","June","July","August","September","October","November","December"};
		JComboBox<String> month = new JComboBox<String>(months);
		month.setBounds(250,350,90,20);
		
		String[] days = {"Day", "1","1","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
		JComboBox<String> day = new JComboBox<String>(days);
		day.setBounds(340,350,75,20);
		
		String[] years = {"Year", "2017","2016","2015","2014","2013","2012","2011","2010"};
		JComboBox<String> year = new JComboBox<String>(years);
		year.setBounds(415,350,85,20);
		

        	primary.setBounds(250,280,50,20);
        	primary1.setBounds(300,280,50,20);
        	primary2.setBounds(350,280,80,20);

    		add(panel);
    		panel.add(lable);
		add(namepanel);
		add(firstname);
		add(miname);
		add(lastname);
		add(address1);
		add(address2);
		add(city);
		add(state);
		add(zip);
		add(country);
		add(email1);
		add(email2);
		add(primary);
		add(primary1);
    		add(primary2);
		add(phonetypecell);
		add(phonetypehome);
		add(phonetypework);
		add(month);
		add(day);
		add(year);
		setVisible(true);
	}

}
