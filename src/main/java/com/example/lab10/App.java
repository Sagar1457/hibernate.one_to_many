package com.example.lab10;
//BVIDHYASAGAR..AF0320724
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.lab10.model.Address;
import com.example.lab10.model.Persons;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        
        try 
        {
        	Address area=new Address();
        	area.setName("Ameerpet");
        
        	Persons p1=new Persons();
        	p1.setName("sagar");
        	p1.setArea(area);
        
        	Persons p2=new Persons();
        	p2.setName("saibaba");
        	p2.setArea(area);
        
        	area.getPersons().add(p1);
        	area.getPersons().add(p2);
        	session.beginTransaction();
        	session.save(area);
        	session.getTransaction().commit();
        }
        finally 
        {
        	session.close();
        	sessionFactory.close();
        }
    }
}
