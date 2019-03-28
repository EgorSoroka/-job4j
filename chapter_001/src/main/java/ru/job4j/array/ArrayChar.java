package ru.job4j.array;


import java.util.Arrays;

/**
 *  Проверяет префикс.
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 28.03.2019
 */
public class ArrayChar {
    private char[] data;

    /**
     *
     * @param line строка для перевода с char.
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();

    }

    /**
     * Проверяет, что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинается с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = false;
        char x = data[0];
        char y = data[1];
        char[] z = new char[] {x, y};
        char[] value = prefix.toCharArray();
        if (Arrays.equals(z, value)) {
            result = true;
        }
        return result;
    }
}
