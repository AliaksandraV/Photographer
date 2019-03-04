package org.photographer.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.photographer.entity.RoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class RoleDaoImp implements RoleDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public RoleDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(RoleEntity role){
        Session session = sessionFactory.getCurrentSession();
        session.save(role);
    }

    @Override
    public void update(RoleEntity role) {
        Session session = sessionFactory.getCurrentSession();
        session.update(role);
    }

    @Override
    public void delete(long id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(session.get(RoleEntity.class, id));
    }

    @Override
    public RoleEntity get(long id) {
        return sessionFactory.getCurrentSession().get(RoleEntity.class, id);
    }

    @Override
    public List<RoleEntity> list() {
        Session session = sessionFactory.getCurrentSession();
        @SuppressWarnings("unchecked")
        TypedQuery<RoleEntity> query = session.createQuery("from RoleEntity");
        return query.getResultList();
    }


}
