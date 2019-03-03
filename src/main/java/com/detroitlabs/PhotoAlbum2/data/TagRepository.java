package com.detroitlabs.PhotoAlbum2.data;

import com.detroitlabs.PhotoAlbum2.model.Photo;
import com.detroitlabs.PhotoAlbum2.model.Tag;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class TagRepository {

    private static final List<Tag> ALL_TAGS = Arrays.asList(
            new Tag("USA"),
            new Tag("Europe"),
            new Tag ("Africa")
    );

    public List<Tag> getAllTags(){
        return ALL_TAGS;
    }

    public Tag findByTag(String tagName){
        for (Tag tag: ALL_TAGS){
            if(tag.getTag().equalsIgnoreCase(tagName)) {
                return tag;
            }
        }
        return null;
    }

}



