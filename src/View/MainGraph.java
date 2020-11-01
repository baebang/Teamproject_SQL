package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainGraph extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// 아래 기준라인
		g.setColor(Color.BLACK);// 글자
		g.drawString("0", 80, 210);// 내용 x y 80, y+140 기준
		g.setColor(Color.BLACK);
		g.drawString("10", 105, 210);
		g.setColor(Color.BLACK);
		g.drawString("20", 138, 210);
		g.setColor(Color.BLACK);
		g.drawString("30", 170, 210);
		g.setColor(Color.BLACK);
		g.drawString("40", 200, 210);
		g.setColor(Color.BLACK);
		g.drawString("50", 233, 210);
		g.setColor(Color.BLACK);
		g.drawString("60", 266, 210);
		g.setColor(Color.BLACK);
		g.drawString("70", 300, 210);
		g.setColor(Color.BLACK);
		g.drawString("80", 330, 210);
		g.setColor(Color.BLACK);
		g.drawString("90", 360, 210);
		g.setColor(Color.BLACK);
		g.drawString("100", 390, 210);

		g.drawLine(80, 195, 400, 195);

		int xx = 80;
		for (int i = 0; i <= 10; i++) {
			g.drawLine(xx, 190, xx, 195);
			xx = xx + 32;
		}
	}
}
