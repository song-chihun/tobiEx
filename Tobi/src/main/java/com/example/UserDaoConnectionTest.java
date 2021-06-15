package com.example;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.user.dao.CountUserDao;
import spring.user.dao.CountingConnectionMaker;
import spring.user.dao.CountingDaoFactory;
import spring.user.dao.UserDao;
import spring.user.domain.User;

public class UserDaoConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CountingDaoFactory.class);
		CountUserDao dao = context.getBean("CountUserDao", CountUserDao.class);
		
		User user = new User();
		user.setId("easymedia4");
		user.setName("이지미디어");
		user.setPassword("easy");
		
		dao.add(user);
		
		User user2 = new User();
		user2.setId("easymedia5");
		user2.setName("이지미디어");
		user2.setPassword("easy");
		
		dao.add(user2);
		
		CountingConnectionMaker ccm = context.getBean("connectionMaker", CountingConnectionMaker.class);
		System.out.println("Connection counter: " + ccm.getCounter());

	}

}
