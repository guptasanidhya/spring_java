package springmvc.Dao;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import springmvc.model.User;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public UserDaoImpl() {
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }



    @Override
    @Transactional
    public int saveUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);
        session.flush(); //flush the session so that user get save instantly othewise until session is closed it will not be saved
        System.out.println("User has been added successfully");
        return user.getId();
    }
}
