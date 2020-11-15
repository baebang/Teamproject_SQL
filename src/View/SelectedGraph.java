package View;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class SelectedGraph extends JPanel {

   // 초기 샘플 데이터
   private int Max_data = 75;

   public void Max_data(int x) {
      this.Max_data = x;
   }

   @Override
   public void paintComponent(Graphics g) {
      super.paintComponent(g);

      // x축 기준라인
      g.setColor(Color.BLACK);// 글자
      g.drawString("최고 확진자", 245, 230);
      g.setColor(new Color(153, 204, 255));
      g.fillRect(220, 215 - Max_data * 2, 100, Max_data * 2);


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