package View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Person_AreaPanel extends JPanel{
	public Person_AreaPanel(JFrame frame) {
		super();
		panelInit(frame);
	}
	
	private void panelInit(JFrame frame) {
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 636, 360);
		frame.getContentPane().add(this);
		this.setLayout(null);

		// 인원 & 지역 화면
		JLabel Person_Area_NewLabel = new JLabel("Person & Area");
		Person_Area_NewLabel.setFont(new Font("Arial", Font.BOLD, 35));
		Person_Area_NewLabel.setForeground(new Color(0, 35, 110));
		Person_Area_NewLabel.setHorizontalAlignment(JLabel.CENTER);
		Person_Area_NewLabel.setBounds(70, 5, 500, 40);
		
		this.add(Person_Area_NewLabel);
	}

}
