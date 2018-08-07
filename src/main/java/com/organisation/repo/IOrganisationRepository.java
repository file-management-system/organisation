package com.organisation.repo;

import java.util.List;

import com.organisation.entity.Organisation;

public interface IOrganisationRepository {

	public List<Organisation> getAll();

	public int addOrganisation(Organisation org);

	public Organisation getOrganisationById(int id);

	public int deleteOrganisationByID(int id);

	public int deleteAll();

	public int updateOrganisationEmployeeName(Organisation org);
}
