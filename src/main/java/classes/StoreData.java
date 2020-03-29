package classes;


import entities.Person;
import entities.Plate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Address;

import java.util.List;

public class StoreData {

	public void main() {
	
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	  
	    SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	    Session session = factory.openSession();  
	    Transaction t = session.beginTransaction();  
	    
	    Address address = new Address("Gasse",25,"37339","Berlingerode");
		Plate plate = new Plate("EIC JB 111");
		Person person = new Person("Boden", "Aaron",address,plate);
	    session.save(person);
	    t.commit();

	    factory.close();
	    session.close();
	}

	public void read(){

		Session session= getSession();
		Transaction t = session.beginTransaction();

		List<Person> persons = session.createQuery("FROM Person").list();
		for (Person p:persons) {
			System.out.println(p.firstName);
		}
	}

	public Session getSession(){
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		return factory.openSession();
	}
	

}
