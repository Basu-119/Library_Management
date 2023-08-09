package com.digit.Library_Management.Model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;



public class HibernateManager {

	private Session session;

	public HibernateManager() {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());
		session = sessionFactory.openSession();

	}

//******** INSESRT********
	public boolean saveBookreq(Bookreq b1) {
		Transaction tran = session.beginTransaction();
		Serializable save = session.save(b1);
		if (save == null) {
			return false;
		}

		tran.commit();
		return true;
	}
	public boolean saveBook(Book ab) {
		Transaction tran = session.beginTransaction();
		Serializable save = session.save(ab);
		if (save == null) {
			return false;
		}

		tran.commit();
		return true;
	}

	public Bookreq getSpx(String bname) {
		Transaction tran =session.beginTransaction();
		Bookreq s=(Bookreq) session.get(Bookreq.class, bname);
		return s;
	}
	//USERS
	
	
	public boolean saveUserreq(UsersReq u1) {
		Transaction tran = session.beginTransaction();
		Serializable save = session.save(u1);
		if (save == null) {
			return false;
		}

		tran.commit();
		return true;
	}
	public boolean saveBook(Users u2) {
		Transaction tran = session.beginTransaction();
		Serializable save = session.save(u2);
		if (save == null) {
			return false;
		}

		tran.commit();
		return true;
	}
	public UsersReq getSpxUser(String uname) {
		Transaction tran =session.beginTransaction();
		UsersReq s=(UsersReq) session.get(UsersReq.class, uname);
		return s;
	}
	

}
