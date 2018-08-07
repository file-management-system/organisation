package com.organisation.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.organisation.entity.Organisation;
import com.organisation.queries.QueryBuilder;

@Repository(value = "JT")

public class OrganisationRepository implements IOrganisationRepository {

	@Autowired
	JdbcTemplate template;

	public List<Organisation> getAll() {
		RowMapper<Organisation> rowMapper = new OrganisationRowmapper();
		return template.query(QueryBuilder.GET_ALL, rowMapper);
	}

	public int addOrganisation(Organisation org) {
		return template.update(QueryBuilder.INSERT, org.getId(), org.getEmployeeName(), org.getPassword());
	}

	public Organisation getOrganisationById(int id) {
		RowMapper<Organisation> rowMapper = new OrganisationRowmapper();
		return template.queryForObject(QueryBuilder.GET_ORGANISATION_BY_ID, new Object[] { id }, rowMapper);
	}

	public int deleteOrganisationByID(int id) {
		return template.update(QueryBuilder.DELETE_ORGANISATION_BY_ID, new Object[] { id });
	}

	public int deleteAll() {
		return template.update(QueryBuilder.DELETE_ALL);
	}

	public int updateOrganisationEmployeeName(Organisation org) {
		return template.update(QueryBuilder.UPDATE_EMPLOYEE_NAME_BY_ID, org.getEmployeeName(), org.getId());
	}

}
