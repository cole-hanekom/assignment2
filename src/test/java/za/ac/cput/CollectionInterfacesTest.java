package za.ac.cput;

/**
 * @Author: Cole Hanekom
 * @Student Number: 217267556
 * Test Class
 * @Date: 16/05/2021
 */

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class CollectionInterfacesTest {
    // Testing Collection Interface
    //Testing to add item
    @Test
    void collectionAdd() {
        Collection<String> teamList = new LinkedList<String>();
        teamList.add("Manchester United");
        teamList.add("Arsenal");
        teamList.add("Chelsea");
        teamList.add("Liverpool");
        assertEquals(4, teamList.size());
        teamList.add("Leeds");  //adding another
        assertEquals(5, teamList.size()); //checking if it was added
    }

    //Testing to remove item
    @Test
    void collectionRemove() {
        Collection<String> teamList = new LinkedList<String>();
        teamList.add("Manchester United");
        teamList.add("Arsenal");
        teamList.add("Chelsea");
        teamList.add("Liverpool");
        teamList.remove("Arsenal");
        assertEquals(3, teamList.size()); //checking if it was removed
    }

    //Testing if an item can be found in the list
    @Test
    void collectionFind() {
        Collection<String> teamList = new LinkedList<String>();
        teamList.add("Manchester United");
        teamList.add("Arsenal");
        teamList.add("Chelsea");
        teamList.add("Liverpool");
        assertTrue(teamList.contains("Manchester United")); //checking if it was found
    }


    // Testing Map Interface
    //Testing to add item
    @Test
    void mapAdd() {
        Map<Integer, String> officeMap = new HashMap<>();
        officeMap.put(1,"Jim");
        officeMap.put(2,"Dwight");
        officeMap.put(3,"Pam");
        officeMap.put(4,"Michael");
        assertEquals(4, officeMap.size());
        officeMap.put(5,"Kevin");  //adding another
        assertEquals(5, officeMap.size());//checking if it was added
    }

    //Testing to remove item
    @Test
    void mapRemove() {
        Map<Integer, String> officeMap = new HashMap<>();
        officeMap.put(1,"Jim");
        officeMap.put(2,"Dwight");
        officeMap.put(3,"Pam");
        officeMap.put(4,"Michael");
        officeMap.remove(1);
        assertEquals(3, officeMap.size()); //checking if it was removed
    }

    //Testing if an item can be found in the HashMMap
    @Test
    void mapFind() {
        Map<Integer, String> officeMap = new HashMap<>();
        officeMap.put(1,"Jim");
        officeMap.put(2,"Dwight");
        officeMap.put(3,"Pam");
        officeMap.put(4,"Michael");
        assertTrue(officeMap.containsKey(3)); //checking if the HashMap has the key index of 3
        assertTrue(officeMap.containsValue("Jim")); //checking if the HashMap has the value of Jim
    }

}