package com.winter.app.departments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/department/*")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("list")
	public ModelAndView list(ModelAndView mv) {
		List<DepartmentDTO> ar = departmentService.list();
		
		//request와 비슷한 역할, Spring이 제공
		
		mv.addObject("list", ar);
		mv.setViewName("department/list");
		
		return mv;
	}
	
	@GetMapping("detail")
	public void detail(@RequestParam(name="num") String num, Model model) {
		DepartmentDTO departmentDTO = departmentService.detail(num);
		model.addAttribute("d", departmentDTO);
		
	}
	
	@GetMapping("create")//URL정보와 JSP의 경로가 같다면 void로 리턴
	public void create() {}
	
	@PostMapping("create")
	public String create(DepartmentDTO departmentDTO) {
		
		int result = departmentService.create(departmentDTO);
		
		//redirect
		return "redirect:./list";
		
	}
	
	@PostMapping("delete")
	public String delete(DepartmentDTO departmentDTO) {
		
		int result = departmentService.delete(departmentDTO);
		
		return "redirect:./list";
	}
	
	@GetMapping("update")
	public void update(DepartmentDTO departmentDTO, Model model) {
		departmentDTO = departmentService.detail(departmentDTO.getDepartmentNo());
		model.addAttribute("d", departmentDTO);
		
	}
	
	@PostMapping("update")
	public void update() {
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartmentNo("070");
		departmentDTO.setDepartmentName("고고학");
		departmentDTO.setCategory("예체능");
		departmentDTO.setOpenYn("Y");
		departmentDTO.setCapacity(40L);
		int result = departmentService.update(departmentDTO);
		
		System.out.println("희망 값 : 1 , 실제값 :"+ result);
		
	}

}
