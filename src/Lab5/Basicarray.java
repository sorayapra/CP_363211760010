

package Lab5;

import java.util.Scanner;

public class Basicarray {

    public static void main(String[] args) {

        int []number ;
        number = new int[5];  // 5 blocks, index = 0-4

        //display data in array
        displayArray(number);

        number[0] = 100;
        number[4] = 500;
        number[1] = 700;
        number[2] = 800;
        number[3] = 900;
        displayArray(number);

        //input data to array
        number = inputArray(number);
        displayArray(number);

        //find total value in array
        totalValueArray(number);
        //find max value in array
        findValueArray(number);
        //find minimum value in array
        findminValueArray(number);

    }

    private static void findminValueArray(int[] number) {
        int min = number[0];
        for (int i = 0; i < number.length; i++) {
            if (min >= number[i]){
                min = number[i];
            }

        }
        System.out.println("The minimum value in array: "+min);
    }

    private static void findValueArray(int[] number) {
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (max <= number[i]){
                max = number[i];
            }
        }
        System.out.println("The maximum value in array: "+max);
    }

    private static void totalValueArray(int[] number) {
        int total = 0;
        for (int val:number){
            total += val;
        }
        System.out.println("Total value in array: "+total);


    }//main

    private static int[] inputArray(int[] number) {
        System.out.println("Please, input data to array: ");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < number.length; i++) {
            System.out.print("number["+i+"]:");
            number[i] = sc.nextInt();

        }
        return number;

    }

    private static void displayArray(int[] number) {
        System.out.println("Data in array: ");
        for (int val:number) {
            System.out.print(val+" ");

        }
        System.out.print(number);
    }


}//class