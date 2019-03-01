package com.detroitlabs.PhotoAlbum2.data;

import com.detroitlabs.PhotoAlbum2.model.Photo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class PhotoRepository {

    private static final List<Photo> ALL_PHOTOS = Arrays.asList(
            new Photo("beach", LocalDate.of(2019,8,01),"funny"),
            new Photo("caloriecount", LocalDate.of(2019,9,02), "sarcasm"),
            new Photo("dogmartini", LocalDate.of(2012,07,02), "sarcasm"),
            new Photo("gloatingdog", LocalDate.of(2018,02,02), "sarcasm"),
            new Photo("kidadvice", LocalDate.of(2014,03,02), "sarcasm"),
            new Photo("kidcryingbasketball", LocalDate.of(2019,07,02), "sarcasm"),
            new Photo("portugal", LocalDate.of(2015,05,02), "sarcasm"),
            new Photo("progammers", LocalDate.of(2016,02,02), "sarcasm"),
            new Photo("therock", LocalDate.of(2017,02,02), "sarcasm"),
            new Photo("vaccuumcleaner", LocalDate.of(2016,02,02), "sarcasm")
    );

    public List<Photo> show5photos(){
        Collections.shuffle(ALL_PHOTOS);
        for(int i = 0; i <= 5; i++){
            ALL_PHOTOS.get(i);
        }
        return ALL_PHOTOS;
    }

}
