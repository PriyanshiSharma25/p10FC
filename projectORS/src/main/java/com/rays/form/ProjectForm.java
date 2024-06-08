package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ProjectDTO;

public class ProjectForm extends BaseForm {
	
	
	@NotEmpty(message = "name is required.......!")
    protected String name;
	
	@NotEmpty(message = "category is required.......!")
	protected String category;
	
	@NotNull(message = "Date is required")
	protected Date openDate;
	
	@NotEmpty(message = "version is required.......!")
	protected String version;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public Date getOpenDate() {
		return openDate;
	}


	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}
	
	@Override
	public BaseDTO getDto() {
		ProjectDTO dto = initDTO(new ProjectDTO());
		dto.setName(name);
		dto.setCategory(category);
		dto.setOpenDate(openDate);
		dto.setVersion(version);
		return dto;
	}
	
	

}
