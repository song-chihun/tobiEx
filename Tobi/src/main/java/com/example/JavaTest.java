package com.example;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.user.dao.DaoFactory;
import spring.user.dao.UserDao;
import spring.user.domain.User;

public class JavaTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		UserDao dao = context.getBean("userDao", UserDao.class);

		User user = new User();
		user.setId("easymedia2");
		user.setName("이지미디어");
		user.setPassword("easy");
		
		dao.add(user);
		
		System.out.println(user.getId() + " 등록 성공");
		
		User user2 = dao.get("easymedia1");
		
		System.out.println(user2.getName());
	
	}

}
