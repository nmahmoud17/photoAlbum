package com.detroitlabs.PhotoAlbum2.controllers;

import com.detroitlabs.PhotoAlbum2.data.PhotoRepository;
import com.detroitlabs.PhotoAlbum2.data.TagRepository;
import com.detroitlabs.PhotoAlbum2.model.Photo;
import com.detroitlabs.PhotoAlbum2.model.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TagController {
    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private PhotoRepository photoRepository;

    @RequestMapping("/tags")
    public String displayAllTags(ModelMap modelMap){
        List<Tag> allTags = tagRepository.getAllTags();
        modelMap.put("tags", allTags);
        return "tags";
    }

    @RequestMapping("/tags/{tag}")
    public String findPhotosByTag (ModelMap modelMap, @PathVariable String tag){
        Tag tag1 = tagRepository.findByTag(tag);
        modelMap.put("tag", tag1);

        List<Photo> photos = photoRepository.showPhotosByTag(tag);
        modelMap.put("photos", photos);
        return "tag";
    }

}
