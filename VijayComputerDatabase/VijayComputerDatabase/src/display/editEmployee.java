package display;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import java.awt.Component;
import java.awt.Container;

import javax.swing.Box;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import display.CreateStudent.DateLabelFormatter;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Toolkit;

public class editEmployee {

	private JFrame frmCreateEmployee;
	private JFormattedTextField empIDTextField;
	private JTextField firstNameTextField;
	private JTextField lastNameTextField;
	private JTextField middleITextField;
	private JFormattedTextField homePhTextField;
	private JTextField emailTextField;
	private JTextField addNumTextField;
	private JTextField addStreetTextField;
	private JTextField postalCodeTextField;
	private JTextField cityTextField;
	private JTextField fbTextField;
	private JTextField instaTextField;
	private JTextField twitTextField;
	private JFormattedTextField mobilePhTextField;
	private JTextField addStreet2TextField;
	private JTextField ssnTextField;
	private JTextField salTextField;
	private int empTypeID;
	private int empStatusID;
	private int employeeID;

	private JDatePanelImpl datePanel;
	private JDatePickerImpl dateField;
	private JDatePickerImpl dateField2;
	private JDatePickerImpl dateField3;
	/**
	 * Launch the application.
	 */
	public void newWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editEmployee window = new editEmployee(employeeID);
					window.frmCreateEmployee.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public editEmployee(int x) {
		employeeID = x;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCreateEmployee = new JFrame();
		frmCreateEmployee.setIconImage(Toolkit.getDefaultToolkit().getImage(editEmployee.class.getResource("/employee.png")));
		frmCreateEmployee.setTitle("VCA - Edit Employee");
		frmCreateEmployee.setBounds(100, 100, 838, 782);
		frmCreateEmployee.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCreateEmployee.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmCreateEmployee.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_12 = new JLabel("Pay Information:");
		panel.add(lblNewLabel_12);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_5);
		panel_5.setLayout(new MigLayout("", "[][]", "[][][][][][][][][][][][][][][][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Employee ID:");
		panel_5.add(lblNewLabel, "cell 0 0");
		
		empIDTextField = new JFormattedTextField();
		panel_5.add(empIDTextField, "cell 1 0");
		empIDTextField.setAlignmentY(Component.TOP_ALIGNMENT);
		empIDTextField.setAlignmentX(Component.LEFT_ALIGNMENT);
		empIDTextField.setColumns(8);
		
		JLabel lblNewLabel_7 = new JLabel("Employee Type:");
		panel_5.add(lblNewLabel_7, "cell 0 1");
		
		JComboBox typecomboBox = new JComboBox();
		panel_5.add(typecomboBox, "cell 1 1");
		
		
		JLabel lblNewLabel_11 = new JLabel("Employee Status:");
		panel_5.add(lblNewLabel_11, "cell 0 2");
		
		JComboBox statuscomboBox = new JComboBox();
		panel_5.add(statuscomboBox, "cell 1 2");
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		panel_5.add(lblNewLabel_1, "cell 0 3");
		
		firstNameTextField = new JTextField();
		panel_5.add(firstNameTextField, "cell 1 3");
		firstNameTextField.setColumns(30);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name:");
		panel_5.add(lblNewLabel_2, "cell 0 4");
		
		lastNameTextField = new JTextField();
		panel_5.add(lastNameTextField, "cell 1 4");
		lastNameTextField.setColumns(30);
		
		JLabel lblNewLabel_3 = new JLabel("Middle Initial:");
		panel_5.add(lblNewLabel_3, "cell 0 5");
		
		middleITextField = new JTextField();
		panel_5.add(middleITextField, "cell 1 5");
		middleITextField.setColumns(1);
		
		JLabel lblNewLabel_4 = new JLabel("Home Phone:");
		panel_5.add(lblNewLabel_4, "cell 0 6");
		
		
		MaskFormatter mf1 = null;
		try {
			mf1 = new MaskFormatter("(###)-###-####");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    mf1.setPlaceholderCharacter('_');
	    MaskFormatter mf2 = null;
		try {
			mf2 = new MaskFormatter("(###)-###-####");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    mf2.setPlaceholderCharacter('_');
		
		homePhTextField = new JFormattedTextField(mf1);
		panel_5.add(homePhTextField, "cell 1 6");
		homePhTextField.setColumns(8);
		
		JLabel lblNewLabel_5 = new JLabel("Mobile Phone:");
		panel_5.add(lblNewLabel_5, "cell 0 7");
		
		mobilePhTextField = new JFormattedTextField(mf2);
		panel_5.add(mobilePhTextField, "cell 1 7");
		mobilePhTextField.setColumns(8);
		
		JLabel lblNewLabel_6 = new JLabel("Email:");
		panel_5.add(lblNewLabel_6, "cell 0 8");
		
		emailTextField = new JTextField();
		panel_5.add(emailTextField, "cell 1 8");
		emailTextField.setColumns(35);
		
				JLabel lblNewLabel_8 = new JLabel("Date of Birth:");
				panel_5.add(lblNewLabel_8, "cell 0 9");
				
				JPanel dobPanel = new JPanel();
				panel_5.add(dobPanel, "cell 1 9,alignx left,growy");
				UtilDateModel model=new UtilDateModel();
			    Properties p = new Properties();
		        p.put("text.today", "Today");
		        p.put("text.month", "Month");
		        p.put("text.year", "Year");
			    JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
			    dateField = new JDatePickerImpl(datePanel, new DateLabelFormatter());
			    SpringLayout springLayout = (SpringLayout) dateField.getLayout();
			    springLayout.putConstraint(SpringLayout.WEST, dateField.getJFormattedTextField(), 0, SpringLayout.WEST, dateField);
			    dobPanel.add(dateField);
				
				JLabel lblNewLabel_8_1 = new JLabel("Hire Date:");
				panel_5.add(lblNewLabel_8_1, "cell 0 10");
				
				JPanel hirePanel = new JPanel();
				panel_5.add(hirePanel, "cell 1 10");
				
				UtilDateModel model2=new UtilDateModel();
			    Properties p2 = new Properties();
		        p.put("text.today", "Today");
		        p.put("text.month", "Month");
		        p.put("text.year", "Year");
			    JDatePanelImpl datePanel2 = new JDatePanelImpl(model2, p2);
			    dateField2 = new JDatePickerImpl(datePanel2, new DateLabelFormatter());
			    SpringLayout springLayout2 = (SpringLayout) dateField2.getLayout();
			    springLayout2.putConstraint(SpringLayout.WEST, dateField2.getJFormattedTextField(), 0, SpringLayout.WEST, dateField2);
			    hirePanel.add(dateField2);
				
				JLabel lblNewLabel_8_2 = new JLabel("Contract End Date:");
				panel_5.add(lblNewLabel_8_2, "cell 0 11");
				
				JPanel contactPanel = new JPanel();
				panel_5.add(contactPanel, "cell 1 11");
				
				UtilDateModel model3=new UtilDateModel();
			    Properties p3 = new Properties();
		        p.put("text.today", "Today");
		        p.put("text.month", "Month");
		        p.put("text.year", "Year");
			    JDatePanelImpl datePanel3 = new JDatePanelImpl(model3, p3);
			    dateField3 = new JDatePickerImpl(datePanel3, new DateLabelFormatter());
			    SpringLayout springLayout3 = (SpringLayout) dateField3.getLayout();
			    springLayout2.putConstraint(SpringLayout.WEST, dateField3.getJFormattedTextField(), 0, SpringLayout.WEST, dateField3);
			    contactPanel.add(dateField3);
				
				JLabel alfst = new JLabel("SSN");
				panel_5.add(alfst, "cell 0 12");
				
				ssnTextField = new JTextField();
				panel_5.add(ssnTextField, "cell 1 12");
				ssnTextField.setColumns(10);
				
				JLabel lblNewLabel_9 = new JLabel("Address Num:");
				panel_5.add(lblNewLabel_9, "cell 0 13");
				
				addNumTextField = new JTextField();
				panel_5.add(addNumTextField, "cell 1 13");
				addNumTextField.setColumns(10);
				
				JLabel lblNewLabel_9_1 = new JLabel("Address Street:");
				panel_5.add(lblNewLabel_9_1, "cell 0 14");
				
				addStreetTextField = new JTextField();
				panel_5.add(addStreetTextField, "cell 1 14");
				addStreetTextField.setColumns(30);
				
				JLabel lblNewLabel_9_1_1 = new JLabel("Address Line 2:");
				panel_5.add(lblNewLabel_9_1_1, "cell 0 15");
				
				addStreet2TextField = new JTextField();
				panel_5.add(addStreet2TextField, "cell 1 15");
				addStreet2TextField.setColumns(30);
				
				JLabel lblNewLabel_9_2 = new JLabel("Postal Code:");
				panel_5.add(lblNewLabel_9_2, "cell 0 16");
				
				postalCodeTextField = new JTextField();
				panel_5.add(postalCodeTextField, "cell 1 16");
				postalCodeTextField.setColumns(8);
				
				JLabel lblNewLabel_9_2_1 = new JLabel("City:");
				panel_5.add(lblNewLabel_9_2_1, "cell 0 17");
				
				cityTextField = new JTextField();
				panel_5.add(cityTextField, "cell 1 17");
				cityTextField.setColumns(30);
				
				JLabel lblNewLabel_9_2_2 = new JLabel("Country:");
				panel_5.add(lblNewLabel_9_2_2, "cell 0 18");
				
				JComboBox countryComboBox = new JComboBox();
				panel_5.add(countryComboBox, "cell 1 18");
				
		
		JLabel lblNewLabel_10 = new JLabel("State / Providence:");
		panel_5.add(lblNewLabel_10, "cell 0 19");
		
		JComboBox stateProvComboBox = new JComboBox();
		panel_5.add(stateProvComboBox, "cell 1 19");
		
		
		
		JLabel lblNewLabel_10_1 = new JLabel("Facebook:");
		panel_5.add(lblNewLabel_10_1, "cell 0 20");
		
		fbTextField = new JTextField();
		panel_5.add(fbTextField, "cell 1 20");
		fbTextField.setColumns(30);
		
		JLabel lblNewLabel_10_2 = new JLabel("Instagram Handle:");
		panel_5.add(lblNewLabel_10_2, "cell 0 21");
		
		instaTextField = new JTextField();
		panel_5.add(instaTextField, "cell 1 21");
		instaTextField.setColumns(20);
		
		JLabel lblNewLabel_10_3 = new JLabel("Twitter Handle:");
		panel_5.add(lblNewLabel_10_3, "cell 0 22");
		
		twitTextField = new JTextField();
		panel_5.add(twitTextField, "cell 1 22");
		twitTextField.setColumns(20);
		
		 try{
		    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
		        String sql = "SELECT EmployeeID FROM Employee WHERE EmployeeID ="+employeeID;
		        PreparedStatement pst = conn.prepareStatement(sql);
		        ResultSet rs = pst.executeQuery();

		        while(rs.next()){
		         int s = rs.getInt(1);
		         empIDTextField.setText(Integer.toString(s));

		        }

		        pst.close();
		        rs.close();
		        conn.close();

		    }catch (Exception e){
		        JOptionPane.showMessageDialog(null, e);
		    }
		 try{
		    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
		        String sql = "SELECT EmpTypeName from EmployeeType";
		        PreparedStatement pst = conn.prepareStatement(sql);
		        ResultSet rs = pst.executeQuery();

		        while(rs.next()){
		        	String r = rs.getString(1);
		        	typecomboBox.addItem(r);

		        }

		        pst.close();
		        rs.close();
		        conn.close();

		    }catch (Exception e){
		        JOptionPane.showMessageDialog(null, e);
		    }
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7, BorderLayout.EAST);
		panel_7.setLayout(new MigLayout("", "[grow]", "[][][]"));
		
		Component verticalStrut_1_1_1 = Box.createVerticalStrut(40);
		panel_7.add(verticalStrut_1_1_1, "cell 0 0");
		
		JLabel lblNewLabel_15 = new JLabel("Pay Information:");
		panel_7.add(lblNewLabel_15, "cell 0 1,alignx center");
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.add(panel_9, "cell 0 2,grow");
		panel_9.setLayout(new MigLayout("", "[grow][grow]", "[][][][]"));
		
		JLabel lblNewLabel_13 = new JLabel("Salary:");
		panel_9.add(lblNewLabel_13, "cell 0 0");
		
		salTextField = new JTextField();
		panel_9.add(salTextField, "cell 1 0");
		salTextField.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Pay Type:");
		panel_9.add(lblNewLabel_14, "cell 0 1,alignx trailing");
		
		JComboBox payTypecomboBox = new JComboBox();
		panel_9.add(payTypecomboBox, "cell 1 1,growx");
		try{
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
	        String sql = "SELECT PayType from PayType";
	        PreparedStatement pst = conn.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();

	        while(rs.next()){
	        	String r = rs.getString(1);
	        	payTypecomboBox.addItem(r);

	        }

	        pst.close();
	        rs.close();
	        conn.close();

	    }catch (Exception e){
	        JOptionPane.showMessageDialog(null, e);
	    }
		
		
		JLabel lblNewLabel_14_1 = new JLabel("Pay Period:");
		panel_9.add(lblNewLabel_14_1, "cell 0 2");
		
		JComboBox payPeriodComboBox = new JComboBox();
		panel_9.add(payPeriodComboBox, "cell 1 2,growx");
		try{
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
	        String sql = "SELECT PayPeriod from PayPeriod";
	        PreparedStatement pst = conn.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();

	        while(rs.next()){
	        	String r = rs.getString(1);
	        	payPeriodComboBox.addItem(r);

	        }

	        pst.close();
	        rs.close();
	        conn.close();

	    }catch (Exception e){
	        JOptionPane.showMessageDialog(null, e);
	    }
		
		JLabel lblNewLabel_14_1_1 = new JLabel("Work Eligibility");
		panel_9.add(lblNewLabel_14_1_1, "cell 0 3,alignx trailing");
		
		JComboBox workEComboBox = new JComboBox();
		panel_9.add(workEComboBox, "cell 1 3,growx");
		try{
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
	        String sql = "SELECT EligibilityStatus from WorkEligibilityStatus";
	        PreparedStatement pst = conn.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();

	        while(rs.next()){
	        	String r = rs.getString(1);
	        	workEComboBox.addItem(r);

	        }

	        pst.close();
	        rs.close();
	        conn.close();

	    }catch (Exception e){
	        JOptionPane.showMessageDialog(null, e);
	    }		
		
		 try{
		    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
		        String sql = "SELECT Status from EmployeeStatus";
		        PreparedStatement pst = conn.prepareStatement(sql);
		        ResultSet rs = pst.executeQuery();

		        while(rs.next()){
		        	String r = rs.getString(1);
		        	statuscomboBox.addItem(r);

		        }

		        pst.close();
		        rs.close();
		        conn.close();

		    }catch (Exception e){
		        JOptionPane.showMessageDialog(null, e);
		    }

		
		
	    try{
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
	        String sql = "SELECT CountryName FROM Country";
	        PreparedStatement pst = conn.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();

	        while(rs.next()){
	         String s = rs.getString(1);
	         countryComboBox.addItem(s);

	        }

	        pst.close();
	        rs.close();
	        conn.close();

	    }catch (Exception e){
	        JOptionPane.showMessageDialog(null, e);
	    }
	    try{
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
	        String sql = "SELECT StateProvName FROM StateProv";
	        PreparedStatement pst = conn.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();

	        while(rs.next()){
	         String s = rs.getString(1);
	         stateProvComboBox.addItem(s);

	        }

	        pst.close();
	        rs.close();
	        conn.close();

	    }catch (Exception e){
	        JOptionPane.showMessageDialog(null, e);
	    }
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 204, 204));
		frmCreateEmployee.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		Component verticalStrut_1 = Box.createVerticalStrut(15);
		panel_1.add(verticalStrut_1);
		
