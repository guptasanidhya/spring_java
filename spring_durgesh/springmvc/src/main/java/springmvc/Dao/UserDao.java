package springmvc.Dao;
import org.springframework.stereotype.Repository;
import springmvc.model.User;

@Repository
public interface UserDao {

    public int saveUser(User user);
}
