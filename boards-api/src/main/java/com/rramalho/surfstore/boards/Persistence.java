package com.rramalho.surfstore.boards;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Persistence {

    public static List<com.rramalho.surfstore.boards.Board> listBoards(){
        List<com.rramalho.surfstore.boards.Board> boards = new ArrayList<com.rramalho.surfstore.boards.Board>();
        boards.add(new com.rramalho.surfstore.boards.Board("LOST SUB SCORCHER", new BigDecimal(1990), "5'11", "lost-prancha-de-surf-lost-sub-scorcher.jpg"));
        boards.add(new com.rramalho.surfstore.boards.Board("FM SURF FUNBOARD TEAHUPOO", new BigDecimal(1200), "7'2", "surf-prancha-fm-surf-funboard-teahupoo.jpg"));
        boards.add(new com.rramalho.surfstore.boards.Board("FM SURF EVOLUTION MAUI", new BigDecimal(1499.9), "7'4", "surf-prancha-fm-surf-evolution-maui.jpg"));

        return boards;
    }


}
