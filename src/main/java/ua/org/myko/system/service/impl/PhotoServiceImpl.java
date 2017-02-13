package ua.org.myko.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.org.myko.system.dao.PhotoDao;
import ua.org.myko.system.model.Photo;
import ua.org.myko.system.model.UserOur;
import ua.org.myko.system.service.PhotoService;

import java.util.List;

/**
 * Created by lede on 4/29/16.
 */

@Service
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    private PhotoDao photoDao;

    public Photo save(Photo photo) {
        return photoDao.save(photo);
    }

    public List<Photo> findAll() {
        return photoDao.findAll();
    }

    public List<Photo> findByUserOur(UserOur userOur) {
        return photoDao.findByUserOur(userOur);
    }

    public Photo findByPhotoId(Long photoId) {
        return photoDao.findByPhotoId(photoId);
    }
}
