package View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DurationPanel extends JPanel{
	public DurationPanel(JFrame frame) {
		super();
		panelInit(frame);
	}

	private void panelInit(JFrame frame) {
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 636, 440);
		frame.getContentPane().add(this);
		this.setLayout(null);

		// 기간 화면
		JLabel Duration_NewLabel = new JLabel("Duration");
		Duration_NewLabel.setFont(new Font("Arial", Font.BOLD, 35));
		Duration_NewLabel.setForeground(new Color(0, 35, 110));
		Duration_NewLabel.setHorizontalAlignment(JLabel.CENTER);
		Duration_NewLabel.setBounds(70, 5, 500, 40);
		
		this.add(Duration_NewLabel);
	}
}
