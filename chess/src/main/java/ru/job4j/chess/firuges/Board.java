package ru.job4j.chess.firuges;

import ru.job4j.chess.chessexception.*;

public class Board {
    /**
     *  Содержит в себе шахматные фигуры.
     */
    Figure[] figures = new Figure[32];

    /**
     * добавляет фигуры на доску.
     * @param figure шахматные фигуры.
     */
    public void add(Figure figure) {

    }

    /**
     *
     * @param source source
     * @param dest положение фигуры после шага.
     * @return
     */
    boolean move(Cell source, Cell dest) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        if () {
            throw new FigureNotFoundException("Фигуры не найдена.");
        } if () {
            throw new ImpossibleMoveException("Данная фигура так двигаться не может");
        } if (){
            throw new OutOfMemoryError("На пути фигуры есть препятствие.");
        }
    }
}
