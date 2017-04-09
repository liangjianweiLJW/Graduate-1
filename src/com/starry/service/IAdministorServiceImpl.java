package com.starry.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starry.dao.IAdministorDao;
import com.starry.entity.Administor;
import com.starry.entity.User;

@Service("administorService")
public class IAdministorServiceImpl implements IAdministorService {
@Autowired
	private IAdministorDao administorDao;
	//@Resource
	public void setAdministorDao(IAdministorDao administorDao) {
		this.administorDao = administorDao;
	}

	public IAdministorDao getAdministorDao() {
		return administorDao;
	}

	@Override
	public boolean checkLogin(String name, String pwd) {
		Administor administor = new Administor();
		administor.setName(name);
		administor.setPwd(pwd);
		System.out.println(administor);
		boolean result = administorDao.login(administor);
		return result;
	}
}