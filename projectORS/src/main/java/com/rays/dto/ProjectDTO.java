package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_project")
public class ProjectDTO extends BaseDTO{
	
	@Column(name = "NAME", length = 50)
	protected String name;
	
	@Column(name = "CATEGORY", length = 50)
	protected String category;
	
	@Column(name = "OPEN_DATE")
	protected Date openDate;
	
	@Column(name = "VERSION", length = 50)
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
	public String getKey() {
		// TODO Auto-generated method stub
		return id + "";
	}
	
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return category;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "name";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("name", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("name", name);
		return map;
	}

}
