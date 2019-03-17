package ru.job4j.converter;
/**
 * Класс является конвертером валют.
 *
 * @author Egor Soroka ( https://vk.com/id428714363)
 */
public class Converter {
     /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return 100 / value;
    }
     /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return 100 / value;
    }
     /**
     * @param value доллар.
     * @return рубли.
     */
    public int dollarToRuble(int value) {
        return 60 * 100 / value / 100;
    }
     /**
     * @param value евро.
     * @return рубль.
     */
    public int euroToRuble(int value) {
        return 70 * 100 / value / 100;
    }
}
