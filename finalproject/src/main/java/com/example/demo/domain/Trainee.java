package com.example.demo.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Trainee extends User
{
private String  name;
@OneToMany
private List<Document>assignedDocuments;

@OneToMany
private List<Assignment>assignments;
public List<Assignment> getAssignments() {
	return assignments;
}
public void setAssignments(List<Assignment> assignments) {
	this.assignments = assignments;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Document> getAssignedDocuments() {
	return assignedDocuments;
}
public void setAssignedDocuments(List<Document> assignedDocuments) {
	this.assignedDocuments = assignedDocuments;
}
}