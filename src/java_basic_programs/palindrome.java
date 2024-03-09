package java_basic_programs;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        int remiander,number,reverse=0,temp;
        Scanner scan_number = new Scanner(System.in);
        number = scan_number.nextInt();
        temp = number;
        while (number>0){
            remiander = number % 10;
            reverse = reverse*10+remiander;
            number = number/10;
        }
        if(temp == reverse){
            System.out.println("It is a Palindrome number");
        }else{
            System.out.println("Not a Palindrome");
        }

    }
}
