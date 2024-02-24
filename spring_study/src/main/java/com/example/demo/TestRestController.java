package com.example.demo;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestRestController {

	@GetMapping("/hello")
	public String hello(@RequestParam(value="msg", required=false) String msg) {
		return msg;
	}
	
	@GetMapping("/hello2")
	public HashMap<String,String> hello2() {
		HashMap<String,String> map = new HashMap<>() {{
			put("이름","팜하니");
			put("나이","99");
			put("국적","호주");
		}};
		return map;
	}
}
