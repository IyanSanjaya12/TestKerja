/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_iyansanjaya;

import java.util.ArrayList;

/**
 *
 * @author SYAMSUL ABDUL AZIZ
 */
public class Soal_1 {

    public static void main(String[] args) {
        
        Soal1("promerit");
    }

    static String Soal1(String kata) {
        ArrayList<String> tamp = new ArrayList<String>();
        String kamus[] = {"pro", "gram", "merit", "program", "it", "programmer"};
        for (int x = 0; x < kamus.length; x++) {
            for (int y = 0; y < (kata.length() - (kamus[x].length() - 1)); y++) {
                if (kamus[x].equals(kata.substring(y, kamus[x].length() + y))) {
                    tamp.add(kata.substring(y, kamus[x].length() + y));
                }
            }
        }
        for (int a = 0; a < tamp.size(); a++) {
            for (int b = 0; b < tamp.size(); b++) {
                if (tamp.get(a).concat(tamp.get(b)).equals(kata)) {
                    System.out.println(tamp.get(a) + ", " + tamp.get(b));
                } else {
                    for (int c = 0; c < tamp.size(); c++) {
                        if (tamp.get(a).concat(tamp.get(b)).concat(tamp.get(c)).equals(kata)) {
                            System.out.println(tamp.get(a) + ", " + tamp.get(b)+ ", " + tamp.get(c));
                        }
                    }
                }
            }
        }

        return "";
    }
}
