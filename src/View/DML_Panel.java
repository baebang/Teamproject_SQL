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

public class DML_Panel extends JPanel{
	private JTextArea Patient_Number;
	private JButton Select;
	private JButton insert;
	private Data Selected_Data;
	private Control control;
	private JLabel month, data, people_num, contry, people_info, area, travel, contact, measures, status, route, registration_d, modified_d, exposure;
	private JLabel month1, data1, people_num1, contry1, people_info1, area1, travel1, contact1, measures1, status1, route1, registration_d1, modified_d1, exposure1;
	public DML_Panel(JFrame frame, Control control) {
		super();
		this.control = control;
		frame.getContentPane().add(this);
		panelInit(frame);
	}
	
	private void panelInit(JFrame frame) {
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 636, 440);//636 360
		this.setLayout(null);

		// 날짜 & 지역
		JLabel Date_Area_Label = new JLabel("Patient & Number");
		Date_Area_Label.setFont(new Font("Arial", Font.BOLD, 35));
		Date_Area_Label.setForeground(new Color(204, 051, 051));
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
		
		insert = new JButton("insert");
		insert.setBounds(550, 70, 80, 40);
		insert.setActionCommand("insert");
		insert.addActionListener(new MyActionCommand());
		
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
		
		data = new JLabel("확진 일");
		data.setFont(new Font(null, Font.BOLD, 15));
		data.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		data.setHorizontalAlignment(JLabel.CENTER);
		data.setBounds(70, 130, 70, 30);
		data.setVisible(false);
		data1 = new JLabel();
		data1.setFont(new Font(null, Font.BOLD, 15));
		data1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		data1.setHorizontalAlignment(JLabel.CENTER);
		data1.setBounds(70, 160, 70, 30);
		data1.setVisible(false);
		
		area = new JLabel("지역");
		area.setFont(new Font(null, Font.BOLD, 15));
		area.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		area.setHorizontalAlignment(JLabel.CENTER);
		area.setBounds(140, 130, 70, 30);
		area.setVisible(false);
		area1 = new JLabel();
		area1.setFont(new Font(null, Font.BOLD, 15));
		area1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		area1.setHorizontalAlignment(JLabel.CENTER);
		area1.setBounds(140, 160, 70, 30);
		area1.setVisible(false);
		
		status = new JLabel("상태");
		status.setFont(new Font(null, Font.BOLD, 15));
		status.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		status.setHorizontalAlignment(JLabel.CENTER);
		status.setBounds(210, 130, 70, 30);
		status.setVisible(false);
		status1 = new JLabel();
		status1.setFont(new Font(null, Font.BOLD, 15));
		status1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		status1.setHorizontalAlignment(JLabel.CENTER);
		status1.setBounds(210, 160, 70, 30);
		status1.setVisible(false);
		
		route = new JLabel("이동경로");
		route.setFont(new Font(null, Font.BOLD, 15));
		route.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		route.setHorizontalAlignment(JLabel.LEFT);
		route.setBounds(0, 190, 400, 30);
		route.setVisible(false);
		route1 = new JLabel();
		route1.setFont(new Font(null, Font.BOLD, 10));
		route1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		route1.setHorizontalAlignment(JLabel.LEFT);
		route1.setBounds(0, 220, 400, 30);
		route1.setVisible(false);
		
		travel = new JLabel("여행력");
		travel.setFont(new Font(null, Font.BOLD, 15));
		travel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		travel.setHorizontalAlignment(JLabel.LEFT);
		travel.setBounds(0, 250, 400, 30);
		travel.setVisible(false);
		travel1 = new JLabel();
		travel1.setFont(new Font(null, Font.BOLD, 10));
		travel1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		travel1.setHorizontalAlignment(JLabel.LEFT);
		travel1.setBounds(0, 280, 400, 30);
		travel1.setVisible(false);
		
		contact = new JLabel("접촉력");
		contact.setFont(new Font(null, Font.BOLD, 15));
		contact.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		contact.setHorizontalAlignment(JLabel.LEFT);
		contact.setBounds(0, 310, 400, 30);
		contact.setVisible(false);
		contact1 = new JLabel();
		contact1.setFont(new Font(null, Font.BOLD, 10));
		contact1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		contact1.setHorizontalAlignment(JLabel.LEFT);
		contact1.setBounds(0, 340, 400, 30);
		contact1.setVisible(false);
		
		
		this.add(Date_Area_Label);
		this.add(Patient_Number);
		this.add(Select);
		this.add(insert);
		this.add(month);
		this.add(month1);
		this.add(data);
		this.add(data1);
		this.add(area);
		this.add(area1);
		this.add(status);
		this.add(status1);
		this.add(route);
		this.add(route1);
		this.add(travel);
		this.add(travel1);
		this.add(contact);
		this.add(contact1);

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
							month1.setVisible(true);
							month.setVisible(true);
							
							data1.setText(Integer.toString(Selected_Data.getDate()));
							data1.setVisible(true);
							data.setVisible(true);
							
							area1.setText(Selected_Data.getArea());
							area1.setVisible(true);
							area.setVisible(true);
							
							status1.setText(Selected_Data.getStatus());
							status1.setVisible(true);
							status.setVisible(true);

							route1.setText(Selected_Data.getRoute());
							route1.setVisible(true);
							route.setVisible(true);
							
							travel1.setText(Selected_Data.getTravel());
							travel1.setVisible(true);
							travel.setVisible(true);
							
							contact1.setText(Selected_Data.getContact());
							contact1.setVisible(true);
							contact.setVisible(true);
							
						}
						
					case "insert":
						int num2 = Integer.parseInt(Patient_Number.getText());
						Selected_Data = control.Patient_Number(num2);
						if(Selected_Data != null) {
							month1.setText(Integer.toString(Selected_Data.getMonth()));
							month1.setVisible(true);
							month.setVisible(true);
							
							data1.setText(Integer.toString(Selected_Data.getDate()));
							data1.setVisible(true);
							data.setVisible(true);
							
							area1.setText(Selected_Data.getArea());
							area1.setVisible(true);
							area.setVisible(true);
							
							status1.setText(Selected_Data.getStatus());
							status1.setVisible(true);
							status.setVisible(true);

							route1.setText(Selected_Data.getRoute());
							route1.setVisible(true);
							route.setVisible(true);
							
							travel1.setText(Selected_Data.getTravel());
							travel1.setVisible(true);
							travel.setVisible(true);
							
							contact1.setText(Selected_Data.getContact());
							contact1.setVisible(true);
							contact.setVisible(true);
							
						}
						
						break;
				}
			}catch(NumberFormatException ex) {
				System.out.println("숫자를 입력");
			}
			
		}
		
	}
}
