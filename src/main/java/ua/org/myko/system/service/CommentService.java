package ua.org.myko.system.service;


import ua.org.myko.system.model.Comment;

import java.util.List;

/**
 * Created by Le on 4/30/2016.
 */
public interface CommentService {
    Comment save(Comment comment);

    List<Comment> findByPhotoId(Long photoId);

    Comment findOne(Long commentId);

}
