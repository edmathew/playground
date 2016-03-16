package pt.ejpm.learn.hibernate.filehandler.entities;

import org.hibernate.SessionFactory;
import pt.ejpm.learn.hibernate.HibernateSession;

/**
 *
 * @author utilizador
 */
public class Main {

    public static void main(String[] args) {
        final SessionFactory factory = HibernateSession.createSessionFactory();
                
        
        
        System.out.println("tests");
    }

}
