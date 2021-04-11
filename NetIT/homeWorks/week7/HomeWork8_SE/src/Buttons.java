import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Buttons implements ActionListener {

	JButton myButton = new JButton("NEW");
	
	public Component example() {	
		myButton.setFont(new Font("Arial", Font.BOLD, 20));
		
		myButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == myButton) {
					System.exit(0);
				}
			}
			
		});
		return myButton;	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
