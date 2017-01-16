package com.opsyspower.springboot.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.opsyspower.springboot.user.domain.BootUser;

@RestController
@RequestMapping("/bootuser")
public class BootUserController {

	//@Autowired
	//private IBootUserService bootUserService;

	@ResponseBody
	@GetMapping("/{userId}")
	public BootUser getUser(@PathVariable(name = "userId") String id) {
		return new BootUser(id, "test", 10);
	}
}
