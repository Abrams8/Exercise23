package com.company;

public class Main {

    public static void main(String[] args) {
        int array[][] = new int[5][5];
        int i = 0;
        int j = 0;
        for (i = 0; i < array.length; i++) {
            System.out.println(" ");
            for (j = 0; j < array[i].length; j++) {
                if (i == 0 || i == 4) {
                    array[i][j] = 1;
                    System.out.print(array[i][j] + " ");
                }
                if (i == 1 || i == 3) {
                    array[i][1] = 1;
                    array[i][2] = 1;
                    array[i][3] = 1;
                    System.out.print(array[i][j] + " ");
                }
                if (i == 2) {
                    array[i][2] = 1;
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}
