import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

class Save {
    Save(){
        Message m = new Message();
        m.setText("Hello");
        EntityManagerFactory emp = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager em = emp.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(m);
        et.commit();
        em.close();
        emp.close();
    }
}
