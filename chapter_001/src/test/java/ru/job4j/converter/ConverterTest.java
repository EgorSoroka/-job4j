package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

 /**
 * Тест на class Convertor.
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 */
public class ConverterTest {
     /**
     * Тест перевода рублей в доллары.
     */
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    /**
     * Тест перевода  рублей в евро.
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    /**
     * Тест перевода рублей в доллары.
     */
    @Test
    public void dollarToRubleTest() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(1);
        assertThat(result, is(60));
    }

    /**
     * Тест перевода рублей в евро.
     */
    @Test
    public void euroToRubleTest() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(1);
        assertThat(result, is(70));
    }
}
