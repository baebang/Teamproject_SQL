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

public class DurationPanel extends JPanel{
   
   private DurationGraph duration_Graph;
   private JComboBox duration_month, duration_date;
   private Control control;
   private int[] duration_Data;
   
   public DurationPanel(JFrame frame, Control control) {
		super();
		panelInit(frame);
		this.control = control;
		duration_Graph = new DurationGraph();
		duration_Graph.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
		duration_Graph.setBackground(Color.white);
		duration_Graph.setBounds(60, 110, 510, 240);
		this.add(duration_Graph);
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
      
      JLabel lblDay = new JLabel("날짜 입력");
       lblDay.setBounds(50, 70, 57, 15);
       this.add(lblDay);

       // 월
       String MonthList[] = new String[12];
       for (int m = 1; m < 13; m++) {
          MonthList[m - 1] = Integer.toString(m) + "월";
       }

       duration_month = new JComboBox(MonthList);
       duration_month.setBounds(106, 66, 116, 21);
       duration_month.setSize(new Dimension(55, 20));
       this.add(duration_month);

       // 날짜 리스트
       String DateList[] = new String[31];
       for (int d = 1; d < 32; d++) {
          DateList[d - 1] = Integer.toString(d) + "일";
       }

       
       duration_date = new JComboBox(DateList);
       duration_date.setBounds(175, 66, 116, 21);
       duration_date.setSize(new Dimension(55, 20));
       this.add(duration_date);
       
      JLabel Duration_Imp = new JLabel("입력 날짜의 + 15일 기록 출력");
      Duration_Imp.setBounds(250, 70, 200, 15);
      Duration_Imp.setForeground(new Color(0, 35, 110));
       this.add(Duration_Imp);
         
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
					
					Month = (String) duration_month.getSelectedItem();
					date = (String) duration_date.getSelectedItem();
					duration_Data = control.duration_filter(Month, date);
					duration_Graph.getData(duration_Data, control.getMax());
					duration_Graph.getDate(Month, date);
					duration_Graph.repaint();
			}
		}
      }
}