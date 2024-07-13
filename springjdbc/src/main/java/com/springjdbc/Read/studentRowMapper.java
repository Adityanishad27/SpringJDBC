package com.springjdbc.Read;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class studentRowMapper implements RowMapper<students> {
	
	@Override
	public students mapRow(ResultSet rs, int rowNum) throws SQLException {
		students std = new students();
		std.setStudentId(rs.getInt("studentId"));
		std.setStudentName(rs.getString("studentName"));
		std.setStudentAge(rs.getInt("studentAge"));
		std.setStudentGender(rs.getString("studentGender"));
		std.setStudentAddress(rs.getString("studentAddress"));
		return std;
	}
	

}
