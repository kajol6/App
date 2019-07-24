package com.app.RestApp1;

import java.util.HashMap;
import java.util.Map.Entry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class ControllerRestApp {
	HashMap<String, String > hm = new HashMap<>();
	public ControllerRestApp() {
		hm.put("user1","user1");
		hm.put("user2","user2");
	}
	
	@GetMapping("/welcome")
	@ResponseBody
	public String message() {
		return "Welcome page";
	}
	
	@GetMapping("/login")
	//@ResponseBody
	public String loginpage() {
		return "login";
	}
	@GetMapping("/")
	//@ResponseBody
	public String registerpage() {
		return "register";
	}
	@PostMapping("/loginvalidate")
	//@ResponseBody
	public String loginValidate(@RequestParam("username") String name,@RequestParam("pwd") String password) {
		for (Entry<String, String> entry : hm.entrySet()) {
		    if(name.equals(entry.getKey()) && password.equals(entry.getValue()))
		    		return "success";
		}
		
			return "failure";
	}
	@PostMapping("/registervalidate")
	public String  registerValidate(@RequestParam("username")String name,@RequestParam("pwd")String password) {
		hm.put(name,password);
		
		return "login";
	}

}
