package d.model.dao;

//import d.model.pojos.Empleado;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class EmpleadoDAO {
    SessionFactory sf = null;
    Session session = null;
    Transaction transaction = null;
    
    public void add(Object e){
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            transaction = session.beginTransaction();
           
            session.save(e);
            transaction.commit();
            session.close();
        } catch (Exception ex) {
            transaction.rollback();
            throw new RuntimeException("Error: No se agregar el empleado!");
        }
    }
    
    public List list(){
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            transaction = session.beginTransaction();
            
            Query q = session.createQuery("from empleados");
            return q.list();
        } catch (Exception e) {
            transaction.rollback();
            throw new RuntimeException("Error: No se pudieron listar los empleados!");
        }
    }
    
}
