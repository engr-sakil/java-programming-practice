package java_basic_programs;

import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args){

        Scanner scan_number = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number_of_series = scan_number.nextInt();
        int firstValue = 0;
        int secondValue = 1;
        int nextValue;
        for(int i = 0; i<number_of_series; i++){
            if(i<=1){
                nextValue = i ;
            }else{
                nextValue = firstValue + secondValue;
                firstValue = secondValue;
                secondValue = nextValue;
            }
            System.out.print(nextValue + " ");
        }

    }
}
