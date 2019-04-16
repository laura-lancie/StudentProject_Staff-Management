package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import staff_management.staff;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_S {

	private JFrame frmLoginSystem;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_S window = new Login_S();
					window.frmLoginSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_S() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginSystem = new JFrame();
		frmLoginSystem.setBounds(200, 200, 500, 300);
		frmLoginSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginSystem.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login to System");
		lblLogin.setBounds(189, 11, 99, 14);
		frmLoginSystem.getContentPane().add(lblLogin);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(101, 74, 70, 14);
		frmLoginSystem.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(101, 120, 70, 14);
		frmLoginSystem.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(185, 71, 128, 20);
		frmLoginSystem.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(185, 117, 128, 20);
		frmLoginSystem.getContentPane().add(txtPassword);
		
		/**
		 * Username and password setter
		 */
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String password = txtPassword.getText();
				String username = txtUsername.getText();
				
				if (password.contains("open") && username.contains("one")) {
					
					txtPassword.setText(null);
					txtUsername.setText(null);
					
					staff info = new staff();
					staff.main(null);
					
					
				}
				
				else 
				{
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtUsername.setText(null);
				}
				
				
				/**
				 * ERROR MESSAGE 
				 */
				
			}
		});
		btnLogin.setBounds(51, 189, 89, 23);
		frmLoginSystem.getContentPane().add(btnLogin);
		
		/**
		 * Clear all fields
		 */
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtUsername.setText(null);
				txtPassword.setText(null);
				
			}
		});
		btnReset.setBounds(199, 189, 89, 23);
		frmLoginSystem.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmLoginSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem, "Confirm if you want to exit", "Login Systems",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
				/**
				 * Exit message box and dialog 
				 */
			}
		});
		btnExit.setBounds(345, 189, 89, 23);
		frmLoginSystem.getContentPane().add(btnExit);
	}
}
