package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Control.Control;

public class Person_AreaPanel extends JPanel {

   private Person_AreaGraph person_AreaGraph;
   private JComboBox AreaBox;
   private String Area;
   private Control control;

   public Person_AreaPanel(JFrame frame, Control control) {
      super();
      panelInit(frame);
      this.control = control;
      person_AreaGraph = new Person_AreaGraph();
      person_AreaGraph.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
      person_AreaGraph.setBackground(Color.white);
      person_AreaGraph.setBounds(60, 110, 510, 240);
      this.add(person_AreaGraph);
   }

   private void panelInit(JFrame frame) {
      this.setBackground(new Color(255, 255, 255));
      this.setBounds(0, 0, 636, 440);
      frame.getContentPane().add(this);
      this.setLayout(null);

      // 인원 & 지역 화면
      JLabel Person_Area_NewLabel = new JLabel("Person & Area");
      Person_Area_NewLabel.setFont(new Font("Arial", Font.BOLD, 35));
      Person_Area_NewLabel.setForeground(new Color(204, 051, 051));
      Person_Area_NewLabel.setHorizontalAlignment(JLabel.CENTER);
      Person_Area_NewLabel.setBounds(70, 5, 500, 40);

      JLabel lblSerch = new JLabel("지역 검색");
      lblSerch.setBounds(70, 70, 57, 15);
      this.add(lblSerch);

      // sample list
      String Arealist[] = { "강남구", "강동구", "강북구", "강서구", "관악구", "광진구", "구로구", "금천구", "노원구",
            "도봉구", "동대문구", "동작구", "마포구", "서대문구", "서초구", "성동구", "성북구", "송파구", "신촌로", "양천구", "영등포구",
            "용산구", "은평구", "정릉로", "종로", "종로구", "중구", "중랑구"};

      AreaBox = new JComboBox(Arealist);
      AreaBox.setBounds(136, 68, 116, 19);
      this.add(AreaBox);

      JButton btnApply = new JButton("확인");
      btnApply.setActionCommand("확인");
      btnApply.addActionListener(new MyActionListener());
      btnApply.setBounds(454, 65, 120, 23);
      this.add(btnApply);

      this.add(Person_Area_NewLabel);
   }

   class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			switch(e.getActionCommand()) {
			case "확인":
				Area = (String) AreaBox.getSelectedItem();
				int[][] Month_Count = control.Person_Area_filter(Area);
				person_AreaGraph.getData(Month_Count);
				person_AreaGraph.repaint();
				break;
			}

		}
	   
   }

}