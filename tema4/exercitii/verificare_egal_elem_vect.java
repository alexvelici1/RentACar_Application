import java.util.Vector;   //importam clsa pt a folosii un vector
import java.util.Scanner;
import java.io.*;
import java.util.Arrays.*;
public class verificare_egal_elem_vect {
    // sursa : https://www.pbinfo.ro/probleme/500/verificareordonat
    // sursa : https://www.pbinfo.ro/probleme/501/verifegale
    public static void main(String[] args) {
        int x[] = new int[5];
        int y[] = new int[0];
        int count = 0;
        Scanner scan = null;
        scan = new Scanner(System.in);
        int a;

        int n = 4; //new Scanner(System.in).nextInt();

        System.out.println("introduceti valori : ");
       for (a = 0; a <=n; a++) {
            x[a] = scan.nextInt();
       }
        System.out.println("afisam valori  : ");
        for (a = 0; a <=n; a++) {
           System.out.println(x[a]);
        }

       for(a=0;a<n;a++) {
           if (x[a] == x[a + 1]) {


           }
           else {
               count++;
           }
       }


        if(count!=0){
            System.out.println("nu");
        }
        else{
            System.out.println("da");
        }


    }
}
