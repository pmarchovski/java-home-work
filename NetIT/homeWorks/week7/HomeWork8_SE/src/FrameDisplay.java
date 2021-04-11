import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import net.miginfocom.swing.MigLayout;

public class FrameDisplay implements ActionListener {

	JFrame frame;
	
	
	JPanel[] panelsPosition = new JPanel[20];
	JLabel[] labels = new JLabel[20];
	JLabel[] labelsPlayer = new JLabel[20];
	JLabel labelPlayer = new JLabel();
	JTextArea textInfoPlayerPosition = new JTextArea();
	JTextArea textInfoMoneyLeft = new JTextArea();
	JTextArea textInfoFields = new JTextArea();
	JTextArea textInfoInvest = new JTextArea();
	JTextArea textInfoInvestGlobal = new JTextArea();
	JTextArea textInfoPlayerOne = new JTextArea();
	JTextArea textInfoPlayerTwo = new JTextArea();
	JPanel panel = new JPanel();
	JPanel panel_1 = new JPanel();
	JPanel panel_2 = new JPanel();
	JPanel panel_3 = new JPanel();
	JPanel panel_4 = new JPanel();
	JPanel panel_5 = new JPanel();
	JButton buttonPlayer = new JButton("Player");
	JButton buttonPlayer1 = new JButton("Създаване");
	JButton buttonNewGame = new JButton("Нова игра");
	JButton buttonChoose = new JButton("");
	JButton buttonExit = new JButton("Изход от играта");
	JTextField fieldChoose = new JTextField("y or n");
	Buttons button = new Buttons();
	String urlIconOne = "C:\\Users\\petar\\OneDrive\\Desktop\\Dice4.gif";
	String urlIconTwo = "C:\\Users\\petar\\OneDrive\\Desktop\\Dice5.gif";
	ImageIcon icon = new ImageIcon(urlIconOne);
    ImageIcon icon1 = new ImageIcon(urlIconTwo);
    JScrollPane scrollPane = new JScrollPane();
    
    
	public void intialise() {

		SetUpPlayers.createPlayer();
		Board.createBoard();
		Invest.createInvestCollection();

		if (SetUpPlayers.firstPlayer() == 0) {
			buttonPlayer.setText(SetUpPlayers.playerOne);
		}
		
		if (SetUpPlayers.firstPlayer() == 1) {
			buttonPlayer.setText(SetUpPlayers.playerTwo);
		}

		frame = new JFrame();
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setBounds(150, 30, 1650, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.add(panel_1);
        frame.add(panel_4);
        frame.add(panel_5);
        
		panel.setBounds(65, 60, 1100, 500);
		panel.setLayout(new MigLayout("", "[150px][150px][150px][150px][150px][150px][150px][150px]",
				"[140px][140px][140px][140px]"));

		panel.setBackground(Color.gray);	

		panel_1.setBounds(65, 600, 800, 300);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		panel_1.add(panel_2);
		panel_1.add(panel_3);
		
		panel_2.setLayout(new GridLayout(4, 0, 0, 0));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.add(textInfoPlayerPosition);
		panel_2.add(textInfoMoneyLeft);
		panel_2.add(textInfoFields);
		panel_2.add(textInfoInvest);
	
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setLayout(new GridLayout(5, 5, 2, 2));
		panel_3.add(buttonPlayer);
		panel_3.add(buttonNewGame);
		panel_3.add(buttonExit);
		panel_3.add(button.example());
		
		panel_4.setBorder(new LineBorder(new Color(0,0,0)));
		panel_4.setBounds(1200, 60, 400, 100);
		panel_4.setLayout(new GridLayout(2,0,0,0));
		panel_4.add(textInfoPlayerOne);
		panel_4.add(textInfoPlayerTwo);
		
	    panel_5.setBorder(new LineBorder(new Color(0,0,0)));
	    panel_5.setBounds(1200, 200, 400, 700);
	    panel_5.setLayout(new GridLayout(1,0,0,0));
	    panel_5.add(scrollPane);
	    
	    scrollPane.add(textInfoInvestGlobal);
	    scrollPane.setVisible(true);
	    scrollPane.setViewportView(textInfoInvestGlobal);
		
		labelPlayer.setFont(new Font("Arial", Font.BOLD, 14));
		labelPlayer.setIcon(icon1);
		
		fieldChoose.setSize(60, 50);
		
		textInfoFields.setEditable(false);
		textInfoFields.setLineWrap(true);
		textInfoFields.setFont(new Font("Arial", Font.BOLD, 18));
		
		textInfoPlayerPosition.setEditable(false);
		textInfoPlayerPosition.setLineWrap(true);
		textInfoPlayerPosition.setFont(new Font("Arial", Font.BOLD, 18));
		
		textInfoMoneyLeft.setEditable(false);
		textInfoMoneyLeft.setFont(new Font("Arial", Font.BOLD, 18));
		
		textInfoInvest.setEditable(false);
		textInfoInvest.setFont(new Font("Arial", Font.BOLD, 14));
		textInfoInvest.setWrapStyleWord(true);
		textInfoInvest.setRows(4);
		
		textInfoInvestGlobal.setEditable(false);
		textInfoInvestGlobal.setVisible(true);
		textInfoInvestGlobal.setFont(new Font("Arial", Font.BOLD, 18));
		
		textInfoPlayerOne.setEditable(false);
		textInfoPlayerOne.setVisible(true);
		textInfoPlayerOne.setFont(new Font("Arial", Font.BOLD, 20));
		
		textInfoPlayerTwo.setEditable(false);
		textInfoPlayerTwo.setVisible(true);
		textInfoPlayerTwo.setFont(new Font("Arial", Font.BOLD, 20));
		
		buttonPlayer.setFont(new Font("Arial", Font.BOLD, 20));
		buttonPlayer.setForeground(Color.red);
		buttonPlayer.setIcon(icon);
		
		buttonExit.setFont(new Font("Arial", Font.BOLD, 20));
		buttonNewGame.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));

