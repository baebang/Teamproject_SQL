package View;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import Control.Control;
import Control.ReadCsv;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JComboBox<String> combo;
	private MainPanel main;
	public MainFrame() {
		Control control = new Control();
		main = new MainPanel(control);
		String[] month = {"1","2","3","4","5","6","7","8","9","10","11","12"};
		JButton btn = new JButton("data");
		combo = new JComboBox<>(month);
		
		btn.setActionCommand("data");
		
		btn.addActionListener(new MyActionListener());
		
		this.add(btn,BorderLayout.NORTH);
		this.add(combo, BorderLayout.SOUTH);
		
		
		
		this.add(main);
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			switch(e.getActionCommand()) {
			
			case "data":
				Control.dataSelect(combo.getSelectedItem());
				main.DataShow();
				break;
			}
		}
	}


}

