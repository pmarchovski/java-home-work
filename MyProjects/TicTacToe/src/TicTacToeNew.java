import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.DropMode;

public class TicTacToeNew {

	private JFrame frame;
	private final JPanel panel 					= new JPanel();
	private final JPanel panel_1 				= new JPanel();
	private final JPanel panel_2 				= new JPanel();
	private final JPanel panel_3 				= new JPanel();
	private final JPanel panel_4 				= new JPanel();
	private final JPanel panel_5 				= new JPanel();
	private final JPanel panel_6 				= new JPanel();
	private final JPanel panel_7 				= new JPanel();
	private final JPanel panel_8 				= new JPanel();
	private final JPanel panel_9 				= new JPanel();
	private final JPanel panel_10 				= new JPanel();
	private final JPanel panel_11 				= new JPanel();
	private final JButton btn1 					= new JButton("");
	private final JButton btn2 					= new JButton("");
	private final JButton btn3 					= new JButton("");
	private final JButton btn4				    = new JButton("");
	private final JButton btn5 					= new JButton("");
	private final JButton btn6 					= new JButton("");
	private final JButton btn7 					= new JButton("");
	private final JButton btn8 					= new JButton("");
	private final JButton btn9 					= new JButton("");
	private final JPanel panel_12 				= new JPanel();
	private final JPanel panel_13 				= new JPanel();
	private final JPanel panel_12_1 			= new JPanel();
	private final JPanel panel_13_1 			= new JPanel();
	private final JPanel panel_12_2 			= new JPanel();
	private final JPanel panel_13_2 			= new JPanel();
	private final JLabel lblPlayerX 			= new JLabel();
	private final JLabel lblPlayerO			    = new JLabel();
	private final JLabel lblNewLabel_2		    = new JLabel("Изиграни игри");
	private final JPanel panel_14 				= new JPanel();
	private final JPanel panel_14_1 			= new JPanel();
	private final JButton btnNewButton_9 		= new JButton("НОВА ИГРА");
	private final JButton btnAddNewPlayers	    = new JButton("Добави играчите");
	private final JPanel panel_14_1_1 			= new JPanel();
	private final JPanel panel_14_1_2 			= new JPanel();
	private final JButton btnReset 				= new JButton("RESET");
	private final JButton btnExit			    = new JButton("EXIT");
	private int xCount1 						= 0; // аз съм писал това
	private int oCount1 						= 0; // аз съм писал това
	private int gameCount 						= 0;
	private String startGame				    = "X"; // аз съм писал това
	private int b1 								= 10; // аз съм писал това
	private int b2 								= 10;// аз съм писал това
	private int b3 								= 10;// аз съм писал това
	private int b4 								= 10;// аз съм писал това
	private int b5 								= 10;// аз съм писал това
	private int b6 								= 10;// аз съм писал това
	private int b7 								= 10;// аз съм писал това
	private int b8 								= 10;// аз съм писал това
	private int b9 								= 10;// аз съм писал това
	private int i 								= 0;
	private final JLabel lblNewLabel            = new JLabel("Име на играч \"X\"\"");
	private final JLabel lblNewLabel_1          = new JLabel("Име на играч \"O\"\"");
	private final JTextField inputGamerX        = new JTextField("");
	private final JTextField inputGamerO        = new JTextField("");
	private final JButton btnClearPlaeyers 		= new JButton("Нови играчи");
	private String gamerX					    = "";
	private String gamerO 					    = "";
	private final JLabel lblNewLabel_3 			= new JLabel("X");
	private final JLabel lblNewLabel_3_1 		= new JLabel("O");
	private final JPanel panel_15 				= new JPanel();
	private final JLabel lblPlayerChoose 		= new JLabel("Въведи имената на играчите");
	private final JLabel xCount = new JLabel("");
	private final JLabel oCount = new JLabel("");
	private final JLabel gameCountData = new JLabel("");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToeNew window = new TicTacToeNew();
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
	public TicTacToeNew() {
		initialize();
	}

