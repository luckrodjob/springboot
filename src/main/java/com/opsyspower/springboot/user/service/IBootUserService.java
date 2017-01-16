package com.opsyspower.springboot.user.service;

import com.opsyspower.springboot.user.domain.BootUser;

public interface IBootUserService {

	void addBootUser(BootUser bootUser);
	
	void getBootUser(String id);
}
