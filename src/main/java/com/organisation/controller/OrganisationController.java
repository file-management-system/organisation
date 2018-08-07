package com.organisation.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organisation.entity.Organisation;
import com.organisation.repo.IOrganisationRepository;


@RestController
@RequestMapping("/org")
public class OrganisationController {

	@Autowired
	@Qualifier(value = "NJT")
	IOrganisationRepository repo;

	@GetMapping("/data")
	public List<Organisation> displayAll() {
		return repo.getAll();
	}

	@PostMapping("/")
	public int createOrganisation(@RequestBody Organisation org) {

		return repo.addOrganisation(org);

	}

	@GetMapping("/{id}")
	public Organisation getOrganisationById(@PathVariable("id") int id) {
		return repo.getOrganisationById(id);
	}

	@DeleteMapping("/{id}")
	public int deleteOrganisationById(@PathVariable("id") int id) {
		return repo.deleteOrganisationByID(id);
	}

	@DeleteMapping
	public int deleteAll() {
		return repo.deleteAll();
	}

	@PutMapping("/{id}")
	public int updateOrganisationEmployeeName(@PathVariable("id") int id, @RequestBody Organisation org) {
		org.setId(id);
		return repo.updateOrganisationEmployeeName(org);

	}
}


