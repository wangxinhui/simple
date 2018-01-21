import com.simple.springcp.model.User;
import com.simple.springcp.service.UserService;
import org.junit.Test;

public class UserServiceTest {

    @Test
    public void addTest(){
        UserService userService = new UserService();
        User user = new User();
        userService.save(user);
    }
}
