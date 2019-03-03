package com.detroitlabs.PhotoAlbum2.model;

import java.time.LocalDate;

public class Photo {

    private String name;
    private LocalDate uploadDate;
    private String tag;
    private String printName;

    public Photo(String name, String printName, LocalDate uploadDate, String tag) {
        this.name = name;
        this.printName = printName;
        this.uploadDate = uploadDate;
        this.tag = tag;
    }

    public String getPrintName() {
        return printName;
    }

    public void setPrintName(String printName) {
        this.printName = printName;
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
