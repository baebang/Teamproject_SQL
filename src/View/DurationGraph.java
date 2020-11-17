package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class DurationGraph extends JPanel{
   private int[] num_Data;
   private int Start_Month, Start_Date, Max_data;
   private int[] Month_List = {31,29,31,30,31,30,31,31,30,31,30,31};
   
   public void getData(int[] data, int max) {
	   num_Data = data;
	   Max_data = max;
   }
   
   public void getDate(String Month, String date) {
	   Start_Month = Integer.parseInt(Month.substring(0, Month.length()-1));
	   Start_Date = Integer.parseInt(date.substring(0, date.length()-1));
   }

   @Override
   public void paintComponent(Graphics g) {
      
	   if(num_Data != null) {

			super.paintComponent(g);

			int x = 30;// 초기 x좌표

			for (int i = 0; i <= 14; i++) {
				// x축 기준라인
				if(Start_Date > Month_List[Start_Month-1]) Start_Date = 1;
				g.setColor(Color.BLACK);
				g.drawString(Start_Date + "일", x + 23, 230);
				
				g.drawString(Integer.toString(num_Data[i]), x + 33, (int)(12+(200-(200/(double)Max_data)*num_Data[i])));
				
				g.setColor(Color.PINK);
				g.fillRect(x + 30, (int)(15+(200-(200/(double)Max_data)*num_Data[i])), 17, (int)((200/(double)Max_data)*num_Data[i]));

				x += 30;
				Start_Date++;
			}

			x = 30; // 다시 x 초기 값으로 셋팅

			// y축 기준라인
			g.setColor(Color.BLACK);
			int y = 20;

			for (int i = 10; i >= 0; i--) {
				g.drawString(Integer.toString((int)(Max_data*(i/(double)10))), 17, y);
				g.drawLine(40, y-5, 45, y-5);
				y = y + 20;
			}
			g.drawLine(40, 15, 40, 215);

		}
   }

}