package ua.org.myko.system.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.org.myko.system.model.User;

import java.util.List;

/**
 * Created by Le on 4/24/2016.
 */

@Repository
public interface UserDao extends CrudRepository<User, Long> {
    List<User> findAll();

    User findByUserName(String userName);

    User findByUserId(Long userId);

    User save(User user);
}
