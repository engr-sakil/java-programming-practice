package java_basic_programs;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner scan_number = new Scanner(System.in);
        System.out.println("Please enter number for factorial series and value:");
        int factorial_value = scan_number.nextInt();
        int final_factorial_value = 1;
        System.out.print("Factorial Series: ");
        for(int i = 1; i <= factorial_value; i++){
            final_factorial_value = final_factorial_value * i;
            System.out.print(final_factorial_value + " ");
        }
        System.out.println("Final Factorial Value: "+final_factorial_value);


    }
}
