package staff_management;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;

public class staff {

	private JFrame frame;
	private JTextField txtStaff;
	private JTextField txtTitle;
	private JTextField txtLast;
	private JTextField txtFirst;
	private JTextField txtAddress;
	private JTextField txtJobTitle;
	private JTextField txtMobile;
	private JTextField txtEmail;
	private JTextField txtDob;
	private JTable table;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					staff window = new staff();
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
	public staff() {
		initialize();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 4), "Employee Records", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 454, 361);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStaffID = new JLabel("Staff ID:");
		lblStaffID.setFont(new Font("Arial", Font.PLAIN, 12));
		lblStaffID.setBounds(30, 37, 57, 14);
		panel.add(lblStaffID);
		
		txtStaff = new JTextField();
		txtStaff.setFont(new Font("Arial", Font.PLAIN, 12));
		txtStaff.setBounds(97, 34, 86, 20);
		panel.add(txtStaff);
		txtStaff.setColumns(10);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTitle.setBounds(30, 79, 57, 14);
		panel.add(lblTitle);
		
		txtTitle = new JTextField();
		txtTitle.setFont(new Font("Arial", Font.PLAIN, 12));
		txtTitle.setColumns(10);
		txtTitle.setBounds(97, 76, 86, 20);
		panel.add(txtTitle);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLastName.setBounds(30, 174, 57, 14);
		panel.add(lblLastName);
		
		txtLast = new JTextField();
		txtLast.setFont(new Font("Arial", Font.PLAIN, 12));
		txtLast.setColumns(10);
		txtLast.setBounds(97, 171, 86, 20);
		panel.add(txtLast);
		
		txtFirst = new JTextField();
		txtFirst.setFont(new Font("Arial", Font.PLAIN, 12));
		txtFirst.setColumns(10);
		txtFirst.setBounds(97, 129, 86, 20);
		panel.add(txtFirst);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Arial", Font.PLAIN, 12));
		lblFirstName.setBounds(30, 132, 57, 14);
		panel.add(lblFirstName);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMobile.setBounds(30, 267, 57, 14);
		panel.add(lblMobile);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Arial", Font.PLAIN, 12));
		txtAddress.setColumns(10);
		txtAddress.setBounds(97, 222, 86, 20);
		panel.add(txtAddress);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAddress.setBounds(30, 225, 57, 14);
		panel.add(lblAddress);
		
		JLabel lblJobTitle = new JLabel("Job Title");
		lblJobTitle.setFont(new Font("Arial", Font.PLAIN, 12));
		lblJobTitle.setBounds(254, 76, 57, 14);
		panel.add(lblJobTitle);
		
		txtJobTitle = new JTextField();
		txtJobTitle.setFont(new Font("Arial", Font.PLAIN, 12));
		txtJobTitle.setColumns(10);
		txtJobTitle.setBounds(321, 73, 86, 20);
		panel.add(txtJobTitle);
		
		/**
		 * Event handler set to key and data type
		 */
		
		txtMobile = new JTextField();
		txtMobile.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				
				
				char iNumber = evt.getKeyChar();
				if(!Character.isDigit(iNumber)
					||(iNumber == KeyEvent.VK_BACK_SPACE)
				||	(iNumber == KeyEvent.VK_DELETE)){
					evt.consume();
				}
				
			}
		});
		txtMobile.setFont(new Font("Arial", Font.PLAIN, 12));
		txtMobile.setColumns(10);
		txtMobile.setBounds(97, 264, 86, 20);
		panel.add(txtMobile);
		
		JLabel lblDepartmentNo = new JLabel("Department No");
		lblDepartmentNo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDepartmentNo.setBounds(254, 34, 57, 14);
		panel.add(lblDepartmentNo);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 12));
		lblEmail.setBounds(254, 174, 57, 14);
		panel.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Arial", Font.PLAIN, 12));
		txtEmail.setColumns(10);
		txtEmail.setBounds(321, 171, 86, 20);
		panel.add(txtEmail);
		
		txtDob = new JTextField();
		txtDob.setFont(new Font("Arial", Font.PLAIN, 12));
		txtDob.setColumns(10);
		txtDob.setBounds(321, 129, 86, 20);
		panel.add(txtDob);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDob.setBounds(254, 132, 57, 14);
		panel.add(lblDob);
		
		/**
		 * Combo box added data for drop down menu 
		 */
		
		JComboBox cbDepartment = new JComboBox();
		cbDepartment.setModel(new DefaultComboBoxModel(new String[] {"001 - Maths", "002 - English", "003 -Science ", "004 - Art", "005 - PE", "006 - ICT", "007 D&T Food"}));
		cbDepartment.setFont(new Font("Arial", Font.PLAIN, 12));
		cbDepartment.setBounds(321, 33, 86, 22);
		panel.add(cbDepartment);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 4), "Record View", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_1.setBounds(489, 22, 403, 343);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea txtA = new JTextArea();
		txtA.setBounds(10, 23, 383, 309);
		panel_1.add(txtA);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Employee_ID", "Department No.", "Title", "First Name", "Last Name", "DOB", "Address", "Mobile", "Email", "Job Title"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(101);
		table.setBounds(20, 411, 872, 143);
		frame.getContentPane().add(table);
		
		JButton btnAddResult = new JButton("Add Result");
		btnAddResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/**
				 * Recall information 
				 */
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
						
						txtStaff.getText(),
						cbDepartment.getSelectedItem(),
						txtFirst.getText(),
						txtLast.getText(),
						txtTitle.getText(),
						txtDob.getText(),
						txtMobile.getText(),
						txtEmail.getText(),
						txtJobTitle.getText(),
						txtAddress.getText(),
						
						
				});
				
			}
		});
		btnAddResult.setFont(new Font("Arial", Font.PLAIN, 12));
		btnAddResult.setBounds(82, 565, 105, 30);
		frame.getContentPane().add(btnAddResult);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/**
				 * Error messages and help message 
				 */
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						
						JOptionPane.showMessageDialog(null,  "No data to delete", "Employee Record System", JOptionPane.OK_OPTION);
						
					}else {
						JOptionPane.showMessageDialog(null,  "Select a row to delete", "Employee Record System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
					}
				
				
				
				
				
			}
		});
		btnDelete.setFont(new Font("Arial", Font.PLAIN, 12));
		btnDelete.setBounds(236, 565, 105, 30);
		frame.getContentPane().add(btnDelete);
		
		JButton btnRecord = new JButton("Record");
		btnRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//==========================================
				
				txtA.append("Employee Record\n"
						+"=====================================\n"
						+ "Staff ID:\t\t" + txtStaff.getText() 
						+ "\nDepartment ID:\t\t" + cbDepartment.getSelectedItem() 
						+ "\nJob Title\t\t" + txtJobTitle.getText() 
						+ "\nTitle\t\t" + txtTitle.getText() 
						+ "\nFirst Name\t\t" + txtFirst.getText() 
						+ "\nLast Name\t\t" + txtLast.getText()
						+ "\nDOB\t\t" + txtDob.getText() 
						+ "\nAddress\t\t" + txtAddress.getText()
						+ "\nMobile\t\t" + txtMobile.getText() 
						+ "\nEmail\t\t" + txtEmail.getText() 
						
						);
						
		
				/**
				 * Data shown in another format 
				 */
				
				
				
			}
		});
		btnRecord.setFont(new Font("Arial", Font.PLAIN, 12));
		btnRecord.setBounds(401, 565, 105, 30);
		frame.getContentPane().add(btnRecord);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JTextField temp=null;
				for(java.awt.Component c:panel.getComponents()) {
					if(c.getClass().toString().contains("javax.swing.JTextField")) {
						temp=(JTextField)c;
						temp.setText(null);
						
					}
				}
				
			}
		});
		btnReset.setFont(new Font("Arial", Font.PLAIN, 12));
		btnReset.setBounds(562, 565, 105, 30);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Employee Record System",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
			System.exit(0);
		
		}
				
				/**
				 * Exit the system code 
				 */
				
			}
		});
		btnExit.setFont(new Font("Arial", Font.PLAIN, 12));
		btnExit.setBounds(736, 565, 105, 30);
		frame.getContentPane().add(btnExit);
		
		JLabel label = new JLabel("Staff ID:");
		label.setFont(new Font("Arial", Font.PLAIN, 12));
		label.setBounds(20, 386, 57, 14);
		frame.getContentPane().add(label);
		
		JLabel lblDepartmentNo_1 = new JLabel("Department No");
		lblDepartmentNo_1.setBounds(104, 386, 105, 14);
		frame.getContentPane().add(lblDepartmentNo_1);
		
		JLabel lblTitle_1 = new JLabel("Title");
		lblTitle_1.setBounds(224, 386, 46, 14);
		frame.getContentPane().add(lblTitle_1);
		
		JLabel lblFirstName_1 = new JLabel("First Name");
		lblFirstName_1.setBounds(305, 386, 75, 14);
		frame.getContentPane().add(lblFirstName_1);
		
		JLabel lblLastName_1 = new JLabel("Last Name");
		lblLastName_1.setBounds(390, 387, 74, 14);
		frame.getContentPane().add(lblLastName_1);
		
		JLabel lblDob_1 = new JLabel("DOB");
		lblDob_1.setBounds(474, 387, 46, 14);
		frame.getContentPane().add(lblDob_1);
		
		JLabel lblAddress_1 = new JLabel("Address");
		lblAddress_1.setBounds(556, 386, 46, 14);
		frame.getContentPane().add(lblAddress_1);
		
		JLabel lblMobile_1 = new JLabel("Mobile");
		lblMobile_1.setBounds(639, 387, 46, 14);
		frame.getContentPane().add(lblMobile_1);
		
		JLabel lblEmail_1 = new JLabel("Email");
		lblEmail_1.setBounds(724, 387, 46, 14);
		frame.getContentPane().add(lblEmail_1);
		
		JLabel lblJobTitle_1 = new JLabel("Job Title");
		lblJobTitle_1.setBounds(806, 386, 46, 14);
		frame.getContentPane().add(lblJobTitle_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 383, 872, 2);
		frame.getContentPane().add(separator);
	}
}
