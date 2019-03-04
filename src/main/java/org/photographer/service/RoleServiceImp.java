package org.photographer.service;

import org.photographer.dao.RoleDao;
import org.photographer.entity.RoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImp implements RoleService {

    private final RoleDao roleDao;

    @Autowired
    public RoleServiceImp(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Transactional
    @Override
    public void add(RoleEntity role) {
        roleDao.add(role);
    }

    @Transactional
    @Override
    public void update(RoleEntity role) {
        roleDao.update(role);
    }

    @Transactional
    @Override
    public void delete(long id) {
        roleDao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public RoleEntity get(long id) {
        return roleDao.get(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<RoleEntity> list() {
        return roleDao.list();
    }
}
