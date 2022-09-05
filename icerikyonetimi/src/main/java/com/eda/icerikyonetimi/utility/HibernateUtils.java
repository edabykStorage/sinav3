package com.eda.icerikyonetimi.utility;

import com.eda.icerikyonetimi.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {


	private static final SessionFactory SESSION_FACTORY = sessionFactoryHibernate();

	private static SessionFactory sessionFactoryHibernate() {
		try {
			Configuration configuration = new Configuration();

//
			configuration.addAnnotatedClass(User.class);
			configuration.addAnnotatedClass(Answers.class);
			configuration.addAnnotatedClass(Lesson.class);
			configuration.addAnnotatedClass(Questions.class);
			configuration.addAnnotatedClass(Subject.class);
			configuration.addAnnotatedClass(SubjectDetail.class);

			SessionFactory factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();

			return factory;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

}
