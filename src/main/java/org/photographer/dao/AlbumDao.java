package org.photographer.dao;


import org.photographer.entity.AlbumEntity;

import java.util.List;

public interface AlbumDao {

    void add(AlbumEntity album);
    void update(AlbumEntity album);
    void delete(long id);
    AlbumEntity get(long id);
    List<AlbumEntity> list();
}
