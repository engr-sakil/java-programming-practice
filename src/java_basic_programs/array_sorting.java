package java_basic_programs;

import java.util.Arrays;

public class array_sorting {
    public static void main(String[] args){
        int arr[] = {23,24,53,46,57,89,99,2,21};
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
