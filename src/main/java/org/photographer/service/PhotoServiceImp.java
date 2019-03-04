package org.photographer.service;

import org.photographer.dao.PhotoDao;
import org.photographer.entity.PhotoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PhotoServiceImp implements PhotoService {

    private final PhotoDao photoDao;

    @Autowired
    public PhotoServiceImp(PhotoDao photoDao) {
        this.photoDao = photoDao;
    }

    @Transactional
    @Override
    public void add(PhotoEntity photo) {
        photoDao.add(photo);
    }

    @Transactional
    @Override
    public void update(PhotoEntity photo) {
        photoDao.update(photo);
    }

    @Transactional
    @Override
    public void delete(long id) {
        photoDao.delete(id);
    }

    @Transactional
    @Override
    public PhotoEntity get(long id) {
        return photoDao.get(id);
    }

    @Transactional
    @Override
    public List<PhotoEntity> list() {
        return photoDao.list();
    }
}
