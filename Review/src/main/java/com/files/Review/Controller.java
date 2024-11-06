package com.files.Review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.ws.rs.Path;
 
@RestController
@RequestMapping("/reveiw")
public class Controller {
    
	@Autowired
	Service service;
	
	@PostMapping("/add")
	public Reveiw add(@RequestBody Reveiw reveiw ) {
		return service.add(reveiw);
	}
	
	@GetMapping("/{id}")
	public  Reveiw show(@PathVariable int id) {
		return service.show(id);
	}
}
