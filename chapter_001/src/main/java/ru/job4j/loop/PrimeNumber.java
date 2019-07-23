package ru.job4j.loop;

/**
 * Класс считает количество простых чисел..
 *
 * @author @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 23.07.2019
 */

public class PrimeNumber {

    /**
     *  Ищет простые числа.
     * @param finich до этого числа искать.
     * @return количество простых чисел от 1 до inich.
     */
    public  int calc(int finich) {
        int count = 0;
        boolean check = true;
        for (int out = 2; out <= finich; out++) {
            for (int in = 2; in < out; in++) {
               if (out % in == 0) {
                check = false;
                break;
               }
            }
            if (check) {
                count++;
            } else  {
                check = true;
            }

        }
        return count;
    }
}