		 try{
		    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
		        String sql = "SELECT Employee.EmployeeID, EmployeeType.EmpTypeName, EmployeeStatus.Status, Employee.FirstName, Employee.LastName, Employee.MiddleInitial, Employee.HomePhone, Employee.MobilePhone,"
		        		+ " Employee.Email, Employee.DOB, Employee.HireDate, Employee.ContractEndDate, Employee.SSN, Employee.AddressNum, Employee.AddressStreet, Employee.AddressStreet2, Employee.PostalCode,"
		        		+ " Employee.City, StateProv.StateProvName, Country.CountryName, Employee.Salary, PayType.PayType, PayPeriod.PayPeriod, WorkEligibilityStatus.EligibilityStatus, Employee.FacebookHandle,"
		        		+ " Employee.InstagramHandle, Employee.TwitterHandle"
		        		+ " FROM EmployeeType INNER JOIN"
		        		+ " Employee ON EmployeeType.TypeID = Employee.EmployeeTypeID INNER JOIN"
		        		+ " EmployeeStatus ON Employee.EmployeeStatusID = EmployeeStatus.EmpStatusID INNER JOIN"
		        		+ " PayType ON Employee.PayTypeID = PayType.PayTypeID INNER JOIN"
		        		+ " PayPeriod ON Employee.PayPeriodID = PayPeriod.PayPeriodID INNER JOIN"
		        		+ " StateProv ON Employee.StateProvinceID = StateProv.StateID INNER JOIN"
		        		+ " Country ON Employee.CountryID = Country.CountryID INNER JOIN"
		        		+ " WorkEligibilityStatus ON Employee.WorkEligibilityID = WorkEligibilityStatus.EligibilityID WHERE EmployeeID = "+employeeID;
		        PreparedStatement pst = conn.prepareStatement(sql);
		        ResultSet rs = pst.executeQuery();

		        while(rs.next()){
		         typecomboBox.setSelectedItem(rs.getString("EmpTypeName"));
		         statuscomboBox.setSelectedItem(rs.getString("Status"));
		         firstNameTextField.setText(rs.getString("FirstName"));
		         lastNameTextField.setText(rs.getString("LastName"));
		         middleITextField.setText(rs.getString("MiddleInitial"));
		         homePhTextField.setText(rs.getString("HomePhone"));
		         mobilePhTextField.setText(rs.getString("MobilePhone"));
		         emailTextField.setText(rs.getString("Email"));
		         dateField.getJFormattedTextField().setText(rs.getString("DOB"));
		         dateField2.getJFormattedTextField().setText(rs.getString("HireDate"));
		         dateField3.getJFormattedTextField().setText(rs.getString("ContractEndDate"));
		         ssnTextField.setText(rs.getString("SSN"));
		         addNumTextField.setText(rs.getString("AddressNum"));
		         addStreetTextField.setText(rs.getString("AddressStreet"));
		         addStreet2TextField.setText(rs.getString("AddressStreet2"));
		         postalCodeTextField.setText(rs.getString("PostalCode"));
		         cityTextField.setText(rs.getString("City"));
		         stateProvComboBox.setSelectedItem(rs.getString("StateProvName"));
		         countryComboBox.setSelectedItem(rs.getString("CountryName"));
		         salTextField.setText(rs.getString("Salary"));
		         payTypecomboBox.setSelectedItem(rs.getString("PayType"));
		         payPeriodComboBox.setSelectedItem(rs.getString("PayPeriod"));
		         workEComboBox.setSelectedItem(rs.getString("EligibilityStatus"));
		         fbTextField.setText(rs.getString("FacebookHandle"));
		         instaTextField.setText(rs.getString("InstagramHandle"));
		         twitTextField.setText(rs.getString("TwitterHandle"));

		        }

		        pst.close();
		        rs.close();
		        conn.close();

		    }catch (Exception e){
		        JOptionPane.showMessageDialog(null, e);
		    }
		
		
		
		
		
		
		
