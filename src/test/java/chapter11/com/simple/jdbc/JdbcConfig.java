package chapter11.com.simple.jdbc;

import com.simple.spring4.chapter11.db.SpitterRepository;
import com.simple.spring4.chapter11.db.hiberate4.BaseDAO;
import com.simple.spring4.chapter11.db.hiberate4.BaseDAOImpl;
import com.simple.spring4.chapter11.db.hiberate4.HibernateSpitterRepository;
import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author: by simple on 2018/9/4.
 */
@Configuration
@ComponentScan
@EnableTransactionManagement
public class JdbcConfig implements TransactionManagementConfigurer{

    @Autowired
    private SessionFactory sessionFactory;

    @Bean
    public DataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8");
        ds.setUsername("root");
        ds.setPassword("123456");
        return ds;
    }

    @Bean
    public SessionFactory sessionFactory(DataSource dataSource) throws IOException {
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setPackagesToScan(new String[]{"com.simple4.chapter11.domain"});
        Properties props = new Properties();
        props.setProperty("dialect", "org.hibernate.dialect.H2Dialect");
        sessionFactoryBean.setHibernateProperties(props);
        sessionFactoryBean.afterPropertiesSet();
        SessionFactory object = sessionFactoryBean.getObject();
        return object;
    }



    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
        hibernateTransactionManager.setSessionFactory(sessionFactory);
        return hibernateTransactionManager;
    }
}
