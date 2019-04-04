package SingleTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class TestHeritage {
	
public static SessionFactory factory;

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		factory = configuration.buildSessionFactory(serviceRegistry);
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Employeur e=new Employeur("emp1","emp 1",36);
		
		Directeur d=new Directeur("dir1","dir1",38,"JAVA");
		
		session.persist(e);
		session.persist(d);
		
		t.commit();
		
		
	}

}