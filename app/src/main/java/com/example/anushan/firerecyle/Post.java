package com.example.anushan.firerecyle;

/**
 * Created by Anushan on 1/30/2018.
 */

public class Post {
    private String UID;
    private String text;

    public Post(){

    }

    public Post(String UID, String text) {
        this.UID = UID;
        this.text = text;
    }

    public String getUID() {
        return UID;
    }

    public String getText() {
        return text;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public void setText(String text) {
        this.text = text;
    }
}
