package ua.org.myko.system.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.org.myko.system.model.Comment;
import ua.org.myko.system.model.Photo;
import ua.org.myko.system.service.CommentService;
import ua.org.myko.system.service.PhotoService;

import java.util.List;

/**
 * Created by Le on 4/30/2016.
 */
@RestController
@RequestMapping("/rest")
public class CommentResources {

    @Autowired
    private PhotoService photoService;

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/comment/add", method = RequestMethod.POST)
    public void addComment (@RequestBody Comment comment) {
        Photo photo = photoService.findByPhotoId(comment.getPhotoId());
        List<Comment> commentList=photo.getCommentList();
        comment.setPhoto(photo);
//        if (commentList==null) {
//            commentList = new ArrayList<Comment>();
//        }
//        commentList.add(comment);
//        photo.setCommentList(commentList);
//        photoService.save(photo);
        commentService.save(comment);
    }
}