		for (int i = labels.length - 1; i >= 0; i--) {

			panelsPosition[i] = new JPanel();
			panelsPosition[i].setBounds(50, 50, 50, 50);
			panelsPosition[i].setLayout(new BorderLayout(1, 1));
			panelsPosition[i].setVisible(true);
			panelsPosition[i].setBackground(Color.gray);
			panelsPosition[i].setLayout(new GridLayout(2, 0, 0, 0));

			labels[i] = new JLabel();
			labelsPlayer[i] = new JLabel();
			labelsPlayer[i].setHorizontalAlignment(SwingConstants.CENTER);
			labels[i].setText((Board.boardPosition[i].getFieldsName()));
			labels[i].setHorizontalAlignment(SwingConstants.CENTER);
			labels[i].setFont(new Font("Arial", Font.BOLD, 20));
			labelsPlayer[i].setFont(new Font("Arial", Font.BOLD, 20));
			panelsPosition[i].add(labels[i]);
			panelsPosition[i].add(labelsPlayer[i]);

			if (labels[i].getText().equals(Board.start.getFieldsName()))
				panelsPosition[i].setBackground(Color.GREEN);
			if (labels[i].getText().equals(Board.trap.getFieldsName()))
				panelsPosition[i].setBackground(Color.RED);
			if (labels[i].getText().equals(Board.invest.getFieldsName()))
				panelsPosition[i].setBackground(Color.PINK);
			if (labels[i].getText().equals(Board.chance.getFieldsName()))
				panelsPosition[i].setBackground(Color.CYAN);
			if (labels[i].getText().equals(Board.party.getFieldsName()))
				panelsPosition[i].setBackground(Color.ORANGE);
			if (labels[i].getText().equals(Board.steal.getFieldsName()))
				panelsPosition[i].setBackground(Color.BLUE);
		}

		panel.add(panelsPosition[19], "cell 7 2,grow");
		panel.add(panelsPosition[18], "cell 7 1,grow");
		panel.add(panelsPosition[17], "cell 7 0,grow");
		panel.add(panelsPosition[16], "cell 6 0,grow");
		panel.add(panelsPosition[15], "cell 5 0,grow");
		panel.add(panelsPosition[14], "cell 4 0,grow");
		panel.add(panelsPosition[13], "cell 3 0,grow");
		panel.add(panelsPosition[12], "cell 2 0,grow");
		panel.add(panelsPosition[11], "cell 1 0,grow");
		panel.add(panelsPosition[10], "cell 0 0,grow");
		panel.add(panelsPosition[9], "cell 0 1,grow");
		panel.add(panelsPosition[8], "cell 0 2,grow");
		panel.add(panelsPosition[7], "cell 0 3,grow");
		panel.add(panelsPosition[6], "cell 1 3,grow");
		panel.add(panelsPosition[5], "cell 2 3,grow");
		panel.add(panelsPosition[4], "cell 3 3,grow");
		panel.add(panelsPosition[3], "cell 4 3,grow");
		panel.add(panelsPosition[2], "cell 5 3,grow");
		panel.add(panelsPosition[1], "cell 6 3,grow");
		panel.add(panelsPosition[0], "cell 7 3,grow");

		frame.setState(JFrame.ICONIFIED);
		frame.setState(JFrame.NORMAL);

		buttonPlayer1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == buttonPlayer1) {

				}

			}

		});


	buttonPlayer.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (buttonPlayer.getText().equals(SetUpPlayers.playerOne) && e.getSource() == buttonPlayer) {

			SetUpPlayers.numberPlayer = 0;

			buttonPlayer.setIcon(icon);
			buttonPlayer.setText("   " + SetUpPlayers.playerTwo);
			
			SetUpPlayers.myFrame.textInfoFields.setText("");
			Game.game();
		}
			else if (buttonPlayer.getText().equals(SetUpPlayers.playerTwo) && e.getSource() == buttonPlayer) {

				SetUpPlayers.numberPlayer = 1;
				
				buttonPlayer.setIcon(icon);				
				buttonPlayer.setText("   " + SetUpPlayers.playerOne);
				
				SetUpPlayers.myFrame.textInfoFields.setText("");
				Game.game();

		}
	}
	});

	buttonExit.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttonExit) {
			
				System.exit(0);
			}
		}
	});
	
	buttonNewGame.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttonNewGame) {
				
				Game.game();
			}
		}
	});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
