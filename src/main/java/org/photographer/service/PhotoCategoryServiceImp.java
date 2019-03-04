package org.photographer.service;

import org.photographer.dao.PhotoCategoryDao;
import org.photographer.entity.PhotoCategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PhotoCategoryServiceImp implements PhotoCategoryService {

    private final PhotoCategoryDao photoCategoryDao;

    @Autowired
    public PhotoCategoryServiceImp(PhotoCategoryDao photoCategoryDao) {
        this.photoCategoryDao = photoCategoryDao;
    }

    @Transactional
    @Override
    public void add(PhotoCategoryEntity photoCategory) {
        photoCategoryDao.add(photoCategory);
    }

    @Transactional
    @Override
    public void update(PhotoCategoryEntity photoCategory) {
        photoCategoryDao.update(photoCategory);
    }

    @Transactional
    @Override
    public void delete(long id) {
        photoCategoryDao.delete(id);
    }

    @Transactional
    @Override
    public PhotoCategoryEntity get(long id) {
        return photoCategoryDao.get(id);
    }

    @Transactional
    @Override
    public List<PhotoCategoryEntity> list() {
        return photoCategoryDao.list();
    }
}
