package Control;

import java.util.ArrayList;

import Model.Data;

public class Control {
	
	private static ArrayList<Data> DataList, SelectedList;
	private int[] Month_List = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30};
	private int[] durationData;
	private int duration_Max;
	private DBmanager dbm;
	public Control() {
		ReadCsv csv = new ReadCsv();
		dbm = new DBmanager();
		
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
	
	public Data insert_filter(int people_num) {
		for(Data item : DataList) {
			if(item.getPeople_num() == people_num) {
				//중복값이 있을때 걸러주는 것 ★
				return null;
			}
			else {
				//중복값이 없을때 걸러주는 것★
				
			}
		}
		return null;
	}



	public int[] duration_filter(String month1, String date1) {
		String month = month1.substring(0, month1.length()-1);
		String date = date1.substring(0, date1.length()-1);
		durationData = new int[15];
		duration_Max = 0;
		for(int i=0; i<15; i++) {
			
			String sql = "Select Count(num) from sqldata where MONTH = " + month + " AND DATE = " + date + ";";
			durationData[i] = dbm.LoadData(sql);
			
			date = Integer.toString(Integer.parseInt(date) + 1);
			
			//일 수가 넘어가면 다음 달 1일로 만듭니다.
			if(Integer.parseInt(date) > Month_List[Integer.parseInt(month)]) {
				month = Integer.toString(Integer.parseInt(month) + 1);
				date = "1";
			}
			
		}
		
		for(int i: durationData) duration_Max = Math.max(duration_Max, i);
		return durationData;
	}
	
	public int selected_filter(String month1, String date1) {
		
		String month = month1.substring(0, month1.length()-1);
		String date = date1.substring(0, date1.length()-1);		
		
		String sql = "Select Count(num) from sqldata where MONTH = " + month + " AND DATE = " + date + ";";
		int selected_data = dbm.LoadData(sql);	
		duration_Max = selected_data;
		
		return selected_data;
	}
	
	
	
	
	public int getMax() {
		return duration_Max;
	}
	
	public int[][] Person_Area_filter(String Area) {
		String sql = "select count(num), month "
				+ " from sqldata"
				+ " where area = '" + Area + "'"
				+ " group by month;";
		int[][] Month_Count = dbm.LoadAreaData(sql);	
		
		return Month_Count;
	}
}
