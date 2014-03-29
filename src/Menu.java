import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 446, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 255, 47));
		panel.setBounds(6, 6, 434, 485);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fitness Tracker 360");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblNewLabel.setBounds(120, 6, 194, 105);
		panel.add(lblNewLabel);
		
		JButton btnTrackExercise = new JButton("Track Exercise");
		btnTrackExercise.setBounds(149, 123, 135, 53);
		panel.add(btnTrackExercise);
		
		JButton btnTrackHealthInfo = new JButton("Track Health Info");
		btnTrackHealthInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnTrackHealthInfo.setBounds(149, 182, 135, 53);
		panel.add(btnTrackHealthInfo);
		
		JButton btnViewSummary = new JButton("View Summary");
		btnViewSummary.setBounds(149, 247, 135, 53);
		panel.add(btnViewSummary);
		
		JButton btnEditPersonalInfo = new JButton("Edit Personal Info");
		btnEditPersonalInfo.setBounds(149, 312, 135, 53);
		panel.add(btnEditPersonalInfo);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(158, 377, 117, 29);
		panel.add(btnLogout);
	}
}
