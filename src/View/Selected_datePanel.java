package View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Selected_datePanel extends JPanel{
	public Selected_datePanel(JFrame frame) {
		super();
		panelInit(frame);
	}
	
	private void panelInit(JFrame frame) {
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 636, 440);
		frame.getContentPane().add(this);
		this.setLayout(null);

		// 지정날짜
		JLabel Selected_date_NewLabel = new JLabel("Selected date");
		Selected_date_NewLabel.setFont(new Font("Arial", Font.BOLD, 35));
		Selected_date_NewLabel.setForeground(new Color(0, 35, 110));
		Selected_date_NewLabel.setHorizontalAlignment(JLabel.CENTER);
		Selected_date_NewLabel.setBounds(70, 5, 500, 40);
		
		this.add(Selected_date_NewLabel);
	}

}
