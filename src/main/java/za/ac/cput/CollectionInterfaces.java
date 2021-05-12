package za.ac.cput;

/**
 * @Author: Cole Hanekom
 * @Student Number: 217267556
 * Main Class
 * @Date: 16/05/2021
 */

import java.util.*;

public class CollectionInterfaces {

    public static void main(String[] args) {
        //Collection
        System.out.println( "Collection Interface"  );
        // creating an empty LinkedList
        Collection<String> teamList = new LinkedList<String>();

        // use add() method to add elements in the list
        teamList.add("Manchester United");
        teamList.add("Arsenal");
        teamList.add("Chelsea");
        teamList.add("Liverpool");

        // Output the present list
        System.out.println("The list is: " + teamList);

        //adding a new element to the list
        teamList.add("Leeds");
        System.out.println("The list after adding an item is: " + teamList);

        //removing an element from the list
        teamList.remove("Liverpool");
        System.out.println("The list after removing an item is: " + teamList);

        //Checking if an item can be found in the list
        // using contains() method
        boolean result = teamList.contains("Chelsea");

        // printing the result
        System.out.println("Is Chelsea present in the list: "
                + result);


    }
}
