package ua.org.myko.system.service;


import ua.org.myko.system.model.Photo;
import ua.org.myko.system.model.UserOur;

import java.util.List;

/**
 * Created by lede on 4/29/16.
 */
public interface PhotoService {
    Photo save(Photo photo);

    List<Photo> findAll();

    List<Photo> findByUserOur(UserOur userOur);

    Photo findByPhotoId(Long photoId);

}
