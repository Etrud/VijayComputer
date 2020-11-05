package display;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FinanceWindow {

	private JFrame frmVcaFinances;

	/**
	 * Launch the application.
	 */
	public static void createWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinanceWindow window = new FinanceWindow();
					window.frmVcaFinances.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FinanceWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVcaFinances = new JFrame();
		frmVcaFinances.setIconImage(Toolkit.getDefaultToolkit().getImage("VijayComputerDatabase\\resources\\hand.png"));
		frmVcaFinances.setTitle("VCA - Finances");
		frmVcaFinances.setBounds(100, 100, 450, 300);
		frmVcaFinances.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmVcaFinances.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmVcaFinances.getContentPane().add(panel, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		frmVcaFinances.getContentPane().add(panel_1, BorderLayout.EAST);
		
		JPanel panel_2 = new JPanel();
		frmVcaFinances.getContentPane().add(panel_2, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		frmVcaFinances.getContentPane().add(panel_3, BorderLayout.SOUTH);
		
		JPanel panel_4 = new JPanel();
		frmVcaFinances.getContentPane().add(panel_4, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		frmVcaFinances.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
	}

}
