package test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import entities.Produit;

public class main {

		public static SessionFactory factory;
		
		public static void main(String[] args) {
			
			Configuration configuration = new Configuration();
			configuration.configure();
			ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()). buildServiceRegistry();
			
			factory = configuration.buildSessionFactory(serviceRegistry);
			Session session = factory.openSession();
			Transaction t = session.beginTransaction();
			//create(session, "prod9");//
			/*Produit test1=new Produit();
		     test1.setIdProduit(1);
		     test1.setNomProduit("test1");
		    session.persist(test1);*/
		    /*Produit test2=new Produit();
		     test2.setIdProduit(2);
		     test2.setNomProduit("lasdroguas");
		    session.persist(test2);*/
			/*Produit test3=new Produit();
		     test3.setIdProduit(3);
		     test3.setNomProduit("yolo");
		    session.persist(test3);*/
			//update(session, 1,"prodtest2");//
			/*Produit p = new Produit();
		    p=(Produit) session.get(Produit.class,3);
		    p.setNomProduit("modif�e");
		    session.update(p);*/
			//delete(session,1);//
			Produit p = (Produit) session.get(Produit.class,2);
	        
	        session.delete(p);
			t.commit();
			
		}
			
			private static void create(Session session, String nom) {
				Produit p = new Produit();
				p.setNomProduit(nom);
				session.persist(p);
			}
			private static void update(Session session,int id,String nom) {
				Produit p = new Produit();
				p=(Produit) session.get(Produit.class, id);
				p.setNomProduit(nom);
				session.update(p);
			}
			private static void delete(Session session,int id) {
				Produit p = (Produit) session.get(Produit.class, id);
				session.delete(p);
			}
			private static void afficher(Session session) {
				List<Produit> products = session.createQuery(" from Produit p").list();
				System.out.println(products);
			}
			private static Produit getProduitById(Session session,int id) {
				return (Produit) session.get(Produit.class, id);
			}
}
