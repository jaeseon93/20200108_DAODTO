package co.jessie.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.jessie.dto.JobDto;

public class EmployeeDao {
	private Connection conn;
//	private PreparedStatement psmt;
//	private ResultSet rs; // select 구문에서 결과값을 받기 위해 씀.
//
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";

	public EmployeeDao() { // 생성될때 드라이버로드와 연결해준다.
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

//	public void select() {
//		JobDto dto = new JobDto();
//		String sql = "select * from jobs";
//		try {
//			psmt = conn.prepareStatement(sql);
//			rs = psmt.executeQuery();
//			while (rs.next()) {
//				dto.setJob_id(rs.getString("job_id"));
//				dto.setJob_title(rs.getString("job_title"));
//				dto.setMin_salary(rs.getInt("min_salary"));
//				dto.setMax_salary(rs.getInt("max_salary"));
//				dto.toString();
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (rs != null)
//					rs.close();
//				if (psmt != null)
//					psmt.close();
//				if (conn != null)
//					conn.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}

}
