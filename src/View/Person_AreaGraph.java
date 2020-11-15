package View;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Person_AreaGraph extends JPanel {
   
   // 초기 샘플 데이터
   private int Max_data = 75;
   private int Min_data = 25;

   public void Max_data(int x) {
      this.Max_data = x;
   }
   
   public void Min_data(int x) {
      this.Min_data = x;
   }

   @Override
   public void paintComponent(Graphics g) {
      super.paintComponent(g);

      // x축 기준라인 : MAX
      g.setColor(Color.BLACK);// 글자
      g.drawString("최고 확진자", 165, 230);
      g.setColor(new Color(153, 204, 255));
      g.fillRect(145, 215 - Max_data * 2, 100, Max_data * 2);
      
      // x축 기준라인 : MIN
      g.setColor(Color.BLACK);// 글자
      g.drawString("최저 확진자", 290, 230);
      g.setColor(new Color(153, 204, 255));
      g.fillRect(270, 215 - Min_data * 2, 100, Min_data * 2);


      // y축 기준라인
      String[] standard = { "90", "80", "70", "60", "50", "40", "30", "20", "10" };

      g.setColor(Color.BLACK);
      g.drawString("100", 15, 20);
      g.setColor(Color.BLACK);
      g.drawString("0", 24, 220);

      g.setColor(Color.BLACK);
      int y = 40;

      for (int i = 0; i <= 8; i++) {
         g.drawString(standard[i], 20, y);
         y = y + 20;
      }

      g.drawLine(40, 10, 40, 220);

      int xx = 12;
      for (int i = 0; i <= 10; i++) {
         g.drawLine(40, xx, 45, xx);
         xx = xx + 23;
      }

   }

}