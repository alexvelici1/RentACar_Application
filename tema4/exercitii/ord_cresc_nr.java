import java.util.Vector;   //importam clsa pt a folosii un vector
import java.util.Scanner;
import java.io.*;
import java.util.Arrays.*;
import java.util.Collections;

public class ord_cresc_nr {
    public static void main(String[] args) {
        /// sursa xml http://inf.ucv.ro/~mihaiug/courses/xml/IntroducereInXML.html

        int x [] = new int[5];
        Scanner scan = null;
        scan = new Scanner(System.in);
        int a;
        int n=4;
        int tmp;
        int j;
        //operatiunea de introducere
        System.out.println("introduceti nr :");
        for(a=0;a<n;a++) {
        //System.out.println("x[a]=");
        x[a]=scan.nextInt();
        }
        // operatiunea dee calculare
        for(a=0;a<n-1;a++){
        for(j=0;j<n-a-1;j++)
            if (x[j]>x[j+1]) {
                tmp = x[j];
                x[j] =x[j+1];
                x[j+1] =tmp;

            }
        }
        //operatiunea de afisare
        System.out.println("afisam valori  : ");
        for (a = 0; a <n; a++) {
          System.out.println(x[a]);
        }



    }
}
