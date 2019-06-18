package ru.job4j.figures;


/**
 * Вывод рисунков в консоль.
 *  @author Egor Soroka ( https://vk.com/id428714363)
 *  @version 1.0
 *  @since 19.06.19
 */


public class Paint {
    /**
     * Выводит рисунки в консоль.
     * @param shape рисунки.
     */
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.draw(new Triangle());
        paint.draw(new Square());
    }
}
