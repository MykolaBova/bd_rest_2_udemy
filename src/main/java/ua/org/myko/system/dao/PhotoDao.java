package ua.org.myko.system.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.org.myko.system.model.Photo;
import ua.org.myko.system.model.UserOur;

import java.util.List;

/**
 * Created by Le on 4/24/2016.
 */
@Repository
public interface PhotoDao extends CrudRepository<Photo, Long> {
    Photo save(Photo photo);

    List<Photo> findByUserOur(UserOur userOur);

    List<Photo> findAll();

    Photo findByPhotoId(Long photoId);
}
