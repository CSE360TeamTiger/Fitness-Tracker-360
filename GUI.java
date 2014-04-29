import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.lang.String;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.rtf.RTFEditorKit;

import rtf.AdvancedRTFEditorKit;



public class GUI extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	//DECLARING FOR FORGOTPASSWORD FRAME
	private JFrame forgotPasswordFrame;
	private JPanel forgotPanel;
	private JTextField usernameTextField;
	private JLabel hintLabel;
	private JLabel showHint;
	private JLabel passwordLabel;
	private JTextField passwordTextField;
	private JButton btnEnter;
	
	private String username = "vanessa";
	private String usernameEntered;
	private String password = "fitnesstracker";
	private String passwordEntered;
	private String hint;
	private JButton btnEnterPassword;
	
	//DECLARING FOR LOGIN FRAME
	private JFrame login;
	private JPanel loginPanel;
	private JTextField txtUserName_login;
	private JPasswordField passwordField_login;
	private JButton btnForgotPassowrd;
	private JButton btnCreateUser;
	private String userChoice;
	private String[] choice = {"Patient","Doctor"};
	
	//DECLARING FOR ACTIVITIES FRAME
	private JFrame activitiesFrame;
	private JPanel welcomePanel;
	private JLabel welcomeLabel;
	
	private JPanel exercisePanel;
	private JTextField newWorkout;
	private ArrayList<String> userWorkouts;
	String workout;
	private JComboBox givenWorkout;
	private String[] exercise = {"CARDIO","---------","Running/Treadmil","Bicycle","Eliptical","Jumpe Rope","\n",
			"UPPER BODY","---------","Dumbbell Biceps Curl","Lying Down Tricep Extension",
			"Bosu Kneeling Pushups","Arnold Press","Kettlebell Upright Row","\n",
			"LOWER BODY","---------","Beginner Squat","Calf Raise","Machine Leg Extension",
			"Machine Leg Curl"};
	private JLabel enterExercise_label;
	private JLabel selectExercise_label;
	private String chosenExercise;
	private JLabel or_Label;
	private JLabel duration_label;
	private JTextField txtDuration;
	private ArrayList<String> userDuration;
	private String workoutDuration;
	private JLabel hours_label;
	private JButton btnAdd;
	private JButton viewExercise;
	
	private JPanel healthPanel;
	private JLabel bloodPressure_label;
	private JTextField txtDiastolic;
	private int userDiastolic;
	private JTextField txtSystolic;
	private int userSystolic;
	private JLabel sleepHours_label;
	private JTextField txtHours;
	private int userSleep;
	private JLabel calories_label;
	private JTextField txtCalorieIntake;
	private int userIntake;
	private JTextField txtCaloriesBurned;
	private int userBurned;
	private JLabel dateOfEntry_label;
	private JComboBox monthBox_health;
	private String userMonth_health;
	private JComboBox dayBox_health;
	private String userDay_health;
	private JComboBox yearBox_health;
	private String userYear_health;
	private JLabel timeOfEntry_label;
	private JTextField txtEntryTime;
	private int userTimeEntry;
	private JComboBox am_pm;
	private String[] time = {"am","pm"};
	private String userAm_Pm;
	private JButton btnSubmit_health;
	private JButton btnHealthLogout;
	
	private JPanel viewPanel;
	private JTable table;
	private String[] columnNames = {"Health Indicator","Data"};
	private Object[][] data;
	
	private JPanel graphPanel;
	
	private JPanel chooseGraph_Panel;
	private JLabel chooseGraph_label;
	private JRadioButton rdbtnBloodPressure;
	private JRadioButton rdbtnCalories;
	private JRadioButton rdbtnExercise;
	private ButtonGroup radioGroup;
	
	private JPanel editPanel;
	private JTextField txtFirstName;
	private String first;
	private JTextField txtLastName;
	private String last;
	private JTextField txtStreetAddress;
	private String address;
	private JTextField txtZipCode;
	private String zipCode;
	private JTextField txtCity;
	private String city;
	private JTextField txtPhoneNumber;
	private String number;
	private JTextField txtHeight;
	private String height;
	private JTextField txtWeight;
	private Double weight;
	private JLabel birthLabel;
	private JComboBox monthBox_birth;
	private String birthMonth;
	private JComboBox dayBox_birth;
	private String birthDay;
	private JComboBox yearBox_birth;
	private String birthYear;
	private String userGender;
	private JTextField txtPassword;
	private JTextField txtVerifyPassword;
	private String verify;
	private JTextField txtPasswordHint;
	private JButton btnSubmit_edit;	
	private JButton btnLogout_edit;
	
	private JPanel notesForUserPanel;
	
	
	//DECLARE FOR CREATE USER FRAME
	private JFrame createUser;
	private JPanel createUserPanel;
	private JLabel createUserLabel;
	private JTextField txtUsername;
	private JLabel securityInfo_label;
	private JButton submitCreated;
	private JButton btnExit;
	


	//DECLARING VIEW EXERCISE FRAME
	private JFrame viewExerciseFrame;
	private JPanel viewExercisePanel;
	private JScrollPane scroll_viewExercise;
	
	//DECLARING DOCTOR FRAME
	private JFrame Doctor;
	private JPanel patientInfoPanel;
	private JScrollPane scrollPane;
	private JTextArea patients;
	private JComboBox data_graphBox;
	private String [] data_Graph = {"Data Table", "Blood Pressure", "Exercises", "Calories"};
	private JTextArea txtSuggestions;
	private String data_graphChoice;
	private String suggestions;
	private JButton btnSubmit_Doctor;
	private JTextArea noteFromDoctor;
	
	//Delcaring JComboBoxes used in multiple frames
	private JComboBox genderBox;
	private JComboBox stateBox;
	private String chosenState;
	private JComboBox choiceBox;
	
	//declare and initialize array of genders for gender combo box used by edit panel and create user frame
	private String[] gender = {"Female","Male"};
	
	//declare and initialize array of states for state combo box used by edit panel and create user frame
	private String[] state = {"Alabama","Alaska","Arizona","Arkansas","California","Colorado",
			"Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho",
			"Illinoise","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine",
			"Maryland","Massachusetts","Michigan","Minnesota","Mississippi",
			"Missouri","Montana","Nebraska","Nevada","New Hampshire",
			"New Jersey","New Mexico","New York","North Carolina","North Dakota",
			"Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina",
			"South Dakota","Tennessee","Texas","Utah","Vermont","Virginia",
			"Washington","West Virginia","Wisconsin","Wyoming"};
	
	//declare and initialize array of the months for the month combo box used by edit panel, create user frame, track health info panel
	private String[] month = {"January","February","March","April","May","June",
			"July","August","September","October","November","December"};
	
	//declare and initialize array of numbers from 1-31 for the day combo box used by edit panel, create user frame, track health info panel
	private String[] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",
							"16","17","18","19","20","21","22","23","24","25","26","27","28",
							"29","30","31"};
	
	//declare and initialize array of years from 1900-2040 for year combo box used by edit panel, create user frame, track health info panel
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
	
	
		

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	


	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public GUI() throws IOException {
		initialize1();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	@SuppressWarnings("deprecation")
	private void initialize1() throws IOException {
		
		//TABS
		JTabbedPane tabs = new JTabbedPane();
		
		//Creates LOGIN FRAME and all its contents
		login = new JFrame();
		login.setBounds(100, 100, 615, 383);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login.getContentPane().setLayout(null);
		
		//creates login panel
		loginPanel = new JPanel();
		loginPanel.setBounds(6, 6, 603, 349);
		login.getContentPane().add(loginPanel);
		loginPanel.setLayout(null);
		
		//creates text field for user input
		txtUserName_login = new JTextField();
		txtUserName_login.setBounds(228, 87, 134, 28);
		txtUserName_login.setText("Username");
		loginPanel.add(txtUserName_login);
		txtUserName_login.setColumns(10);
		
		//creates text field for user input
		passwordField_login = new JPasswordField();
		passwordField_login.setBounds(228, 116, 134, 28);
		passwordField_login.setToolTipText("password");
		loginPanel.add(passwordField_login);
		
		//creates forgot password button
		btnForgotPassowrd = new JButton("Forgot Passowrd?");
		btnForgotPassowrd.setBounds(223, 235, 151, 29);
		btnForgotPassowrd.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		loginPanel.add(btnForgotPassowrd);
		
		//adds action to forgot password button
		btnForgotPassowrd.addActionListener(new ActionListener() {
			//when button is clicked, saves user's input and screen changes to forgot password frame
			public void actionPerformed(ActionEvent arg0) {
				//saving user input
				usernameEntered = txtUserName_login.getText();
				passwordEntered = passwordField_login.getText();
				
				//hides menu frame
				login.setVisible(false);
				//shows forgot password frame
				forgotPasswordFrame.setVisible(true);
			
			}
		});
		
		//creates button to create a new user
		btnCreateUser = new JButton("Create User");
		btnCreateUser.setBounds(238, 276, 117, 29);
		btnCreateUser.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		loginPanel.add(btnCreateUser);
		
		//adds action to create user button
		btnCreateUser.addActionListener(new ActionListener() {
			//when Back button is clicked, it takes the user to create user frame
			public void actionPerformed(ActionEvent arg0) {
			// hides login frame
			login.setVisible(false);
			//shows create user frame
			createUser.setVisible(true);
			}
		});
		
		//combo box to choose if patient or doctor
		choiceBox = new JComboBox(choice);
		choiceBox.setBounds(228, 156, 134, 27);
		loginPanel.add(choiceBox);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(238, 194, 117, 29);
		btnLogin.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		loginPanel.add(btnLogin);
		
		
		
		//adds action to the Login button
		btnLogin.addActionListener(new ActionListener() {
			//when button is clicked, screen changes to activities frame
			public void actionPerformed(ActionEvent arg0) {

				//saving user input
				usernameEntered = txtUserName_login.getText();
				passwordEntered = passwordField_login.getText();
				//saves user selection from combo box
				userChoice = (String)choiceBox.getSelectedItem();
				
				//if the inputed username, password match in the database AND 
				//user is a patient
				if(usernameEntered.equals(username) && passwordEntered.equals(password) && "Patient".equals(userChoice)){	
					//hides login frame
					login.setVisible(false);
					//makes activities frame visible
					activitiesFrame.setVisible(true);
				}
				else if(usernameEntered.equals(username) && passwordEntered.equals(password) && "Doctor".equals(userChoice)){
						//hides login frame
						login.setVisible(false);
						//makes doctor frame visible
						Doctor.setVisible(true);
						
						
				}
			  	
			  	else{
			  		JOptionPane.showMessageDialog(login, "Username or password is invalid","A plain message",
    				JOptionPane.PLAIN_MESSAGE);
			  	}
			}
		});
		
		//Initialize the ACTIVITIES FRAME and all its contents
		activitiesFrame = new JFrame();
		activitiesFrame.setBounds(100, 100, 615, 383);
		activitiesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		activitiesFrame.getContentPane().setLayout(null);
		
		//Creating WELCOME PANEL	
		welcomePanel = new JPanel();
		welcomePanel.setBounds(6, 6, 603, 349);
		activitiesFrame.setContentPane(tabs);
		welcomePanel.setLayout(null);
		tabs.addTab("Welcome", welcomePanel);
		
		//Creates welcome label
		welcomeLabel = new JLabel("Welcome!");
		welcomeLabel.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		welcomeLabel.setBounds(221, 84, 194, 105);
		welcomePanel.add(welcomeLabel);
		
		//Creating Track EXERCISE PANEL and all contents
		exercisePanel = new JPanel();
		exercisePanel.setBounds(6, 6, 603, 349);
		activitiesFrame.setContentPane(tabs);
		exercisePanel.setLayout(null);
		tabs.addTab("Track Exercise", exercisePanel);
		
		//creates text field for user to input new work outs
		newWorkout = new JTextField();
		newWorkout.setHorizontalAlignment(SwingConstants.CENTER);
		newWorkout.setText("new exercise");
		newWorkout.setBounds(95, 142, 134, 28);
		exercisePanel.add(newWorkout);
		newWorkout.setColumns(10);
		
		//displays given work outs in jcombobox
		givenWorkout = new JComboBox(exercise);
		givenWorkout.setBounds(341, 144, 181, 27);
		exercisePanel.add(givenWorkout);
		
		//creates label
		enterExercise_label = new JLabel("Enter a New Exercise");
		enterExercise_label.setHorizontalAlignment(SwingConstants.CENTER);
		enterExercise_label.setBounds(82, 114, 157, 16);
		exercisePanel.add(enterExercise_label);
		
		//creates label
		selectExercise_label = new JLabel("Select a Given Exercise");
		selectExercise_label.setHorizontalAlignment(SwingConstants.CENTER);
		selectExercise_label.setBounds(345, 114, 166, 16);
		exercisePanel.add(selectExercise_label);
		
		//creates or label
		or_Label = new JLabel("OR");
		or_Label.setBounds(278, 142, 33, 16);
		exercisePanel.add(or_Label);
		
		//creates duration label
		duration_label = new JLabel("Duration of Exercise");
		duration_label.setBounds(99, 201, 144, 16);
		exercisePanel.add(duration_label);
		
		//creates text field for user to input duration of workout
		txtDuration = new JTextField();
		txtDuration.setHorizontalAlignment(SwingConstants.CENTER);
		txtDuration.setText("00:00");
		txtDuration.setBounds(241, 195, 66, 28);
		exercisePanel.add(txtDuration);
		txtDuration.setColumns(10);
		
		//creates hours label
		hours_label = new JLabel("hours");
		hours_label.setBounds(309, 201, 61, 16);
		exercisePanel.add(hours_label);	
		
		//creates button for user to add an exercise to their log
		btnAdd = new JButton("Add");
		btnAdd.setBounds(86, 270, 117, 29);
		exercisePanel.add(btnAdd);
		
				//VIEW EXERCISES FRAME
				viewExerciseFrame = new JFrame();
				viewExerciseFrame.setBounds(100, 100, 615, 383);
				viewExerciseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				viewExerciseFrame.getContentPane().setLayout(null);
				
				
				//creates view exercise panel
				viewExercisePanel = new JPanel();
				viewExercisePanel.setBounds(6, 6, 603, 349);
				viewExerciseFrame.getContentPane().add(viewExercisePanel);
				viewExercisePanel.setLayout(null);
		        
				//COMPILES BUT DOES NOT WORK
				// Create an RTF editor window
		        RTFEditorKit exerciseDescription = new RTFEditorKit();
		        JEditorPane editorPane = new JEditorPane();
		        editorPane.setBounds(100, 100, 615, 383);
		        editorPane.setEditorKit(exerciseDescription);
		        editorPane.setBackground(Color.white);

		        // This text could be big so add a scroll pane
		        JScrollPane scrollPane_Description = new JScrollPane();
		        scrollPane_Description.getViewport().add(editorPane);
		        viewExercisePanel.add(scrollPane_Description);

		        // Load an RTF file into the editor
		        try {
		          FileInputStream myFile = new FileInputStream("C:\\exerciseDescription.rtf");
		          exerciseDescription.read(myFile, editorPane.getDocument(), 0);
		        } catch (FileNotFoundException e) {
		          System.out.println("File not found");
		        } catch (IOException e) {
		          System.out.println("I/O error");
		        } catch (BadLocationException e) {
		        }
				

		
		//adds action to the add button
		btnAdd.addActionListener(new ActionListener() {
			//when Back button is clicked, it saves the exercise and duration user chose/inputed
			public void actionPerformed(ActionEvent arg0) {
				//saves work outs to an array of work outs
				userWorkouts = new ArrayList<String>();
				workout = newWorkout.getText();
				
				//saves work out durations to an array
				userDuration = new ArrayList<String>();
				workoutDuration = txtDuration.getText();
				
				//saves exercise chosen from combobox
				chosenExercise = (String)givenWorkout.getSelectedItem();
				
				//add exercise and duration to array list and saved
				userWorkouts.add(workout);
				userDuration.add(workoutDuration);
			}
		});
		
		//creates a jbutton so user can view how to do the given work outs
		viewExercise = new JButton("View Given Exercises");
		viewExercise.setBounds(370, 270, 170, 29);
		exercisePanel.add(viewExercise);
		
		//adds action to the viewExercise button
		viewExercise.addActionListener(new ActionListener() {
			//when viewExercise is clicked by user, it takes user to a frame
			//that shows how to do each work out that was given in combo box
			public void actionPerformed(ActionEvent arg0) {		
			//shows viewExerciseFrame to the user	
			viewExerciseFrame.setVisible(true);
			}
		});
		
		//Creating Track HEALTH INFO PANEL and all contents
		healthPanel = new JPanel();
		healthPanel.setBounds(6, 6, 603, 349);
		activitiesFrame.setContentPane(tabs);
		healthPanel.setLayout(null);
		tabs.addTab("Track Health Info", healthPanel);
		
		//creates blood pressure label to primpt user to enter blood pressures
		bloodPressure_label = new JLabel("Blood Pressure");
		bloodPressure_label.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		bloodPressure_label.setBounds(96, 66, 107, 16);
		healthPanel.add(bloodPressure_label);
		
		//creates text field for user to input their diastolic blood pressure
		txtDiastolic = new JTextField();
		txtDiastolic.setText("Diastolic");
		txtDiastolic.setBounds(74, 82, 134, 28);
		healthPanel.add(txtDiastolic);
		txtDiastolic.setColumns(10);

		//creates text field for user to input their systolic blood pressure
		txtSystolic = new JTextField();
		txtSystolic.setText("Systolic");
		txtSystolic.setBounds(74, 110, 134, 28);
		healthPanel.add(txtSystolic);
		txtSystolic.setColumns(10);

		//creates label for sleep hours
		sleepHours_label = new JLabel("Sleep Hours");
		sleepHours_label.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		sleepHours_label.setBounds(107, 150, 86, 16);
		healthPanel.add(sleepHours_label);
		
		//creates hours label
		hours_label = new JLabel("hours");
		hours_label.setBounds(96, 169, 58, 28);
		healthPanel.add(hours_label);		
		
		//creates text field for user to input hours slept the night before
		txtHours = new JTextField("00:00");
		txtHours.setBounds(157, 178, 53, 16);
		healthPanel.add(txtHours);
		txtHours.setColumns(10);

		//creates calories label
		calories_label = new JLabel("Calories");
		calories_label.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		calories_label.setBounds(107, 209, 78, 16);
		healthPanel.add(calories_label);
		
		//creates text field for user to enter amount of calories burned
		txtCaloriesBurned = new JTextField();
		txtCaloriesBurned.setText("Enter Calories Burned");
		txtCaloriesBurned.setBounds(74, 227, 155, 28);
		healthPanel.add(txtCaloriesBurned);
		txtCaloriesBurned.setColumns(10);

		//creates text field for user to enter amount of calories they ate that day
		txtCalorieIntake = new JTextField();
		txtCalorieIntake.setText("Enter Calorie Intake");
		txtCalorieIntake.setBounds(74, 255, 155, 28);
		healthPanel.add(txtCalorieIntake);
		txtCalorieIntake.setColumns(10);		

		//creates label for date entry
		dateOfEntry_label = new JLabel("Date of Entry");
		dateOfEntry_label.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		dateOfEntry_label.setBounds(383, 66, 93, 16);
		healthPanel.add(dateOfEntry_label);
	
		//creates combo box for the month
		monthBox_health = new JComboBox(month);
		monthBox_health.setToolTipText("");
		monthBox_health.setBounds(300, 84, 100, 27);
		healthPanel.add(monthBox_health);		

		//creates combo box for the day
		dayBox_health = new JComboBox(day);
		dayBox_health.setBounds(393, 84, 63, 26);
		healthPanel.add(dayBox_health);
		
		//creates combo box for the year
		yearBox_health = new JComboBox(year);
		yearBox_health.setBounds(453, 84, 88, 27);
		healthPanel.add(yearBox_health);
		
		//creates label for time of entry
		timeOfEntry_label = new JLabel("Time of Entry");
		timeOfEntry_label.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		timeOfEntry_label.setBounds(383, 116, 93, 16);
		healthPanel.add(timeOfEntry_label);
		
		//creates text field for user to input time of entry
		txtEntryTime = new JTextField();
		txtEntryTime.setHorizontalAlignment(SwingConstants.CENTER);
		txtEntryTime.setText("00:00");
		txtEntryTime.setColumns(10);
		txtEntryTime.setBounds(400, 144, 53, 28);
		healthPanel.add(txtEntryTime);

		//creates combo box to choose if time is am or pm
		am_pm = new JComboBox(time);
		am_pm.setBounds(453, 146, 76, 27);
		healthPanel.add(am_pm);	

		//creates button that saves user entry when clicked
		btnSubmit_health = new JButton("Submit");
		btnSubmit_health.setBounds(369, 204, 117, 29);
		healthPanel.add(btnSubmit_health);	
		
		//adds action to the submit button
		btnSubmit_health.addActionListener(new ActionListener() {
			//when Back button is clicked, it saves all the health information inputed by user.
			public void actionPerformed(ActionEvent arg0) {
				//saves all user's inputs
				userDiastolic = Integer.parseInt(txtDiastolic.getText());
				userSystolic = Integer.parseInt(txtSystolic.getText());
				userSleep = Integer.parseInt(txtHours.getText());
				userBurned = Integer.parseInt(txtCaloriesBurned.getText());
				userIntake = Integer.parseInt(txtCalorieIntake.getText());
				userMonth_health = (String)monthBox_health.getSelectedItem();
				userDay_health = (String)dayBox_health.getSelectedItem();
				userYear_health = (String)yearBox_health.getSelectedItem();
				userTimeEntry = Integer.parseInt(txtEntryTime.getText());
				userAm_Pm = (String)am_pm.getSelectedItem();
				
			}
		});
		
		//creates button for user to logout of account
		btnHealthLogout = new JButton("Logout");
		btnHealthLogout.setBounds(369, 241, 117, 29);
		healthPanel.add(btnHealthLogout);
		
		//adds action to the logout button from the health panel
		btnHealthLogout.addActionListener(new ActionListener() {
			//when Back button is clicked, it takes the user back to login page
			public void actionPerformed(ActionEvent arg0) {		
			activitiesFrame.setVisible(false);
			
			login.setVisible(true);
			}
		});
		
		//Create VIEW SUMMARY PANEL and all contents
		viewPanel = new JPanel();
		viewPanel.setBounds(6, 6, 603, 349);
		activitiesFrame.setContentPane(tabs);
		viewPanel.setLayout(null);
		tabs.addTab("View Summary", viewPanel);
		
		//creates data panel within view summary
		JPanel dataPanel = new JPanel(new FlowLayout());
		dataPanel.setBounds(6, 46, 235, 309);
		viewPanel.add(dataPanel);
		
		//NEED TO MAKE CUSTOM TABLE MODEL
		//creates table				
		table = new JTable(data, columnNames);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Dyastolic Blood Pressure", new Double(1.3)},
				{"Systolic Blood Pressure", new Integer(3)},
				{"Calorie Intake", new Integer(2)},
				{"Calories Burned", new Integer(20)},
				{"Hours Slept", new Integer(10)},
				{" ", " "},
				{"Completed Exercise", " "},
				{"--------------------------", " "},
			},
			new String[] {
				"Health Indicator", "Data"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(158);
		table.getColumnModel().getColumn(1).setPreferredWidth(42);
		table.setBounds(6, 46, 235, 309);
		table.setFillsViewportHeight(true);
		dataPanel.add(table);
						
		
		//adds panel to show graphs 
		graphPanel = new JPanel();
		graphPanel.setBounds(242, 46, 367, 176);
		viewPanel.add(graphPanel);
		graphPanel.setLayout(null);
		
		//adds panel to show options of graph subject
		chooseGraph_Panel = new JPanel();
		chooseGraph_Panel.setBounds(242, 223, 367, 132);
		viewPanel.add(chooseGraph_Panel);
		chooseGraph_Panel.setLayout(null);
		
		//Creates label to tell user to choose one of the graphs 
		chooseGraph_label = new JLabel("Choose the graph you would like to view");
		chooseGraph_label.setBounds(242, 223, 367, 132);
		viewPanel.add(chooseGraph_label);
		
		//Creates button to choose the graph of the user's blood pressure 
		rdbtnBloodPressure = new JRadioButton("Blood Pressure");
		rdbtnBloodPressure.setBounds(6, 31, 141, 23);
		viewPanel.add(rdbtnBloodPressure);
		
		//Creates button to choose the graph of the user's calories
		rdbtnCalories = new JRadioButton("Calories");
		rdbtnCalories.setBounds(6, 52, 141, 29);
		viewPanel.add(rdbtnCalories);
		
		//Creates button to choose the graph of the user's overall workout duration
		rdbtnExercise = new JRadioButton("Exercise Duration");
		rdbtnExercise.setBounds(6, 80, 158, 23);
		viewPanel.add(rdbtnExercise);
		
		//Adds radio buttons to a button group
		radioGroup = new ButtonGroup();
		radioGroup.add(rdbtnBloodPressure);
		radioGroup.add(rdbtnCalories);
		radioGroup.add(rdbtnExercise);
		
		//adding action to radio buttons
		if(rdbtnBloodPressure.isSelected())
		{
			// display blood pressure graph
		}
		else if(rdbtnCalories.isSelected())
		{
			//display calories graph
		}
		else
		{
			//display exercise graph
		}
		
		//ADD GRAPHS
		
		//Create EDIT ACCOUNT PANEL and all contents
		editPanel = new JPanel();
		editPanel.setBounds(6, 6, 603, 349);
		activitiesFrame.setContentPane(tabs);
		editPanel.setLayout(null);
		tabs.addTab("Edit Account", editPanel);

		//creates text field for user to input first name
		txtFirstName = new JTextField();
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(65, 66, 94, 28);
		editPanel.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		//creates text field for user to input last name
		txtLastName = new JTextField();
		txtLastName.setText("Last Name");
		txtLastName.setBounds(161, 66, 88, 28);
		editPanel.add(txtLastName);
		txtLastName.setColumns(10);
			
		//Creates text field for user to input address
		txtStreetAddress = new JTextField();
		txtStreetAddress.setText("Street Address");
		txtStreetAddress.setBounds(63, 92, 134, 28);
		editPanel.add(txtStreetAddress);
		txtStreetAddress.setColumns(10);
		
		
		//creates text field for user to input zipcode
		txtZipCode = new JTextField();
		txtZipCode.setText("Zip Code");
		txtZipCode.setBounds(198, 92, 69, 28);
		editPanel.add(txtZipCode);
		txtZipCode.setColumns(10);
				
		//creates text field for user to input city
		txtCity = new JTextField();
		txtCity.setText("City");
		txtCity.setBounds(65, 120, 88, 28);
		editPanel.add(txtCity);
		txtCity.setColumns(10);
		
		//creates combo box for user to select the state
		stateBox = new JComboBox(state);
		stateBox.setBounds(161, 122, 117, 27);
		editPanel.add(stateBox);
				
		//creates text field for user to input phone number
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setText("Phone Number");
		txtPhoneNumber.setBounds(65, 153, 134, 28);
		editPanel.add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);
			
		//creates text field for user's inputed height 
		txtHeight = new JTextField("0'00''");
		txtHeight.setText("Height");
		txtHeight.setBounds(65, 179, 88, 28);
		editPanel.add(txtHeight);
		txtHeight.setColumns(10);
				
		//creates text field for user to input weight
		txtWeight = new JTextField();
		txtWeight.setText("Weight (lbs)");
		txtWeight.setBounds(65, 203, 88, 28);
		editPanel.add(txtWeight);
		txtWeight.setColumns(10);		
		
		//creates label to prompt user to select their birth date
		birthLabel = new JLabel("Select Birthday");
		birthLabel.setHorizontalAlignment(SwingConstants.CENTER);
		birthLabel.setFont(new Font("Lucida Grande", Font.BOLD, 11));
		birthLabel.setBounds(371, 54, 134, 16);
		editPanel.add(birthLabel);
		
		//creates combo box of months for user to choose 
		monthBox_birth = new JComboBox(month);
		monthBox_birth.setToolTipText("");
		monthBox_birth.setBounds(310, 68, 100, 27);
		editPanel.add(monthBox_birth);		
		
		//creates combo box of days in a month for user to select
		dayBox_birth = new JComboBox(day);
		dayBox_birth.setBounds(403, 68, 63, 26);
		editPanel.add(dayBox_birth);
				
		//Creates combo box for user to select the year they were born
		yearBox_birth = new JComboBox(year);
		yearBox_birth.setBounds(458, 68, 99, 27);
		editPanel.add(yearBox_birth);		
		
		//creates combo box for user to choose a gender
		genderBox = new JComboBox(gender);
		genderBox.setBounds(65, 233, 117, 27);
		editPanel.add(genderBox);

		//creates label to prompt user to enter security info
		securityInfo_label = new JLabel("Security Info");
		securityInfo_label.setHorizontalAlignment(SwingConstants.CENTER);
		securityInfo_label.setFont(new Font("Lucida Grande", Font.BOLD, 11));
		securityInfo_label.setBounds(388, 104, 106, 16);
		editPanel.add(securityInfo_label);
		
		//creates text field for user to enter a new password
		txtPassword = new JTextField();
		txtPassword.setText("New Password");
		txtPassword.setBounds(371, 121, 134, 28);
		editPanel.add(txtPassword);
		txtPassword.setColumns(10);		
		
		//creates text field for user to verify password
		txtVerifyPassword = new JTextField();
		txtVerifyPassword.setText("Verify Password");
		txtVerifyPassword.setBounds(371, 179, 134, 28);
		editPanel.add(txtVerifyPassword);
		txtVerifyPassword.setColumns(10);		
		
		//creates text field for user to enter password hint
		txtPasswordHint = new JTextField();
		txtPasswordHint.setText("Password Hint");
		txtPasswordHint.setBounds(371, 153, 134, 28);
		editPanel.add(txtPasswordHint);
		txtPasswordHint.setColumns(10);
		
		//creates button for user to submit edited account info
		btnSubmit_edit = new JButton("Submit");
		btnSubmit_edit.setBounds(371, 243, 117, 29);
		editPanel.add(btnSubmit_edit);
		
		//adds action to the submit button
		btnSubmit_edit.addActionListener(new ActionListener() {
			//when Back button is clicked, it takes the user back to login page
			public void actionPerformed(ActionEvent arg0) {		
				//SAVES ALL PERSONAL INFO TO USERS ACCOUNT IN DATABASE
				password = txtPassword.getText();
				verify = txtVerifyPassword.getText();
				hint = txtPasswordHint.getText();
				
				//checks password verification
				// if password matches the verification then adds user inputs to account
				if(password.equals(verify))
				{
					first = txtFirstName.getText();
					last = txtLastName.getText();
					address = txtStreetAddress.getText();
					zipCode = txtZipCode.getText();
					city = txtCity.getText();
					chosenState = (String)stateBox.getSelectedItem();
					number = txtPhoneNumber.getText();
					height = txtHeight.getText();
					weight = Double.parseDouble(txtWeight.getText());
					birthMonth = (String)monthBox_birth.getSelectedItem();
					birthDay = (String)dayBox_birth.getSelectedItem();
					birthYear = (String)yearBox_birth.getSelectedItem();
					userGender = (String)genderBox.getSelectedItem();
				}
				else{
					JOptionPane.showMessageDialog(activitiesFrame,
						    "Entered password did not match the password verification",
						    "Inane error",
						    JOptionPane.ERROR_MESSAGE);
				}		
			}
		});
		
		//creates logout button for user to logout of their account 
		btnLogout_edit = new JButton("Logout");
		btnLogout_edit.setBounds(480, 6, 117, 29);
		editPanel.add(btnLogout_edit);
		
		//adds action to the logout button
		btnLogout_edit.addActionListener(new ActionListener() {
			//when logout button is clicked, it takes the user back to login page
			public void actionPerformed(ActionEvent arg0) {		
				//hide the activities frame
				activitiesFrame.setVisible(false);
				//shows the login frame
				login.setVisible(true);
			}
		});
		
		//creates DOCTOR SUGGESTIONS FRAME
		notesForUserPanel = new JPanel();
		notesForUserPanel.setBounds(6, 6, 603, 349);
		activitiesFrame.setContentPane(tabs);
		notesForUserPanel.setLayout(null);
		tabs.addTab("Doctor Suggestions", notesForUserPanel);

		//creates text area to display doctor's notes/suggestions
		noteFromDoctor = new JTextArea();
		noteFromDoctor.setText("Doctor Suggestions");
		noteFromDoctor.setRows(10);
		noteFromDoctor.setBounds(6, 6, 603, 349);
		notesForUserPanel.add(noteFromDoctor);
		
		
		//declare and initialize CREATE USER FRAME and all its contents
		createUser = new JFrame();
		createUser.setBounds(100, 100, 615, 383);
		createUser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createUser.getContentPane().setLayout(null);
		
		//creates create user panel
		createUserPanel = new JPanel();
		createUserPanel.setBounds(6, 6, 603, 349);
		createUser.getContentPane().add(createUserPanel);
		createUserPanel.setLayout(null);
		
		//creates create user label
		createUserLabel = new JLabel("Create a User");
		createUserLabel.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		createUserLabel.setBounds(198, 26, 201, 28);
		createUserPanel.add(createUserLabel);
		
		//text field to get user's first name
		txtFirstName = new JTextField();
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(65, 66, 94, 28);
		createUserPanel.add(txtFirstName);
		txtFirstName.setColumns(10);		
		
		//text field to get user's last name
		txtLastName = new JTextField();
		txtLastName.setText("Last Name");
		txtLastName.setBounds(161, 66, 88, 28);
		createUserPanel.add(txtLastName);
		txtLastName.setColumns(10);
		
		//text field for user's address
		txtStreetAddress = new JTextField();
		txtStreetAddress.setText("Street Address");
		txtStreetAddress.setBounds(63, 92, 134, 28);
		createUserPanel.add(txtStreetAddress);
		txtStreetAddress.setColumns(10);

		//text field to get user's zipcode
		txtZipCode = new JTextField();
		txtZipCode.setText("Zip Code");
		txtZipCode.setBounds(198, 92, 69, 28);
		createUserPanel.add(txtZipCode);
		txtZipCode.setColumns(10);
		
		//text field to get user's city
		txtCity = new JTextField();
		txtCity.setText("City");
		txtCity.setBounds(65, 120, 88, 28);
		createUserPanel.add(txtCity);
		txtCity.setColumns(10);
		
		//text field to get user's phone number
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setText("Phone Number");
		txtPhoneNumber.setBounds(65, 153, 134, 28);
		createUserPanel.add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);
		
		//creates text field for user's inputed height 
		txtHeight = new JTextField("0'00''");
		txtHeight.setText("Height");
		txtHeight.setBounds(65, 179, 88, 28);
		createUserPanel.add(txtHeight);
		txtHeight.setColumns(10);
				
		//creates text field for user to input weight
		txtWeight = new JTextField();
		txtWeight.setText("Weight (lbs)");
		txtWeight.setBounds(65, 203, 88, 28);
		createUserPanel.add(txtWeight);
		txtWeight.setColumns(10);    
	    
	    //creates label to prompt user to select their birth date
	    birthLabel = new JLabel("Select Birthday");
	    birthLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    birthLabel.setFont(new Font("Lucida Grande", Font.BOLD, 11));
	    birthLabel.setBounds(371, 54, 134, 16);
	    createUserPanel.add(birthLabel);
	  
	    //creates jcombo box of months for user to choose 
	    monthBox_birth = new JComboBox(month);
	    monthBox_birth.setToolTipText("");
	    monthBox_birth.setBounds(310, 68, 100, 27);
	    createUserPanel.add(monthBox_birth);
	  		
	    //creates jcombobox of days in a month for user to select
	    dayBox_birth = new JComboBox(day);
	    dayBox_birth.setBounds(403, 68, 63, 26);
	    createUserPanel.add(dayBox_birth);
	    
	    //Creates jcombobox for user to select the year they were born
	    yearBox_birth = new JComboBox(year);
	    yearBox_birth.setBounds(458, 68, 99, 27);
	    createUserPanel.add(yearBox_birth);

	    //creates jcombobox for user to choose a gender
	    genderBox = new JComboBox(gender);
	    genderBox.setBounds(65, 233, 117, 27);
	    createUserPanel.add(genderBox);
	  	
		//creates label for security info
	    securityInfo_label = new JLabel("Security Info");
	    securityInfo_label.setHorizontalAlignment(SwingConstants.CENTER);
	    securityInfo_label.setFont(new Font("Lucida Grande", Font.BOLD, 11));
	    securityInfo_label.setBounds(382, 99, 106, 16);
		createUserPanel.add(securityInfo_label);
		
		//creates text field for user to enter desired username
		txtUsername = new JTextField();
		txtUsername.setText("Username");
		txtUsername.setBounds(371, 122, 117, 28);
		createUserPanel.add(txtUsername);
		txtUsername.setColumns(10);
		
		//text field for user to enter desired password
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setBounds(371, 153, 117, 28);
		createUserPanel.add(txtPassword);
		txtPassword.setColumns(10);
		
		//text field for password verification
		txtVerifyPassword = new JTextField();
		txtVerifyPassword.setText("Verify Password");
		txtVerifyPassword.setBounds(371, 179, 117, 28);
		createUserPanel.add(txtVerifyPassword);
		txtVerifyPassword.setColumns(10);
		
		//text field for user to input a password hint
		txtPasswordHint = new JTextField();
		txtPasswordHint.setText("Password Hint");
		txtPasswordHint.setBounds(371, 203, 117, 28);
		createUserPanel.add(txtPasswordHint);
		txtPasswordHint.setColumns(10);
		
		//saves user's hint
		hint = txtPasswordHint.getText();
		
		//button for user to click when wanting to create the account
		submitCreated = new JButton("Submit");
		submitCreated.setBounds(371, 243, 117, 29);
		createUserPanel.add(submitCreated);
		
		//adds action to the Submit button
		submitCreated.addActionListener(new ActionListener() {
			//when submit button is clicked it created the user
			public void actionPerformed(ActionEvent arg0) {		
				//CREATES USER
				username = txtUsername.getText();
				password = txtPassword.getText();
				verify = txtVerifyPassword.getText();
				hint = txtPasswordHint.getText();
				
				//checks password verification
				// if password matches the verification then adds user inputs to account
				if(/** if username does not already exist && */ password.equals(verify))
				{
					first = txtFirstName.getText();
					last = txtLastName.getText();
					address = txtStreetAddress.getText();
					zipCode = txtZipCode.getText();
					city = txtCity.getText();
					chosenState = (String)stateBox.getSelectedItem();
					number = txtPhoneNumber.getText();
					height = txtHeight.getText();
					weight = Double.parseDouble(txtWeight.getText());
					birthMonth = (String)monthBox_birth.getSelectedItem();
					birthDay = (String)dayBox_birth.getSelectedItem();
					birthYear = (String)yearBox_birth.getSelectedItem();
					userGender = (String)genderBox.getSelectedItem();
					
					//ADD USER INPUTS TO DATABASE, CHECK IF ADDED, show jdialog
				/** if (new account was added to database)
				 * {
				 * 		//displays success message if account created
				 * 		JOptionPane.showMessageDialog(createUser, "Account as successfully created!","A plain message",
    							JOptionPane.PLAIN_MESSAGE);
    				}
    				else
    				{
    					//displays error message if account was not created
    					JOptionPane.showMessageDialog(createUser, "Account was not created, please try again","Inane error",
    							JOptionPane.ERROR_MESSAGE);
    				}
				 */
				}
				else{
					JOptionPane.showMessageDialog(activitiesFrame,
						    "Entered password did not match the password verification",
						    "Inane error",
						    JOptionPane.ERROR_MESSAGE);
				}	
			}
		});
		
		//Exit button for user to go back to login page if decide to
		//not create an account
		btnExit = new JButton("Exit");
		btnExit.setBounds(371, 272, 117, 29);
		createUserPanel.add(btnExit);
		
		//adds action to Back button
		btnExit.addActionListener(new ActionListener() {
			//when exit button is clicked, it takes the user back to login page
			public void actionPerformed(ActionEvent arg0){		
				//hides the createUser frame
				createUser.setVisible(false);
				//shows the login frame
				login.setVisible(true);
			}
		});
	
		//creates FORGOTPASSWORD FRAME
		forgotPasswordFrame = new JFrame();
		forgotPasswordFrame.setBounds(100, 100, 615, 383);
		forgotPasswordFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		forgotPasswordFrame.getContentPane().setLayout(null);

		//creates the forgotPanel JPanel
		forgotPanel = new JPanel();
		forgotPanel.setBounds(6, 6, 603, 349);
		forgotPasswordFrame.getContentPane().add(forgotPanel);
		forgotPanel.setLayout(null);
		
		//creates enter username label
		JLabel usernameLabel = new JLabel("Enter UserName");
		usernameLabel.setBounds(161, 69, 107, 16);
		forgotPanel.add(usernameLabel);
		
		//creates text field for user to input username
		usernameTextField = new JTextField();
		usernameTextField.setBounds(271, 63, 159, 28);
		forgotPanel.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		//creates label for chosen hint
		hintLabel = new JLabel("Chosen Hint:");
		hintLabel.setBounds(179, 109, 89, 16);
		forgotPanel.add(hintLabel);
		
		//creates label that will show the hint if username entered is found
		showHint = new JLabel(hint);
		showHint.setBounds(271, 109, 254, 16);
		forgotPanel.add(showHint);
		showHint.setVisible(false);
		
		//creates the enter button for the user's username
		btnEnter = new JButton("Enter");
		btnEnter.setBounds(430, 64, 117, 29);
		forgotPanel.add(btnEnter);
		
		//adds action to btnEnter
		btnEnter.addActionListener(new ActionListener(){
			//when Enter button is clicked, it saves the user's input and compares to others in database
			public void actionPerformed(ActionEvent arg0) {
			   
				first = txtFirstName.getText();
				last = txtLastName.getText();
				usernameEntered = usernameTextField.getText();
				
				//CHANGE TO FIND "username" from database
				//if the username inputed by user matches a username in the database
				if(usernameEntered.equals(username))
				{
					//shows the hint chosen by the user
					showHint.setVisible(true);
					passwordLabel.setVisible(true);
					passwordTextField.setVisible(true);
					btnEnterPassword.setVisible(true);
					
				}
				//the username was not found in the database
				else
				{
					//shows error message
					JOptionPane.showMessageDialog(forgotPanel, "Username was not found","A plain message",
		    				JOptionPane.PLAIN_MESSAGE);
					//hides the hint
					showHint.setVisible(false);
				}
			
			}
		});
		
		//creates label to prompt user to enter password
		passwordLabel = new JLabel("Enter Password");
		passwordLabel.setBounds(161, 164, 107, 16);
		forgotPanel.add(passwordLabel);
		passwordLabel.setVisible(false);
		
		//creates text field for user to input password
		passwordTextField = new JTextField();
		passwordTextField.setBounds(271, 158, 159, 28);
		forgotPanel.add(passwordTextField);
		passwordTextField.setColumns(10);
		passwordTextField.setVisible(false);
		
		//creates button for user to enter password
		btnEnterPassword = new JButton("Enter");
		btnEnterPassword.setBounds(430, 159, 117, 29);
		forgotPanel.add(btnEnterPassword);
		btnEnterPassword.setVisible(true);
		
		//adds action to the btnEnterPassword button
		btnEnterPassword.addActionListener(new ActionListener(){
			//when button is clicked, it saves and checks password inputed by user
			public void actionPerformed(ActionEvent arg0) {
				
				//saves user input
				passwordEntered = passwordTextField.getText();
			
				//HAVE TO CHECK DATABASE NOT SURE HOW TO DO THAT?
				//checks to see if the password entered matches the username in the database
				if(usernameEntered.equals(username) && passwordEntered.equals(password))
				{
					//hides forgot password frame
					forgotPasswordFrame.setVisible(false);
					//logs user into system and shows activity frame
					activitiesFrame.setVisible(true);
				}
				//the enterd password did not match the entered username in the database
				else 
				{
					JOptionPane.showMessageDialog(forgotPanel, "Password entered is incorrect","A plain message",
		    				JOptionPane.PLAIN_MESSAGE);
				}
			
			}});
		
		
		//creates DOCTOR FRAME and all of its content
		Doctor = new JFrame();
		Doctor.setBounds(100, 100, 681, 479);
		Doctor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Doctor.getContentPane().setLayout(null);
		Doctor.setVisible(false);
		
		//PRINT PATIENTS NAME IN TEXTAREA
		//creates JTextArea and JScrollPane
		patients = new JTextArea();
		scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 195, 445);
		Doctor.getContentPane().add(scrollPane);
		
		//creates panel for graph and data
		patientInfoPanel = new JPanel();
		patientInfoPanel.setBounds(213, 37, 462, 272);
		Doctor.getContentPane().add(patientInfoPanel);
		
		data_graphBox = new JComboBox(data_Graph);
		data_graphBox.setBounds(418, 6, 257, 27);
		Doctor.getContentPane().add(data_graphBox);
		
		txtSuggestions = new JTextArea();
		txtSuggestions.setText("Enter notes for patient");
		txtSuggestions.setRows(10);
		txtSuggestions.setBounds(213, 318, 338, 133);
		Doctor.getContentPane().add(txtSuggestions);
		
		//adds action to the data_graph combo box
		data_graphBox.addActionListener(new ActionListener() {
			//when button is clicked, screen changes to activities frame
			public void actionPerformed(ActionEvent arg0) {
				
				//saves doctor's choice for what to view
				data_graphChoice = (String)data_graphBox.getSelectedItem();
				
				//if data table is selected
				if("Data Table".equals(data_graphChoice))
				{
					//show data table
				}
				//if blood pressure is selected
				else if("Blood Pressure".equals(data_graphChoice))
				{
					//show blood pressure graph
				}
				//if exercise is selected
				else if("Exercises".equals(data_graphChoice))
				{
					//show exercise graph
				}
				//if calories was selected
				else
				{
					//show calories graph
				}
		
			}
		});

		//creates button for doctor to submit suggestions
		btnSubmit_Doctor = new JButton("Submit");
		btnSubmit_Doctor.setBounds(558, 368, 117, 29);
		Doctor.getContentPane().add(btnSubmit_Doctor);

		//adds action to the submit button
		btnSubmit_Doctor.addActionListener(new ActionListener() {
			//when button is clicked, suggestions are saved for patient to view
			public void actionPerformed(ActionEvent arg0) {
			//saves doctor's suggestions for specific patient
			suggestions = txtSuggestions.getText();
			noteFromDoctor = new JTextArea(suggestions);
			
			}
		});				
		
		
		
		

		
		
	}
}

