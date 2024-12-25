package com.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Driver {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Mobile.class);
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Mobile mb=session.load(Mobile.class,2);
		System.out.println(mb);
	}
}
