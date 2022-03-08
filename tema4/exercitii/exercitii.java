import java.io.*;
import java.util.Arrays.*;
import java.util.Vector;//importam clsa pt a folosii un vector
import java.util.Scanner;

public class exercitii{
    // asa se creeaza un vector plus tipul folosit
    //Vector<Integer> exercitii= new Vector<>();

    public static void main(String[] args) {
        int i;
        int n;
        int c=0 ;

        System.out.println("introduceti marimea n");
        n=new Scanner(System.in).nextInt();//aici fac  introducerea la tastatura lui atrb i fiind de tip  int , un fel de cin2
        for( i=2;i<=n;i++){
            //c=c+i //aici este calculata suma nr naturala pna la n  cu c fiind 0 la inceput
           // if(i==2)
            if((i%1 == 0) && (i%i == 0)){
                     System.out.println("este nr prim");
                     System.out.println(i);
                     //c=c+i;

                }

              ///else {  if (i % 2 == 1){


                 //System.out.println("este nr prim");
                // System.out.println(i);
                // c=c+i;

             //}
              //}


        }
       // System.out.println("suma este : ");
        //System.out.println(c);

         }
}
