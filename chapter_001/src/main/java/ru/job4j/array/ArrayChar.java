package ru.job4j.array;

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
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int index = 0; index < value.length; index++) {
            if (data[index] != value[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
