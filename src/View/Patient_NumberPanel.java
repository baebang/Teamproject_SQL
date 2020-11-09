package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Control.Control;
import Model.Data;

public class Patient_NumberPanel extends JPanel{
	private JTextArea Patient_Number;
	private JButton Select;
	private Data Selected_Data;
	private Control control;
	private JLabel month, data, people_num, contry, people_info, area, travel, contact, measures, status, route, registration_d, modified_d, exposure;
	private JLabel month1, data1, people_num1, contry1, people_info1, area1, travel1, contact1, measures1, status1, route1, registration_d1, modified_d1, exposure1;
	public Patient_NumberPanel(JFrame frame, Control control) {
		super();
		this.control = control;
		frame.getContentPane().add(this);
		panelInit(frame);
	}
	
	private void panelInit(JFrame frame) {
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 636, 360);
		this.setLayout(null);

		// 날짜 & 지역
		JLabel Date_Area_Label = new JLabel("Patient & Number");
		Date_Area_Label.setFont(new Font("Arial", Font.BOLD, 35));
		Date_Area_Label.setForeground(new Color(0, 35, 110));
		Date_Area_Label.setHorizontalAlignment(JLabel.CENTER);
		Date_Area_Label.setBounds(70, 5, 500, 40);
			
		Patient_Number = new JTextArea();
		Patient_Number.setFont(new Font("Arial", Font.BOLD, 35));
		Patient_Number.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		Patient_Number.setBounds(225, 70, 200, 40);
		
		Select = new JButton("Select");
		Select.setBounds(445, 70, 100, 40);
		Select.setActionCommand("select");
		Select.addActionListener(new MyActionCommand());
		
		month = new JLabel("확진 월");
		month.setFont(new Font(null, Font.BOLD, 15));
		month.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		month.setHorizontalAlignment(JLabel.CENTER);
		month.setBounds(0, 130, 70, 30);
		month.setVisible(false);
		month1 = new JLabel();
		month1.setFont(new Font(null, Font.BOLD, 15));
		month1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		month1.setHorizontalAlignment(JLabel.CENTER);
		month1.setBounds(0, 160, 70, 30);
		month1.setVisible(false);
		
		this.add(Date_Area_Label);
		this.add(Patient_Number);
		this.add(Select);
		this.add(month);
		this.add(month1);

	}
	
	class MyActionCommand implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				switch(e.getActionCommand()) {
				
					case "select":
						int num = Integer.parseInt(Patient_Number.getText());
						Selected_Data = control.Patient_Number(num);
						if(Selected_Data != null) {
							month1.setText(Integer.toString(Selected_Data.getMonth()));
							month.setVisible(true);
							month1.setVisible(true);
						}
						break;
				}
			}catch(NumberFormatException ex) {
				System.out.println("숫자를 입력");
			}
			
		}
		
	}
}
