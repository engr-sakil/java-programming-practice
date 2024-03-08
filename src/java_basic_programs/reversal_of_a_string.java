package java_basic_programs;
import java.util.Scanner;
public class reversal_of_a_string {
    public static void main(String[] args) {

        String originalString;
        System.out.println("Please enter the original string that has to be reversed:");
        Scanner scanInput = new Scanner(System.in);
        originalString = scanInput.nextLine();
        String resersedString = "";
        int originalStringLength = originalString.length();
        for(int i = originalStringLength-1; i >= 0; i--){
            resersedString = resersedString + originalString.charAt(i);
        }
        System.out.println("Reversed String: "+resersedString);
    }
}
