package main.java.com.academy;

import java.util.ArrayList;

public class Album {
    
    private String name;
    private SongList songList;

    public Album(String name) {
        this.name = name;
        this.songList = new SongList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SongList getSongList() {
        return songList;
    }

    public boolean addSong(String title, double duration) {
        return getSongList().addSong(title, duration);
    }

    public Song getSong(String title) {
        return getSongList().getSong(title);
    }

    public boolean isSongExist(String title) {
        return getSongList().isSongExist(title);
    }

    /**
     * Inner class to handle the list of songs on the album.
     */
    private class SongList {

        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }

        private ArrayList<Song> getSongs() {
            return songs;
        }

        private boolean addSong(String title, double duration) {

            if (!isValidSong(title, duration)) {
                return false;
            }
            if (isSongExist(title)) {
                return false;
            }

            boolean isAdded = this.songs.add(new Song(title, duration));

            return isAdded;
        }

        private Song getSong(String title) {

            int index = searchSong(title);
            if (index >= 0) {
                return getSongs().get(index);
            }

            return null;
        }

        private boolean isSongExist(String title) {
            return (searchSong(title) >= 0);
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

}
