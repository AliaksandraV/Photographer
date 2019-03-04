package org.photographer.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "album")
public class AlbumEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "localized_name_id")
    private LocalizedTextEntity localizedName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "photo_category_id")
    private PhotoCategoryEntity photoCategory;

    //todo Настройка orphanRemoval=true переводится с английского — "удалять сирот".
    //todo Если мы удалим из БД — все связанные с ним также будут удалены. Надо подумать нужно ли это указывать
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "albumId", orphanRemoval = true)
    private List<PhotoEntity> photoList;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public LocalizedTextEntity getLocalizedName() {
        return localizedName;
    }

    public void setLocalizedName(LocalizedTextEntity localizedName) {
        this.localizedName = localizedName;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public PhotoCategoryEntity getPhotoCategory() {
        return photoCategory;
    }

    public void setPhotoCategory(PhotoCategoryEntity photoCategory) {
        this.photoCategory = photoCategory;
    }


    public List<PhotoEntity> getPhotoList() {
        return photoList;
    }

    public void setPhotoList(List<PhotoEntity> photo) {
        this.photoList = photo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumEntity that = (AlbumEntity) o;
        return id == that.id &&
                Objects.equals(localizedName, that.localizedName) &&
                Objects.equals(date, that.date) &&
                Objects.equals(photoCategory, that.photoCategory) &&
                Objects.equals(photoList, that.photoList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, localizedName, date, photoCategory, photoList);
    }

    @Override
    public String toString() {
        return "AlbumEntity{" +
                "id=" + id +
                ", localizedName=" + localizedName +
                ", date=" + date +
                ", photoCategory=" + photoCategory +
                '}';
    }
}
