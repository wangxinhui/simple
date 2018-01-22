import com.simple.springcp.dao.UserDAO;
import com.simple.springcp.model.User;
import com.simple.springcp.service.UserService;
import com.simple.springcp.spring.ClassPathXmlApplicationContext;
import com.simple.springcp.spring.Factory;
import org.junit.Test;

public class UserServiceTest {

    @Test
    public void addTest(){
        Factory factory = new ClassPathXmlApplicationContext();
        Object o = factory.getBean("userService");
        User u = new User();
        UserDAO userDAO = (UserDAO) o;
        UserService userService = new UserService();
        userService.setUserDAO(userDAO);
        userService.save(u);
//        service.save(u);
    }
}
