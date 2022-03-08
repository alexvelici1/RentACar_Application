import java.util.Scanner;
import java.math.*;

public class palindrom {
        public static void main(String[] args) {
            // int r=0, sum = 0, temp;
            // System.out.println("introduceti un nr : ");
            //int n = new Scanner(System.in).nextInt();

            //  temp = n;
            // while (n > 0) {
            // r = n % 10;  //getting remainder

            //   sum = (sum * 10) + r;
            //    n = n / 10;
            //}
            // if (temp == sum)
            // System.out.println(" este  nr palindrom ");

            // else
            //    System.out.println("nu este nr  palindrom");

            // afisare prima cifra dintr un nr sursa :https://java2blog.com/java-program-find-first-last-digit-number/
            int r=0;
            System.out.println("introduceti un nr : ");
            int n = new Scanner(System.in).nextInt();
            int firstDigit = 0;

            while(n!=0) {
                firstDigit =n%10;
                n /= 10;
            }
            System.out.println("First digit: "+firstDigit);
        }


}







