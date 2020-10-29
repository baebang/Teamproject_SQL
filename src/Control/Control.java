package Control;

import java.util.ArrayList;

import Model.Data;

public class Control {
	
	private static ArrayList<Data> DataList;
	private static ArrayList<Data> SelectedList;
	
	public Control() {
		ReadCsv csv = new ReadCsv();
		DBmanager dbm = new DBmanager();
		
		DataList = csv.LoadCSV();
		dbm.saveAll(DataList);
	}
	
	public static void dataSelect(Object selectedItem) {
		String selected = (String) selectedItem;
		SelectedList = new ArrayList<>();
		for(Data item : DataList) {
			if(item.getMonth() == Integer.parseInt(selected)) {
				SelectedList.add(item);
				System.out.println(item.getArea());
			}
		}
		
		System.out.println(SelectedList.size());
		
	}

	public ArrayList<Data> getSelectedList() {
		// TODO Auto-generated method stub
		return Control.SelectedList;
	}
}
