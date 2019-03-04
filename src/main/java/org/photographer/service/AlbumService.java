package org.photographer.service;


import org.photographer.entity.AlbumEntity;

import java.util.List;

public interface AlbumService {

    void add(AlbumEntity role);
    void update(AlbumEntity role);
    void delete(long id);
    AlbumEntity get(long id);
    List<AlbumEntity> list();
}
