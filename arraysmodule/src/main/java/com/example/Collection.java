package com.example;
import java.util.*;
/**
 * Created by Felix on 10/23/15.
 */
public class Collection {

    Scanner input = new Scanner(System.in);

    String[] gamesCollected = {"Mario Kart 64", "The Legend of Zelda: Ocarina of Time", "GoldenEye 007", "New Super Mario Bros.Wii", "Mario Party 8", "Mario Kart Wii", "NBA Jam on Fire Edition", "Tekken 3", "Tekken 2", "Resident Evil 2"};
    HashMap<String, Integer> releaseDates = new HashMap<String, Integer>(); //holds release dates for each game
    HashMap<String, String> mainDeveloper = new HashMap<String, String>();  //main developer for each game
    HashMap<String, String> consoleReleased = new HashMap<String, String>(); //console the videogame was released on

    public void runApp(){
        //instantiate HashMaps
        instantiateData();
        printToUser("" + releaseDates.get("Mario Kart 64"));

        printToUser("This program will use some dictionaries and arrays to print out some information about a few of the video games I have collected over the years.");



        //program control goes here
        do{
            //print a list of video games I own
            printVideogames();
            //print a list of the video games and their release dates
            printReleaseDates();
            //print a list of the video games and their developers
            printDeveloper();
            //print a list of the video games and the console they were released on
            printReleaseConsole();

        }while(testYesNo());
        //outside of main loop of program, can shut down
        System.exit(0);
    }

    //prints out to console
    private void printToUser(String str){
        System.out.println(str);
    }

    //simply takes input from user
    private String inputFromUser(){
        String temp = input.nextLine();     //store input in temp variable
        //printToUser("echo: " + temp);       //testing
        return temp;                        //return user input

    }

    //tests to see if user would like to run program again
    private boolean testYesNo(){
        printToUser("\nWould you like to see the data again? (Y/N)");
        if(inputFromUser().equalsIgnoreCase("Y")){
            return true;
        }else{
            return false;
        }
    }

    //prints the array of video games I have collected
    private void printVideogames(){
        printToUser("\nHere are some of the videogames I have collected over the years:");
        //iterate through the array and print the names of videogames
        for(int cnt = 0; cnt < gamesCollected.length; cnt++){
            printToUser(gamesCollected[cnt]);
        }
    }

    //prints the Hashmap showing videogames and their developers
    //Note: This wasnt made more modular as its being printed out differently for clarity
    private void printDeveloper(){
        printToUser("\nHere are the main Developers for the videogames:");
        //iterate through the array as an entry set
        for ( HashMap.Entry<String, String> entry : mainDeveloper.entrySet() ) {
            //for each key/value pair temporarily store their values
            String key = entry.getKey();
            String value = entry.getValue();
            //print out the info in an easy to read manner
            if(value.equalsIgnoreCase("Electronic Arts")){
                printToUser("Developer: " + value + "\tVideo Game: " + key );
            }else if(value.equalsIgnoreCase("Rare")){
                printToUser("Developer: " + value + "\t\t\t\tVideo Game: " + key );
            }else{
                printToUser("Developer: " + value + "\t\t\tVideo Game: " + key );
            }

        }
    }

    //prints the Hashmap showing videogames and their release dates
    //Note: This wasnt made more modular as its being printed out in an easy to read manner
    private void printReleaseDates(){
        printToUser("\nHere are the release dates for each video game:");
        //iterate through the array as an entry set
        for ( HashMap.Entry<String, Integer> entry : releaseDates.entrySet() ) {
            //for each key/value pair temporarily store their values
            String key = entry.getKey();
            String value = entry.getValue().toString();
            //print out the info in an easy to read manner
            printToUser("Release Date: " + value + "\t\t\tVideogame: " + key);

        }
    }

    //prints the Hashmap showing videogames and their release dates
    //Note: This wasnt made more modular as its being printed out in an easy to read manner
    private void printReleaseConsole(){
        printToUser("\nHere are the Console for each video game:");
        //iterate through the array as an entry set
        for ( HashMap.Entry<String, String> entry : consoleReleased.entrySet() ) {
            //for each key/value pair temporarily store their values
            String key = entry.getKey();
            String value = entry.getValue().toString();
            //print out the info in an easy to read manner
            printToUser("Console: " + value + "\t\tVideogame: " + key);

        }
    }

    //instantiates all data for hashmaps
    private void instantiateData(){
        //instantiate release date data for videogames collected
        releaseDates.put("Mario Kart 64", Integer.valueOf(1997));
        releaseDates.put("The Legend of Zelda: Ocarina of Time", Integer.valueOf(1998));
        releaseDates.put("GoldenEye 007", Integer.valueOf(1997));
        releaseDates.put("New Super Mario Bros. Wii", Integer.valueOf(2009));
        releaseDates.put("Mario Party 8", Integer.valueOf(2007));
        releaseDates.put("Mario Kart Wii", Integer.valueOf(2008));
        releaseDates.put("NBA Jam on Fire Edition", Integer.valueOf(2010));
        releaseDates.put("Tekken 3", Integer.valueOf(1997));
        releaseDates.put("Tekken 2", Integer.valueOf(1995));
        releaseDates.put("Resident Evil 2", Integer.valueOf(1998));

        //instantiate developer data for videogames
        mainDeveloper.put("Mario Kart 64","Nintendo");
        mainDeveloper.put("The Legend of Zelda: Ocarina of Time","Nintendo");
        mainDeveloper.put("GoldenEye 007","Rare");
        mainDeveloper.put("New Super Mario Bros. Wii","Nintendo");
        mainDeveloper.put("Mario Party 8","Nintendo");
        mainDeveloper.put("Mario Kart Wii","Nintendo");
        mainDeveloper.put("NBA Jam on Fire Edition","Electronic Arts");
        mainDeveloper.put("Tekken 3","Namco");
        mainDeveloper.put("Tekken 2","Namco");
        mainDeveloper.put("Resident Evil 2","Capcom");

        //instantiate console for each videogame
        consoleReleased.put("Mario Kart 64","Nintendo 64");
        consoleReleased.put("The Legend of Zelda: Ocarina of Time","Nintendo 64");
        consoleReleased.put("GodenEye 007","Nintendo 64");
        consoleReleased.put("New Super Mario Bros. Wii","Nintendo Wii");
        consoleReleased.put("Mario Party 8","Nintendo Wii");
        consoleReleased.put("Mario Kart Wii","Nintendo Wii");
        consoleReleased.put("NBA Jam on Fire Edition","Nintendo Wii");
        consoleReleased.put("Tekken 3","Playstation");
        consoleReleased.put("Tekken 2","Playstation");
        consoleReleased.put("Resident Evil 2","Playstation");

    }

}//end Collection class
