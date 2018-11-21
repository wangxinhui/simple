package com.simple.spring4.chapter11.db.hiberate4;

import com.simple.spring4.chapter11.db.SpitterRepository;
import com.simple.spring4.chapter11.domain.Spitter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 * @Author: by simple on 2018/9/3.
 */
@Repository
public class HibernateSpitterRepository extends BaseDAOImpl<Spitter> implements SpitterRepository {

    @Autowired
    private BaseDAOImpl baseDAOimpl;

    @Override
    public long count() {
        return findAll().size();
    }

    @Override
    public Spitter save(Spitter spitter) {
        Serializable id = baseDAOimpl.save(spitter);
        return new Spitter((Long) id,
                spitter.getUsername(),
                spitter.getPassword(),
                spitter.getFullName(),
                spitter.getEmail(),
                spitter.isUpdateByEmail());
    }

    @Override
    public Spitter findOne(long id) {

        return null;
//        return (Spitter) baseDAO.get(Spitter.class, id);
    }

    @Override
    public Spitter findByUsername(String username) {
        return null;
//        return (Spitter) baseDAO.createCriteria(Spitter.class)
//                .add(Restrictions.eq("username", username))
//                .list().get(0);

    }

    @Override
    public List<Spitter> findAll() {
        return null;
//        return currentSession().createCriteria(Spitter.class).list();
    }
}
