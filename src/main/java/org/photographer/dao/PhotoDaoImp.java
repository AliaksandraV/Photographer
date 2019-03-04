package org.photographer.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.photographer.entity.PhotoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class PhotoDaoImp implements PhotoDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public PhotoDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(PhotoEntity photo) {
        Session session = sessionFactory.getCurrentSession();
        session.save(photo);
    }

    @Override
    public void update(PhotoEntity photo) {
        Session session = sessionFactory.getCurrentSession();
        session.update(photo);
    }

    @Override
    public void delete(long id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(session.get(PhotoEntity.class, id));
    }

    @Override
    public PhotoEntity get(long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(PhotoEntity.class, id);
    }

    @Override
    public List<PhotoEntity> list() {
        Session session = sessionFactory.getCurrentSession();
        @SuppressWarnings("unchecked")
        TypedQuery<PhotoEntity> query= session.createQuery("from PhotoEntity ");
        return query.getResultList();
    }
}
