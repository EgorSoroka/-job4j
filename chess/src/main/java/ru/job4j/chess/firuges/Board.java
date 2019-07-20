package ru.job4j.chess.firuges;

import ru.job4j.chess.chessexception.*;

import java.util.stream.IntStream;

public class Board {
    /**
     *  Содержит в себе шахматные фигуры.
     */
    private Figure[] figures = new Figure[32];
    private int index;

    /**
     * добавляет фигуры на доску.
     * @param figure шахматные фигуры.
     */
    public void add(Figure figure) {
        this.figures[index++] = figure;
    }

    /**
     *
     * @param source source
     * @param dest положение фигуры после шага.
     * @return
     */
    boolean move(Cell source, Cell dest) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        this.index = noFigures(source);
        if (this.index == - 1) {
            throw new FigureNotFoundException("Фигуры не найдена.");
        } if () {
            throw new ImpossibleMoveException("Данная фигура так двигаться не может");
        } if (){
            throw new OutOfMemoryError("На пути фигуры есть препятствие.");
        }
    }

    private int noFigures(Cell source) {
            return IntStream.range(0, this.figures.length - 1)
                    .filter(i->this.figures[i] != null)
                    .filter(i->this.figures[i].position().equals(source))
                    .findFirst()
                    .orElse(-1);
    }
}
