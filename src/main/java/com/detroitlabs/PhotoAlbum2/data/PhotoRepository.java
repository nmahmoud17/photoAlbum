package com.detroitlabs.PhotoAlbum2.data;

import com.detroitlabs.PhotoAlbum2.model.Photo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;

@Component
public class PhotoRepository {

    private static final List<Photo> ALL_PHOTOS = Arrays.asList(
            new Photo("beach", LocalDate.of(2019,8,01),"funny"),
            new Photo("alexandriaLibrary", LocalDate.of(2019,9,02), "sarcasm"),
            new Photo("amalfiCoast", LocalDate.of(2012,07,02), "sarcasm"),
            new Photo("chicago", LocalDate.of(2018,02,02), "sarcasm"),
            new Photo("mikumiSafari", LocalDate.of(2014,03,02), "sarcasm"),
            new Photo("neworleans", LocalDate.of(2019,07,02), "sarcasm"),
            new Photo("residenceZanzibar", LocalDate.of(2015,05,02), "sarcasm"),
            new Photo("Ronda", LocalDate.of(2016,02,02), "sarcasm"),
            new Photo("sanDiego", LocalDate.of(2017,02,02), "sarcasm"),
            new Photo("seville", LocalDate.of(2016,02,02), "sarcasm"),
            new Photo("sanfrancisco", LocalDate.of(2015,04,13), "sarcasm"),
            new Photo("newyork", LocalDate.of(2015,8,13), "sarcasm")

    );

    public List<Photo> show5photos(){
        List<Photo> fivePhotos = new ArrayList<>();
        Collections.shuffle(ALL_PHOTOS);
        for(int i = 0; i <= 5; i++){
            Photo photo = ALL_PHOTOS.get(i);
            fivePhotos.add(photo);
        }
        return fivePhotos;
    }

    public List<Photo> sortByDate(){
        Collections.sort(ALL_PHOTOS, new Comparator<Photo>() {
            @Override
            public int compare(Photo o1, Photo o2) {
                return o1.getUploadDate().compareTo(o2.getUploadDate());
            }
        }); return ALL_PHOTOS;

    }

}
