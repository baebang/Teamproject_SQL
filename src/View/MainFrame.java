package View;

import javax.swing.JFrame;

import Control.ReadCsv;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	public MainFrame() {
		MainPanel main = new MainPanel();
		new ReadCsv();
		
		this.add(main);
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
