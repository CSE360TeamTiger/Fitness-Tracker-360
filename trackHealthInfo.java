import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;



public class trackHealthInfo {

	private JFrame frame;
	private JTextField txtDiastolicBloodPressure;
	private JTextField txtSystolic;
	private JTextField minutes;
	private JTextField hours;
	private JTextField txtEnterCaloriesBurned;
	private JTextField txtEnterCalorieIntake;
	private JTextField textField;
	private JTextField textField_1;
	
	private JLabel label_1;
	private JLabel lblTimeOfEntry;
	
	private JComboBox monthBox;
	private JComboBox dayBox;
	private JComboBox yearBox;
	private JComboBox am_pm;
	
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
	private String[] time = {"am","pm"};
	private JButton btnNewButton;
	private JButton btnSubmit;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trackHealthInfo window = new trackHealthInfo();
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
	public trackHealthInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 554, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(238, 130, 238));
		panel.setBounds(6, 6, 542, 456);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Track Health Info");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblNewLabel.setBounds(190, 22, 170, 42);
		panel.add(lblNewLabel);
		
		JLabel lblBloodPressure = new JLabel("Blood Pressure");
		lblBloodPressure.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblBloodPressure.setBounds(61, 103, 107, 16);
		panel.add(lblBloodPressure);
		
		txtDiastolicBloodPressure = new JTextField();
		txtDiastolicBloodPressure.setText("Diastolic");
		txtDiastolicBloodPressure.setBounds(47, 123, 134, 28);
		panel.add(txtDiastolicBloodPressure);
		txtDiastolicBloodPressure.setColumns(10);
		
		txtSystolic = new JTextField();
		txtSystolic.setText("Systolic");
		txtSystolic.setBounds(47, 153, 134, 28);
		panel.add(txtSystolic);
		txtSystolic.setColumns(10);
		
		JLabel lblSleepHours = new JLabel("Sleep Hours");
		lblSleepHours.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblSleepHours.setBounds(76, 203, 86, 16);
		panel.add(lblSleepHours);
		
		minutes = new JTextField();
		minutes.setBounds(125, 231, 46, 28);
		panel.add(minutes);
		minutes.setColumns(10);
		
		JLabel lblMin = new JLabel("min");
		lblMin.setBounds(170, 237, 61, 16);
		panel.add(lblMin);
		
		hours = new JTextField();
		hours.setBounds(25, 231, 58, 28);
		panel.add(hours);
		hours.setColumns(10);
		
		JLabel lblHours = new JLabel("hours");
		lblHours.setBounds(86, 237, 61, 16);
		panel.add(lblHours);
		
		JLabel lblCalories = new JLabel("Calories");
		lblCalories.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblCalories.setBounds(87, 281, 61, 16);
		panel.add(lblCalories);
		
		txtEnterCaloriesBurned = new JTextField();
		txtEnterCaloriesBurned.setText("Enter Calories Burned");
		txtEnterCaloriesBurned.setBounds(38, 309, 155, 28);
		panel.add(txtEnterCaloriesBurned);
		txtEnterCaloriesBurned.setColumns(10);
		
		txtEnterCalorieIntake = new JTextField();
		txtEnterCalorieIntake.setText("Enter Calorie Intake");
		txtEnterCalorieIntake.setBounds(38, 340, 155, 28);
		panel.add(txtEnterCalorieIntake);
		txtEnterCalorieIntake.setColumns(10);
		
		JLabel lblDateOfEntry = new JLabel("Date of Entry");
		lblDateOfEntry.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblDateOfEntry.setBounds(331, 103, 93, 16);
		panel.add(lblDateOfEntry);
		
		monthBox = new JComboBox(month);
		monthBox.setToolTipText("");
		monthBox.setBounds(256, 125, 100, 27);
		panel.add(monthBox);
		
		dayBox = new JComboBox(day);
		dayBox.setBounds(353, 125, 63, 26);
		panel.add(dayBox);
		
		yearBox = new JComboBox(year);
		yearBox.setBounds(414, 125, 88, 27);
		panel.add(yearBox);
		
		am_pm = new JComboBox(time);
		am_pm.setBounds(414, 215, 76, 27);
		panel.add(am_pm);
		
		lblTimeOfEntry = new JLabel("Time of Entry");
		lblTimeOfEntry.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblTimeOfEntry.setBounds(331, 187, 93, 16);
		panel.add(lblTimeOfEntry);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("00");
		textField.setColumns(10);
		textField.setBounds(353, 215, 46, 28);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("00");
		textField_1.setColumns(10);
		textField_1.setBounds(282, 215, 58, 28);
		panel.add(textField_1);
		
		label_1 = new JLabel(":");
		label_1.setBounds(341, 221, 24, 16);
		panel.add(label_1);
		
		btnNewButton = new JButton("<-- Back");
		btnNewButton.setBounds(0, 6, 117, 29);
		panel.add(btnNewButton);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(323, 320, 117, 29);
		panel.add(btnSubmit);
		
		
	}
}
