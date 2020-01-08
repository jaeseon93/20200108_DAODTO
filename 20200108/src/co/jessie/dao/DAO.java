package co.jessie.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.jessie.dto.JobDto;

public class DAO {
	public Connection conn;
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";

	public DAO() { // 생성될때 드라이버 로드와 연결해준다.
		try {
			Class.forName(driver); //driver에 적혀있는 값(주소)에 파일이 있는지 확인하는것.
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
