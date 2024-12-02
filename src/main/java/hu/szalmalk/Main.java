package hu.szalmalk;

import hu.szalmalk.feladat.Program;

public class Main {
    public static void main(String[] args) {
        program();

        }

    private static void program() {
        Program p = new Program("0");
        p.tombTisztit();
        p.mutat();
        for (int i =0;i<5;i++){
            System.out.println("Ennyi karakter van a "+ (i+1) +". sorban:"+p.jelekSzamaSorban(i));
        }

        System.out.println("Ennyi teli sor van: "+p.teliSorDb());

    }
}
