package com.files.Job.Clients;

import org.springframework.cloud.openfeign.FeignClient;
 import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.files.Job.external.Company;
 @FeignClient(name="COMPANY-SERVICE")
public interface CompanyClient {
	@GetMapping("/company/{id}")
     Company getcompany(@PathVariable int id);
    	 
     }

