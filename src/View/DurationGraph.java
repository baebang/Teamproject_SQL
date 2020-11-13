package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class DurationGraph extends JPanel{
   
   private int []num_Data = {0, 0, 0, 0, 0, 0, 0 ,0 , 0, 0, 0, 0, 0, 0, 0};
   
      public DurationGraph() {
            super();
            num_Data = new int[15];
      }

   @Override
   public void paintComponent(Graphics g) {
      
//	  ������ ���Ƿ� ����
      int []num_Data = { 30, 25, 40, 55, 65, 70, 80 ,10 , 60, 30, 40, 30, 10, 70, 80 };
   
      super.paintComponent(g);

      int x = 30;// �ʱ� x��ǥ

      for (int i = 0; i <= 14; i++) {
         // x�� ���ض���
         g.setColor(Color.BLACK);
         g.drawString(i + 1 +"��", x + 23, 230);
         
         g.setColor(Color.PINK);
           g.fillRect(x + 30, 215 - num_Data[i] * 2 , 17, num_Data[i] * 2);
            
           x += 30;
      }      
      
      x = 30; // �ٽ� x �ʱ� ������ ����
      
      
      // y�� ���ض��� 
         String [] standard= {"90","80","70","60","50","40","30","20","10"};
         
         g.setColor(Color.BLACK);   
         g.drawString("100", 15, 20); 
         g.setColor(Color.BLACK);   
         g.drawString("0", 24, 220);
         
         g.setColor(Color.BLACK);
         int y = 40;
         
         for(int i = 0; i <= 8; i++) {
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