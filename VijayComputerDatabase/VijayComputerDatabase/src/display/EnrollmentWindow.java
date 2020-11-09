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
		frmEnrollmentWindow.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		frmEnrollmentWindow.getContentPane().add(panel, BorderLayout.NORTH);
		
		Component verticalStrut_1 = Box.createVerticalStrut(15);
		panel.add(verticalStrut_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 255));
		frmEnrollmentWindow.getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new MigLayout("", "[]", "[][]"));
		
		JButton btnNewButton = new JButton("Student Portal");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StudentWindow sw = new StudentWindow();
				sw.studWindow();
			}
		});
		panel_1.add(btnNewButton, "cell 0 0,alignx center");
		
		JButton btnNewButton_1 = new JButton("Class Portal");
		panel_1.add(btnNewButton_1, "cell 0 1,alignx center");
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(204, 204, 255));
		frmEnrollmentWindow.getContentPane().add(panel_3, BorderLayout.SOUTH);
		
		Component verticalStrut = Box.createVerticalStrut(15);
		panel_3.add(verticalStrut);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmEnrollmentWindow.getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new MigLayout("", "[]", "[]"));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(204, 204, 255));
		frmEnrollmentWindow.getContentPane().add(panel_5, BorderLayout.EAST);
		
		Component horizontalStrut = Box.createHorizontalStrut(15);
		panel_5.add(horizontalStrut);
		
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
