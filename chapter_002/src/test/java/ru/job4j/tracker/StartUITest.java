package ru.job4j.tracker;

import org.junit.Test;

import java.lang.reflect.Array;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test StartUI class
 *
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 08.05.2019
 */
public class StartUITest {
    private long time() {
        return System.currentTimeMillis();
    }

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc", this.time()));
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    @Test
    public void testDeleteItemStartUI() {
        Tracker tracker = new Tracker();
        Item itemDelet = tracker.add(new Item("test name1", "desc1", this.time()));
        Item [] items = {
                tracker.add(new Item("test name2", "desc2", this.time())),
                tracker.add(new Item("test name3", "desc3", this.time()))
        };
        tracker.delete(itemDelet.getId());
        
        assertThat(tracker.findAll(), is(items));
    }
}
