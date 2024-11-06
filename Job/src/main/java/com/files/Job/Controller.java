package com.files.Job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PatchExchange;
 
@RestController
@RequestMapping("/job")
public class Controller {
    
	@Autowired
	Service service;
	
	@PostMapping("/add")
	public Job add(@RequestBody Job job) {
		return service.add(job);
	}
	
	@GetMapping("/showall")
	public List<JobWithCompanyDto> show() {
		return service.show();
	}
	
	@GetMapping("/{id}")
	public JobWithCompanyDto show(@PathVariable int id) {
		return service.showbyid(id);
	}
}
