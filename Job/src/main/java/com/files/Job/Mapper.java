package com.files.Job;

	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.files.Job.Clients.CompanyClient;
import com.files.Job.external.Company;
import com.files.Job.external.Reveiw;
import com.netflix.discovery.converters.Auto;
@Component
public class Mapper {
	  @Autowired
	    RestTemplate restTemplate;
	   @Autowired
	  CompanyClient client;
	public JobWithCompanyDto convertToDto (Job job) {	
 			 Reveiw reveiw=new Reveiw();
 			//    RestTemplate restTemplate=new RestTemplate();     bean created in main class
		// Company company = restTemplate.getForObject("http://COMPANY-SERVICE:8082/company/"+job.getCompany_id(), Company.class);
			 Company company=client.getcompany(job.getCompany_id());
		   JobWithCompanyDto convertToJobWWithCompany = convertToJobWWithCompany(job, company,reveiw);
		   convertToJobWWithCompany.setCompany(company);
 			 return convertToJobWWithCompany;
	}
	
	
	public static  JobWithCompanyDto convertToJobWWithCompany(Job job,Company company,Reveiw reveiw) {
		JobWithCompanyDto jobWithCompanyDto=new JobWithCompanyDto();
		jobWithCompanyDto.setJob_id(job.getJob_id());
		jobWithCompanyDto.setJob_role(job.getJob_role());
		jobWithCompanyDto.setLocation(job.getLocation());
		jobWithCompanyDto.setSalary(job.getSalary());
		jobWithCompanyDto.setCompany(company);
		jobWithCompanyDto.setReviews(reveiw);
		return jobWithCompanyDto;
	}
}
