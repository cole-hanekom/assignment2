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
}