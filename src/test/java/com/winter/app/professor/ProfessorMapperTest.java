package com.winter.app.professor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProfessorMapperTest {

	@Autowired
	private ProfessorMapper professorMapper;
	
	@Test
	void testList() {
		fail("Not yet implemented");
	}

	@Test
	void testDetail() {
		fail("Not yet implemented");
	}

	@Test
	void testCreate() throws Exception {
		//dummy data
		ProfessorDTO professorDTO = new ProfessorDTO();
		professorDTO.setProfessorNo("P200");
		professorDTO.setProfessorName("iu");
		professorDTO.setProfessorSsn("991223-1234567");
		professorDTO.setProfessorAddress("t서울시");
		professorDTO.setDepartmentNo("002");
		
		int result = professorMapper.create(professorDTO);
		
		assertEquals(1, result);
		
		
	}

	//@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	//@Test
	void testDelete() {
		fail("Not yet implemented");
	}

}
