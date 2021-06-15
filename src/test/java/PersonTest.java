/*
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PersonTest {
    private ArrayList<Person> people;

    @Before
    public void setUp(){
        this.people = new ArrayList<>();
        people.add(new Person("Joe", true));
        people.add(new Person("Rose", false));
        Person rose = new Person("Rose", true);
        people.add(rose);
        people.add(rose);
        people.add(new Person("Rose", true));
    }

    @Test
    public void testPerson() {
      */
/*  Person rose = new Person("Rose");
        Person rose2 = new Person("Rose");
        Person roseInAPartyHat = rose;*//*


        assertEquals("Rose", this.people.get(2).getName());
        assertSame(this.people.get(2), this.people.get(3));
        */
/*assertSame(rose, rose2);*//*

    }

    @Test
    public void arrayTest() {
        int[] arrayOfInts = {1, 2, 3, 4};
        int[] yetMoreInts = {5, 6, 7, 8};

       */
/* assertEquals(arrayOfInts, yetMoreInts);*//*

       */
/* assertArrayEquals(arrayOfInts, yetMoreInts);*//*


    }

    @Test
    public void testForCool() {
        Person joeCool = new Person("Joe", true);
        Person coderRose = new Person("Rose", false);

        assertArrayEquals(this.people.get(0).isCool());
        assertTrue("Joe is super cool", joeCool.isCool());
        assertTrue("Rose is also cool.", this.people.get(1).isCool());
    }


}
*/
