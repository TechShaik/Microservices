package com.files.Job;

 import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
 
 
@org.springframework.stereotype.Service
public class Service {
   
	@Autowired
	Mapper mapper;
	@Autowired
	JobRepo jobRepo;
	
	public Job add(Job job) {
		return jobRepo.save(job);
	}

	public List<JobWithCompanyDto> show() {
 	 List<Job>jobs=jobRepo.findAll(); 	 
   		 return jobs.stream().map(mapper::convertToDto).collect(Collectors.toList());
	 }  
	  	 

	public JobWithCompanyDto showbyid(int id) {
	      Job job = jobRepo.findById(id).get();
	      return mapper.convertToDto(job);
	}

}
