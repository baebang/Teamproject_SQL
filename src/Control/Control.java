package Control;

import java.util.ArrayList;

import Model.Data;

public class Control {
	
	private static ArrayList<Data> DataList, SelectedList;
	
	public Control() {
		ReadCsv csv = new ReadCsv();
		DBmanager dbm = new DBmanager();
		
		DataList = csv.LoadCSV();
		dbm.saveAll(DataList);
	}
	


	public ArrayList<Data> getSelectedList() {
		// TODO Auto-generated method stub
		return Control.SelectedList;
	}



	public Data Patient_Number(int num) {
		for(Data item : DataList) {
			if(item.getPeople_num() == num) return item;
		}
		return null;
	}
}
