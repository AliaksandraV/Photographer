package org.photographer.dao;

import org.photographer.entity.LocalizedTextEntity;

import java.util.List;

public interface LocalizedTextDao {

    void add(LocalizedTextEntity localizedText);
    void update(LocalizedTextEntity localizedText);
    void delete(long id);
    LocalizedTextEntity get(long id);
    List<LocalizedTextEntity> list();
}
