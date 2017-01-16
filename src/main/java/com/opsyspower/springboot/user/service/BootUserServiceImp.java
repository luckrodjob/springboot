package com.opsyspower.springboot.user.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.opsyspower.springboot.user.dao.IBootUserDao;
import com.opsyspower.springboot.user.domain.BootUser;

//@Service
//@Transactional
public class BootUserServiceImp implements IBootUserService {

	@Autowired
	private IBootUserDao bootUserDao;

	@Override
	public void addBootUser(BootUser bootUser) {
		//bootUserDao.save(bootUser);
	}

	@Override
	//@Transactional(readOnly = true)
	public void getBootUser(String id) {
		//bootUserDao.findOne(id);
	}

}
