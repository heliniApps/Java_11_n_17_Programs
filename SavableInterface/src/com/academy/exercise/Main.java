package com.academy.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Player
        ISavable savableObj = new Player("John", 89.5, 4);
        System.out.println(savableObj);
        System.out.println("\n");

        List<String> values = readValues();
        savableObj.loadObject(values);
        System.out.println(savableObj);

        List<String> valuesForSaving = savableObj.getObject();
        printObjectValues(valuesForSaving);
        saveObject(valuesForSaving);

        System.out.println("\n");

        // Monster
        savableObj = new Monster("Orc", 20, 60);
        System.out.println(savableObj);
        System.out.println("\n");

        values.clear();
        values = readValues();
        savableObj.loadObject(values);
        printObjectValues(savableObj.getObject());
        saveObject(savableObj.getObject());

        // Casting super-type variable to subtype.
        Monster zombie = (Monster) savableObj;
        System.out.println(zombie);

        savableObj = new Player("Liz", 78.3, 3);
        System.out.println(savableObj);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    private static void printObjectValues(List<String> values) {
        System.out.println("Object Values { " +
                "name='" + values.get(0) + '\'' +
                ", score=" + values.get(1) +
                ", numOfLives=" + values.get(2) +
                ", weapon='" + values.get(3) + '\'' +
                '}');
    }

    private static void saveObject(List<String> values) {
        System.out.println("Saving object... " + values.get(0));
    }
}
