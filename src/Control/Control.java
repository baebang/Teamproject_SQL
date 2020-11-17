package Control;

import java.util.ArrayList;

import Model.Data;

public class Control {
	
	private static ArrayList<Data> DataList, SelectedList;
	private int[] Month_List = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30};
	private int[] durationData;
	private int duration_Max;
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
	

	



	public int[] duration_filter(String month, String date) {
		
		SelectedList = new ArrayList<>();
		durationData = new int[15];
		duration_Max = 0;
		int filter_sum=0;
		
		//filter 의 month와 date 값을 0 ~ 365일의 값으로 수치화한다.
		for(int i=1; i<Month_List.length; i++) {
			if(i >= Integer.parseInt(month.substring(0, month.length()-1))) break;
			else filter_sum += Month_List[i];
		}
		filter_sum += Integer.parseInt(date.substring(0, date.length()-1));
		
		int item_sum;
		for(Data item : DataList) {
			item_sum = 0;
			for(int i=1; i<Month_List.length; i++) {
				if(i >= item.getMonth()) break;
				else item_sum += Month_List[i];
			}
			item_sum += item.getDate();
			
			if(filter_sum <= item_sum && filter_sum+15 > item_sum) {
				durationData[item_sum-filter_sum]++;
			}
		}
		
		for(int i: durationData) duration_Max = Math.max(duration_Max, i);
		
		return durationData;
	}
	
	public int[] selected_filter(String month, String date) {
		
		SelectedList = new ArrayList<>();
		durationData = new int[15];
		duration_Max = 0;
		int filter_sum=0;
		
		//filter 의 month와 date 값을 0 ~ 365일의 값으로 수치화한다.
		for(int i=1; i<Month_List.length; i++) {
			if(i >= Integer.parseInt(month.substring(0, month.length()-1))) break;
			else filter_sum += Month_List[i];
		}
		filter_sum += Integer.parseInt(date.substring(0, date.length()-1));
		
		int item_sum;
		for(Data item : DataList) {
			item_sum = 0;
			for(int i=1; i<Month_List.length; i++) {
				if(i >= item.getMonth()) break;
				else item_sum += Month_List[i];
			}
			item_sum += item.getDate();
			
			if(filter_sum == item_sum && filter_sum+15 > item_sum) {
				durationData[item_sum-filter_sum]++;
			}
		}
		
		for(int i: durationData) duration_Max = Math.max(duration_Max, i);
		
		return durationData;
	}
	public int getMax() {
		return duration_Max;
	}
}
