package com.files.Review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    
	@Autowired
	ReveiwRepo reveiwRepo;
	public Reveiw add(Reveiw review ) {
  		reveiwRepo.save(review);
		return review;
	}
		 
	public   Reveiw show(int company_id) {
		 Reveiw reveiws= reveiwRepo.findById(company_id).get();
		 return reveiws;
		
		 
	}

}
