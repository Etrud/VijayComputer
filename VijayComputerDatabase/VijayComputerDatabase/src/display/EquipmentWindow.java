package display;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class EquipmentWindow {

	private JFrame frmEquipmentMenu;

	/**
	 * Launch the application.
	 */
	public static void createWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EquipmentWindow window = new EquipmentWindow();
					window.frmEquipmentMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EquipmentWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEquipmentMenu = new JFrame();
		frmEquipmentMenu.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\bshaffer\\git\\VijayComputerDatabase\\VijayComputerDatabase\\resources\\laptop.png"));
		frmEquipmentMenu.setTitle("VCA - Equipment");
		frmEquipmentMenu.setBounds(100, 100, 450, 300);
		frmEquipmentMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmEquipmentMenu.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 204, 102));
		frmEquipmentMenu.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new MigLayout("", "[147px,grow][30px,grow]", "[22px]"));
		
		JLabel lblNewLabel = new JLabel("Display Equipment with status:");
		panel.add(lblNewLabel, "cell 0 0,alignx right");
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox, "cell 1 0,alignx left,aligny center");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 204, 102));
		frmEquipmentMenu.getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new MigLayout("", "[]", "[][]"));
		
		JButton btnNewButton = new JButton("New Checkout");
		panel_1.add(btnNewButton, "cell 0 0,alignx center");
		
		JButton btnNewButton_1 = new JButton("Software");
		panel_1.add(btnNewButton_1, "cell 0 1,alignx center");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(102, 204, 102));
		frmEquipmentMenu.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(102, 204, 102));
		frmEquipmentMenu.getContentPane().add(panel_3, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmEquipmentMenu.getContentPane().add(panel_4, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		frmEquipmentMenu.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Print");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
	}

}
