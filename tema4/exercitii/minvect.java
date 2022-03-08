import java.io.*;
import java.util.Arrays.*;
import java.util.Collections;
import java.util.Vector;   //importam clsa pt a folosii un vector
import java.util.Scanner;

public class minvect {
    public static void main(String[] args) {
        // asa se creeaza un vector plus tipul folosit
       // Vector<Integer> x= new Vector<>(5);
        //https://stackoverflow.com/questions/56976805/finding-smallest-value-from-array-in-java
        //https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html
        Scanner scan = null;
        int a;
        int n=4;
        scan = new Scanner(System.in);

        int x [] = new int[5];

        for(a=0;a<n;a++) {
            x[a]=scan.nextInt();
        }

        int min= x[0];
        System.out.println("Enter all the elements:");
       for(a=0;a<n;a++){

           if (x[a] < min) {
               min = x[a];
           }

        }
        System.out.println("minimul este ");
        System.out.println(min);

    }

}
