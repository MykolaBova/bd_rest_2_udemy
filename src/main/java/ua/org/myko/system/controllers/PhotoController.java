package ua.org.myko.system.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.org.myko.system.model.Photo;
import ua.org.myko.system.service.PhotoService;

import java.util.List;

/**
 * Created by lede on 4/29/16.
 */

@RestController
@RequestMapping("/photo")
public class PhotoController {

    @Autowired
    private PhotoService photoService;

    @RequestMapping("/allPhotos")
    public List<Photo> getAllPhotos () {
        return photoService.findAll();
    }

}
