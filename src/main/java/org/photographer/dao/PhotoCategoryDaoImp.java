package org.photographer.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.photographer.entity.PhotoCategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class PhotoCategoryDaoImp implements PhotoCategoryDao {

    protected final SessionFactory sessionFactory;

    @Autowired
    public PhotoCategoryDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(PhotoCategoryEntity photoCategory) {
        Session session = sessionFactory.getCurrentSession();
        session.save(photoCategory);
    }

    @Override
    public void update(PhotoCategoryEntity photoCategory) {
        Session session = sessionFactory.getCurrentSession();
        session.update(photoCategory);
    }

    @Override
    public void delete(long id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(session.get(PhotoCategoryEntity.class, id));
    }

    @Override
    public PhotoCategoryEntity get(long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(PhotoCategoryEntity.class, id);
    }

    @Override
    public List<PhotoCategoryEntity> list() {
        Session session = sessionFactory.getCurrentSession();
        @SuppressWarnings("unchecked")
        TypedQuery<PhotoCategoryEntity> query = session.createQuery("from PhotoCategoryEntity");
        return query.getResultList();
    }
}
