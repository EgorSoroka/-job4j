package ru.job4j.tracker;

import java.util.Scanner;
/**
 *  Реализация консольного вывода.
 *
 * @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 08.05.2019
 */

public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    /**
     *
     * @param question Вопрос к ползователю.
     * @return Вывод ответа в зависимости от вопроса.
     */
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    @Override
    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException(" Запрос вне диапазона меню ");
        }
    }
}
