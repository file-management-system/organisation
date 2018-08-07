package com.organisation.repo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.organisation.entity.Organisation;

public class OrganisationRowmapper implements RowMapper<Organisation> {

	@Override
	public Organisation mapRow(ResultSet rs, int rowNum) throws SQLException {

		Organisation org = new Organisation();
		org.setId(rs.getInt("ID"));
		org.setEmployeeName(rs.getString("EMPLOYEE_NAME"));
		org.setPassword((rs.getString("PASSWORD")));

		return org;
	}

}
