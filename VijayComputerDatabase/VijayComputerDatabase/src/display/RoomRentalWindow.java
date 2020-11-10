package display;

import java.awt.EventQueue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import display.CreateStudent.DateLabelFormatter;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class RoomRentalWindow {

	private JFrame frmVcaRoom;
	private JDatePickerImpl dateField;


	/**
	 * Launch the application.
	 */
	public static void newWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoomRentalWindow window = new RoomRentalWindow();
					window.frmVcaRoom.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RoomRentalWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVcaRoom = new JFrame();
		frmVcaRoom.setTitle("VCA - Room Reservation");
		frmVcaRoom.setBounds(100, 100, 687, 374);
		frmVcaRoom.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmVcaRoom.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 248, 220));
		frmVcaRoom.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new MigLayout("", "[117px,grow]", "[][]"));
		
		JLabel lblNewLabel_2 = new JLabel("Room Reservation");
		panel.add(lblNewLabel_2, "cell 0 0,alignx center,aligny center");
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_5, "cell 0 1,grow");
		panel_5.setLayout(new MigLayout("", "[117px]", "[23px][]"));
		
		//Room Rental Button
		JButton btnNewButton = new JButton("New Room Reservation");
		panel_5.add(btnNewButton, "cell 0 0,alignx center,aligny center");
		
		JButton btnNewButton_1 = new JButton("Update Room Status");
		panel_5.add(btnNewButton_1, "cell 0 1,alignx center,aligny center");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewRoomReserve nrr = new NewRoomReserve();
				nrr.newWindow();
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 248, 220));
		frmVcaRoom.getContentPane().add(panel_1, BorderLayout.EAST);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 248, 220));
		frmVcaRoom.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 248, 220));
		frmVcaRoom.getContentPane().add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Show Room Status:");
		panel_3.add(lblNewLabel);
		
		JComboBox roomStatusComboBox = new JComboBox();
		panel_3.add(roomStatusComboBox);
	    roomStatusComboBox.addItem(new String("Available"));
	    roomStatusComboBox.addItem(new String("Booked"));
		
		JLabel lblNewLabel_1 = new JLabel("on date");
		panel_3.add(lblNewLabel_1);
		
		JPanel panel_6 = new JPanel();
		panel_3.add(panel_6);
		 UtilDateModel model=new UtilDateModel();
		    Properties p = new Properties();
	        p.put("text.today", "Today");
	        p.put("text.month", "Month");
	        p.put("text.year", "Year");
		    JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		    dateField = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		    SpringLayout springLayout = (SpringLayout) dateField.getLayout();
		    springLayout.putConstraint(SpringLayout.WEST, dateField.getJFormattedTextField(), 0, SpringLayout.WEST, dateField);
		    panel_6.add(dateField);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmVcaRoom.getContentPane().add(panel_4, BorderLayout.CENTER);
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
