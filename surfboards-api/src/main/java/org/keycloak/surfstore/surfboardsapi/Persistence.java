package org.keycloak.surfstore.surfboardsapi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.keycloak.surfstore.surfboardsapi.model.*;

public class Persistence {

    public static List<Board> listBoards(){
        List<Board> boards = new ArrayList<Board>();
        boards.add(new Board("LOST SUB SCORCHER", new BigDecimal(1990), "5'11", "lost-prancha-de-surf-lost-sub-scorcher.jpg"));
        boards.add(new Board("FM SURF FUNBOARD TEAHUPOO", new BigDecimal(1200), "7'2", "surf-prancha-fm-surf-funboard-teahupoo.jpg"));
        boards.add(new Board("FM SURF EVOLUTION MAUI", new BigDecimal(1499.9), "7'4", "surf-prancha-fm-surf-evolution-maui.jpg"));

        return boards;
    }


}