package display;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.Box;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class EnrollmentWindow {

	private JFrame frmEnrollmentWindow;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnrollmentWindow window = new EnrollmentWindow();
					window.frmEnrollmentWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	*/
	public EnrollmentWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEnrollmentWindow = new JFrame();
		frmEnrollmentWindow.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\bshaffer\\git\\VijayComputerDatabase\\VijayComputerDatabase\\resources\\user.png"));
		frmEnrollmentWindow.setTitle("VCA - Enrollment");
		frmEnrollmentWindow.setBounds(100, 100, 724, 529);
		frmEnrollmentWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmEnrollmentWindow.getContentPane().setLayout(new MigLayout("", "[119px][315px]", "[36px][225px]"));
		
		JPanel panel = new JPanel();
		frmEnrollmentWindow.getContentPane().add(panel, "cell 0 1,alignx left,growy");
		panel.setLayout(new MigLayout("", "[89px]", "[][23px][][216px]"));
		
		Component verticalStrut = Box.createVerticalStrut(20);
		panel.add(verticalStrut, "cell 0 0");
		
		/**
		 * Edit Students Button
		 */
		JButton btnNewButton_1 = new JButton("Student Mod Portal");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentWindow stud = new StudentWindow();
				stud.studWindow();
			}
		});
		panel.add(btnNewButton_1, "cell 0 1,alignx center,aligny bottom");
		
		/**
		 * Edit Students Button
		 */
		JButton btnNewButton_2 = new JButton("Class Mod Portal");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_2, "cell 0 2");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmEnrollmentWindow.getContentPane().add(panel_1, "cell 1 1,grow");
		panel_1.setLayout(new MigLayout("", "[1px]", "[1px]"));
		
		table = new JTable();
		panel_1.add(table, "cell 0 0,alignx left,aligny top");
		
		JPanel panel_2 = new JPanel();
		frmEnrollmentWindow.getContentPane().add(panel_2, "cell 0 0 2 1,growx,aligny top");
		panel_2.setLayout(new MigLayout("", "[][76px][358px]", "[22px]"));
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut_1, "cell 0 0");
	
		
		/**
		 * Sort Classes By
		 */
		
		JComboBox comboBox = new JComboBox();
		panel_2.add(comboBox, "flowx,cell 2 0,growx,aligny top");
		
		JLabel lblNewLabel = new JLabel("Sort classes by:");
		lblNewLabel.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_2.add(lblNewLabel, "cell 1 0,alignx left,growy");
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut, "cell 2 0");
		
		JMenuBar menuBar = new JMenuBar();
		frmEnrollmentWindow.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Print");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnNewMenu.add(mntmExit);
	}

}
