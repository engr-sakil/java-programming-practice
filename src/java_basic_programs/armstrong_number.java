package java_basic_programs;

import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args){
        System.out.println("Please enter a number: ");
        Scanner scan_number = new Scanner(System.in);
        int number = scan_number.nextInt();
        int sum = 0,remainder;
        int initial_number = number;
        int number_length = Integer.toString(number).length();

        while(number>0){
            remainder = number%10;
            double temp = Math.pow(remainder,number_length);
            sum = sum + (int)temp;
            number = number / 10;
            System.out.println(sum);
        }

        if(initial_number == sum){
            System.out.println("It's Armstrong Number");
        }else{
            System.out.println("It's not Armstrong Number");
        }

    }

}
