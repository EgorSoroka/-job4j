package ru.job4j.array;

/**
 * Проверяем заполненность массива true или false
 *
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 28.03.2019
 */
public class Check {
    /**
     * @param data массив
     * @return результат проверки
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 1; index < data.length; index++) {
            if (data[0] != data[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
