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
        
        /*
        float[]
        int[]
        String[]
        double[]
        char[]
        object[]
        bool[]
        */
        
        String szo = "almafa";
        // szo[3] = a
        char [] szo_bontva = new char [6];
        szo_bontva = szo.toCharArray();
        
        /*
        Hozzon létre egy három egész számot tároló tömböt,
        majd számítsa ki az összegüket és írja ki az eredményt!
        */
        
        int [] t = new int [3];
        t[0] = 3;
        t[1] = 2;
        t[2] = 9;
        int eredmeny = t[0] + t[1] + t[2];
        System.out.println("Összeg: " + eredmeny);
        
        String [] szavak = new String [3];
        szavak[0] = "alma";
        szavak[1] = "körte";
        szavak[2] = "eper";
        
        String[] szavak2 = {"alma", "körte", "eper"}; // 3 elemű
        
        //Tömbök 2D - mátrixok/táblázatok
        //Létrehozás
        int[][] matrix = new int[3][3]; // [sor] [oszlop] 3x3
        int[][] matrix2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        }; // 3x3 konkrét elemekkel
           // [0][0] = 1   [0][1] = 2   [0][2] = 3
           // [1][0] = 4   [1][1] = 5   [1][2] = 6
           // [2][0] = 7   [2][1] = 8   [2][2] = 9
           // Sorok számának lekérdezése
           int sor = matrix2.length;
           // Oszlopok számának lekérdezése
           int oszlop1 = matrix2[0].length; // első sor oszlopainak száma
           int oszlop2 = matrix2[1].length; // a 2. sor oszlopainak száma
           int oszlop3 = matrix2[2].length; // a 3. sor oszlopainak száma
           
           /*
           Hozzon létre egy 3x2-es tömböt, amely tartalmazza bolti termékek nevét és azok árát!
           Ezután írja ki a második termék nevét és az árát!
           */
           String[][] termekek = {
               {"Kenyér", "1000 Ft"},
               {"Tej", "520 Ft"},
               {"Farizer", "600 Ft"},
           };
           System.out.println("Termék neve: " + termekek[1][0] + " - " + termekek[1][1]);
    }
    
}
