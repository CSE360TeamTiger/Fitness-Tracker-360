import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;



public class Login {

	private JFrame frame;
	private JTextField txtUsername;
	private JButton btnLogin;
	private JButton btnForgotPassword;
	private JButton btnCreateUser;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
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
		panel.setBackground(new Color(127, 255, 212));
		panel.setBounds(6, 6, 438, 266);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		lblNewLabel.setBounds(179, 6, 102, 39);
		panel.add(lblNewLabel);
		
		txtUsername = new JTextField();
		txtUsername.setText("Username");
		txtUsername.setBounds(147, 80, 134, 28);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		btnLogin = new JButton("Login");
		btnLogin.setBounds(157, 147, 117, 29);
		panel.add(btnLogin);
		
		btnForgotPassword = new JButton("Forgot Password?");
		btnForgotPassword.setBounds(78, 188, 134, 29);
		panel.add(btnForgotPassword);
		
		btnCreateUser = new JButton("Create User");
		btnCreateUser.setBounds(207, 188, 126, 29);
		panel.add(btnCreateUser);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(147, 107, 134, 28);
		panel.add(passwordField);
	}
}
