package ru.job4j.tracker;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
    /** поле содержит дефолтный вывод в консоль. */
    private final PrintStream stdout = System.out;
    /** буфер для результата. */
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    /** Генерация времени для Id. */
    private long time() {
        return System.currentTimeMillis();
    }
    /**
     * Меню
     */
    private final String is = System.lineSeparator();
    private final StringBuilder menu = new StringBuilder()
            .append(String.format("%s %s", 0, " Дабовить новую заявку ")).append(is)
            .append(String.format("%s %s", 1, " Показать все заявки ")).append(is)
            .append(String.format("%s %s", 2, " Изменить заявку ")).append(is)
            .append(String.format("%s %s", 3, " Удалить заявку ")).append(is)
            .append(String.format("%s %s", 4, " Получить заявку по ID ")).append(is)
            .append(String.format("%s %s", 5, " Поиск заявок по имени ")).append(is)
            .append(String.format("%s %s", 6, " Выйти из программы "));

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
    /**
     *  Тест вывода всех заявок в консоль.
     */
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
                        .append(menu).append(is)
                        .append(String.format("Id: %s Name: %s Description: %s", items1.getId(), items1.getName(), items1.getDecs()))
                        .append(is)
                        .append(String.format("Id: %s Name: %s Description: %s", items2.getId(), items2.getName(), items2.getDecs()))
                        .append(is)
                        .toString()
        ));
    }
    /**
     *  Тест получения заявки по Id.
     */
    @Test
    public void testFindByID() {
        Item items =
                tracker.add(new Item("test name1", "desc2", this.time()));
        Input input = new StubInput(new String[]{"4", items.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(
                new StringBuilder()
                        .append(menu).append(is)
                        .append(" Поиск по ID ").append(is)
                        .append(String.format("Id: %s Name: %s Description: %s", items.getId(), items.getName(), items.getDecs()))
                        .append(is)
                        .toString()
        ));
    }
    /**
     *  Тест получения заявки по имени.
     */
    @Test
    public void testFindByName() {
        Item items =
                tracker.add(new Item("test name1", "desc2", this.time()));
        Input input = new StubInput(new String[]{"5", items.getName(), "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(
                new StringBuilder()
                        .append(menu).append(is)
                        .append(" Поиск заявки по имени ").append(is)
                        .append(String.format("Id: %s Name: %s Description: %s", items.getId(), items.getName(), items.getDecs()))
                        .append(is)
                        .toString()
        ));
    }
    /** Тест создания новой заявки. */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }
    /** Тест изменения существующей заявки. */
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Item item = tracker.add(new Item("test name", "desc", this.time()));
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }
    /**
     *  Тест удаления существующей заявки.
     */
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
