package ru.job4j.tracker;

/**
 * Тест сингл классов..
 *
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 30.06.2019
 */

import org.junit.Test;
import ru.job4j.singletracker.SingleTrackerFour;
import ru.job4j.singletracker.SingleTrackerOne;
import ru.job4j.singletracker.SingleTrackerThree;
import ru.job4j.singletracker.SingleTrackerTwo;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class SingleTrackerTest {
    private long time() {
        return System.currentTimeMillis();
    }
    /**
     *  Test class  SingleTrackerOne.
     */
    @Test
    public void testOne() {
        SingleTrackerOne treck = SingleTrackerOne.INSTANCE;
        treck.addItem(new Item("test name1", "desc2", this.time()));
        SingleTrackerOne tracker = SingleTrackerOne.INSTANCE;
        assertThat(treck, is(tracker));
    }

    /**
     * Test class  SingleTrackerTwo.
     */
    @Test
    public void testTwo() {
        SingleTrackerTwo treck = SingleTrackerTwo.getInstance();
        treck.addItem(new Item("test name1", "desc2", this.time()));
        SingleTrackerTwo tracker = SingleTrackerTwo.getInstance();
        assertThat(treck, is(tracker));
    }

    /**
     * Test class  SingleTrackerThree.
     */
    @Test
    public void testThree() {
        SingleTrackerThree treck = SingleTrackerThree.getInstance();
        treck.addItem(new Item("test name1", "desc2", this.time()));
        SingleTrackerThree tracker = SingleTrackerThree.getInstance();
        assertThat(treck, is(tracker));
    }

    /**
     * Test class  SingleTrackerFour.
     */
    @Test
    public void testFour() {
        SingleTrackerFour treck = SingleTrackerFour.getInstance();
        treck.addItem(new Item("test name1", "desc2", this.time()));
        SingleTrackerFour tracker = SingleTrackerFour.getInstance();
        assertThat(treck, is(tracker));
    }


}
