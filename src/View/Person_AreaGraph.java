package View;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Person_AreaGraph extends JPanel {
   
   // 초기 샘플 데이터
   private int[][] Month_Count;


   @Override
   public void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (Month_Count != null) {
			// x축 기준라인 : MAX
			g.setColor(Color.BLACK);// 글자
			g.drawString("최고 확진자 발생: "+Month_Count[0][0]+" 월", 135, 230);
			g.setColor(new Color(153, 204, 255));
			g.fillRect(145, 15, 100, 200);
			g.drawString(Integer.toString(Month_Count[0][1]), 185, 12);

			// x축 기준라인 : MIN
			g.setColor(Color.BLACK);// 글자
			g.drawString("최저 확진자 발생: "+Month_Count[1][0]+" 월", 270, 230);
			g.setColor(new Color(153, 204, 255));
			g.fillRect(270, (int)(15+(200-(200/(double)Month_Count[0][1])*Month_Count[1][1])), 100, (int)((200/(double)Month_Count[0][1])*Month_Count[1][1]));
			g.drawString(Integer.toString(Month_Count[1][1]), 320, (int)(12+(200-(200/(double)Month_Count[0][1])*Month_Count[1][1])));
			
			// y축 기준라인
			g.setColor(Color.BLACK);
			int y = 20;

			for (int i = 10; i >= 0; i--) {
				g.drawString(Integer.toString((int)(Month_Count[0][1]*(i/(double)10))), 17, y);
				g.drawLine(40, y-5, 45, y-5);
				y = y + 20;
			}
			g.drawLine(40, 15, 40, 215);
		}
   }

	public void getData(int[][] month_Count) {
		this.Month_Count = month_Count;
	}

}