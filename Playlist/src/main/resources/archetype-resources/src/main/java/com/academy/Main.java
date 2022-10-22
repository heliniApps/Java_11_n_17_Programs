package com.academy;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {

        ArrayList<Album> albums = getAllAlbums();

        Playlist playlist = new Playlist("My New Playlist");
        playlist.addSong("song1", albums);
        playlist.addSong("song8", albums);
        playlist.addSong("song6", albums);
        playlist.addSong("song3", albums);

        playlist.play();

        playlist.exit();

    }

    private static ArrayList<Album> getAllAlbums() {

        ArrayList<Album> albums = new ArrayList<Album>();

        Album album = new Album("Album1");
        album.addSong("song1", 4);
        album.addSong("song2", 4);
        album.addSong("song3", 3);
        albums.add(album);

        album = new Album("Album2");
        album.addSong("song4", 3);
        album.addSong("song5", 6);
        album.addSong("song6", 4);
        albums.add(album);

        album = new Album("Album3");
        album.addSong("song7", 5);
        album.addSong("song8", 7);
        album.addSong("song9", 2);
        albums.add(album);

        return albums;
    }

}
