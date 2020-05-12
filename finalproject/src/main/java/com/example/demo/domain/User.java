package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	private Role role;
@Override
	public String toString() {
		return "User [id=" + id + ", role=" + role + ", block=" + block + "]";
	}
public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
public boolean isBlock() {
	return block;
}
public void setBlock(boolean block) {
	this.block = block;
}
private boolean block;
}
