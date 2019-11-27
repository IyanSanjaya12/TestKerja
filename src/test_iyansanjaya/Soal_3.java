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
public class Soal_3 {

    public static void main(String[] args) {
        int saham[]={10,15,8,7,14};
        System.out.println("Profit Tertinggi: "+Soal3(saham));
    }

    static int Soal3(int saham[]) {
        
        ArrayList <Integer> hasil=new ArrayList<Integer>();
        int tamp=0;
        for(int x=0;x<saham.length;x++){
            for (int y=x;y<saham.length;y++){
                for(int z=saham[x];z<saham[y];z++){
                    tamp++;
                }
                hasil.add(tamp);
                tamp=0;
            }
        }
        int max=hasil.get(0);
        for(int a=0;a<hasil.size();a++){
            if(max<hasil.get(a)){
                max=hasil.get(a);
            }
        }
        return max;
    }
}
