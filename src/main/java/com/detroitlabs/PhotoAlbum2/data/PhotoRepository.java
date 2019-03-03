package com.detroitlabs.PhotoAlbum2.data;

import com.detroitlabs.PhotoAlbum2.model.Photo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;

@Component
public class PhotoRepository {

    private static final List<Photo> ALL_PHOTOS = Arrays.asList(
            new Photo("alexandriaLibrary","Alexandria Library", LocalDate.of(2019,9,02), "Africa"),
            new Photo("amalfiCoast","Amalfi Coast", LocalDate.of(2012,07,02), "Europe"),
            new Photo("chicago","Chicago", LocalDate.of(2018,02,02), "USA"),
            new Photo("mikumiSafari","Mikumi Safari", LocalDate.of(2014,03,02), "Africa"),
            new Photo("neworleans","New Orleans", LocalDate.of(2019,07,02), "USA"),
            new Photo("residenceZanzibar","Residence at Zanzibar", LocalDate.of(2015,05,02), "Afirca"),
            new Photo("Ronda","Ronda", LocalDate.of(2016,02,02), "Europe"),
            new Photo("sanDiego","San Diego", LocalDate.of(2017,02,02), "USA"),
            new Photo("seville", "Seville", LocalDate.of(2016,02,02), "Europe"),
            new Photo("sanfrancisco","San Francisco", LocalDate.of(2015,04,13), "USA"),
            new Photo("newyork","New York", LocalDate.of(2015,8,13), "USA"),
            new Photo("BayBridge", "Bay Bridge, Oakland", LocalDate.of(2015,10,17), "USA"),
            new Photo("Bayt","Bay Al-Ajaib, Tanzania", LocalDate.of(2016,05,01),"Africa"),
            new Photo("BKBridgewView","Brooklyn Bridge with a View", LocalDate.of(2015,11,10),"USA"),
            new Photo("DC","White House", LocalDate.of(2017,07,07),"USA"),
            new Photo("elephant","Mikumi Safari Elephants", LocalDate.of(2016,05,02),"Africa"),
            new Photo("ItalyAlly","Ally in Italy", LocalDate.of(2018,04,20),"USA"),
            new Photo("LublubSeville","Cutest human in Seville, Spain", LocalDate.of(2018,11,20),"Europe"),
            new Photo("LubsAndLincoln","Lincoln and Lubs", LocalDate.of(2017,01,29),"USA"),
            new Photo("Malaga","Malaga", LocalDate.of(2018,11,21),"Europe"),
            new Photo("OpryLand","OpryLand in TN", LocalDate.of(2017,12,30),"USA"),
            new Photo("PicturedLakes","Pictured Lake in MI", LocalDate.of(2017,8,15),"USA"),
            new Photo("Ravello","Ravello Rescue", LocalDate.of(2018,04,22),"USA"),
            new Photo("RomeAlly","Alley in Rome", LocalDate.of(2018,4,23),"Europe"),
            new Photo("RondaCar","Fiat 500 Commercial", LocalDate.of(2017,07,07),"Europe"),
            new Photo("RowingItaly","Gondolier", LocalDate.of(2018,04,24),"Europe"),
            new Photo("TwinPeaks","Twin Peaks, SF", LocalDate.of(2016,3,13),"USA"),
            new Photo("WashingtonSQPark","Washington Square Park", LocalDate.of(2014,10,30),"USA"),
            new Photo("ZanziATV","ATV in Zanzibar", LocalDate.of(2016,05,05),"Africa")

            );

    public List<Photo> show5photos(){
        List<Photo> fivePhotos = new ArrayList<>();
        Collections.shuffle(ALL_PHOTOS);
        for(int i = 0; i < 5; i++){
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

    public List<Photo> showPhotosByTag(String tag){

        List<Photo> photosInTag = new ArrayList<>();
        for (Photo photo: ALL_PHOTOS){
            if (photo.getTag().equalsIgnoreCase(tag)) {
                photosInTag.add(photo);
            }
        }
        return photosInTag;
    }



}
