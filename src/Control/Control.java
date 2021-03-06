package Control;

import java.util.ArrayList;

import javax.swing.JButton;

//import javax.swing.JButton;

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
		String sql = "select * from sqldata where people_num = " + num + ";";
		Data item = dbm.Load(sql);
		if(item != null) return item;
		else return null;
	}
	
//	public JButton insert_Data(int people_num,int month) {
//		String sql = "UPDATE sqldata SET month=" + month + " WHERE people_num= "+ people_num+";";
//		dbm.LoadData(sql);
//		return null;
//	}
		



	public int[] duration_filter(String month1, String date1) {
		String month = month1.substring(0, month1.length()-1);
		String date = date1.substring(0, date1.length()-1);
		durationData = new int[15];
		duration_Max = 0;
		for(int i=0; i<15; i++) {
			
			String sql = "Select Count(num) as num from sqldata where MONTH = " + month + " AND DATE = " + date + ";";
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
		
		String sql = "Select Count(num) as num from sqldata where MONTH = " + month + " AND DATE = " + date + ";";
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



	public int Update_Data(Data item) {
		return dbm.Update(item);
	}



	public int getMaxPrimaryKey() {
		String sql = "select Max(num) as num from sqldata;";
		int maxnum = dbm.LoadData(sql);
		return maxnum;
	}



	public int getMaxpeopleNum() {
		String sql = "select Max(people_num) as num from sqldata;";
		int maxpnum = dbm.LoadData(sql);
		return maxpnum;
	}



	public void insert_Data(Data insert_item) {
		dbm.save(insert_item);
	}

}
