package ru.job4j.loop;
/**
 * Класс считает количество лет необходимое для погашения кредита.
 *
 * @author @author Egor Soroka ( https://vk.com/id428714363)
 * @version 1.0
 * @since 23.07.2019
 */
public class Mortgage {
    /**
     *  Расчет необходимого времени для выплаты крудита.
     * @param amount сумма кредита.
     * @param monthly месечная выплата.
     * @param percent процент по займу.
     * @return количество лет затраченных на выплту.
     */
    public int year(int amount, int monthly, double percent) {
        int year = 0;
        int refund = 0;
        percent =  (amount * percent) / 100;
        amount = (int) (amount + percent);
        while (refund < amount) {
            for (int out = 1; out <= 12; out++) {
                refund = refund + monthly;
                if (out == 12) {
                    year++;
                }
            }
        }
        return year;
    }

}
