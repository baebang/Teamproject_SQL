package View;


import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InformationPanel extends JPanel{
   
   public InformationPanel(JFrame frame) {
      super();
      panelInit(frame);
   }
   
   private void panelInit(JFrame frame) {
         this.setBackground(new Color(255, 255, 255));
         this.setBounds(0, 0, 636, 440);
         frame.getContentPane().add(this);
         this.setLayout(null);
         
         
         JLabel information_Content1 = new JLabel("1. 환자 번호 조회: 환자 번호를 입력하면 해당 환자에 대한 정보를 보여줍니다");
         information_Content1.setFont(new Font("맑은고딕", Font.BOLD, 15));
         information_Content1.setForeground(new Color(0, 0, 0));
         information_Content1.setHorizontalAlignment(JLabel.CENTER);
         information_Content1.setBounds(30, 10, 600, 200);
         
         this.add(information_Content1);
         
         JLabel information_Content2 = new JLabel("2. 기간: 시작 날짜와 끝 날짜를 선택하면 해당하는 기간의 그래프와 ");
         information_Content2.setFont(new Font("맑은고딕", Font.BOLD, 15));
         information_Content2.setForeground(new Color(0, 0, 0));
         information_Content2.setHorizontalAlignment(JLabel.CENTER);
         information_Content2.setBounds(30, 40, 600, 200);
         
         this.add(information_Content2);
         

         JLabel information_Content2_2 = new JLabel("최고/최저 확진자 수를 보여줍니다.");
         information_Content2_2.setFont(new Font("맑은고딕", Font.BOLD, 15));
         information_Content2_2.setForeground(new Color(0, 0, 0));
         information_Content2_2.setHorizontalAlignment(JLabel.CENTER);
         information_Content2_2.setBounds(30, 70, 600, 200);
         
         this.add(information_Content2_2);
         
         JLabel information_Content3 = new JLabel("3. 지정 날짜: 특정 날짜를 선택하면 해당하는 날짜의 확진자 그래프를 보여줍니다.");
         information_Content3.setFont(new Font("맑은고딕", Font.BOLD, 15));
         information_Content3.setForeground(new Color(0, 0, 0));
         information_Content3.setHorizontalAlignment(JLabel.CENTER);
         information_Content3.setBounds(30, 100, 600, 200);
         
         this.add(information_Content3);
         
         
         JLabel information_Content4 = new JLabel("4. 구역별 최고/최저: 구역을 선택하면 해당 구역의 최고 최저 확진자를 보여줍니다.");
         information_Content4.setFont(new Font("맑은고딕", Font.BOLD, 15));
         information_Content4.setForeground(new Color(0, 0, 0));
         information_Content4.setHorizontalAlignment(JLabel.CENTER);
         information_Content4.setBounds(30, 130, 600, 200);
         
         this.add(information_Content4);
         
         JLabel information_Content5 = new JLabel("5. 지정 날짜: 날짜를 지정하면 해당 날짜에 대한 확진자 정보를 보여줍니다");
         information_Content5.setFont(new Font("맑은고딕", Font.BOLD, 15));
         information_Content5.setForeground(new Color(0, 0, 0));
         information_Content5.setHorizontalAlignment(JLabel.CENTER);
         information_Content5.setBounds(30, 160, 600, 200);
         
         this.add(information_Content5);
         
         JLabel information_Content6 = new JLabel("6. 데이터입력: 원하는 데이터를 입력할 수 있습니다.");
         information_Content6.setFont(new Font("맑은고딕", Font.BOLD, 15));
         information_Content6.setForeground(new Color(0, 0, 0));
         information_Content6.setHorizontalAlignment(JLabel.CENTER);
         information_Content6.setBounds(30, 190, 600, 200);
         
         this.add(information_Content6);

   }
}