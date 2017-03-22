package org.action;

import org.service.UserService;
import org.vo.User;

import com.opensymphony.xwork2.ActionSupport;

public class SaveAction extends ActionSupport{
	private User user;
	private UserService userService;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		System.out.println("service");
		this.userService = userService;
	}
	
	
	public String execute(){
		System.out.println("haha");
		userService.save(user);
		return SUCCESS;
	}

}
