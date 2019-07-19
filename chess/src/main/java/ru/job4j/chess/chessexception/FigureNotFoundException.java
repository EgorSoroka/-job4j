package ru.job4j.chess.chessexception;

public class FigureNotFoundException extends  RuntimeException {
    public FigureNotFoundException(String msg) {
        super(msg);
    }
}
