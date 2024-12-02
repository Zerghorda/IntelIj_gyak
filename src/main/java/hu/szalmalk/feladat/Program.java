package hu.szalmalk.feladat;

import java.util.Arrays;

public class Program {
    private String jel;
    private final int sor=5,oszlop =5;
    private  String [][]tomb = new String[sor][oszlop];

    public Program(String jel) {
        this.jel = jel;
    }

    public void tombTisztit() {
    for (int i = 0;i< tomb.length;i++)
        for (int j =0;j< tomb[i].length;j++){
            Arrays.fill(tomb[j], " ");
        }

    }

    public void mutat(){
        tomb[0][2] = jel;
        tomb[1][0] = jel;
        tomb[1][4] = jel;
        tomb[2][0] = jel;
        tomb[2][3] = jel;
        tomb[2][4] = jel;
        tomb[3][0] = jel;
        tomb[3][4] = jel;
        tomb[4][1] = jel;
        tomb[4][2] = jel;
        tomb[4][3] = jel;
        for (int i =0;i< tomb.length;i++){
            for (int j = 0;j< tomb[i].length;j++){
                System.out.print(tomb[i][j]);
            }
            System.out.println();
        }
    }

    public int jelekSzamaSorban(int sor){
        int db = 0;
            for (int j = 0;j< tomb[sor].length;j++){
                if (tomb[sor][j].equals(jel)){
                    db++;
                }
            }

        return db;
    }

    public boolean teliSor(int sor){
        int i =0;
        boolean teli=true;
        while(i < sor && teli ){
            if (tomb[sor][i].equals(" ")){
                teli = false;
            }
            i++;
        }
        return teli;
    }

    public int teliSorDb(){
        int db = 0;
        for (int i = 0;i< sor;i++) {
            if (teliSor(i)){
               db++;
            }
        }
        return db;
    }
    public static void fajbaIr(){
        for (int i = 0; i < 100 ; i++ ){

        }
    }

    @Override
    public String toString() {
        return "Program{" +
                "jel='" + jel + '\'' +
                ", sor=" + sor +
                ", oszlop=" + oszlop +
                ", tomb=" + Arrays.toString(tomb) +
                '}';
    }
}
