package org.serviceimpl;

import org.service.UserService;
import org.vo.User;

public class UserServiceImpl implements  UserService{
	public void save(User user){
		System.out.println(user.getName()+"´¢´æ³É¹¦");
	}
}
