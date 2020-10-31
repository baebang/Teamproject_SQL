package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Control.Control;
import Model.Data;

public class MainPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JComboBox<String> combo;
	private MainPanel main;
	
	private Control control;
	private ArrayList<Data> SelectedList;
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public MainPanel(JFrame frame) {
		super();
		
		panelInit(frame);
//		DataShow();
		
	}
	
	private void panelInit(JFrame frame) {
		Control control = new Control();
//		main = new MainPanel(control);
		String[] month = {"1","2","3","4","5","6","7","8","9","10","11","12"};
		JButton btn = new JButton("data");
		combo = new JComboBox<>(month);
		
		btn.setActionCommand("data");
		
		btn.addActionListener(new MyActionListener());
		
		this.add(btn,BorderLayout.NORTH);
		this.add(combo, BorderLayout.SOUTH);
		
		
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 636, 360);
		frame.getContentPane().add(this);
		this.setLayout(null);

		// 인원 & 지역 화면
		JLabel Main_NewLabel = new JLabel("Main");
		Main_NewLabel.setFont(new Font("Arial", Font.BOLD, 35));
		Main_NewLabel.setForeground(new Color(0, 35, 110));
		Main_NewLabel.setHorizontalAlignment(JLabel.CENTER);
		Main_NewLabel.setBounds(70, 5, 500, 40);
		
		this.add(Main_NewLabel);
	}

	public void DataShow() {
		// TODO Auto-generated method stub
		SelectedList = control.getSelectedList();
		int count = SelectedList.size();
		for(Data list : SelectedList) {

			System.out.println(list.getPeople_num());
		}
	}
	
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			switch(e.getActionCommand()) {
			
			case "data":
				Control.dataSelect(combo.getSelectedItem());
				main.DataShow();
				break;
			}
		}
	}
	
}
