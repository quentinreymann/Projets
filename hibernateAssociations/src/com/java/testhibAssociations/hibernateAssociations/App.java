package com.java.testhibAssociations.hibernateAssociations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import embedded.Adresse;
import embedded.Employe;

public class App {

	public static SessionFactory factory;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
			factory = new Configuration().configure().buildSessionFactory();
			
			Session session = factory.openSession();
			Transaction t = session.beginTransaction();
			
			/*Employe e = new Employe();
			e.setNom("emp1");
			e.setPrenom("emppre");
			e.setAge(20);
			
			Adresse a=new Adresse();
			a.setAdresse("paris");
			a.setEmploye(e);
			e.setAdresse(a);
			session.persist(e);*/
			
			
			/*Employe e = new Employe();
			e.setNom("emp1");
			e.setPrenom("emppre");
			e.setAge(20);
			
			
			Projet proj1=new Projet();
			proj1.setNom("projBiat");
			proj1.setEmploye(e);
			
			Projet proj2=new Projet();
			proj2.setNom("projATB");
			proj2.setEmploye(e);
			
			List<Projet> emprojets=new ArrayList<Projet>();
			emprojets.add(proj1);
			emprojets.add(proj2);
			
			e.setProjets(emprojets);
			session.persist(e);*/
			
			/*Employe e = new Employe();
			e.setNom("emp1");
			e.setPrenom("emppre");
			e.setAge(20);
			
			Employe e1 = new Employe();
			e1.setNom("emp2");
			e1.setPrenom("emppre2");
			e1.setAge(20);
			
			Projet proj1=new Projet();
			proj1.setNom("projBiat");
			
			Projet proj2=new Projet();
			proj2.setNom("projATB");
			
			List<Projet> emprojets=new ArrayList<Projet>();
			emprojets.add(proj1);
			emprojets.add(proj2);
			
			List<Employe> emps = new ArrayList<Employe>();
			emps.add(e1);
			emps.add(e);
			
			proj1.setEmployers(emps);
			proj2.setEmployers(emps);
			
			e.setProjets(emprojets);
			e1.setProjets(emprojets);
			
			e.setProjets(emprojets);
			session.persist(e);*/
			Employe e = new Employe();
			e.setNom("Weissmuller");
			e.setPrenom("BoB");
			e.setAge(20);
			
			Adresse a=new Adresse();
			a.setRue("avenue du général De Gaulle ");
			a.setVille("Strasbourg");
			a.setCodePostale(67000);
			e.setAdresse(a);
			session.persist(e);
			t.commit();
	}

}
