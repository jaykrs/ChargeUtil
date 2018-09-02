package com.charge.ms.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.charge.ms.user.model.User;
import com.charge.ms.user.model.User_Address;

public class HibernateSessionManager {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	 
	private static SessionFactory buildSessionFactory() {
	try {
		
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(User.class);
		configuration.addAnnotatedClass(User_Address.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
		applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
	return factory;	
		
//	return new AnnotationConfiguration().
//	configure().addAnnotatedClass(User.class).buildSessionFactory();
	} catch (Throwable ex) {
	System.err.println("SessionFactory creation failed." + ex);
	throw new ExceptionInInitializerError(ex);
	}
	}
	 
	public static SessionFactory getSessionFactory() {
	return sessionFactory;
	}
	 
	public static void shutdown() {
	getSessionFactory().close();
	}

}
