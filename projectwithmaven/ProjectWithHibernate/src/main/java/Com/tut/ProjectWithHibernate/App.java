package Com.tut.ProjectWithHibernate;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */ 
public class App 
{
    



	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg =new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        
       // System.out.println(factory);
       // System.out.println(factory.isClosed());
       //creating Student
        Student St= new Student();
        St.setId(101);
        St.setCity("DELHI");
        St.setName("RAHUL");
        System.out.println(St);
        //crating address of object
        Address ad =new Address();
        ad.setStreet("street1");
        ad.setCity("DELHI");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(123.123);
        
       Session session= factory.openSession();
       
       Transaction tx=session.beginTransaction();
       session.save(St);
       session.save(ad);
       tx.commit();
       
       
       
       
       session.close();
       System.out.println("done");
          
    } 
}
