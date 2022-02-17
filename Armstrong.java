package javaPractise;

import java.util.Scanner;

public class Armstrong {
        public static void main(String[] args){
            int number,testnumber, sum=0, a;
            System.out.println("enter the number");
            Scanner sc= new Scanner(System.in);
            number= sc.nextInt();
            testnumber=number;
            while(number!=0){
                a=number%10;
                sum=sum+(a*a*a);
                number=number/10;
            }
            if(sum==testnumber){
                System.out.println("the given number is amstrong number");
            }
            else{
                System.out.println("the given number is not an amstrong number");
            }


        }
    }

