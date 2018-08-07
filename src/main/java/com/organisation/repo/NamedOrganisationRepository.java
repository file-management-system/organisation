package com.organisation.repo;



import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.organisation.entity.Organisation;
import com.organisation.queries.QueryBuilder;

@Repository(value = "NJT")
public class NamedOrganisationRepository implements IOrganisationRepository {
	@Autowired
	NamedParameterJdbcTemplate template;

	@Override
	public List<Organisation> getAll() {

		return template.query(QueryBuilder.GET_ALL, new OrganisationRowmapper());
	}

	@Override
	public int addOrganisation(Organisation org) {

		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("id", org.getId());
		source.addValue("employeename", org.getEmployeeName());
		source.addValue("password", org.getPassword());

		return template.update(QueryBuilder.NJ_INSERT, source);
	}

	@Override
	public Organisation getOrganisationById(int id) {

		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("id", id);
		return template.queryForObject(QueryBuilder.NJ_GET_ORGANISATION_BY_ID, source, new OrganisationRowmapper());

	}

	@Override
	public int deleteOrganisationByID(int id) {

		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("id", id);
		return template.update(QueryBuilder.NJ_DELETE_ORGANISATION_BY_ID, source);

	}

	@Override
	public int deleteAll() {

		return template.update(QueryBuilder.NJ_DELETE_ALL, new HashMap<>());
	}

	@Override
	public int updateOrganisationEmployeeName(Organisation org) {
		
		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("id", org.getId());
		source.addValue("employee_name", org.getEmployeeName());
		return template.update(QueryBuilder.NJ_UPDATE_EMPLOYEE_NAME_BY_ID, source);
	}
}