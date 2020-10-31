package View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Date_AreaPanel extends JPanel{
	public Date_AreaPanel(JFrame frame) {
		super();
		panelInit(frame);
	}
	
	private void panelInit(JFrame frame) {
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 636, 360);
		frame.getContentPane().add(this);
		this.setLayout(null);

		// 날짜 & 지역
		JLabel Date_Area_Label = new JLabel("Date & Area");
		Date_Area_Label.setFont(new Font("Arial", Font.BOLD, 35));
		Date_Area_Label.setForeground(new Color(0, 35, 110));
		Date_Area_Label.setHorizontalAlignment(JLabel.CENTER);
		Date_Area_Label.setBounds(70, 5, 500, 40);
		
		this.add(Date_Area_Label);
	}
}
