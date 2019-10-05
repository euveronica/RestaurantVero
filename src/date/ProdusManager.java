package date;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class ProdusManager  {
	
	protected SessionFactory sessionFactory;
	
	 
	    protected void setup() {
	        // code to load Hibernate Session factory
	    	
	    	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
	    	        .configure() // configures settings from hibernate.cfg.xml
	    	        .build();
	    	try {
	    	    sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
	    	} catch (Exception ex) {
	    	    StandardServiceRegistryBuilder.destroy(registry);
	    	}
  	
	    	
	    }
	 
	    protected void exit() {
	        // code to close Hibernate Session factory
	    	sessionFactory.close();

	    }
	 
	    protected void create() {
	        // code to save a book
	    	Produs produs = new Produs();
	    	produs.setNume_categorie("Peste");
	    	produs.setNume_produs("Somon (200g)");
	    	produs.setDescriere_produs("Cu sos de roșii și usturoi, lămâie");
	    	produs.setPret_unitar(43.50f);
	    	produs.setNivel_existent(30);
	    	produs.setNumar_portii(5);
	    	
	     
	        Session session = sessionFactory.openSession();
	        session.beginTransaction();
	     
	        session.save(produs);
	     
	        session.getTransaction().commit();
	        session.close();
	    }
	 
	    protected void read() {
	        // code to get a book
	    	Session session = sessionFactory.openSession();
	    	 
	        long produsId = 15;
	       Produs produs = session.get(Produs.class, produsId);
	     
	        System.out.println("Categorie: " + produs.getNume_categorie());
	        System.out.println("Produs: " + produs.getNume_produs());
	        System.out.println("Descriere Produs: " + produs.getDescriere_produs());
	     
	        session.close();
	    }
	 
	    protected void update() {
	        // code to modify a book
	    	Produs produs = new Produs();
	    	produs.setId_produs(22);
	    	produs.setNume_categorie("PESTE");
	    	produs.setNume_produs("Somon prajit (200g)");
	    	produs.setDescriere_produs("Cu sos de roșii și usturoi, lămâie");
	    	produs.setPret_unitar(43.50f);
	    	produs.setNivel_existent(30);
	    	produs.setNumar_portii(5);
	        
	        
	     
	        Session session = sessionFactory.openSession();
	        session.beginTransaction();
	     
	        session.update(produs);
	     
	        session.getTransaction().commit();
	        session.close();
	    }
	 
	    protected void delete() {
	        // code to remove a book
	    	 Produs produs = new Produs();
	    	    produs.setId_produs(28);
	    	 
	    	    Session session = sessionFactory.openSession();
	    	    session.beginTransaction();
	    	 
	    	    session.delete(produs);
	    	 
	    	    session.getTransaction().commit();
	    	    session.close();
	    }
	   
	   	       
	    public static void main(String[] args) {
	        // code to run the program
	        ProdusManager manager = new ProdusManager();
	        manager.setup();
	     
	        manager.create();
	        manager.exit();
	    	
	    }

		
}
