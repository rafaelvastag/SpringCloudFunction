package com.vastag.azure.function.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POC_PARTNER_XP")
public class PoCEntity {

	@Id
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "Description")
	private String description;
	
	public PoCEntity() {
	}

	public PoCEntity(Long id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "PoCEntity [id=" + id + ", description=" + description + "]";
	}
		
}
