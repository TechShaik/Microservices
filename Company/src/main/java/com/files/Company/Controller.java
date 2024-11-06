package com.files.Company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class Controller {
	
	@Autowired
	Service service;
	@PostMapping("/add")
  public Company add(@RequestBody Company company) {
	  return service.add(company);
  }
	
	@GetMapping("/show")
	  public List<Company> show( ) {
		  return service.show( );
	  }
	@GetMapping("/{id}")
	  public Company showbyid( @PathVariable int id) {
		  return service.showbyid( id);
	  }
}
