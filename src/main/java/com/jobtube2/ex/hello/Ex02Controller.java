package com.jobtube2.ex.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex02Controller {
	@ResponseBody
	@RequestMapping("/lesson1/ex02")
	public String ex02() {
		return "lesson1/ex02";
	}
}
