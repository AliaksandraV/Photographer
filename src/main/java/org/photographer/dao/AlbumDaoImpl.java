package org.photographer.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.photographer.entity.AlbumEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class AlbumDaoImpl implements AlbumDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public AlbumDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(AlbumEntity album) {
        sessionFactory.getCurrentSession().save(album);
    }

    @Override
    public void update(AlbumEntity album) {
        Session session = sessionFactory.getCurrentSession();
        session.update(album);
    }

    @Override
    public void delete(long id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(session.get(AlbumEntity.class, id));
    }

    @Override
    public AlbumEntity get(long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(AlbumEntity.class, id);
    }

    @Override
    public List<AlbumEntity> list() {
        Session session = sessionFactory.getCurrentSession();
        @SuppressWarnings("unchecked")
        TypedQuery<AlbumEntity> query = session.createQuery("from AlbumEntity");
        return query.getResultList();
    }
}
