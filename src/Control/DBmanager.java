package Control;

import java.sql.*;
import java.util.ArrayList;

import Model.Data;

public class DBmanager {
	private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; //드라이버
	private final String DB_URL = "jdbc:mysql://127.0.0.1:3306/covidsqldata?serverTimezone=UTC"; //접속할 DB 서버
		
	private final String USER_NAME = "root"; //DB에 접속할 사용자 이름을 상수로 정의
	private final String PASSWORD = "root"; //사용자의 비밀번호를 상수로 정의
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
			
		} catch (Exception e) {}	
		
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
				e.getStackTrace();
			}
		}
		
	}


}
