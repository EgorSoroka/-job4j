package ru.job4j.chess.firuges;

public interface Figure {
    /**
     *  Позиция фигуры.
     * @return текущая позиция.
     */
    Cell position();

    /**
     *
     * @param source source.
     * @param dest координата перехода фигуры.
     * @return вернуть массив ячеек, которые проходит фигура.
     */

    Cell[] way(Cell source, Cell dest);

    default String icon() {
        return String.format(
                "%s.png", this.getClass().getSimpleName()
        );

    }

    /**
     *
     * @param dest позиция фигуры после хода.
     * @return копия фигуры на новой позиции.
     */
    Figure copy(Cell dest);

}
