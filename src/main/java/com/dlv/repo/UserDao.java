package com.dlv.repo;

public interface UserDao {
	
	String findNameById(Integer id);
	Boolean findByEmailAndPwd(String email,String pwd);

}
