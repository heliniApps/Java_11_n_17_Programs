package com.academy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class AlbumTest {

   
    // @BeforeEach
    // void setUp() {
    //     System.out.println("starting tests.");
    //     newAlbum.addSong("song1", 3);
    //     newAlbum.addSong("song2", 4);
    // }

    @Test
    public void testAddSong() {
        Album newAlbum = new Album("New Album");
        assertFalse(newAlbum.addSong("", 4));
    }

    @Test
    public void testIsSongExist() {
        Album newAlbum = new Album("New Album");
        newAlbum.addSong("song1", 3);
        newAlbum.addSong("song2", 4);

        assertTrue(newAlbum.isSongExist("song1"));
        assertFalse(newAlbum.isSongExist("song3"));
    }
    
}
