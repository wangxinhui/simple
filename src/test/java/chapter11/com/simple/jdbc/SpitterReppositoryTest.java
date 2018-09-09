package chapter11.com.simple.jdbc;

import com.simple.spring4.chapter11.db.SpitterRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: by simple on 2018/9/6.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JdbcConfig.class)
public class SpitterReppositoryTest {

    @Autowired
    private SpitterRepository spitterRepository;

    @Test
    @Transactional
    public void count(){
        System.out.println( spitterRepository.count());
    }
}
