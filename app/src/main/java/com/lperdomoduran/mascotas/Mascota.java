package com.lperdomoduran.mascotas;

/**
 * Created by lperdomoduran on 12/11/16.
 */

public class Mascota {

    private String name;
    private int photo;
    private String likes;

    public Mascota(String name, int photo, String likes) {
        this.name = name;
        this.photo = photo;
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
}
