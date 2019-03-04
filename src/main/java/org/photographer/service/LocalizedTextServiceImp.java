package org.photographer.service;

import org.photographer.dao.LocalizedTextDao;
import org.photographer.entity.LocalizedTextEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LocalizedTextServiceImp implements LocalizedTextService {

    private final LocalizedTextDao localizedTextDao;

    @Autowired
    public LocalizedTextServiceImp(LocalizedTextDao localizedTextDao) {
        this.localizedTextDao = localizedTextDao;
    }

    @Transactional
    @Override
    public void add(LocalizedTextEntity localizedText) {
        localizedTextDao.add(localizedText);
    }

    @Transactional
    @Override
    public void update(LocalizedTextEntity localizedText) {
        localizedTextDao.update(localizedText);
    }

    @Transactional
    @Override
    public void delete(long id) {
        localizedTextDao.delete(id);
    }

    @Transactional
    @Override
    public LocalizedTextEntity get(long id) {
        return localizedTextDao.get(id);
    }

    @Transactional
    @Override
    public List<LocalizedTextEntity> list() {
        return localizedTextDao.list();
    }
}
