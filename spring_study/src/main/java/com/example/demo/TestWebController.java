package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestWebController {

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/hello2")
	@ResponseBody
	public String hello2(@RequestParam(value="msg",required=false) String msg) {
		return msg;
	}
	
	@GetMapping("/hello3/{msg}")
	public String hello3(@PathVariable String msg, Model m) {
		m.addAttribute("msg",msg);
		//경로 파라미터를 사용했기 때문에 웹 브라우저에서 테스트를 할 때 localhost:8080/test/hello3/안녕 ← 으로 요청해야 한다.
		return "hello";
	}
}

