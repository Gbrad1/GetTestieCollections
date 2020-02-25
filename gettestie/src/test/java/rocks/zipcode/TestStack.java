package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;
import java.util.logging.Logger;

public class TestStack {

    private static final Logger LOGGER = Logger.getLogger(TestStack.class.getName());

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void testHashMap() {
        HashMap<String, Boolean> myHashMap = new HashMap();
        myHashMap.put("the sky is blue", true);
        myHashMap.put("the sky is red", false);

        assertEquals(false, myHashMap.isEmpty());
    }

    @Test
    public void testHashMapGetMethod() {
        HashMap<String, String> myHashMap = new HashMap();
        myHashMap.put("Giles", "Doesn't own an ice cream scooper.");
        myHashMap.put("Amanda", "Can't describe a fudge bar without legit cracking up");

        String actual = myHashMap.get("Giles");
        String actual2 = myHashMap.get("Amanda");

        String expected = "Doesn't own an ice cream scooper.";
        String expected2 = "Can't describe a fudge bar without legit cracking up";

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);

        LOGGER.info("\n" + actual);
        LOGGER.info("\n" + actual2);
    }

    @Test
    public void testHashMapContainsMethod() {
        HashMap<String, String> myHashMap = new HashMap();
        myHashMap.put("Giles", "Doesn't own an ice cream scooper.");
        myHashMap.put("Amanda", "Can't describe a fudge bar without legit cracking up");

        Boolean actual = myHashMap.containsKey("Giles");
        Boolean actual2 = myHashMap.containsKey("Amanda");

        assertEquals(true, actual);
        assertEquals(true, actual2);

        LOGGER.info("\n" + actual);
        LOGGER.info("\n" + actual2);
    }

    @Test
    public void testHashMapRemoveMethod() {
        HashMap<Integer, String> myHashMap = new HashMap();
        myHashMap.put(1, "avocado");
        myHashMap.put(2, "eggs, over easy of course");
        myHashMap.put(3, "butter");

        myHashMap.remove(3);

        Integer actual = myHashMap.size();
        Integer expected = 2;

        assertEquals(expected, actual);
        LOGGER.info("\n" + actual);
    }

    @Test
    public void testPersonConstructor() {
        HashMap<String, Integer> a = new HashMap<>();
        Person rina = new Person("Rina", 2018);
        a.put(rina.getName(), rina.getYearOfBirth());

        Integer actual = a.get("Rina");

        Integer expected = 2018;

        assertEquals(expected, actual);
        LOGGER.info("\n" + actual);
    }

    @Test
    public void testArrayList() {
        ArrayList<String> listOfNames = new ArrayList<>();
        Person amanda = new Person ("Amanda", 1996);
        Person giles = new Person ("Giles", 1995);
        String expected = "Amanda";
        String expected2 = "Giles";

        listOfNames.add(amanda.getName());
        listOfNames.add(giles.getName());

        String actual = listOfNames.get(0);
        String actual2 = listOfNames.get(1);

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);

        LOGGER.info("\n" + actual);
        LOGGER.info("\n" + actual2);
    }

    @Test
    public void testArrayListIsEmpty() {
        ArrayList<String> listOfNames = new ArrayList<>();
        Person person = new Person ("Amanda", 1996);

        assertTrue(listOfNames.isEmpty());

        LOGGER.info("\n");
    }

    @Test
    public void testArrayListIsNotEmpty() {
        ArrayList<String> listOfNames = new ArrayList<>();
        Person person = new Person ("Amanda", 1996);
        listOfNames.add(person.getName());

        assertFalse(listOfNames.isEmpty());
    }

    @Test
    public void testHashSet() {
        HashSet<Integer> listOfBirthDates = new HashSet<>();
        Person person = new Person("Emily", 1996);
        listOfBirthDates.add(person.getYearOfBirth());

        Integer expected = 1996;
        Integer expectedSize = 1;
        Integer actual = listOfBirthDates.size();

        assertEquals(expected, listOfBirthDates.contains(person.getYearOfBirth()));
        assertEquals(expectedSize, actual);
    }
}