		JButton btnNewButton = new JButton("Edit Employee");
		btnNewButton.addActionListener(new ActionListener() {
			private int stateID;
			private int countryID;
			private int payTypeID;
			private int payPeriodID;
			private int bigEID;

			public void actionPerformed(ActionEvent arg0) {
				try{
			    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
			        String sql = "SELECT EmployeeType.TypeID"
			        		+ " FROM Employee INNER JOIN"
			        		+ " EmployeeType ON Employee.EmployeeTypeID = EmployeeType.TypeID WHERE EmployeeID = ";
			        PreparedStatement pst = conn.prepareStatement(sql);
			        ResultSet rs = pst.executeQuery();

			        while(rs.next()){
			         int s = rs.getInt(1);
			         empTypeID = s;
			        }

			        pst.close();
			        rs.close();
			        conn.close();

			    }catch (Exception e){
			        JOptionPane.showMessageDialog(null, e);
			    }
				try{
			    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
			        String sql = "EmployeeStatus.EmpStatusID"
			        		+ " FROM Employee INNER JOIN"
			        		+  "EmployeeStatus ON Employee.EmployeeStatusID = EmployeeStatus.EmpStatusID WHERE Status = '"+statuscomboBox.getSelectedItem().toString()+"'";
			        PreparedStatement pst = conn.prepareStatement(sql);
			        ResultSet rs = pst.executeQuery();

			        while(rs.next()){
			         int s = rs.getInt(1);
			         empStatusID = s;
			        }

			        pst.close();
			        rs.close();
			        conn.close();

			    }catch (Exception e){
			        JOptionPane.showMessageDialog(null, e);
			    }
				try{
			    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
			        String sql = "SELECT StateProv.StateID"
			        		+ " FROM StateProv INNER JOIN"
			        		+ " Employee ON StateProv.StateID = Employee.StateProvinceID WHERE StateProvName = '"+stateProvComboBox.getSelectedItem().toString()+"'";
			        PreparedStatement pst = conn.prepareStatement(sql);
			        ResultSet rs = pst.executeQuery();

			        while(rs.next()){
			         int s = rs.getInt(1);
			         stateID = s;
			        }

			        pst.close();
			        rs.close();
			        conn.close();

			    }catch (Exception e){
			        JOptionPane.showMessageDialog(null, e);
			    }				try{
			    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
			        String sql = "SELECT Country.CountryID"
			        		+ "FROM Employee INNER JOIN"
			        		+ " Country ON Employee.CountryID = Country.CountryID WHERE CountryName = '"+countryComboBox.getSelectedItem().toString()+"'";
			        PreparedStatement pst = conn.prepareStatement(sql);
			        ResultSet rs = pst.executeQuery();

			        while(rs.next()){
			         int s = rs.getInt(1);
			         countryID = s;
			        }

			        pst.close();
			        rs.close();
			        conn.close();

			    }catch (Exception e){
			        JOptionPane.showMessageDialog(null, e);
			    }				try{
			    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
			        String sql = "SELECT PayType.PayTypeID"
			        		+ " FROM PayType INNER JOIN"
			        		+ " Employee ON PayType.PayTypeID = Employee.PayTypeID WHERE PayType = '"+payTypecomboBox.getSelectedItem().toString()+"'";
			        PreparedStatement pst = conn.prepareStatement(sql);
			        ResultSet rs = pst.executeQuery();

			        while(rs.next()){
			         int s = rs.getInt(1);
			         payTypeID = s;
			        }

			        pst.close();
			        rs.close();
			        conn.close();

			    }catch (Exception e){
			        JOptionPane.showMessageDialog(null, e);
			    }				try{
			    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
			        String sql = "SELECT PayPeriodID"
			        		+ "FROM PayPeriod WHERE PayPeriod = '"+payPeriodComboBox.getSelectedItem().toString()+"'";
			        PreparedStatement pst = conn.prepareStatement(sql);
			        ResultSet rs = pst.executeQuery();

			        while(rs.next()){
			         int s = rs.getInt(1);
			         payPeriodID = s;
			        }

			        pst.close();
			        rs.close();
			        conn.close();

			    }catch (Exception e){
			        JOptionPane.showMessageDialog(null, e);
			    }				try{
			    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
			        String sql = "SELECT EligibilityID"
			        		+ "FROM WorkEligibilityStatus WHERE EligibilityStatus = '"+workEComboBox.getSelectedItem().toString()+"'";
			        PreparedStatement pst = conn.prepareStatement(sql);
			        ResultSet rs = pst.executeQuery();

			        while(rs.next()){
			         int s = rs.getInt(1);
			         bigEID = s;
			        }

			        pst.close();
			        rs.close();
			        conn.close();

			    }catch (Exception e){
			        JOptionPane.showMessageDialog(null, e);
			    }

				try {
					BigInteger big = new BigInteger(homePhTextField.getText().replace("(", "").replace(")","").replace("-", ""));
					BigInteger big1 = new BigInteger(mobilePhTextField.getText().replace("(", "").replace(")","").replace("-", ""));
					
			    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
			        
			    	String sql = "UPDATE Employee SET EmployeeID = "+Integer.parseInt(empIDTextField.getText())
			    	+", EmployeeTypeID = "+empTypeID
			    	+", EmployeeStatusID = "+empStatusID
			    	+ ", FirstName = '"+firstNameTextField.getText()
			    	+ "', LastName = '"+lastNameTextField.getText()
			    	+ "', MiddleInital = '"+middleITextField.getText()
			    	+ "', HomePhone = "+big
			    	+ ", MobilePhone = "+big1
			    	+ ", Email = '"+emailTextField.getText()
			    	+ ", DOB = CAST('"+dateField.getJFormattedTextField().getText()+"' as date)"
			    	+ ", HireDate = CAST('"+dateField2.getJFormattedTextField().getText()+"' as date)"
			    	+ ", ContractEndDate= CAST('"+dateField2.getJFormattedTextField().getText()+"' as date)"
			    	+ ",SSN = "+Integer.parseInt(ssnTextField.getText())
			    	+ ", AddressNum = "+Integer.parseInt(addNumTextField.getText())
			    	+ ", AddressStreet = '"+addStreetTextField.getText()
			    	+ "', AddressStreet2 = '"+addStreet2TextField.getText()
			    	+ "', PostalCode = '"+postalCodeTextField.getText()
			    	+ "', City = '"+cityTextField.getText()
			    	+ "', StateProvinceID = "+stateID
			    	+ ", CountryID = "+countryID
			    	+ ", Salary = "+Integer.parseInt(salTextField.getText())
			    	+ ",PayTypeID = "+payTypeID 
			    	+ ",PayPeriodID ="+payPeriodID
			    	+ ",WorkEligibilityID ="+bigEID
			    	+ ",FaceBookHandle = '"+fbTextField.getText()
			    	+ "', InstagramHandle = '"+instaTextField.getText()
			    	+ "', TwitterHandle = '"+twitTextField.getText() + "WHERE EmployeeID = "+Integer.parseInt(empIDTextField.getText());
			    	Statement pst = conn.createStatement();
			        pst.executeUpdate(sql);
			        System.out.println("Inserted records into the table...");
				}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e);
				}
				catch(Exception e){
				      //Handle errors for Class.forName
				      e.printStackTrace();
				 }
				finally {
					frmCreateEmployee.dispose();
				}
			}});
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 204, 204));
		frmCreateEmployee.getContentPane().add(panel_2, BorderLayout.NORTH);
		
		Component verticalStrut_1_1 = Box.createVerticalStrut(15);
		panel_2.add(verticalStrut_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 204, 204));
		frmCreateEmployee.getContentPane().add(panel_3, BorderLayout.WEST);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		panel_3.add(horizontalStrut_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 204, 204));
		frmCreateEmployee.getContentPane().add(panel_4, BorderLayout.EAST);
		
		Component horizontalStrut_1_1 = Box.createHorizontalStrut(20);
		panel_4.add(horizontalStrut_1_1);
	}
	public class DateLabelFormatter extends AbstractFormatter {

	    private String datePattern = "yyyy-MM-dd";
	    private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

	    @Override
	    public Object stringToValue(String text) throws ParseException {
	        return dateFormatter.parseObject(text);
	    }

	    @Override
	    public String valueToString(Object value) throws ParseException {
	        if (value != null) {
	            Calendar cal = (Calendar) value;
	            return dateFormatter.format(cal.getTime());
	        }

	        return "";
	    }

	}
}
