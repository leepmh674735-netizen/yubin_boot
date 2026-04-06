package com.winter.app.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDAO {

	//전체 목록 list
	public ArrayList<DepartmentDTO> list() throws Exception {
		System.out.println("DAO List");
		ArrayList<DepartmentDTO> ar = new ArrayList<>();
		
		//1. DB 연결
		Connection con = null;
		
		//2. SQL문 생성
		String sql = "SELECT * FROM TB_DEPARTMENT";
		
		//3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 세팅
		
		//5. 최종 전송 및 결과 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			DepartmentDTO departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartmentNo(rs.getString("DEPARTMENT_NO"));
			departmentDTO.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
			departmentDTO.setCategory(rs.getString("CATEGORY"));
			departmentDTO.setOpenYn(rs.getString("OPEN_YN"));
			departmentDTO.setCapacity(rs.getLong("CAPACITY"));
			ar.add(departmentDTO);
		}
		
		//6. 연결 해제
		rs.close();
		st.close();
		con.close();
		
		return ar;
		
	}
	
}
