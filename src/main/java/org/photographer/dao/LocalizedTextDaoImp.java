package org.photographer.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.photographer.entity.LocalizedTextEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class LocalizedTextDaoImp implements LocalizedTextDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public LocalizedTextDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(LocalizedTextEntity localizedText) {
        Session session = sessionFactory.getCurrentSession();
        session.save(localizedText);
    }

    @Override
    public void update(LocalizedTextEntity localizedText) {
        Session session = sessionFactory.getCurrentSession();
        session.update(localizedText);
    }

    @Override
    public void delete(long id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(session.get(LocalizedTextEntity.class, id));
    }

    @Override
    public LocalizedTextEntity get(long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(LocalizedTextEntity.class, id);
    }

    //TODO Возможно тут понадобиться список строк с определенным id, ИЛИ тут СПИСКИ вообще НЕ НУЖНЫ
    @Override
    public List<LocalizedTextEntity> list() {
        Session session = sessionFactory.getCurrentSession();
        @SuppressWarnings("unchecked")
        TypedQuery <LocalizedTextEntity> query = session.createQuery("from LocalizedTextEntity ");
        return query.getResultList();
    }
}
