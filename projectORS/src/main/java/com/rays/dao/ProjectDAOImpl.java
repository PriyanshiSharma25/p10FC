package com.rays.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ProjectDTO;

@Repository
public class ProjectDAOImpl extends BaseDAOImpl<ProjectDTO> implements ProjectDAOInt {

	@Override
	protected List<Predicate> getWhereClause(ProjectDTO dto, CriteriaBuilder builder, Root<ProjectDTO> qRoot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<ProjectDTO> getDTOClass() {
		return ProjectDTO.class;
	}

}
