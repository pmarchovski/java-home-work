import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class threathCalcolator {

	private JFrame frame;
	private final JTextField threathValue = new JTextField();
	private final JTextField pichValue = new JTextField();
	private final JLabel lblNewLabel = new JLabel("Размер на резбата");
	private final JLabel lblNewLabel_1 = new JLabel("PICH");
	private final JButton btnNewButton = new JButton("Калкулирай");
	private final JLabel rezult = new JLabel("New label");
	private final JComboBox comboBox = new JComboBox();
	private final JLabel razmer = new JLabel("");
	private final JLabel lblNewLabel_2 = new JLabel("");
	private final JButton clear = new JButton("Изчисти");
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					threathCalcolator window = new threathCalcolator();
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
	public threathCalcolator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		pichValue.setHorizontalAlignment(SwingConstants.CENTER);
		pichValue.setFont(new Font("Tahoma", Font.BOLD, 16));
		pichValue.setBounds(33, 187, 169, 36);
		pichValue.setColumns(10);
		threathValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		threathValue.setHorizontalAlignment(SwingConstants.CENTER);
		threathValue.setFont(new Font("Tahoma", Font.BOLD, 16));
		threathValue.setBounds(33, 140, 169, 36);
		threathValue.setColumns(10);
		frame = new JFrame();
		frame.setTitle("Калкулатор за резби");
		frame.setBounds(200, 200, 650, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.getContentPane().add(threathValue);
		
		frame.getContentPane().add(pichValue);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(212, 140, 121, 36);
		
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(212, 190, 121, 31);
		
		frame.getContentPane().add(lblNewLabel_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBox.getSelectedItem().equals("Вътрешна резба"))
				{
			 double threathValueNum, pichValueNum;
			 threathValueNum = Double.parseDouble(threathValue.getText());
			 pichValueNum = Double.parseDouble(pichValue.getText());	 
			 double resultNum = threathValueNum + pichValueNum;
			 rezult.setText(Double.toString(resultNum) + " " + "мм.");
			 razmer.setText("Размер на отовора");
	
				}
				
				if(comboBox.getSelectedItem().equals("Външна резба"))
				{
					double threathValueNum, pichValueNum;
					 threathValueNum = Double.parseDouble(threathValue.getText());
					 pichValueNum = Double.parseDouble(pichValue.getText());
					 double resultNum = threathValueNum-pichValueNum;
					 rezult.setText(Double.toString(resultNum) + " " + "мм.");
					 razmer.setText("Размер на оста");			 					 
				}
					
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(426, 233, 175, 31);
		
		frame.getContentPane().add(btnNewButton);
		rezult.setHorizontalAlignment(SwingConstants.CENTER);
		rezult.setFont(new Font("Tahoma", Font.BOLD, 14));
		rezult.setBorder(new LineBorder(new Color(0, 0, 0)));
		rezult.setBounds(33, 273, 169, 60);
		rezult.setText(null);
		
		frame.getContentPane().add(rezult);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBox.getSelectedItem().equals("Избери вид на резбата"))
				{
					lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\petar\\OneDrive\\Desktop\\metchik.jpg"));
				}
				
				if(comboBox.getSelectedItem().equals("Вътрешна резба"))
				{
					lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\petar\\OneDrive\\Desktop\\metchik.jpg"));
				}
				if(comboBox.getSelectedItem().equals("Външна резба"))
				{
					lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\petar\\OneDrive\\Desktop\\plashka.jpg"));
				}
				
			}
		});
		
		comboBox.setBounds(33, 66, 169, 31);
		comboBox.addItem("Избери вид на резбата");
		comboBox.addItem("Вътрешна резба");
		comboBox.addItem("Външна резба");
		
	
		
		frame.getContentPane().add(comboBox);
		razmer.setForeground(Color.RED);
		razmer.setFont(new Font("Tahoma", Font.BOLD, 14));
		razmer.setBounds(212, 273, 179, 60);
		
		frame.getContentPane().add(razmer);
		lblNewLabel_2.setBounds(413, 11, 200, 200);
		
		frame.getContentPane().add(lblNewLabel_2);
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				threathValue.setText(null);
				pichValue.setText(null);
				rezult.setText(null);
			}
		});
		clear.setFont(new Font("Tahoma", Font.BOLD, 14));
		clear.setBounds(426, 275, 175, 31);
		
		frame.getContentPane().add(clear);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 108, 352, 146);
		
		frame.getContentPane().add(panel);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
