package com.academy;

public class Song {
    
    private String title;
    private int duration;

    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static Song createSong(String title, int duration) {
        return new Song(title, duration);
    }

    @Override
    public String toString() {
        return (this.title.trim() + " :  Duration: " + this.duration);
    }

}
