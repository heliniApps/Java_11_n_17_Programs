package com.academy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
    
    private String name;
    private LinkedList<Song> playlist;
    private Scanner scanner;

    public Playlist(String name) {
        this.name = name;
        this.playlist = new LinkedList<Song>();
        this.scanner  = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    public boolean addSong(String title, ArrayList<Album> availableAlbums) {

        boolean isAdded = false;

        for (Album album : availableAlbums) {
            if (album.isSongExist(title)) {
                isAdded = playlist.add(album.getSong(title));
                break;
            }
        }
        
        return isAdded;
    }

    public void printSongsList() {

        ListIterator<Song> listIt = getPlaylist().listIterator();

        while (listIt.hasNext()) {
            System.out.println(listIt.next().toString());
        }
    }

    public void play() {

        ListIterator<Song> listItr = getPlaylist().listIterator();
        boolean isQuit = false;
        boolean isMovingForward = true;
        boolean isMovingBackward = false;

        printOptionsList();

        while (!isQuit) {
            System.out.println("Please enter the option number to select: ");
            int option = readOption();

            switch (option) {
                case 1:
                    if (isMovingForward) {
                        if (listItr.hasPrevious()) {
                            Song currentSong = listItr.previous();
                            isMovingForward = false;
                            isMovingBackward = true;
                            System.out.println("Replaying song :::  " + currentSong.toString());
                            break;
                        } else {
                            System.out.println("Reached the beginning of the list.");
                        }

                    } else if (isMovingBackward) {
                        if (listItr.hasNext()) {
                            Song currentSong = listItr.next();
                            isMovingForward = true;
                            isMovingBackward = false;
                            System.out.println("Replaying song :::  " + currentSong.toString());
                            break;
                        } else {
                            System.out.println("Reached the end of the list.");
                        }
                    }
                    break;

                case 2:
                    if (isMovingBackward) {
                        if (listItr.hasNext()) {
                            listItr.next();
                            isMovingForward = true;
                            isMovingBackward = false;
                        }
                    }
                    if (listItr.hasNext()) {
                        System.out.println("Now playing song :::  " + listItr.next().toString());
                    } else {
                        System.out.println("Reached the end of the list.");
                    }
                    break;

                case 3:
                    if (isMovingForward) {
                        if (listItr.hasPrevious()) {
                            listItr.previous();
                            isMovingForward = false;
                            isMovingBackward = true;
                        }
                    }
                    if (listItr.hasPrevious()) {
                        System.out.println("Now playing song :::   " + listItr.previous().toString());
                    } else {
                        System.out.println("Reached the beginning of the list.");
                    }
                    break;

                case 4:
                    /* 
                    * remove() function does not move the cursor.
                    * If it is called twice, java will throw an error the second time, 
                    * since it doesn't know what the current item is.
                    */
                    if (getPlaylist().size() > 0) {
                        listItr.remove();

                        if (listItr.hasNext()) {
                            System.out.println("Now playing :::  " + listItr.next().toString());
                            isMovingForward = true;
                            isMovingBackward = false;

                        } else if (listItr.hasPrevious()) {
                            System.out.println("Now playing :::  " + listItr.previous().toString());
                            isMovingForward = false;
                            isMovingBackward = true;
                        }
                    }
                    break;

                case 5:
                    printSongsList();
                    break;

                case 6:
                    printOptionsList();
                    break;

                case 7:
                    isQuit = true;
                    break;

                case 8:
                    // testing: adding through an Iterator.
                    Song newSong = Song.createSong("Random Song:  Breaking the Rules ;)", 6);
                    listItr.add(newSong);
                    System.out.println("Added song  ::: " + newSong.toString());

                    System.out.println(listItr.previous().toString());
                    break;

                default:
                    System.out.println("Invalid Option.");
                    break;
            }
        }

    }

    private void printOptionsList(){
        System.out.println("\n1 -  Replay the current song.");
        System.out.println("2 -  Skip to the next song.");
        System.out.println("3 -  Go back to the previous song.");
        System.out.println("4 -  Remove current song from playlist.");
        System.out.println("5 -  Print songs in the playlist.");
        System.out.println("6 -  Print options list.");
        System.out.println("7 -  Quit.\n");
    }

    private int readOption() {
        int option = 0;
        boolean isExit = false;

        while (!isExit) {
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                isExit = true;
            } else {
                System.out.println("Invalid Value.");
            }
            scanner.nextLine();
        }

        return option;
    }

    public void exit() {
        scanner.close();
    }

}
