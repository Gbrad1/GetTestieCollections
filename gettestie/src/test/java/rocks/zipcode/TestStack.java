package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
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

        Integer expectedSize = 1;
        Integer actual = listOfBirthDates.size();

        assertTrue(listOfBirthDates.contains(1996));
        assertEquals(expectedSize, actual);
        LOGGER.info("\n" + listOfBirthDates.toString());
        LOGGER.info("\n" + actual);
    }

    @Test
    public void testLinkedList() {
        LinkedList<Person> linkedList = new LinkedList<>();
        Person person = new Person("Kali", 1997);
        Person person2 = new Person("Lilli", 1998);
        linkedList.add(person);
        linkedList.add(person2);

        Integer actual = linkedList.size();
        Integer expected = 2;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testArrayDeque() {
        ArrayDeque<Person> arrayDequeExample = new ArrayDeque<>();
        Person kali = new Person("Kali", 1997);
        Person lilli = new Person("Lilli", 1998);
        Person klaus = new Person("Klaus", 0002);
        arrayDequeExample.add(kali);
        arrayDequeExample.add(lilli);
        arrayDequeExample.add(klaus);

        Integer actual = arrayDequeExample.size();
        Integer expected = 3;
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(arrayDequeExample.contains(kali));
    }

    @Test
    public void testVector() {
        Vector<Person> vectorExample = new Vector();
        Person kali = new Person("Kali", 1997);
        Person lilli = new Person("Lilli", 1998);
        Person klaus = new Person("Klaus", 0002);
        vectorExample.add(kali);
        vectorExample.add(lilli);
        vectorExample.add(klaus);
        LOGGER.info("\n" + vectorExample.size());

        Assert.assertTrue(!vectorExample.isEmpty());
        Assert.assertTrue(vectorExample.contains(kali));
    }

    @Test
    public void testTreeMap() {
        TreeMap<Integer, Person> treeMapExample = new TreeMap<>();
        TreeMap<Integer, Person> newTreeMapExample = new TreeMap<>();
        Person kali = new Person("Kali", 1997);
        Person lilli = new Person("Lilli", 1998);
        Person klaus = new Person("Klaus", 0002);
        treeMapExample.put(1, kali);
        treeMapExample.put(2, lilli);
        treeMapExample.put(3, klaus);
        newTreeMapExample.putAll(treeMapExample);

        Integer expected = treeMapExample.size();
        Integer actual = newTreeMapExample.size();

        LOGGER.info("\n" + treeMapExample.keySet());
        LOGGER.info("\n" + treeMapExample.entrySet());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stackTest() {
        Stack<Person> exampleStack = new Stack<>();
        Person kali = new Person("Kali", 1997);
        Person lilli = new Person("Lilli", 1998);
        Person klaus = new Person("Klaus", 0002);
        exampleStack.push(kali);
        exampleStack.push(lilli);
        exampleStack.push(klaus);

        exampleStack.pop();
        Integer newStackLength = exampleStack.size();
        Integer expected = 2;

        LOGGER.info("\n" + exampleStack.size());

        Assert.assertEquals(newStackLength, expected);
    }

    @Test
    public void treeSetTest() {
        TreeSet<String> treeSetExample = new TreeSet<>();
        String a = "a";
        String b = "b";
        String c = "c";
        treeSetExample.add(a);
        treeSetExample.add(b);
        treeSetExample.add(c);

        String actual = treeSetExample.first();
        String expected = "a";
        LOGGER.info("\n" + treeSetExample);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iteratorTest() {
        ArrayList<String> a = new ArrayList<>();
        Iterator iterator = a.iterator();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        a.add("e");
        Integer actual = a.size();
        Integer expected = 5;

        LOGGER.info("\n" + a.size());
        for (String i : a) {
            iterator.hasNext();
            LOGGER.info("\n" + i);
        }
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void priorityQueueTest() {
        PriorityQueue<Integer> pqExample = new PriorityQueue<>();
        pqExample.add(20);
        pqExample.add(5);
        pqExample.add(80);
        pqExample.add(40);
        pqExample.add(15);

        pqExample.poll();
        Integer actual = pqExample.size();
        Integer expected = 4;
        LOGGER.info("\n" + pqExample.size());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void comparableTest() {
        ArrayList<Person> list = new ArrayList<>();
        Person kali = new Person("Kali", 1997);
        Person lilli = new Person("Lilli", 1998);
        Person klaus = new Person("Klaus", 0002);
        list.add(kali);
        list.add(lilli);
        list.add(klaus);

        Collections.sort(list);

        Person actual = list.get(0);
        Person expected = klaus;

        LOGGER.info("\n" + list);

        Assert.assertEquals(expected, actual);
    }

}
