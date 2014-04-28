import java.awt.EventQueue;
import javax.swing.JFrame;




import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.Color;


public class createUser {

	private int i=0;
	private JFrame frame;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtStreetAddress;
	private JTextField txtZipCode;
	private JTextField txtCity;
	private JTextField txtPhoneNumber;
	private JTextField txtHeight;
	private JTextField txtWeight;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField txtPasswordHint;
	private JTextField txtVerifyPassword;
	
	private JComboBox monthBox;
	private JComboBox dayBox;
	private JComboBox yearBox;
	private JComboBox stateBox;
	private JComboBox heightBox;
	private JComboBox genderBox;

	
	private String[] month = {"January","February","March","April","May","June",
								"July","August","September","October","November","December"};
	private String[] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",
							"16","17","18","19","20","21","22","23","24","25","26","27","28",
							"29","30","31"};
	private String[] year = {"1900","1901","1902","1903","1904","1905","1906","1907","1908","1909","1910",
							"1911","1912","1913","1914","1915","1916","1917","1918","1919","1920","1921",
							"1922","1923","1924","1925","1926","1927","1928","1929","1930","1931","1932",
							"1933","1934","1935","1936","1937","1938","1939","1940","1941","1942","1943",
							"1944","1945","1946","1947","1948","1949","1950","1951","1952","1953","1954",
							"1955","1956","1957","1958","1959","1960","1961","1962","1963","1964","1965",
							"1966","1967","1968","1969","1970","1971","1972","1973","1974","1975","1976",
							"1977","1978","1979","1980","1981","1982","1983","1984","1985","1986","1987",
							"1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998",
							"1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009",
							"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020",
							"2021","2022","2023","2024","2025","2026","2027","2028","2029","2030","2031",
							"2032","2033","2034","2035","2036","2037","2038","2039","2040"};
	private String[] state = {"Alabama","Alaska","Arizona","Arkansas","California","Colorado",
							"Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho",
							"Illinoise","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine",
							"Maryland","Massachusetts","Michigan","Minnesota","Mississippi",
							"Missouri","Montana","Nebraska","Nevada","New Hampshire",
							"New Jersey","New Mexico","New York","North Carolina","North Dakota",
							"Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina",
							"South Dakota","Tennessee","Texas","Utah","Vermont","Virginia",
							"Washington","West Virginia","Wisconsin","Wyoming"};
	private String[] height = new String[i];
	private String[] gender = {"Female","Male"};
			
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createUser window = new createUser();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public createUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 20, 147));
		panel.setBounds(6, 6, 438, 266);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCreateAUser = new JLabel("Create a User");
		lblCreateAUser.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		lblCreateAUser.setBounds(135, 7, 201, 28);
		panel.add(lblCreateAUser);
		
		JButton button = new JButton("<-- Back");
		button.setBounds(6, 6, 117, 29);
		panel.add(button);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(6, 66, 94, 28);
		panel.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setText("Last Name");
		txtLastName.setBounds(101, 66, 88, 28);
		panel.add(txtLastName);
		txtLastName.setColumns(10);
		
		txtStreetAddress = new JTextField();
		txtStreetAddress.setText("Street Address");
		txtStreetAddress.setBounds(6, 92, 134, 28);
		panel.add(txtStreetAddress);
		txtStreetAddress.setColumns(10);
		
		txtZipCode = new JTextField();
		txtZipCode.setText("Zip Code");
		txtZipCode.setBounds(143, 92, 69, 28);
		panel.add(txtZipCode);
		txtZipCode.setColumns(10);
		
		txtCity = new JTextField();
		txtCity.setText("City");
		txtCity.setBounds(6, 120, 88, 28);
		panel.add(txtCity);
		txtCity.setColumns(10);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setText("Phone Number");
		txtPhoneNumber.setBounds(6, 148, 134, 28);
		panel.add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);
		
		txtHeight = new JTextField();
		txtHeight.setText("Height");
		txtHeight.setBounds(6, 179, 88, 28);
		panel.add(txtHeight);
		txtHeight.setColumns(10);
		
		txtWeight = new JTextField();
		txtWeight.setText("Weight");
		txtWeight.setBounds(6, 209, 88, 28);
		panel.add(txtWeight);
		txtWeight.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Select BIrthdate");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 11));
		lblNewLabel.setBounds(207, 44, 134, 16);
		panel.add(lblNewLabel);
		
		monthBox = new JComboBox(month);
		monthBox.setToolTipText("");
		monthBox.setBounds(194, 68, 100, 27);
		panel.add(monthBox);
		
		dayBox = new JComboBox(day);
		dayBox.setBounds(289, 68, 63, 26);
		panel.add(dayBox);
		
		yearBox = new JComboBox(year);
		yearBox.setBounds(344, 68, 88, 27);
		panel.add(yearBox);
		
		stateBox = new JComboBox(state);
		stateBox.setBounds(101, 122, 100, 27);
		panel.add(stateBox);
		
		heightBox = new JComboBox(height);
		heightBox.setBounds(101, 181, 88, 27);
		panel.add(heightBox);
		
		genderBox = new JComboBox(gender);
		genderBox.setBounds(6, 233, 117, 27);
		panel.add(genderBox);
		
		JLabel lblSecurityInfo = new JLabel("Security Info");
		lblSecurityInfo.setFont(new Font("Lucida Grande", Font.BOLD, 11));
		lblSecurityInfo.setBounds(230, 126, 106, 16);
		panel.add(lblSecurityInfo);
		
		txtUsername = new JTextField();
		txtUsername.setText("Username");
		txtUsername.setBounds(207, 148, 106, 28);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setBounds(207, 179, 106, 28);
		panel.add(txtPassword);
		txtPassword.setColumns(10);
		
		txtPasswordHint = new JTextField();
		txtPasswordHint.setText("Password Hint");
		txtPasswordHint.setBounds(207, 209, 106, 28);
		panel.add(txtPasswordHint);
		txtPasswordHint.setColumns(10);
		
		txtVerifyPassword = new JTextField();
		txtVerifyPassword.setText("Verify Password");
		txtVerifyPassword.setBounds(315, 179, 117, 28);
		panel.add(txtVerifyPassword);
		txtVerifyPassword.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(315, 232, 117, 29);
		panel.add(btnSubmit);
	}
}