	private void winningGame() { // това съм го писал аз.... давай надолу до следващия метод

		// за X
		if (b1 == 1 && b2 == 1 && b3 == 1) {
			
			btn1.setBackground(Color.GREEN);
			btn2.setBackground(Color.GREEN);
			btn3.setBackground(Color.GREEN);
			JOptionPane.showMessageDialog(frame, gamerX + " спечели", "ЕВАЛА", 
					JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			gameCount++;
			xCount.setText(String.valueOf(xCount1));
			gameCountData.setText(String.valueOf(gameCount));
			newGame();

		}

		else if (b4 == 1 && b5 == 1 && b6 == 1) {
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			JOptionPane.showMessageDialog(frame, gamerX + " спечели", "ЕВАЛА", 
					JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			gameCount++;
			xCount.setText(String.valueOf(xCount1));
			gameCountData.setText(String.valueOf(gameCount));
			newGame();

		}

		else if (b7 == 1 && b8 == 1 && b9 == 1) {
			btn7.setBackground(Color.GREEN);
			btn8.setBackground(Color.GREEN);
			btn9.setBackground(Color.GREEN);
			
			JOptionPane.showMessageDialog(frame, gamerX + " спечели", "ЕВАЛА", 
					JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			gameCount++;
			xCount.setText(String.valueOf(xCount1));
			gameCountData.setText(String.valueOf(gameCount));
			newGame();

		}

		else if (b1 == 1 && b4 == 1 && b7 == 1) {
			btn1.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn7.setBackground(Color.GREEN);
			
			JOptionPane.showMessageDialog(frame, gamerX + " спечели", "ЕВАЛА", 
					JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			gameCount++;
			xCount.setText(String.valueOf(xCount1));
			gameCountData.setText(String.valueOf(gameCount));
			newGame();

		}

		else if (b2 == 1 && b5 == 1 && b8 == 1) {
			btn2.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn8.setBackground(Color.GREEN);
			
			JOptionPane.showMessageDialog(frame, gamerX + " спечели", "ЕВАЛА", 
					JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			gameCount++;
			xCount.setText(String.valueOf(xCount1));
			gameCountData.setText(String.valueOf(gameCount));
			newGame();

		} else if (b3 == 1 && b6 == 1 && b9 == 1) {
			btn3.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			btn9.setBackground(Color.GREEN);
			
			JOptionPane.showMessageDialog(frame, gamerX + " спечели", "ЕВАЛА", 
					JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			gameCount++;
			xCount.setText(String.valueOf(xCount1));
			gameCountData.setText(String.valueOf(gameCount));
			newGame();

		} else if (b1 == 1 && b5 == 1 && b9 == 1) {
			btn1.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn9.setBackground(Color.GREEN);
			
			JOptionPane.showMessageDialog(frame, gamerX + " спечели", "ЕВАЛА", 
					JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			gameCount++;
			xCount.setText(String.valueOf(xCount1));
			gameCountData.setText(String.valueOf(gameCount));
			newGame();

		}

		else if (b3 == 1 && b5 == 1 && b7 == 1) {
			btn3.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn7.setBackground(Color.GREEN);
			
			JOptionPane.showMessageDialog(frame, gamerX + " спечели", "ЕВАЛА", 
					JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			gameCount++;
			xCount.setText(String.valueOf(xCount1));
			gameCountData.setText(String.valueOf(gameCount));
			newGame();

		}

		// за О

		else if (b1 == 0 && b2 == 0 && b3 == 0) {
			btn1.setBackground(Color.GREEN);
			btn2.setBackground(Color.GREEN);
			btn3.setBackground(Color.GREEN);
			
			JOptionPane.showMessageDialog(frame, gamerO + " спечели", "ЕВАЛА", 
					JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			gameCount++;
			oCount.setText(String.valueOf(oCount1));
			gameCountData.setText(String.valueOf(gameCount));
			newGame();

		}

		else if (b4 == 0 && b5 == 0 && b6 == 0) {
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			
			JOptionPane.showMessageDialog(frame, gamerO + " спечели", "ЕВАЛА", 
					JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			gameCount++;
			oCount.setText(String.valueOf(oCount1));
			gameCountData.setText(String.valueOf(gameCount));
			newGame();

		}

		else if (b7 == 0 && b8 == 0 && b9 == 0) {
			btn7.setBackground(Color.GREEN);
			btn8.setBackground(Color.GREEN);
			btn9.setBackground(Color.GREEN);
			
			JOptionPane.showMessageDialog(frame, gamerO + " спечели", "ЕВАЛА", 
					JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			gameCount++;
			oCount.setText(String.valueOf(oCount1));
			gameCountData.setText(String.valueOf(gameCount));
			newGame();

		}

		else if (b1 == 0 && b4 == 0 && b7 == 0) {
			btn1.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn7.setBackground(Color.GREEN);
			
			JOptionPane.showMessageDialog(frame, gamerO + " спечели", "ЕВАЛА", 
					JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			gameCount++;
			oCount.setText(String.valueOf(oCount1));
			gameCountData.setText(String.valueOf(gameCount));
			newGame();

		}

		else if (b2 == 0 && b5 == 0 && b8 == 0) {
			btn2.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn8.setBackground(Color.GREEN);
			
			JOptionPane.showMessageDialog(frame, gamerO + " спечели", "ЕВАЛА", 
					JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			gameCount++;
			oCount.setText(String.valueOf(oCount1));
			gameCountData.setText(String.valueOf(gameCount));
			newGame();

		} else if (b3 == 0 && b6 == 0 && b9 == 0) {
			btn3.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			btn9.setBackground(Color.GREEN);
			
			JOptionPane.showMessageDialog(frame, gamerO + " спечели", "ЕВАЛА", 
					JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			gameCount++;
			oCount.setText(String.valueOf(oCount1));
			gameCountData.setText(String.valueOf(gameCount));
			newGame();

		} else if (b1 == 0 && b5 == 0 && b9 == 0) {
			btn1.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn9.setBackground(Color.GREEN);
			
			JOptionPane.showMessageDialog(frame, gamerO + " спечели", "ЕВАЛА", 
					JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			gameCount++;
			oCount.setText(String.valueOf(oCount1));
			gameCountData.setText(String.valueOf(gameCount));
			newGame();

		} else if (b3 == 0 && b5 == 0 && b7 == 0) {
			btn3.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn7.setBackground(Color.GREEN);
			
			JOptionPane.showMessageDialog(frame, gamerO + " спечели", "ЕВАЛА", 
					JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			gameCount++;
			oCount.setText(String.valueOf(oCount1));
			gameCountData.setText(String.valueOf(gameCount));
			newGame();

		}

		else if (i == 9) {
			JOptionPane.showMessageDialog(frame, "СМОТАНЯЦИ :) НИКОЙ НЕ СПЕЧЕЛИ", "РАЗМЪРДАЙТЕ СИ МОЗЪЦИТЕ", 
					JOptionPane.INFORMATION_MESSAGE);
			newGame();
			gameCount++;
			gameCountData.setText(String.valueOf(gameCount));
		}

	}

	private void choosePlayer() { // аз съм писал това
	
		if (startGame.equalsIgnoreCase("X")) { // аз съм писал това
			startGame = "O"; // аз съм писал това
			lblPlayerChoose.setText(gamerO + " ти си наред");
			

		} else {
			startGame = "X";// аз съм писал това
			lblPlayerChoose.setText(gamerX + " ти си наред");
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		inputGamerX.setForeground(Color.RED);
		inputGamerX.setFont(new Font("Tahoma", Font.BOLD, 20));
		inputGamerX.setBounds(10, 426, 337, 34);
		inputGamerX.setColumns(10);
		frame = new JFrame();
		frame.setTitle("ТАЗИ ИГРА Е ЗА НИКОЛ");
		frame.setBounds(100, 100, 1040, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel_1.setLocation(0, 87);
		panel_1.setAlignmentY(0.0f);
		panel_1.setAlignmentX(0.0f);
		panel_1.setSize(643, 574);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(3, 3, 2, 2));
		
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setForeground(UIManager.getColor("Button.background"));
		btn1.setFont(new Font("Comic Sans MS", Font.BOLD, 80));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkForAddPlayersStartGame();
				
				btn1.setText(startGame); // аз съм писал това
				if (startGame.equalsIgnoreCase("X")) { // аз съм писал това
					btn1.setForeground(Color.RED); // аз съм писал това
					b1 = 1;
					i++;

				} else { // аз съм писал това
					btn1.setForeground(Color.BLUE); // аз съм писал това
					b1 = 0;
					i++;
				}
				choosePlayer(); // аз съм писал това
				winningGame();
				newGameIfPlayersFieldIsEmpty();
			}
		});
		
		panel_3.add(btn1, BorderLayout.CENTER);
		
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setFont(new Font("Comic Sans MS", Font.BOLD, 80));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkForAddPlayersStartGame();
				
				btn2.setText(startGame); // аз съм писал това
				if (startGame.equalsIgnoreCase("X")) { // аз съм писал това
					btn2.setForeground(Color.RED); // аз съм писал това
					b2 = 1;
					i++;

				} else { // аз съм писал това
					btn2.setForeground(Color.BLUE); // аз съм писал това
					b2 = 0;
					i++;
				}
				choosePlayer(); // аз съм писал това
				winningGame();
				newGameIfPlayersFieldIsEmpty();
			}
		});
		
		panel_4.add(btn2, BorderLayout.CENTER);
		
		panel_1.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setFont(new Font("Comic Sans MS", Font.BOLD, 80));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkForAddPlayersStartGame();
				
				btn3.setText(startGame); // аз съм писал това
				if (startGame.equalsIgnoreCase("X")) { // аз съм писал това
					btn3.setForeground(Color.RED); // аз съм писал това
					b3 = 1;
					i++;

				} else { // аз съм писал това
					btn3.setForeground(Color.BLUE); // аз съм писал това
					b3 = 0;
					i++;

				}
				choosePlayer(); // аз съм писал това
				winningGame();
				newGameIfPlayersFieldIsEmpty();
			}
		});
		
		panel_5.add(btn3, BorderLayout.CENTER);
		
		panel_1.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setForeground(new Color(0, 0, 0));
		btn4.setFont(new Font("Comic Sans MS", Font.BOLD, 80));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkForAddPlayersStartGame();
				
				btn4.setText(startGame); // аз съм писал това
				if (startGame.equalsIgnoreCase("X")) { // аз съм писал това
					btn4.setForeground(Color.RED); // аз съм писал това
					b4 = 1;
					i++;

				} else { // аз съм писал това
					btn4.setForeground(Color.BLUE); // аз съм писал това
					b4 = 0;
					i++;

				}
				choosePlayer(); // аз съм писал това
				winningGame();
				newGameIfPlayersFieldIsEmpty();
			}
		});
		
		panel_6.add(btn4, BorderLayout.CENTER);
		
		panel_1.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setFont(new Font("Comic Sans MS", Font.BOLD, 80));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkForAddPlayersStartGame();
				
				btn5.setText(startGame); // аз съм писал това
				if (startGame.equalsIgnoreCase("X")) { // аз съм писал това
					btn5.setForeground(Color.RED); // аз съм писал това
					b5 = 1;
					i++;

				} else { // аз съм писал това
					btn5.setForeground(Color.BLUE); // аз съм писал това
					b5 = 0;
					i++;

				}
				choosePlayer(); // аз съм писал това
				winningGame();
				newGameIfPlayersFieldIsEmpty();
			}
		});
		
		panel_7.add(btn5, BorderLayout.CENTER);
		
		panel_1.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.setFont(new Font("Comic Sans MS", Font.BOLD, 80));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkForAddPlayersStartGame();
				
				btn6.setText(startGame); // аз съм писал това
				if (startGame.equalsIgnoreCase("X")) { // аз съм писал това
					btn6.setForeground(Color.RED); // аз съм писал това
					b6 = 1;
					i++;

				} else { // аз съм писал това
					btn6.setForeground(Color.BLUE); // аз съм писал това
					b6 = 0;
					i++;

				}
				choosePlayer(); // аз съм писал това
				winningGame();
				newGameIfPlayersFieldIsEmpty();
			}
		});
		
