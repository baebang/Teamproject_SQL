package View;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JPanel;

import Control.Control;
import Model.Data;

public class MainPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private Control control;
	private ArrayList<Data> SelectedList;
	
	public MainPanel(Control control) {
		this.control = control;
	}

	public void DataShow() {
		// TODO Auto-generated method stub
		SelectedList = control.getSelectedList();
		int count = SelectedList.size();
		for(Data list : SelectedList) {

			System.out.println(list.getPeople_num());
		}
	}
	
}
