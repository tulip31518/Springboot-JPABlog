package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BlogControllerTest {
	
	@GetMapping("/test/hello")
	@ResponseBody
	public String hello()
	{
		return "hello spring boot";
	}

}
