package Control;

import java.sql.*;
import java.util.ArrayList;

import Model.Data;

public class DBmanager {
	private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; //����̹�
	private final String DB_URL = "jdbc:mysql://127.0.0.1:3301/covidsqldata?serverTimezone=UTC"; //������ DB ����
		
	private final String USER_NAME = "root"; //DB�� ������ ����� �̸��� ����� ����
	private final String PASSWORD = "root"; //������� ��й�ȣ�� ����� ����
	private Connection conn;
	public DBmanager(){ 
	    conn = null; 
	    try{
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
		} catch(Exception e){
				System.out.println(e.getStackTrace());
		}
	}

	public void save(Data tmp) {
		try {
			PreparedStatement PState = null;
			String sql = "INSERT INTO sqldata VALUE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PState = conn.prepareStatement(sql);
			
			PState.setInt(1, tmp.getNum());
			PState.setInt(2, tmp.getMonth());
			PState.setInt(3, tmp.getDate());
			PState.setInt(4, tmp.getPeople_num());
			PState.setString(5, tmp.getContry());
			PState.setString(6, tmp.getPeople_info());
			PState.setString(7,tmp.getArea());
			PState.setString(8,tmp.getTravel());
			PState.setString(9,tmp.getContact());
			PState.setString(10,tmp.getMeasures());
			PState.setString(11,tmp.getStatus());
			PState.setString(12,tmp.getRoute());
			PState.setString(13,tmp.getRegistration_d());
			PState.setString(14,tmp.getModified_d());
			PState.setString(15,tmp.getExposure());
			
			PState.executeUpdate();
			
		} catch (Exception e) {e.printStackTrace();}	
		
	}

	public void saveAll(ArrayList<Data> dataList) {
		for(Data tmp : dataList) {
			try {
				PreparedStatement PState = null;
				String sql = "INSERT INTO sqldata VALUE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PState = conn.prepareStatement(sql);
				
				PState.setInt(1, tmp.getNum());
				PState.setInt(2, tmp.getMonth());
				PState.setInt(3, tmp.getDate());
				PState.setInt(4, tmp.getPeople_num());
				PState.setString(5, tmp.getContry());
				PState.setString(6, tmp.getPeople_info());
				PState.setString(7,tmp.getArea());
				PState.setString(8,tmp.getTravel());
				PState.setString(9,tmp.getContact());
				PState.setString(10,tmp.getMeasures());
				PState.setString(11,tmp.getStatus());
				PState.setString(12,tmp.getRoute());
				PState.setString(13,tmp.getRegistration_d());
				PState.setString(14,tmp.getModified_d());
				PState.setString(15,tmp.getExposure());
				
				PState.executeUpdate();
				
			} catch (Exception e) {
			}
		}
	}
	
	

	public int LoadData(String sql) {
		try {
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			int result = 0;
			
			while(rs.next()) {
				result = rs.getInt("num");
			}
			return result;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	
	
	public int[][] LoadAreaData(String sql) {
		int[][] Month_Count = new int[2][2];
		int month, count;
		Month_Count[0][1] = 0; // �ִ��� �����ϴ� �迭
		Month_Count[1][1] = 999; // �ּڰ��� �����ϴ� �迭
		try {
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
	
			while(rs.next()) {
				count = rs.getInt("Count(num)");
				month = rs.getInt("Month");
				if(count >= Month_Count[0][1]) { // �ִ� ���� ����
					Month_Count[0][1] = count;
					Month_Count[0][0] = month;
				}
				if(count <= Month_Count[1][1]) { // �ּڰ� ���� ����
					Month_Count[1][1] = count;
					Month_Count[1][0] = month;
				}
			}
			return Month_Count;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new int[2][2];
	}

	public Data Load(String sql) {
		Data item = new Data();
		try {		
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				item.setNum(rs.getInt("num"));
				item.setMonth(rs.getInt("month"));
				item.setDate(rs.getInt("date"));
				item.setPeople_num(rs.getInt("people_num"));
				item.setContry(rs.getString("contry"));
				item.setPeople_info(rs.getString("people_info"));
				item.setArea(rs.getString("area"));
				item.setTravel(rs.getString("travel"));
				item.setContact(rs.getString("contact"));
				item.setMeasures(rs.getString("measures"));
				item.setStatus(rs.getString("status"));
				item.setRoute(rs.getString("route"));
				item.setRegistration_d(rs.getString("registration_d"));
				item.setModified_d(rs.getString("modified_d"));
				item.setExposure(rs.getString("exposure"));
			}
			return item;
			
		} catch (Exception e) {
			return null;
		}
	}

	public int Update(Data item) {
		try {
			PreparedStatement PState = null;
			String sql = "UPDATE sqldata SET month = ?, date = ?, "
					+ "area = ?, travel = ?, contact = ?, status = ?, route = ? " 
					+ "where people_num = ?;";

			PState = conn.prepareStatement(sql);

			PState.setInt(1, item.getMonth());
			PState.setInt(2, item.getDate());
			PState.setString(3, item.getArea());
			PState.setString(4, item.getTravel());
			PState.setString(5, item.getContact());
			PState.setString(6, item.getStatus());
			PState.setString(7, item.getRoute());
			PState.setInt(8, item.getPeople_num());

			PState.executeUpdate();
			return 1; //����
		} catch (SQLException e) {
			e.printStackTrace();
			return 0; //����
		}
	}
}
