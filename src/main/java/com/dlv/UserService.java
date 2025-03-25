package com.dlv;

import com.dlv.repo.UserDao;

public class UserService {
	
	private UserDao userDao;

	public UserService(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	public String getName(Integer id) {
		String name = userDao.findNameById(id);
		return name;
	}
	
	public String login(String email,String pwd) {
		Boolean status = userDao.findByEmailAndPwd(email, pwd);
                int a=10;
		if(status) {
			return "Success";
		}else {
			return "Failed";
		}
	}
}
