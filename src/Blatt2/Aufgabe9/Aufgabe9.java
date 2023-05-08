package Blatt2.Aufgabe9;

import java.lang.Math;

public class Aufgabe9 {


    public static int[][] newMatrix(int n, int m) {
        int[][] matrix = new int[n][m];
        for (n = 0; n < matrix.length; n++) {
            for (m = 0; m < matrix[n].length; m++) {
                matrix[n][m] = (int) (Math.random() * 100);
                //System.out.print(matrix[n][m] + "\t");
            }
            //System.out.println("");
        }
        return matrix;
    }

    public static int[][] newMatrix(int n){
        int temp = n;
        int [][] matrix = new int[n][temp];
        for(n = 0; n < matrix.length; n++) {
            for(temp = 0; temp < matrix[n].length;temp++){
                matrix[n][temp] = (int) (Math.random() * 100);
                //System.out.print(matrix[n][temp] + "\t");
            }
            //System.out.println("");
        }
        return matrix;
    }

    public static void printMatrix(int [][]eingabe){
        //int [][] tempmat = eingabe;
        isMatrix(eingabe);
        for(int i = 0; i < eingabe.length; i++){
            for(int j = 0; j < eingabe[i].length;j++){
                System.out.print(eingabe[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static int[][] addMatrix(int [][]a, int [][]b){
        isMatrix(a);
        isMatrix(b);
        int [][]falschmartix = {};
        if(a.length != b.length){
            System.err.println("Falsch");
            System.exit(-1);
            return falschmartix;
        } else if(a[0].length != b[0].length){
            System.err.println("Falsch2");
            System.exit(-1);
            return falschmartix;
        } else {
            for(int o = 0;o < a.length;o++){
                for(int p = 0; p < a[0].length; p++){
                    a[o][p] += b[o][p];
                }
            }
            return a;
        }

    }
    public static void isMatrix(int [][] mat) {
        int height = mat.length;
        if(height == 0)
            System.err.println("Invalid");
        int width = mat[0].length;
        if(width == 0)
            System.err.println("Invalid2");
        for(int y = 0; y < height;y++){
            if(mat[y].length != width){
                System.err.println("Invalid3"); // throw new Exception("Invalid")
                System.exit(-1);
            }
        }
    }


    public static void main(String[] args) {
        int [][]a = newMatrix(3, 4);
        int [][]b = newMatrix(3, 4);
        int [][]c = newMatrix(3);
        int [][]d = {{3,65,32},
                     {21,43,99,91}
        };
        printMatrix(a);
        printMatrix(b);
        printMatrix(c);
        printMatrix(d);

        printMatrix(addMatrix(a,b));
        printMatrix(addMatrix(a,c));
        printMatrix(addMatrix(a,d));

    }
}
