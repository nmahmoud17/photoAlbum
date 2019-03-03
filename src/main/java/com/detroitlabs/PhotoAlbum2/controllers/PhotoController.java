package com.detroitlabs.PhotoAlbum2.controllers;

import com.detroitlabs.PhotoAlbum2.data.PhotoRepository;
import com.detroitlabs.PhotoAlbum2.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;



@Controller
public class PhotoController {

    @Autowired
    private PhotoRepository photoRepository;

    @RequestMapping("/")
    public String showFivePhotos(ModelMap modelMap){
        List<Photo> fivePhotos = photoRepository.show5photos();
        modelMap.put("fivePhotos", fivePhotos);
        return "index";
    }

    @RequestMapping("/sortedDate")
    public String showSortedByDatePhotos(ModelMap modelMap){
        List<Photo> photo = photoRepository.sortByDate();
        modelMap.put("sortedDate", photo);
        return "sortedByDate";
    }





}
