package javaPractise;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n,fact=1;
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        while(n!=0) {
            fact = fact*n;
            n = --n;
        }
        System.out.println(fact);
    }
}
