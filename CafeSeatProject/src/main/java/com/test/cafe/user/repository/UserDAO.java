package com.test.cafe.user.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.test.cafe.user.model.UserDTO;
import com.test.util.DBUtil;

public class UserDAO {

	//정적 변수(자기 자신의 인스턴스를 담을 변수)
	private static UserDAO dao;
	
	private Connection conn;			//데이터베이스 연결을 위한 객체
	private Statement stat;				//SQL 쿼리 실행을 위한 객체
	private PreparedStatement pstat;	//파라미터가 있는 SQL 쿼리 실행을 위한 객체
	private ResultSet rs;				//쿼리 결과를 담을 객체
	
	private UserDAO() {

		//개인 테스트용은 cafe로 통일!
		this.conn = DBUtil.open("localhost", "cafe", "java1234"); //데이터 베이스 연결
		
		try {

			if (!conn.isClosed()) {
				System.out.println("UserDAO DB 연결 성공!");
			} else {
				System.out.println("UserDAO DB 연결 실패!");
			}

		} catch (Exception e) {
			System.out.println("UserDAO.UserDAO");
			e.printStackTrace();
		}
	}
	
	public static UserDAO getInstance() {
		
		if (dao == null) {
			dao = new UserDAO();	//인스턴스 없으면 생성
		}
		return dao; 				//이미 생성된 인스턴스를 반환
		
	}
	
	//로그인 메서드
	public UserDTO login(UserDTO dto) {
		
		
		try {
			
			String sql = "select * from tblUser where id = ? and pw = ?"; 
			
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, dto.getId());
			pstat.setString(2, dto.getPw());
			
			rs = pstat.executeQuery();
			
			//System.out.println(rs.getString("id")); //테스트
			
			if (rs.next()) { //결과가 있으면
				
				UserDTO result = new UserDTO();	//결과를 담을 UserDTO 객체 생성
				
				result.setSeq(rs.getString("seq"));
				result.setId(rs.getString("id"));
				result.setName(rs.getString("name"));
				result.setTel(rs.getString("tel"));
				result.setEmail(rs.getString("email"));
				result.setIng(rs.getInt("ing"));
				
				System.out.println(rs.getString("seq"));
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("tel"));
				System.out.println(rs.getString("email"));
				System.out.println("사용자 로그인 성공");
				return result;	
				
			} else {
				System.out.println("사용자 로그인 실패");
			}
			
		} catch (Exception e) {
			System.out.println("UserDAO.login");
			e.printStackTrace();
		}
		
		return null;	
	}
	
	public int register(UserDTO dto) {

		try {		
			String sql = "insert into tblUser (id, pw, name, tel, email, ing) values (?, ?, ?, ?, ?, default)"; 
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, dto.getId());
			pstat.setString(2, dto.getPw());
			pstat.setString(3, dto.getName());
			pstat.setString(4, dto.getTel());
			pstat.setString(5, dto.getEmail());
			pstat.setInt(6, dto.getIng());
			
			return pstat.executeUpdate();
		
		} catch (Exception e) {
			System.out.println("UserDAO.register");
			e.printStackTrace();	
		}
		
		return 0;
	}
}