package ua.org.myko.system.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.org.myko.system.model.UserOur;

import java.util.List;

/**
 * Created by Le on 4/24/2016.
 */

@Repository
public interface UserDao extends CrudRepository<UserOur, Long> {
    List<UserOur> findAll();

    UserOur findByUserName(String userName);

    UserOur findByUserId(Long userId);

    UserOur save(UserOur userOur);
}
