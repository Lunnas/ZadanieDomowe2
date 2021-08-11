package gwiazdki;

import java.util.Scanner;

public class Zadanie2 {


    public static void main(String[] args) {
        int line = 7;

        //Zadanie 1
        System.out.println("Zadanie 1");
        for (int x = line; x > 0; x--) {
            for (int y = x; y > 0; y--)
                System.out.print(" ");

            for (int i = 2 * (line - x) + 1; i > 0; i--)
                System.out.print("*");

            System.out.println();
        }
        System.out.println();

        //Zadanie 2
        System.out.println("Zadanie 2");
        for (int x = line; x > 0; x--) {
            for (int y = x; y > 0; y--)
                System.out.print(" ");

            for (int i = 2 * (line - x) + 1; i > 0; i--)
                System.out.print("*");

            System.out.println();
        }
        for (int a = line; a > 0; a--) {
            for (int j = (line - a) + 2; j > 0; j--)
                System.out.print(" ");
            for (int b = (2 * (a - 1)) - 1; b > 0; b--)
                System.out.print("*");
            System.out.println();
        }

        //Zadanie 3
        System.out.println("Zadanie 3");
        System.out.println("Ile gwiazdek Ci wydrukowac: ");
        Scanner in = new Scanner(System.in);
        int starMax = in.nextInt();
        if (starMax < 1) return;
        if (starMax > 20) return;
        for (int z = 0; z < starMax; z++) {

            System.out.print("*");

        }
    }
}

//zadanie 1 i 2

//1:       *
//2:      ***
//3:     *****
//4:    *******
//5:   *********
//6:  ***********
//7: *************
//8:  ***********
//9:   *********
//1:    *******
//2:     *****
//3:      ***
//4:       *
