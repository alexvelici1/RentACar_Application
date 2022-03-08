import java.io.*;
import java.util.Arrays.*;
import java.util.Collections;
import java.util.Vector;   //importam clsa pt a folosii un vector
import java.util.Scanner;
import java.math.MathContext;

public class max_val_num {
    public static void main(String[] args) {
        int n = 320;
        int result = 0;

        if (n > 0) {
            int max = Integer.MIN_VALUE;

            while (n > 0) {
                int digit = n % 10;

                max = Math.max(max, digit);

                n /= 10;
            }

            result =  max;
        }

        System.out.println(result);


    }
}
