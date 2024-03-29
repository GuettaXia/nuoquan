package com.nuoquan.service;

import com.nuoquan.pojo.User;

public interface UserService {
	
	/**
	 * @Description: 判断昵称是否存在
	 * @param nickname
	 * @return
	 */
	public boolean checkNicknameIsExist(String nickname);
	
	/**
	 * 保存用户（用户注册）
	 * @param user
	 */
	public void saveUser(User user);
	
	/**
	 * 用户登录，根据用户名和密码查询用户
	 */
	public User checkUserForLogin(String nickname, String password);
}
