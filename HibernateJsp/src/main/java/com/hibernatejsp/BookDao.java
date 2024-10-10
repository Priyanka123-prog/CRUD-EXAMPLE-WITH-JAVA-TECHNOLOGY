package com.hibernatejsp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public  class BookDao {
	static Session session=new Configuration().configure("com/hibernatejsp/hiber.xml").buildSessionFactory().openSession();

	public static int register(Book b) {
		int i=0;
		
		Transaction tx=session.beginTransaction();
		i=(Integer) session.save(b);
		tx.commit();
		return i;
		
	}
	public static List<Book> getBooks() {
		List<Book> books=(List<Book>) session.createQuery("from Book");
		
		return books;
		
	}

}
