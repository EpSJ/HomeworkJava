package org.EPsJ;

public class JediVsSith {
    public static void main(String[] args) {
        boolean sithJediEqual = true;
        boolean sithPalpatin = false;
        boolean jediKenobi = true;
        boolean sithDarthMaul = false;
        if (sithPalpatin) {
            System.out.println("Палпатин победил");
        } else if (jediKenobi && sithDarthMaul){
            System.out.println("Оби Ван Кеноби победил Дарт Мола");
        } else if (jediKenobi && !sithDarthMaul){
            System.out.println("Оби Ван Кеноби победил Ситха");
        } else if (!jediKenobi && sithDarthMaul){
            System.out.println("Дарт Мол победил");
        } else if (!sithJediEqual ){
            System.out.println("Джедай победил");
        } else if (sithJediEqual){
            System.out.println("Ситх победил");
        }

    }
}

