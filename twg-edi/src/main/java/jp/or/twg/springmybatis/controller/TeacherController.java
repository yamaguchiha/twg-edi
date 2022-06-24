package jp.or.twg.springmybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import jp.or.twg.springmybatis.model.Teacher;
import jp.or.twg.springmybatis.service.TeacherService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class TeacherController {

	private final TeacherService service;

	@GetMapping("/teacher")
	public String getAllTeachers(Model model) {
		model.addAttribute("page", service.selectAll());

		return "list";
	}

	// 以下 を 追加
	@GetMapping("/teacher/add")
	public String addTeacher(@ModelAttribute Teacher teacher) {
		return "form";
	}

	@PostMapping("/teacher/process")
	public String process(@Validated @ModelAttribute Teacher teacher, BindingResult result) {
		if (result.hasErrors()) {
			return "form";
		}
		service.save(teacher);
		return "redirect:/teacher";
	}

	@GetMapping("/teacher/edit/{id}")
	public String editTeacher(@PathVariable Long id, Model model) {
		model.addAttribute("teacher", service. selectByPrimaryKey(id));
		return "form";
	}

	@GetMapping("/teacher/delete/{id}")
	public String delete(@PathVariable Long id) {
		service.deleteByPrimaryKey(id);
		return "redirect:/teacher";
	}
}
