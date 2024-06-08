package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ProjectDTO;
import com.rays.form.ProjectForm;
import com.rays.service.ProjectServiceInt;

@RestController
@RequestMapping(value = "Project")
public class ProjectCtl extends BaseCtl<ProjectForm, ProjectDTO, ProjectServiceInt>{
	
	@Autowired
	public ProjectServiceInt projectService;
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		List<ProjectDTO> list = projectService.search(new ProjectDTO(), userContext);
		res.addResult("category", list);
		return res;
	}
	
	                              

}
