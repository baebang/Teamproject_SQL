package View;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	@Override
	public void paint(Graphics g) {
		g.drawRect(10, 20, 30, 40);
	}
}
