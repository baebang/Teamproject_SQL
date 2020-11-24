package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Control.Control;
import Model.Data;

public class DML_Panel extends JPanel{
	private JTextArea Patient_Number, month_t,data_t,area_t, status_t, people_info_t, route_t, travel_t, contact_t;
	private JButton Select, insert, update, confirm, cancel;
	private Data Selected_Data, insert_Data;
	private Control control;
	private JLabel month, data, people_num, contry, people_info, area, travel, contact, measures, status, route, registration_d, modified_d, exposure;
	private JLabel month1, data1, people_num1, contry1, people_info1, area1, travel1, contact1, measures1, status1, route1, registration_d1, modified_d1, exposure1;
	private JFrame frame;
	private JPanel thispanel;
	private int maxnum = 0;
	private int maxPnum = 0;
	public DML_Panel(JFrame frame, Control control) {
		super();
		this.frame = frame;
		thispanel = this;
		this.control = control;
		frame.getContentPane().add(this);
		panelInit(frame);
	}
	
	private void panelInit(JFrame frame) {
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 636, 440);//636 360
		this.setLayout(null);

		// 날짜 & 지역
		JLabel Date_Area_Label = new JLabel("hello");
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
		
		update = new JButton("update");
		update.setBounds(550, 70, 80, 40);
		update.setActionCommand("update");
		update.addActionListener(new MyActionCommand());
		update.setVisible(false);
		
		confirm = new JButton("confirm");
		confirm.setBounds(550, 70, 80, 40);
		confirm.setActionCommand("confirm");
		confirm.addActionListener(new MyActionCommand());
		confirm.setVisible(false);
		
		cancel = new JButton("cancel");
		cancel.setBounds(550, 110, 80, 40);
		cancel.setActionCommand("cancel");
		cancel.addActionListener(new MyActionCommand());
		cancel.setVisible(false);
		
		
		month = new JLabel("확진 월");
		month.setFont(new Font(null, Font.BOLD, 15));
		month.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		month.setHorizontalAlignment(JLabel.CENTER);
		month.setBounds(0, 130, 70, 30);
		month_t = new JTextArea();
		month_t.setFont(new Font(null, Font.BOLD, 15));
		month_t.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		month_t.setBounds(0, 160, 70, 30);
		month.setVisible(false);
		month_t.setVisible(false);
		
		data = new JLabel("확진 일");
		data.setFont(new Font(null, Font.BOLD, 15));
		data.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		data.setHorizontalAlignment(JLabel.CENTER);
		data.setBounds(70, 130, 70, 30);
		data.setVisible(false);
		data_t = new JTextArea();
		data_t.setFont(new Font(null, Font.BOLD, 15));
		data_t.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		data_t.setBounds(70, 160, 70, 30);
		data_t.setVisible(false);

		
		
		area = new JLabel("지역");
		area.setFont(new Font(null, Font.BOLD, 15));
		area.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		area.setHorizontalAlignment(JLabel.CENTER);
		area.setBounds(140, 130, 70, 30);
		area.setVisible(false);
		area_t = new JTextArea();
		area_t.setFont(new Font(null, Font.BOLD, 15));
		area_t.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		area_t.setBounds(140, 160, 70, 30);
		area_t.setVisible(false);

		
		status = new JLabel("상태");
		status.setFont(new Font(null, Font.BOLD, 15));
		status.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		status.setHorizontalAlignment(JLabel.CENTER);
		status.setBounds(210, 130, 70, 30);
		status.setVisible(false);
		status_t = new JTextArea();
		status_t.setFont(new Font(null, Font.BOLD, 15));
		status_t.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		status_t.setBounds(210, 160, 70, 30);
		status_t.setVisible(false);

		
		route = new JLabel("이동경로");
		route.setFont(new Font(null, Font.BOLD, 15));
		route.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		route.setHorizontalAlignment(JLabel.LEFT);
		route.setBounds(0, 190, 400, 30);
		route.setVisible(false);
		route_t = new JTextArea();
		route_t.setFont(new Font(null, Font.BOLD, 15));
		route_t.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		route_t.setBounds(0, 220, 400, 30);
		route_t.setVisible(false);

		
		travel = new JLabel("여행력");
		travel.setFont(new Font(null, Font.BOLD, 15));
		travel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		travel.setHorizontalAlignment(JLabel.LEFT);
		travel.setBounds(0, 250, 400, 30);
		travel.setVisible(false);
		travel_t = new JTextArea();
		travel_t.setFont(new Font(null, Font.BOLD, 15));
		travel_t.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		travel_t.setBounds(0, 280, 400, 30);
		travel_t.setVisible(false);

		
		contact = new JLabel("접촉력");
		contact.setFont(new Font(null, Font.BOLD, 15));
		contact.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		contact.setHorizontalAlignment(JLabel.LEFT);
		contact.setBounds(0, 310, 400, 30);
		contact.setVisible(false);
		contact_t = new JTextArea();
		contact_t.setFont(new Font(null, Font.BOLD, 15));
		contact_t.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		contact_t.setBounds(0, 340, 400, 30);
		contact_t.setVisible(false);

		
		
