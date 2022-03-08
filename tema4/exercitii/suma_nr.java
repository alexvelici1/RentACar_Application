import java.util.Vector;   //importam clsa pt a folosii un vector
import java.util.Scanner;
import java.io.*;
import java.util.Arrays.*;
public class suma_nr {
    public static void main(String[] args) {

        System.out.println("intr a : ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("intr b : ");
        int b= new Scanner(System.in).nextInt();
        System.out.println("suma este : ");
        a=a+b;// sau a+=b//aici se face suma
       System.out.println( a);
        //System.out.println(a+b);//aici facem suma intre 2 nr


    }
}
