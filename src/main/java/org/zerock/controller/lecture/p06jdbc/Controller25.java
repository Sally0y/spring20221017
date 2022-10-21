package org.zerock.controller.lecture.p06jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.mariadb.jdbc.Statement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex25")
public class Controller25 {

	@Autowired
	private DataSource dataSource;
	
	@RequestMapping("sub01")
	public void method1() throws Exception {
		String sql = "INSERT INTO myTable07 (col1, col2, col3, col4, col5, col6)"
				+ " VALUES (?, ?, ?, ?, ?, ?)";
		
		try (Connection con = dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setInt(1, 9999999);
			pstmt.setDouble(2, 298342.333);
			pstmt.setString(3, "hello world");
			pstmt.setString(4, "sql");
			pstmt.setDate(5, java.sql.Date.valueOf("2022-10-01"));
			pstmt.setTimestamp(6, java.sql.Timestamp.valueOf("2011-11-11 12:12:12"));
			
			int cnt = pstmt.executeUpdate();
			
			System.out.println(cnt + "개 레코드 입력 성공");
		}
	}
	
	@RequestMapping("sub02")
	public void method02() throws Exception {
		String sql = "INSERT INTO myTable07 (name, age, score, address, birthDate, inserted)"
				+ " VALUES (?, ?, ?, ?, ?, ?)";
		
		try (Connection con = dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setString(1, "a");
			pstmt.setInt(2, 29);
			pstmt.setDouble(3, 2.5);
			pstmt.setString(4, "abd");
			pstmt.setDate(5, java.sql.Date.valueOf("2022-10-01"));
			pstmt.setTimestamp(6, java.sql.Timestamp.valueOf("2011-11-11 12:12:12"));
			
			int cnt = pstmt.executeUpdate();
			
			System.out.println(cnt + "개 레코드 입력 성공");

			// mydb1.myTable08 에 레코드 입력하는 코드 작성
		}
	}

	@RequestMapping("sub03")
	public void method03() {
		String sql = "SELECT col1, col2, col3, col4, col5, col6 FROM myTable07";
		
		try (Connection con = dataSource.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			
			while(rs.next()) {
				int col1 = rs.getInt("col1");
				double col2 = rs.getDouble("col2");
				String col3 = rs.getString("col3");
				String col4 = rs.getString("col4");
				java.sql.Date col5 = rs.getDate("col5");
				java.sql.Timestamp col6 = rs.getTimestamp("col6");
				
				System.out.println(col1);
				System.out.println(col2);
				System.out.println(col3);
				System.out.println(col4);
				System.out.println(col5);
				System.out.println(col6);
				System.out.println();
			}
		}
	}
	
//	@RequestMapping("sub04")
	// myTable08 조회 코드 작성

	@RequestMapping("sub04")
	public void method04() {
		String sql = "SELECT name, age, score, address, birthDate, inserted FROM myTable08";
		
		try (Connection con = dataSource.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			
			while(rs.next()) {
				String col1 = rs.getString("name");
				int col2 = rs.getInt("age");
				Double col3 = rs.getDouble("score");
				String col4 = rs.getString("address");
				java.sql.Date col5 = rs.getDate("birthDate");
				java.sql.Timestamp col6 = rs.getTimestamp("inserted");
				
				System.out.println(col1);
				System.out.println(col2);
				System.out.println(col3);
				System.out.println(col4);
				System.out.println(col5);
				System.out.println(col6);
				System.out.println();
			}
		}
	}


}

