package Control;

import java.sql.*;

import Model.Data;

public class DBmanager {
	private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; //����̹�
	private final String DB_URL = "jdbc:mysql://localhost/team_project?serverTimezone=UTC"; //������ DB ����
		
	private final String USER_NAME = "root"; //DB�� ������ ����� �̸��� ����� ����
	private final String PASSWORD = "rlawowjd123"; //������� ��й�ȣ�� ����� ����
	private Connection conn;
	public DBmanager(){ 
	    conn = null; 
	    try{
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
		} catch(Exception e){
				e.getStackTrace();
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
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
//		state = conn.createStatement();
//        
//		String sql; //SQL���� ������ String
//		sql = "SELECT * FROM student";
//		ResultSet rs = state.executeQuery(sql); //SQL���� �����Ͽ� ����
//					
//		    while(rs.next()){
//				String number = rs.getString("_number");
//				String name = rs.getString("name");
//				String kor = rs.getString("kor");
//				String math = rs.getString("math");
//				String eng = rs.getString("eng");
//				System.out.println("Number: "+ number + "\nName: " + name + "\nKOR: " + kor); 
//				System.out.println("MATH: "+ math + "\nENG: " + eng + "\n-------------\n");
//			}
//			
//			rs.close();
//			state.close();
		
	}


}
