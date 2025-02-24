/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombok_listak;

/**
 *
 * @author Asus
 */
public class Tombok_Listak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        
        // Tömb 1D (Dimenziós)
        // lineáris: ([1] [2] [3] [4]...)
        // Fix. méretüek, mérete nem változtatható a futás során
        // Indexelés
        /*
            [10 3 5 7 9] => 5 elemű
             0  1 2 3 4  => elemszám -1
             5. index --> hiba
        */
        
        //Tömb létrehozása
        //tipus[] neve = new tipus[elemszám];
        int[] szamok = new int [2];
        //ilyenkor 0-kat tartalmaz
        
        szamok[0] = a; //Tömb első eleme = 'az' értékben lévő elem
        szamok[1] = b; //Tömb második eleme 
        //szamok[2] = 4; //ez egy hibás sor, mivel csak 2 elemű
        
        // %d - egész érték helymegörző
        System.out.printf("számok[0] = %d\n", szamok[01]);
        System.out.printf("számok[1] = %d\n", szamok[1]);
        
        //tömb elemszáma, hossza
        int hossz = szamok.length;
        System.out.println("A számok tömb hossza: " + hossz);
    }
    
}
