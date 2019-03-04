package org.photographer;

import org.photographer.config.AppConfig;
import org.photographer.entity.AlbumEntity;
import org.photographer.entity.RoleEntity;
import org.photographer.service.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        RoleService roleService = context.getBean(RoleService.class);
        AlbumService albumService = context.getBean(AlbumService.class);
        LocalizedTextService localizedTextService = context.getBean(LocalizedTextService.class);
        PhotoCategoryService photoCategoryService = context.getBean(PhotoCategoryService.class);
        PhotoService photoService = context.getBean(PhotoService.class);

        /**CRUD для ROLEENTITY Готов*/
        //TODO Сделать в базе нормальные роли
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setRole("admin");
        roleService.add(roleEntity);
        System.out.println(roleEntity.getId());
        roleEntity.setRole("user");
        roleService.add(roleEntity);
//        System.out.println(roleEntity.getId());
//
//
//        roleEntity.setId(9);
//        roleEntity.setRole("test update");
//        roleService.update(roleEntity);
//
//        roleService.delete(12);
//
        List<RoleEntity> roles = roleService.list();
        for(RoleEntity role: roles){
            System.out.println("Id = "+ role.getId());
            System.out.println("Role = "+ role.getRole());
            System.out.println();
        }
//
//        System.out.println(roleService.get(3).getId() +"!!!"+roleService.get(3).getRole());
        /**CRUD для ALBUMENTITY Готов*/
        //TODO Сделать добавление имени при добавлении нового объекта, наверное это будет делаться через сервис
        //TODO Сделать добавление категории при создании альбома, и сделать категорию NOT NULL т.к. по факту альбом всегда будет создаваться в какой-либо категории
        //TODO При удлении удалять соответствующую строку в таблице LocalizedText!!!
        AlbumEntity album = new AlbumEntity();
//        Calendar calendar = new GregorianCalendar(2019,01,17);
//        album.setDate(calendar.getTime());
//        albumService.add(album);
//
//        album.setId(2);
//        album.setDate(new Date());
//        albumService.update(album);
//
//        albumService.delete(3);
//
//        System.out.println(albumService.get(5));
//
//        List<AlbumEntity>albums = albumService.list();
//        for (AlbumEntity album1: albums){
//            System.out.println("ID = "+ album1.getId());
//            System.out.println("Data = "+ album1.getDate());
//            System.out.println("Name = "+ album1.getLocalizedName());
//            System.out.println("Photo category = "+ album1.getPhotoCategory());
//            System.out.println();
//        }
        /**CRUD для LocalizedTextEntity*/
//        LocalizedTextEntity localizedText = new LocalizedTextEntity();

//        localizedText.setRussian("Привет");
//        localizedText.setEnglish("Helo");
//        localizedText.setGerman("hz");
//        localizedTextService.add(localizedText);
//        localizedText.setRussian("1");
//        localizedText.setEnglish("1");
//        localizedText.setGerman("1");
//        localizedTextService.add(localizedText);
//        localizedText.setRussian("2");
//        localizedText.setEnglish("2");
//        localizedText.setGerman("2");
//        localizedTextService.add(localizedText);
//
//        localizedText.setGerman("hz");
//        localizedText.setRussian("Обновила");
//        localizedText.setEnglish("Update");
//        localizedText.setId(3);
//        localizedTextService.update(localizedText);
//        localizedTextService.delete(2);
//
//        System.out.println(localizedTextService.get(1));
//
//        List<LocalizedTextEntity> locText = localizedTextService.list();
//        for (LocalizedTextEntity localizedTex:locText){
//            System.out.println("Текст на русском = "+ localizedTex.getRussian());
//            System.out.println("Текст на английском = "+ localizedTex.getEnglish());
//            System.out.println("Текст на немецком = "+ localizedTex.getGerman());
//            System.out.println();
//        }
        //TODO ПРОВЕРИТЬ РАБОТУ!!!!
        /**CRUD для PhotoCategoryEntity*/
//        PhotoCategoryEntity photoCategory = new PhotoCategoryEntity();
//        photoCategory.setCoverImagePath("First");
//        photoCategoryService.add(photoCategory);
//        photoCategory.setCoverImagePath("Second");
//        photoCategoryService.add(photoCategory);
//        photoCategory.setCoverImagePath("third");
//        photoCategoryService.add(photoCategory);
//        photoCategory.setCoverImagePath("Fourth");
//        photoCategoryService.add(photoCategory);
//
//        photoCategoryService.delete(4);
//
//        photoCategory.setId(4);
//        photoCategory.setCoverImagePath("rename!!!!");
//        photoCategoryService.update(photoCategory);
//
//        photoCategoryService.get(3);
//
//        List<PhotoCategoryEntity> photoCategoryList = photoCategoryService.list();
//        for (PhotoCategoryEntity photoCategoryEntity: photoCategoryList){
//            System.out.println("ID = "+photoCategoryEntity.getId());
//            System.out.println("Cover path = "+photoCategoryEntity.getCoverImagePath());
//            System.out.println("Name = "+photoCategoryEntity.getLocalizedName());
//            System.out.println("");
//        }

        /**CRUD для PhotoEntity*/
        //TODO Где надо в геттерах добавить проверку на NULL запрашиваемых значений
        //TODO в CRUD методах delete update get list тоже добавить проверку на NULL - только разобраться делать это надо в дао или сервисе
//        PhotoEntity photo = new PhotoEntity();
//        photo.setPath("1");
//        photoService.add(photo);
//        photo.setPath("2");
//        photoService.add(photo);
//        photo.setPath("3");
//        photoService.add(photo);
//        photo.setPath("4");
//        photoService.add(photo);
//
//        photoService.delete(4);
//
//        photo.setId(4);
//        photo.setPath("rename!!!!");
//        photoService.update(photo);
//
//        System.out.println(photoService.get(3));
//
//        List<PhotoEntity> photoList = photoService.list();
//        for (PhotoEntity photoEntity: photoList){
//            System.out.println("iD = "+photoEntity.getId());
//            System.out.println("Path = "+photoEntity.getPath());
//            System.out.println("Album = "+photoEntity.getAlbumId());
//            System.out.println("");
//        }

        context.close();
    }
}