		panel_8.add(btn6, BorderLayout.CENTER);
		
		panel_1.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setFont(new Font("Comic Sans MS", Font.BOLD, 80));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkForAddPlayersStartGame();
				
				btn7.setText(startGame); // аз съм писал това
				if (startGame.equalsIgnoreCase("X")) { // аз съм писал това
					btn7.setForeground(Color.RED); // аз съм писал това
					b7 = 1;
					i++;

				} else { // аз съм писал това
					btn7.setForeground(Color.BLUE); // аз съм писал това
					b7 = 0;
					i++;

				}
				choosePlayer(); // аз съм писал това
				winningGame();
				newGameIfPlayersFieldIsEmpty();
			}
		});
		
		panel_9.add(btn7, BorderLayout.CENTER);
		
		panel_1.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setFont(new Font("Comic Sans MS", Font.BOLD, 80));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkForAddPlayersStartGame();
				
				btn8.setText(startGame); // аз съм писал това
				if (startGame.equalsIgnoreCase("X")) { // аз съм писал това
					btn8.setForeground(Color.RED); // аз съм писал това
					b8 = 1;
					i++;

				} else { // аз съм писал това
					btn8.setForeground(Color.BLUE); // аз съм писал това
					b8 = 0;
					i++;

				}
				choosePlayer(); // аз съм писал това
				winningGame();
				newGameIfPlayersFieldIsEmpty();
			}
		});
		
		panel_10.add(btn8, BorderLayout.CENTER);
		
		panel_1.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setFont(new Font("Comic Sans MS", Font.BOLD, 80));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkForAddPlayersStartGame();
				
				btn9.setText(startGame); // аз съм писал това
				if (startGame.equalsIgnoreCase("X")) { // аз съм писал това
					btn9.setForeground(Color.RED); // аз съм писал това
					b9 = 1;
					i++;

				} else { // аз съм писал това
					btn9.setForeground(Color.BLUE); // аз съм писал това
					b9 = 0;
					i++;

				}
				choosePlayer(); // аз съм писал това
				winningGame();
				newGameIfPlayersFieldIsEmpty();
			}
		});
		
		panel_11.add(btn9, BorderLayout.CENTER);
		panel_2.setBounds(643, 0, 540, 661);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		panel.add(panel_2);
		panel_2.setLayout(null);
		panel_12.setBounds(10, 11, 184, 65);
		
		panel_2.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		lblPlayerX.setForeground(Color.RED);
		lblPlayerX.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		panel_12.add(lblPlayerX, BorderLayout.CENTER);
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_13.setBounds(204, 11, 143, 65);
		
		panel_2.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		xCount.setForeground(Color.RED);
		xCount.setFont(new Font("Tahoma", Font.BOLD, 20));
		xCount.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_13.add(xCount, BorderLayout.CENTER);
		panel_12_1.setBounds(10, 87, 184, 65);
		
		panel_2.add(panel_12_1);
		panel_12_1.setLayout(new BorderLayout(0, 0));
		lblPlayerO.setForeground(Color.BLUE);
		lblPlayerO.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		panel_12_1.add(lblPlayerO, BorderLayout.CENTER);
		panel_13_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_13_1.setBounds(204, 87, 143, 65);
		
		panel_2.add(panel_13_1);
		panel_13_1.setLayout(new BorderLayout(0, 0));
		oCount.setForeground(Color.BLUE);
		oCount.setFont(new Font("Tahoma", Font.BOLD, 20));
		oCount.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_13_1.add(oCount, BorderLayout.CENTER);
		panel_12_2.setBounds(10, 163, 184, 65);
		
		panel_2.add(panel_12_2);
		panel_12_2.setLayout(new BorderLayout(0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		panel_12_2.add(lblNewLabel_2, BorderLayout.CENTER);
		panel_13_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_13_2.setBounds(204, 163, 143, 65);
		
		panel_2.add(panel_13_2);
		panel_13_2.setLayout(new BorderLayout(0, 0));
		gameCountData.setHorizontalAlignment(SwingConstants.CENTER);
		gameCountData.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		panel_13_2.add(gameCountData, BorderLayout.CENTER);
		panel_14.setBounds(10, 248, 160, 54);
		
		panel_2.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				newGame();		
			}
			
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		panel_14.add(btnNewButton_9, BorderLayout.CENTER);
		panel_14_1.setBounds(187, 248, 160, 54);
		
		panel_2.add(panel_14_1);
		panel_14_1.setLayout(new BorderLayout(0, 0));
		
		btnClearPlaeyers.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
				
			lblPlayerX.setText("");
			lblPlayerO.setText("");
			lblPlayerChoose.setText("Няма въведени играчи");
			gameCountData.setText(null);
			gameCount = 0;
			xCount.setText(null);
	        xCount1 = 0;
			oCount.setText(null);	
			oCount1 = 0;
			newGame();
			
			}
		});
		btnClearPlaeyers.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		panel_14_1.add(btnClearPlaeyers, BorderLayout.CENTER);
		panel_14_1_1.setBounds(10, 313, 160, 54);
		
		panel_2.add(panel_14_1_1);
		panel_14_1_1.setLayout(new BorderLayout(0, 0));
		
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				xCount.setText(null);
		        xCount1 = 0;
				oCount.setText(null);	
				oCount1 = 0;
				gameCountData.setText(null);
				gameCount = 0;
				
				newGame();
			}
		});
		
		panel_14_1_1.add(btnReset, BorderLayout.CENTER);
		panel_14_1_2.setBounds(187, 313, 160, 54);
		
		panel_2.add(panel_14_1_2);
		panel_14_1_2.setLayout(new BorderLayout(0, 0));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "НЕЕЕЕЕЕ НЕ ИСКАМ ДА ИЗЛИЗАААААААААМ", "Никол иска да те попитаа.....",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		
		panel_14_1_2.add(btnExit, BorderLayout.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 388, 218, 34);
		
		panel_2.add(lblNewLabel);
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 477, 218, 34);
		
		panel_2.add(lblNewLabel_1);
		
		panel_2.add(inputGamerX);
		inputGamerO.setForeground(Color.BLUE);
		inputGamerO.setFont(new Font("Tahoma", Font.BOLD, 20));
		inputGamerO.setColumns(10);
		inputGamerO.setBounds(10, 510, 337, 34);
		
		panel_2.add(inputGamerO);
		
		btnAddNewPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
			checkForAddPlayers();					
			gamerX = inputGamerX.getText();
	        gamerO = inputGamerO.getText();
	        lblPlayerX.setText(gamerX);
	        lblPlayerO.setText(gamerO);
	        inputGamerX.setText(null);
	        inputGamerO.setText(null);
	        choosePlayer();	
			}
		});
		btnAddNewPlayers.setBounds(10, 569, 337, 54);
		panel_2.add(btnAddNewPlayers);
		btnAddNewPlayers.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_3.setBounds(348, 11, 29, 65);
		
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3_1.setForeground(Color.BLUE);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_3_1.setBounds(348, 87, 29, 65);
		
		panel_2.add(lblNewLabel_3_1);
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_15.setBounds(0, 0, 643, 86);
		
		panel.add(panel_15);
		panel_15.setLayout(null);
		lblPlayerChoose.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPlayerChoose.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerChoose.setBounds(61, 11, 529, 60);
		
		panel_15.add(lblPlayerChoose);
	}
	
	public void newGame() {
		btn1.setText(null);
		btn1.setBackground(Color.LIGHT_GRAY);
		btn2.setText(null);
		btn2.setBackground(Color.LIGHT_GRAY);
		btn3.setText(null);
		btn3.setBackground(Color.LIGHT_GRAY);
		btn4.setText(null);
		btn4.setBackground(Color.LIGHT_GRAY);
		btn5.setText(null);
		btn5.setBackground(Color.LIGHT_GRAY);
		btn6.setText(null);
		btn6.setBackground(Color.LIGHT_GRAY);
		btn7.setText(null);
		btn7.setBackground(Color.LIGHT_GRAY);
		btn8.setText(null);
		btn8.setBackground(Color.LIGHT_GRAY);
		btn9.setText(null);
		btn9.setBackground(Color.LIGHT_GRAY);
		b1 = 10;
		b2 = 10;
		b3 = 10;
		b4 = 10;
		b5 = 10;
		b6 = 10;
		b7 = 10;
		b8 = 10;
		b9 = 10;
		i = 0;			
		
	}
	
	public void checkForAddPlayers () {
		if (inputGamerX.getText().equals("") && inputGamerO.getText().equals("")) {       	
		     frame = new JFrame("Info");
		     JOptionPane.showMessageDialog(null, "Моля въведете имена на играчите", "Внимание", JOptionPane.OK_CANCEL_OPTION);				    
		}
	}
	
	public void checkForAddPlayersStartGame() {
		if (lblPlayerX.getText().equals("") && lblPlayerO.getText().equals("")) { 
		     frame = new JFrame("Info");
		     JOptionPane.showMessageDialog(null, "Моля въведете имена на играчите", "Внимание", JOptionPane.OK_CANCEL_OPTION);
		     lblPlayerChoose.setText("Няма въведени играчи");
		}
		
	}
	
	public void newGameIfPlayersFieldIsEmpty() {
		if (lblPlayerX.getText().equals("") && lblPlayerO.getText().equals("")) { 
			lblPlayerChoose.setText("Няма въведени играчи");
			newGame();
			
		}
	}
}
