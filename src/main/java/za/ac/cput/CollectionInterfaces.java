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

        //Map
        System.out.println("\n" + "Map Interface"  );
        Map<Integer, String> officeMap = new HashMap<>();

        // Add elements
        officeMap.put(1,"Jim");
        officeMap.put(2,"Dwight");
        officeMap.put(3,"Pam");
        officeMap.put(4,"Michael");

        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + officeMap);

        //adding a new key and value to the HashMap
        officeMap.put(5,"Kevin");

        // Displaying the HashMap after adding
        System.out.println("Mappings after adding are: " + officeMap);

        //removing from the the HashMap
        officeMap.remove(4);

        // Displaying the HashMap after removing
        System.out.println("Mappings after removing are: " + officeMap);

        //Checking if an item can be found in the HashMap
        // Checking for the key_element '2'
        System.out.println("Is the key '2' present? " +
                officeMap.containsKey(2));

        // Checking for the value 'Michael' which should have been removed
        System.out.println("Is the value 'Michael' present? " +
                officeMap.containsValue("Michael"));

        //Set
        System.out.println("\n" + "Set Interface" );
        Set<Integer> set = new HashSet<>();

        // add elements in the set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        System.out.println("Initial set are: "+ set);
        set.add(4); //adding an already added object, but duplicates are not allowed
        System.out.println("Set after adding a duplicate are: "+ set); //confirms that SET does not allow duplicates as the size stays the same
        set.add(7); // adding a new object that is not a duplicate
        System.out.println("Set after adding a non-duplicate are: "+ set); // Displaying the Set after adding

        //removing from the set
        set.remove(3);
        // Displaying the Set after removing
        System.out.println("Set after removing are: "+ set);

        //Checking if an item can be found in the Set
        System.out.println("Is the object '1' present? " +set.contains(1));

        //List
        System.out.println("\n" + "List Interface" );
        List<String> carList = new ArrayList<>();
        //add elements
        carList.add("BMW");
        carList.add("Audi");
        carList.add("Toyota");
        carList.add("Kia");
        System.out.println("Initial Arraylist: " + carList);

        //add new elements
        carList.add("VW");
        System.out.println("After adding a new element: " + carList);

        //remove elements
        carList.remove(0);
        System.out.println("After removing: " + carList);

        //Checking if an item can be found
        System.out.println("Is Kia present? " +
                carList.contains( "Kia" ));



    }
}
