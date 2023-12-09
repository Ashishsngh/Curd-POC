package com.springrest2.springrest2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Course {
	
	@Id
	private long id;
	
	private String title;
	
	private String description;

	public long getId() {
		return id;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + "]";
	}

	public Course(int id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
