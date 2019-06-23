package ru.job4j.tracker;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringJoiner;
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
    private Tracker tracker = new Tracker();
    // поле содержит дефолтный вывод в консоль.
    private final PrintStream stdout = System.out;
    // буфер для результата.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private long time() {
        return System.currentTimeMillis();
    }

    /**
     * Меню
     */
    private final StringBuilder menu = new StringBuilder()
            .append("------------ Меню ------------" + "\n")
            .append("------------ 0 - создать новую заявку " + "\n")
            .append("------------ 1 - показать все заявки " + "\n")
            .append("------------ 2 - изменить заявку " + "\n")
            .append("------------ 3 - удалить заявку " + "\n")
            .append("------------ 4 - получить заявку по ID " + "\n")
            .append("------------ 5 - получить все заявки по имени " + "\n")
            .append("------------ 6 - Выход " + "\n");






    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    public void testShowItem() {
        Item items1 =
                tracker.add(new Item("test name1", "desc2", this.time()));
        Item items2 =
                tracker.add(new Item("test name2", "desc2", this.time()));
        Input input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(
                new StringBuilder()
                        .append(menu)
                        .append(String.format("Id: %s Name: %s Description: %s", items1.getId(), items1.getName(), items1.getDecs()))
                        .append(System.lineSeparator())
                        .append(String.format("Id: %s Name: %s Description: %s", items2.getId(), items2.getName(), items2.getDecs()))
                        .append(System.lineSeparator())
                        .append(menu)
        ));
    }

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Item item = tracker.add(new Item("test name", "desc", this.time()));
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    @Test
    public void testDeleteItemStartUI() {
        Item itemDelet = tracker.add(new Item("test name1", "desc1", this.time()));
        Item[] items = {
                tracker.add(new Item("test name2", "desc2", this.time())),
                tracker.add(new Item("test name3", "desc3", this.time()))
        };
        Input input = new StubInput(new String[]{"3", itemDelet.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll(), is(items));
    }
}
