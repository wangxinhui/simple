package chapter2;


import com.simple.spring4.chapter2.javaconfig.CDPlayer;
import com.simple.spring4.chapter2.javaconfig.JavaConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class CDPlayerTest {

    @Autowired
    private CDPlayer cd;

    @Test
    public void play(){
        cd.play();
    }
}
