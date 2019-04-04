package com.TP2.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.TP2.entities.Employer;
import com.TP2.entities.Adresse;
import com.TP2.entities.Projet;
import com.TP2.entities.Equipe;
import com.TP2.entities.Entreprise;



public class Main {
	
	public static SessionFactory factory;
	public static void main(String[] args) {
		
				
			factory = new Configuration().configure().buildSessionFactory();
			
			Session session = factory.openSession();
			Transaction t = session.beginTransaction();
			
			//Création employés
	        Employer e1 = new Employer();
	        e1.setNom("emp1");
	        e1.setPrenom("empr1");
	        e1.setAge(25);
	        session.persist(e1);
	        
	        Employer e2 = new Employer();
	        e2.setNom("emp2");
	        e2.setPrenom("empr2");
	        e2.setAge(30);
	        session.persist(e2);
	        
	        Employer e3 = new Employer();
	        e3.setNom("emp3");
	        e3.setPrenom("empr3");
	        e3.setAge(35);
	        session.persist(e3);
	        
	        Employer e4 = new Employer();
	        e4.setNom("emp4");
	        e4.setPrenom("empr4");
	        e4.setAge(40);
	        session.persist(e4);
	        
	        Employer e5 = new Employer();
	        e5.setNom("emp5");
	        e5.setPrenom("empr5");
	        e5.setAge(45);
	        session.persist(e5);
	        
	        //Création projets
	        
	        Projet proj1 = new Projet();
	        proj1.setNom("proj1");
	        session.persist(proj1);
	        
	        Projet proj2 = new Projet();
	        proj2.setNom("proj2");
	        session.persist(proj2);
	        
	        Projet proj3 = new Projet();
	        proj1.setNom("proj3");
	        session.persist(proj3);
	        
	        Projet proj4 = new Projet();
	        proj1.setNom("proj4");
	        session.persist(proj4);
	        
	        //Affection Projet_employé
	        
	        List<Projet> emproj1=new ArrayList<Projet>();
	        emproj1.add(proj1);
	        emproj1.add(proj2);
	        
	        List<Projet> emproj2=new ArrayList<Projet>();
	        emproj2.add(proj3);
	        emproj2.add(proj4);
	        
	        List<Employer> emps1 = new ArrayList<Employer>();
	        emps1.add(e1);
	        emps1.add(e2);
	        
	        List<Employer> emps2 = new ArrayList<Employer>();
	        emps1.add(e4);
	        emps1.add(e5);
	        
	        proj1.setEmployer(emps1);
	        proj2.setEmployer(emps1);
	        proj3.setEmployer(emps2);
	        proj4.setEmployer(emps2);
	        
	        e1.setProjets(emproj1);
	        e2.setProjets(emproj1);
	        e4.setProjets(emproj2);
	        e5.setProjets(emproj2);
	        
	        session.persist(e1);
	        session.persist(e2);
	        session.persist(e4);
	        session.persist(e5);
	//Création Adresses
	        
	        Adresse ad1 = new Adresse ();
	       ad1.setRue("rue1");
	       ad1.setVille("ville1");
	       ad1.setCodePostale(69000);
	       session.persist(ad1);

	       Adresse ad2 = new Adresse ();
	       ad2.setRue("rue2");
	       ad2.setVille("ville2");
	       ad2.setCodePostale(69001);
	       session.persist(ad2);

	       Adresse ad3 = new Adresse ();
	       ad3.setRue("rue3");
	       ad3.setVille("ville3");
	       ad3.setCodePostale(69002);
	       session.persist(ad3);

	       Adresse ad4 = new Adresse ();
	       ad4.setRue("rue4");
	       ad4.setVille("ville4");
	       ad4.setCodePostale(69003);
	       session.persist(ad4);

	       Adresse ad5 = new Adresse ();
	       ad5.setRue("rue5");
	       ad5.setVille("ville5");
	       ad5.setCodePostale(69004);
	       session.persist(ad5);

	        //Affectation adresse-employé
	        for (int i=1; i<=5; i++) {
	       Employer ei = new Employer();
	       Adresse ai = new Adresse();
	       ei.setAdresse(ai);
	       session.persist(ei);
	        }

	        //Création équipes
	        Equipe eq1 = new Equipe();
	            eq1.setNom("Java");
	            session.persist(eq1);
	                            
	        Equipe eq2 = new Equipe();
	            eq2.setNom(".Net");
	            session.persist(eq2);
	            
	        //Affectation equipe-employé
	            
	            
	            e1.setEquipe(eq1);
	            e2.setEquipe(eq1);
	            e4.setEquipe(eq1);
	            
	            List<Employer> empEq1=new ArrayList<Employer>();
	            empEq1.add(e1);
	            empEq1.add(e2);
	            empEq1.add(e4);
	            
	            List<Employer> empEq2=new ArrayList<Employer>();
	            empEq2.add(e5);
	            
	            eq1.setEmployer(empEq1);
	            eq2.setEmployer(empEq2);
	            session.persist(e1);
	            session.persist(e2);
	            session.persist(e4);
	            session.persist(e5);
	            session.persist(eq1);
	            session.persist(eq2);
	        
	        //Création entreprise
	        Entreprise ent = new Entreprise();
	        ent.setNom("ent1");
	        session.persist(ent);
	        
	        //Affectation entreprise
	        
	        e1.setEntreprise(ent);
	        e2.setEntreprise(ent);
	        e3.setEntreprise(ent);
	        e4.setEntreprise(ent);
	        e5.setEntreprise(ent);
	        
	        List<Employer> empEnt=new ArrayList<Employer>();
	        empEnt.add(e1);
	        empEnt.add(e2);
	        empEnt.add(e3);
	        empEnt.add(e4);
	        empEnt.add(e5);
	        
	        ent.setEmployer(empEnt);
	        session.persist(e1);
	        session.persist(e2);
	        session.persist(e3);
	        session.persist(e4);
	        session.persist(e5);
	        session.persist(ent);
	                
	        t.commit();

			
	}
	
	

}
