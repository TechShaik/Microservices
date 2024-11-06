package com.files.Review;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Reveiw {
@Id
private int rev_id;
 private int company_id;
 private String description; 
public int getCompany_id() {
	return company_id;
}
public void setCompany_id(int company_id) {
	this.company_id = company_id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getRev_id() {
	return rev_id;
}
public void setRev_id(int rev_id) {
	this.rev_id = rev_id;
}
public Reveiw(int rev_id, int company_id, String description) {
	super();
	this.rev_id=rev_id;
 	this.company_id = company_id;
	this.description = description;
}
public Reveiw() {
	super();
}
 
}
