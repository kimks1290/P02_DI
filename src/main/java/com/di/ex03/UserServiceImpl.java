



package com.di.ex03;

public class UserServiceImpl implements UserService{

	public UserServiceImpl() {
		System.out.println("- UserServiceImple() 생성자 -");
	}
	
	@Override
	public void addUser(UserVO vo) {
		// TODO Auto-generated method stub
		System.out.println("- addUser(UserVO vo) -");
		System.out.println("이름 : " + vo.getUserName());
	}

	
}
