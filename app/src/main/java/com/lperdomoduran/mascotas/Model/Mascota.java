package com.lperdomoduran.mascotas.Model;

/**
 * Created by lperdomoduran on 12/11/16.
 */

public class Mascota {



    private int id;
    private String name;
    private int photo;
    private int likes = 0;

    public Mascota(String name, int photo, int likes) {
        this.name = name;
        this.photo = photo;
        this.likes = likes;
    }

    public Mascota() {

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

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
