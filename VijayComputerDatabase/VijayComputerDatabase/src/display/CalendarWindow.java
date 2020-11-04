package display;

import java.awt.EventQueue;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import net.miginfocom.swing.MigLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.SpringLayout;
import javax.swing.JFormattedTextField.AbstractFormatter;

import org.jdatepicker.*;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import display.CreateStudent.DateLabelFormatter;

import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CalendarWindow {

	private JFrame frmCalendar;

	private JDatePickerImpl dateField;

	
	/**
	 * Launch the application.
	 */
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalendarWindow window = new CalendarWindow();
					window.frmCalendar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalendarWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalendar = new JFrame();
		frmCalendar.setBackground(new Color(153, 204, 255));
		frmCalendar.getContentPane().setBackground(new Color(255, 204, 204));
		frmCalendar.setTitle("VCA - Calendar");
		frmCalendar.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\bshaffer\\git\\VijayComputerDatabase\\VijayComputerDatabase\\resources\\googlecalendar.png"));
		frmCalendar.setBounds(100, 100, 519, 428);
		frmCalendar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmCalendar.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_3_1 = new JMenuItem("Print");
		mnNewMenu.add(mntmNewMenuItem_3_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_2 = new JMenu("Edit");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Edit Announcements");
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_1 = new JMenu("View");
		menuBar.add(mnNewMenu_1);
		
		JRadioButtonMenuItem mntmNewMenuItem = new JRadioButtonMenuItem("Day");
		mntmNewMenuItem.setSelected(true);
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JRadioButtonMenuItem mntmNewMenuItem_1 = new JRadioButtonMenuItem("Week");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JRadioButtonMenuItem mntmNewMenuItem_2 = new JRadioButtonMenuItem("Month");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JRadioButtonMenuItem mntmNewMenuItem_3 = new JRadioButtonMenuItem("Year");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		frmCalendar.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(153, 204, 255));
		frmCalendar.getContentPane().add(panel_5, BorderLayout.NORTH);
		
		Component verticalStrut = Box.createVerticalStrut(5);
		panel_5.add(verticalStrut);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(153, 204, 255));
		frmCalendar.getContentPane().add(panel_4, BorderLayout.SOUTH);
		
		Component verticalStrut_1 = Box.createVerticalStrut(5);
		panel_4.add(verticalStrut_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(153, 204, 255));
		frmCalendar.getContentPane().add(panel_3, BorderLayout.EAST);
		
		Component horizontalStrut = Box.createHorizontalStrut(5);
		panel_3.add(horizontalStrut);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 204, 255));
		frmCalendar.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new MigLayout("", "[grow]", "[][][][][][][][grow][]"));
	    UtilDateModel model=new UtilDateModel();
	    Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
	    JDatePanelImpl datePanel2 = new JDatePanelImpl(model, p);
	    
	    JLabel lblNewLabel_2 = new JLabel("Create new announcment:");
	    panel.add(lblNewLabel_2, "cell 0 0,alignx center,aligny center");
	    
	    Component verticalStrut_2 = Box.createVerticalStrut(20);
	    panel.add(verticalStrut_2, "cell 0 2");
	    
	    JLabel lblNewLabel = new JLabel("Select Date:");
	    panel.add(lblNewLabel, "flowx,cell 0 3,alignx center,aligny center");
	    
	    Component verticalStrut_3 = Box.createVerticalStrut(20);
	    panel.add(verticalStrut_3, "cell 0 5");
	    
	    JLabel lblNewLabel_1 = new JLabel("Display Options");
	    lblNewLabel_1.setBorder(null);
	    panel.add(lblNewLabel_1, "cell 0 6,alignx center,aligny center");
	    
	    JPanel panel_2 = new JPanel();
	    panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
	    panel.add(panel_2, "cell 0 7,grow");
	    panel_2.setLayout(new MigLayout("", "[]", "[][][]"));
	    
	    JCheckBox chckbxNewCheckBox = new JCheckBox("Classes");
	    chckbxNewCheckBox.setSelected(true);
	    panel_2.add(chckbxNewCheckBox, "cell 0 0");
	    
	    JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Announcments");
	    chckbxNewCheckBox_1.setSelected(true);
	    panel_2.add(chckbxNewCheckBox_1, "cell 0 1");
	    
	    JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Birthdays");
	    panel_2.add(chckbxNewCheckBox_2, "cell 0 2");
	    
	    JButton btnNewButton = new JButton("Update");
	    panel.add(btnNewButton, "cell 0 8,alignx center,aligny center");
	    
	    JPanel datePanel = new JPanel();
	    datePanel.setBorder(new LineBorder(new Color(0, 0, 0)));
	    FlowLayout flowLayout = (FlowLayout) datePanel.getLayout();
	    panel.add(datePanel, "cell 0 4,alignx center,aligny top");
	    dateField = new JDatePickerImpl(datePanel2, new DateLabelFormatter());
	    SpringLayout springLayout = (SpringLayout) dateField.getLayout();
	    springLayout.putConstraint(SpringLayout.WEST, dateField.getJFormattedTextField(), 0, SpringLayout.WEST, dateField);
	    datePanel.add(dateField);
	    
	    JButton btnNewButton_1 = new JButton("New Announcment");
	    btnNewButton_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		createAnnouncement cAnnoun = new createAnnouncement();
	    		cAnnoun.createWindow();
	    	}
	    });
	    panel.add(btnNewButton_1, "cell 0 1,alignx center,aligny center");
	
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setHgap(25);
		flowLayout_1.setVgap(25);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmCalendar.getContentPane().add(panel_1, BorderLayout.CENTER);
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
