package Tugas;

import Tugas.Matematika;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika mtkku = new Matematika();
            int Hsilpertambahan = mtkku.pertambahan(20, 10);
            int Hsilpengurangan = mtkku.pengurangan(10, 5);
            int Hsilperkalian = mtkku.perkalian(10, 3);
            double Hsilpembagian = mtkku.pembagian(21, 2);
             System.out.println("Pertambahan: 20 + 10 = " + Hsilpertambahan);
        System.out.println("Pengurangan: 10 - 5 = " + Hsilpengurangan);
        System.out.println("Perkalian: 10 * 3 = " + Hsilperkalian);
        System.out.println("Pembagian: 21 / 2 = " + Hsilpembagian);
    }


    }
