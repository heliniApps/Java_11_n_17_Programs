package com.academy;

import java.util.ArrayList;

public class Album {
    
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(String title, double duration) {

        if (!isValidSong(title, duration)) {
            return false;
        }
        if (isSongExist(title)) {
            return false;
        }

        boolean isAdded = songs.add(Song.createSong(title, duration));

        return isAdded;
    }

    public boolean isSongExist(String title) {
        return (searchSong(title) >= 0);
    }

    public Song getSong(String title) {

        int index = searchSong(title);
        if (index >= 0) {
            return getSongs().get(index);
        }

        return null;
    }

    private int searchSong(String title) {

        if (!isValidTitle(title)) {
            return -1;
        }

        for (int i=0; i < getSongs().size(); i++) {
            if (getSongs().get(i).getTitle().trim().equalsIgnoreCase(title.trim())) {
                return i;
            }
        }

        return -1;
    }

    private boolean isValidTitle(String title) {
        return ((title != null) && (!title.isBlank()));
    }

    private boolean isValidSong(String title, double duration) {
        return (isValidTitle(title) && (duration > 0));
    }

}
