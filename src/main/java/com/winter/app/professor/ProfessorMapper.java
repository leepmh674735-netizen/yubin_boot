package com.winter.app.professor;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface ProfessorMapper {
	
	//list
	public List<ProfessorDTO> list() throws Exception;
	
	//detail
	public ProfessorDTO detail(ProfessorDTO professorDTO)throws Exception;
	
	//create
	public int create(ProfessorDTO professorDTO)throws Exception;
	
	//update
	public int update(ProfessorDTO professorDTO)throws Exception;
	
	//delete
	public int delete(ProfessorDTO professorDTO)throws Exception;

}