		this.add(Date_Area_Label);
		this.add(Patient_Number);
		this.add(Select);
		this.add(insert);
		this.add(update);
		this.add(confirm);
		this.add(cancel);
		this.add(month);
		this.add(month_t);
		this.add(data);
		this.add(data_t);
		this.add(area);
		this.add(area_t);
		this.add(status);
		this.add(status_t);
		this.add(route);
		this.add(route_t);
		this.add(travel);
		this.add(travel_t);
		this.add(contact);
		this.add(contact_t);
		

	}
	
	class MyActionCommand implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				switch(e.getActionCommand()) {
				
					case "select":
						int num = Integer.parseInt(Patient_Number.getText());
						Selected_Data = control.Patient_Number(num);
						if(Selected_Data.getNum() != 0) {

							month_t.setText(Integer.toString(Selected_Data.getMonth()));
							data_t.setText(Integer.toString(Selected_Data.getDate()));
							status_t.setText(Selected_Data.getStatus());
							area_t.setText(Selected_Data.getArea());
							route_t.setText(Selected_Data.getRoute());
							travel_t.setText(Selected_Data.getTravel());
							contact_t.setText(Selected_Data.getContact());
							
							
							month.setVisible(true);
							month_t.setVisible(true);

							data.setVisible(true);
							data_t.setVisible(true);
							
							area.setVisible(true);
							area_t.setVisible(true);						
	
							status.setVisible(true);
							status_t.setVisible(true);
							
							route.setVisible(true);
							route_t.setVisible(true);							
							
							travel.setVisible(true);
							travel_t.setVisible(true);							
							
							contact.setVisible(true);
							contact_t.setVisible(true);
							
							insert.setVisible(false);
							update.setVisible(true);
							cancel.setVisible(true);
							
						}else {
							JOptionPane.showMessageDialog(null, "환자번호를 찾을 수 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
							thispanel.removeAll();
							panelInit(frame);
							thispanel.repaint();
						}
						break;
					case "insert":
						maxnum = control.getMaxPrimaryKey()+1;
						maxPnum = control.getMaxpeopleNum()+1;
						
						Patient_Number.setText(Integer.toString(maxPnum));
						Patient_Number.setEnabled(false);
						
						month.setVisible(true);
						month_t.setVisible(true);

						data.setVisible(true);
						data_t.setVisible(true);
						
						area.setVisible(true);
						area_t.setVisible(true);						

						status.setVisible(true);
						status_t.setVisible(true);
						
						route.setVisible(true);
						route_t.setVisible(true);							
						
						travel.setVisible(true);
						travel_t.setVisible(true);							
						
						contact.setVisible(true);
						contact_t.setVisible(true);
						
						insert.setVisible(false);
						confirm.setVisible(true);
						cancel.setVisible(true);
						
						break;
						
					case "update":
						Data Update_item = Selected_Data;
						Update_item.setMonth(Integer.parseInt(month_t.getText()));
						Update_item.setDate(Integer.parseInt(data_t.getText()));
						Update_item.setStatus(status_t.getText());
						Update_item.setArea(area_t.getText());
						Update_item.setRoute(route_t.getText());
						Update_item.setTravel(travel_t.getText());
						Update_item.setContact(contact_t.getText());
						
						int update_result = control.Update_Data(Update_item);
						if(update_result == 1) { // 성공이면
							JOptionPane.showMessageDialog(null, "DB에 반영되었습니다");
							thispanel.removeAll();
							panelInit(frame);
							thispanel.repaint();
						}else {
							JOptionPane.showMessageDialog(null, "숫자를 입력해주세요.", "경고", JOptionPane.WARNING_MESSAGE);
						}
						
						break;
						
					case "confirm":
						Data insert_item = new Data();
						
						insert_item.setNum(maxnum);
						insert_item.setPeople_num(maxPnum);
						
						insert_item.setMonth(Integer.parseInt(month_t.getText()));
						insert_item.setDate(Integer.parseInt(data_t.getText()));
						insert_item.setStatus(status_t.getText());
						insert_item.setArea(area_t.getText());
						insert_item.setRoute(route_t.getText());
						insert_item.setTravel(travel_t.getText());
						insert_item.setContact(contact_t.getText());
						
						insert_item.setContry("");
						insert_item.setPeople_info("");
						insert_item.setMeasures("");
						insert_item.setRegistration_d("");
						insert_item.setModified_d("");
						insert_item.setExposure("");
						
						control.insert_Data(insert_item);
						JOptionPane.showMessageDialog(null, "DB에 반영되었습니다");
						thispanel.removeAll();
						panelInit(frame);
						thispanel.repaint();
						
						break;
					case "cancel":
						thispanel.removeAll();
						panelInit(frame);
						thispanel.repaint();
						break;
				}
			}catch(NumberFormatException ex) {
			
			}
			
		}
		
	}
}
