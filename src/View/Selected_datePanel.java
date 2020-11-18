package View;

import java.awt.Color;
import java.awt.Dimension;
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
import View.DurationPanel.MyActionListener;


public class Selected_datePanel extends JPanel{
   
   private SelectedGraph selected_Graph;
   private JComboBox selected_month, selected_date;
   private Control control;
   private int selected_Data;
   
   public Selected_datePanel(JFrame frame, Control control) {
      super();
      panelInit(frame);
      this.control = control;
      selected_Graph = new SelectedGraph();
      selected_Graph.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
      selected_Graph.setBackground(Color.white);
      selected_Graph.setBounds(60, 110, 510, 240);
		this.add(selected_Graph);
		
   }
   
   private void panelInit(JFrame frame) {
      this.setBackground(new Color(255, 255, 255));
      this.setBounds(0, 0, 636, 440);
      frame.getContentPane().add(this);
      this.setLayout(null);

      // 지정날짜
      JLabel Selected_date_NewLabel = new JLabel("Selected date");
      Selected_date_NewLabel.setFont(new Font("Arial", Font.BOLD, 35));
      Selected_date_NewLabel.setForeground(new Color(204, 051, 051));
      Selected_date_NewLabel.setHorizontalAlignment(JLabel.CENTER);
      Selected_date_NewLabel.setBounds(70, 5, 500, 40);
      
      this.add(Selected_date_NewLabel);
      
      JLabel lblDay = new JLabel("날짜 입력");
       lblDay.setBounds(50, 70, 57, 15);
       this.add(lblDay);

       // 월
       String MonthList[] = new String[12];
       for (int m = 1; m < 13; m++) {
          MonthList[m - 1] = Integer.toString(m) + "월";
       }

       selected_month = new JComboBox(MonthList);
       selected_month.setBounds(106, 66, 116, 21);
       selected_month.setSize(new Dimension(55, 20));
       this.add(selected_month);

       // 날짜 리스트
       String DateList[] = new String[31];
       for (int d = 1; d < 32; d++) {
          DateList[d - 1] = Integer.toString(d) + "일";
       }

       // 일
       selected_date = new JComboBox(DateList);
       selected_date.setBounds(175, 66, 116, 21);
       selected_date.setSize(new Dimension(55, 20));
       this.add(selected_date);
       
      JLabel selected_Imp = new JLabel("현재 최고 최저 그래프");
      selected_Imp.setBounds(250, 70, 200, 15);
      selected_Imp.setForeground(new Color(255, 255, 255));
       this.add(selected_Imp);
         
       JButton btnApply = new JButton("확인");
       btnApply.setBounds(454, 65, 120, 23);
       btnApply.setActionCommand("확인");
       btnApply.addActionListener(new MyActionListener());
       this.add(btnApply);
   }
   
   class MyActionListener implements ActionListener{
   	private String Month, date;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			switch(e.getActionCommand()) {
			
				case "확인":
					
					Month = (String) selected_month.getSelectedItem();
					date = (String) selected_date.getSelectedItem();
					selected_Data = control.selected_filter(Month, date);
					selected_Graph.getData(selected_Data, control.getMax());
					selected_Graph.getDate(Month, date);
					selected_Graph.repaint();
					break;
			}
		}
     }
}


