package Lab2;

import java.util.Scanner;

public class Basiclnput {

    public static void main(String[] arge) {

        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("What is your name? : ");
        name = scanner.nextLine();
        System.out.print(" your name is " + name);

        String branch;
        System.out.print("คุณเรียนสาขา? : ");
        branch = scanner.nextLine();
        System.out.print(" สาขา: " + branch);

        String email;
        System.out.print("What is your email ? : ");
        email = scanner.nextLine();
        System.out.print(" email: " + email);

        String age;
        System.out.print("How ole are you ? : ");
        age = scanner.nextLine();
        System.out.print(" I am: " + age);




        //age
        //email

    }//main
}//class