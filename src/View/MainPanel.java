package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
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
	
	private MainGraph Graphpanel;
	private JComboBox main_month, main_date, AreaBox;
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public MainPanel(JFrame frame) {
		super();
		
		panelInit(frame);
	    graphInit();
//		DataShow();
		
	}
	
	private void panelInit(JFrame frame) {
//		Control control = new Control();
//		main = new MainPanel(control);
//		String[] month = {"1","2","3","4","5","6","7","8","9","10","11","12"};
//		JButton btn = new JButton("data");
//		combo = new JComboBox<>(month);
//		
//		btn.setActionCommand("data");
//		
//		btn.addActionListener(new MyActionListener());
//		
//		this.add(btn,BorderLayout.NORTH);
//		this.add(combo, BorderLayout.SOUTH);
		
		
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 636, 440);
		frame.getContentPane().add(this);
		this.setLayout(null);

		// 인원 & 지역 화면
		JLabel Main_NewLabel = new JLabel("Main");
		Main_NewLabel.setFont(new Font("Arial", Font.BOLD, 35));
		Main_NewLabel.setForeground(new Color(0, 35, 110));
		Main_NewLabel.setHorizontalAlignment(JLabel.CENTER);
		Main_NewLabel.setBounds(70, 5, 500, 40);
		
		this.add(Main_NewLabel);
		
	    JLabel lblDay = new JLabel("날짜 입력");
	    lblDay.setBounds(40, 70, 57, 15);
	    this.add(lblDay);

	    // 월
	    String MonthList[] = new String[12];
	    for (int m = 1; m < 13; m++) {
	    	MonthList[m - 1] = Integer.toString(m) + "월";
	    }

	    main_month = new JComboBox(MonthList);
	    main_month.setBounds(96, 66, 116, 21);
	    main_month.setSize(new Dimension(55, 20));
	    this.add(main_month);

	    // 날짜 리스트
	    String DateList[] = new String[31];
	    for (int d = 1; d < 32; d++) {
	       DateList[d - 1] = Integer.toString(d) + "일";
	    }

	    // 일
	    main_date = new JComboBox(DateList);
	    main_date.setBounds(155, 66, 116, 21);
	    main_date.setSize(new Dimension(55, 20));
	    this.add(main_date);

	    JLabel lblSerch = new JLabel("지역 검색");
	    lblSerch.setBounds(224, 70, 57, 15);
	    this.add(lblSerch);

	    // sample list
	    String Arealist[] = { "강남구", "강남대로", "강동구", "강변북로", "강북구", "강서구", "공항대로", "관악구", "광진구", "구로구", "금천구",
	     "노원구", "도봉구", "도산대로", "동대문구", "동작구", "동작대로", "마포구", "서대문구", "서초구", "성동구", "성북구", "송파구", "신촌로", "양천구", "영등포구", "영등포로",
	     "용산구", "은평구", "정릉로", "종로", "종로구", "중구", "중랑구", "천호대로", "청계천로", "한강대로", "홍릉로", "화랑로" };
	 
	    AreaBox = new JComboBox(Arealist);
	    AreaBox.setBounds(280, 66, 116, 19);
	    this.add(AreaBox);
	      

	    JButton btnApply = new JButton("날짜 적용");
	    btnApply.setBounds(454, 63, 126, 23);
	    this.add(btnApply);
	}


//	public void DataShow() {
//		// TODO Auto-generated method stub
//		SelectedList = control.getSelectedList();
//		int count = SelectedList.size();
//		for(Data list : SelectedList) {
//
//			System.out.println(list.getPeople_num());
//		}
//	}
//	
//	class MyActionListener implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			switch(e.getActionCommand()) {
//			
//			case "data":
//				Control.dataSelect(combo.getSelectedItem());
//				main.DataShow();
//				break;
//			}
//		}
//	}
	
	   private void graphInit() {
		      Graphpanel = new MainGraph();
		      Graphpanel.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
		      Graphpanel.setBackground(Color.white);
		      Graphpanel.setBounds(60, 110, 510, 214);
		      this.add(Graphpanel);
		   }
	
}
