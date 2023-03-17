package locationInTriangle;

import java.util.*;

public class locationInTriangle {
    public static void main(String[] args) {
        try (java.util.Scanner myObj = new Scanner(System.in)) {
            int xM, yM;
            // For coordinates : xA = 2; yA = 4 ; xB = 0; yB = 0; xC = 5; yC = 0;

            System.out.println("Enter the coordinates: ");
            System.out.print("xM = ");

            xM = myObj.nextInt();
            System.out.println();

            System.out.print("yM = ");

            yM = myObj.nextInt();
            System.out.println();

            if (4 * xM - 2 * yM > 0 && 5 * yM > 0 && 20 + 2 * yM - 4 * xM - 5 * yM > 0) {
                System.out.println("Zona 1");
            }

            if (4 * xM - 2 * yM < 0 && 5 * yM > 0 && 20 + 2 * yM - 4 * xM - 5 * yM > 0) {
                System.out.println("Zona 2");
            }

            if (4 * xM - 2 * yM > 0 && 5 * yM < 0 && 20 + 2 * yM - 4 * xM - 5 * yM > 0) {
                System.out.println("Zona 3");
            }

            if (4 * xM - 2 * yM > 0 && 5 * yM > 0 && 20 + 2 * yM - 4 * xM - 5 * yM < 0) {
                System.out.println("Zona 4");
            }

            if (4 * xM - 2 * yM < 0 && 5 * yM > 0 && 20 + 2 * yM - 4 * xM - 5 * yM < 0) {
                System.out.println("Zona 5");
            }

            if (4 * xM - 2 * yM < 0 && 5 * yM < 0 && 20 + 2 * yM - 4 * xM - 5 * yM > 0) {
                System.out.println("Zona 6");
            }

            if (4 * xM - 2 * yM > 0 && 5 * yM < 0 && 20 + 2 * yM - 4 * xM - 5 * yM < 0) {
                System.out.println("Zona 7");
            }

            if (4 * xM - 2 * yM == 0 && 5 * yM > 0 && 20 + 2 * yM - 4 * xM - 5 * yM > 0) {
                System.out.println("Frontier(1,2)");
            }

            if (4 * xM - 2 * yM > 0 && 5 * yM == 0 && 20 + 2 * yM - 4 * xM - 5 * yM > 0) {
                System.out.println("Frontier(1,3)");
            }

            if (4 * xM - 2 * yM > 0 && 5 * yM > 0 && 20 + 2 * yM - 4 * xM - 5 * yM == 0) {
                System.out.println("Frontier(1,4)");
            }

            if (4 * xM - 2 * yM < 0 && 5 * yM > 0 && 20 + 2 * yM - 4 * xM - 5 * yM == 0) {
                System.out.println("Frontier(5,2)");
            }

            if (4 * xM - 2 * yM == 0 && 5 * yM > 0 && 20 + 2 * yM - 4 * xM - 5 * yM < 0) {
                System.out.println("Frontier(5,4)");
            }

            if (4 * xM - 2 * yM < 0 && 5 * yM == 0 && 20 + 2 * yM - 4 * xM - 5 * yM > 0) {
                System.out.println("Frontier(6,2)");
            }

            if (4 * xM - 2 * yM == 0 && 5 * yM < 0 && 20 + 2 * yM - 4 * xM - 5 * yM > 0) {
                System.out.println("Frontier(6,3)");
            }

            if (4 * xM - 2 * yM > 0 && 5 * yM < 0 && 20 + 2 * yM - 4 * xM - 5 * yM == 0) {
                System.out.println("Frontier(7,3)");
            }

            if (4 * xM - 2 * yM > 0 && 5 * yM == 0 && 20 + 2 * yM - 4 * xM - 5 * yM < 0) {
                System.out.println("Frontier(7,4)");
            }

            if (4 * xM - 2 * yM == 0 && 5 * yM > 0 && 20 + 2 * yM - 4 * xM - 5 * yM == 0) {
                System.out.println("point A");
            }

            if (4 * xM - 2 * yM == 0 && 5 * yM == 0 && 20 + 2 * yM - 4 * xM - 5 * yM > 0) {
                System.out.println("Point B");
            }

            if (4 * xM - 2 * yM > 0 && 5 * yM == 0 && 20 + 2 * yM - 4 * xM - 5 * yM == 0) {
                System.out.println("Point C");
            }
        }

    }
}