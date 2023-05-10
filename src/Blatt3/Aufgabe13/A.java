package Blatt3.Aufgabe13;

import java.util.Arrays;
import java.lang.Math;
import java.util.Random;
    public class A {
        public static void main(String[] args) {
            int[] arr = new int[500];
            Random rd = new Random();
            int [] copyarr = new int[arr.length/2];
            for (int i = 0; i < arr.length;i++){
                arr[i] = rd.nextInt(1,10);
            }
            System.arraycopy(arr,0,copyarr,0,arr.length/2);
            Arrays.sort(copyarr);
            int[] newarr = new int[5000];
            Arrays.fill(newarr,1);
            int count = 0;
            for(int n = 0; n < newarr.length;n++){
                if(copyarr[n] == newarr[n]) {
                    count++;
                }
                else {
                    System.out.println("Nach der "+count +".Stelle unterscheiden sich die Arrays");
                    break;
                }
            }

        }
    }

