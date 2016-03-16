package pt.ejpm.learn.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author utilizador
 */
public class HibernateSession {

    private final static Configuration CONFIGURATION = new Configuration();
    //private final static 

    static {
        CONFIGURATION.configure();
    }

    public static SessionFactory createSessionFactory() {
        final ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(CONFIGURATION.getProperties()).buildServiceRegistry();
        return CONFIGURATION.buildSessionFactory(serviceRegistry);
    }

}
