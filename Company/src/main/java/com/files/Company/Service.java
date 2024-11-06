package com.files.Company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

	
	@Autowired
	CompanyRepo companyRepo;
	
	public Company add(Company company) {
		return companyRepo.save(company);
	}

	public List<Company> show() {
		 
		return companyRepo.findAll();
	}

	public Company showbyid(int id) {
		return companyRepo.findById(id).get();
	}

}
