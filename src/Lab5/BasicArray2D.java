
package Lab5;

        import java.util.Scanner;

public class BasicArray2D {
    public static void main(String[] args) {

        int number[][] = new int[2][3];  // 2* 3= 6 biocks

        //input data to array
        number = inputData(number);
        //display data to array
        displayData(number);
        //find total value in
        findTotalValue(number);
        //find max value
        findMaxValue(number);
        //find min value

    }

    private static void findMaxValue(int[][] number) {
        int t = 0;
        for (int i = 0; i < number.length; i++) {   //row
            for (int j = 0; j < number[i].length; j++) {   //column

                t += number[i][j];  // t = t+number

            }

        }
        System.out.println("Total value in array: "+t);

    }

    private static void findTotalValue(int[][] number) {
        int t = 0;
        for (int i = 0; i < number.length; i++) {   //row
            for (int j = 0; j < number[i].length; j++) {   //column

                t += number[i][j];  // t = t+number

            }

        }
        System.out.println("Total value in array: "+t);
    }

    private static void displayData(int[][] number) {
        System.out.println("Data in array 2D: ");
        for (int i = 0; i < number.length; i++) {  //row
            for (int j = 0; j < number[i].length; j++) {  //column
                System.out.println(number[i][j] + " ");  //number[0][0]:

            }
            System.out.println();

        }

    }


    private static int[][] inputData(int[][] number) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input integers to array 2D: ");
        for (int i = 0; i < number.length; i++) {  //row
            for (int j = 0; j < number[i].length; j++) {  //column
                System.out.println("number[" + i + "][" + j + "]: ");  //number[0][0]:
                number[i][j] = sc.nextInt();

            }
        }
        return number;
    }
}
