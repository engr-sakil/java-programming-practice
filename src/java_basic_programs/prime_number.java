package java_basic_programs;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] agrs){
        System.out.print("Please enter a number: ");
        Scanner scan_number = new Scanner(System.in);
        int number = scan_number.nextInt();
        int temp =0;
        for(int i=2; i<number; i++){
            if(number%i==0){
                temp = temp+1;
            }
        }
        if (temp > 0){
            System.out.println("Number is not a prime");
        }else{
            System.out.println("Number is a prime");
        }
    }
}
