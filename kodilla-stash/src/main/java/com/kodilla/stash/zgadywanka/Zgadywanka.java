package com.kodilla.stash.zgadywanka;

public class Zgadywanka {

    private Gracz p1;
    private Gracz p2;
    private Gracz p3;

    public void rozpocznijGre() {
        p1 = new Gracz();
        p2 = new Gracz();
        p3 = new Gracz();


    int typp1 = 0;
    int typp2 = 0;
    int typp3 = 0;

        boolean p1Odgadl = false;
        boolean p2Odgadl = false;
        boolean p3Odgadl = false;

        int liczbaOdgadywana = (int) (Math.random() * 10);
        System.out.println("Liczba z zakresu od 0 do 9...");

        while (true) {
            System.out.println("wytypuj liczbe: " + liczbaOdgadywana);

            p1.zgaduj();
            p2.zgaduj();
            p3.zgaduj();

            typp1 = p1.liczba;
            System.out.println("gracz pierwszy wytypowal: " + typp1);
            typp2 = p2.liczba;
            System.out.println("gracz pierwszy wytypowal: " + typp2);
            typp3 = p3.liczba;
            System.out.println("gracz pierwszy wytypowal: " + typp3);

            if (typp1 == liczbaOdgadywana) {
                p1Odgadl = true;
            }
            if (typp2 == liczbaOdgadywana) {
                p2Odgadl = true;
            }
            if (typp3 == liczbaOdgadywana) {
                p3Odgadl = true;
            }
            if (p1Odgadl || p2Odgadl || p3Odgadl) {
                System.out.println("czy gracz 1 wytypowal poprawnie? " + p1Odgadl);
                System.out.println("czy gracz 2 wytypowal poprawnie? " + p2Odgadl);
                System.out.println("czy gracz 3 wytypowal poprawnie? " + p3Odgadl);
                break;
            } else {
                System.out.println("try again");
            }
        }
    }
}