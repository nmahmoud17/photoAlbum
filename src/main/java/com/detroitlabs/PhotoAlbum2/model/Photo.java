package com.detroitlabs.PhotoAlbum2.model;

import java.time.LocalDate;

public class Photo {

    private String name;
    private LocalDate uploadDate;
    private String tag;

    public Photo(String name, LocalDate uploadDate, String tag) {
        this.name = name;
        this.uploadDate = uploadDate;
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDate uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

}
