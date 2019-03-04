package org.photographer.service;

import org.photographer.dao.AlbumDao;
import org.photographer.entity.AlbumEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AlbumServiceImp implements AlbumService{

    private final AlbumDao albumDao;

    @Autowired
    public AlbumServiceImp(AlbumDao albumDao) {
        this.albumDao = albumDao;
    }

    @Transactional
    @Override
    public void add(AlbumEntity album) {
        albumDao.add(album);
    }

    @Transactional
    @Override
    public void update(AlbumEntity album) {
        albumDao.update(album);
    }

    @Transactional
    @Override
    public void delete(long id) {
        albumDao.delete(id);
    }

    @Transactional
    @Override
    public AlbumEntity get(long id) {
        return albumDao.get(id);
    }

    @Transactional
    @Override
    public List<AlbumEntity> list() {
        return albumDao.list();
    }
}
