package Exersice;

import java.util.Scanner;

public class Exersice_Lab3_login {
    public static void main(String[] args){
        //define account
        String username = "admin";
        String password = "1234";

        //create Scanner object as sc
        Scanner sc = new Scanner(System.in);

        int count = 0;
        do {
            System.out.print("Username: ");
           String u = sc.nextInt();
            System.out.print("password: ");
            String p = sc.nextInt();
            if (u.equals(username) && p.equals(password)){
                System.out.print("welcome to MT System: ");
                break;

            }else {
                System.out.print("Username or password is not correct. ");
        count++;
        if (count == 3){
            System.out.print("Your account has been locked. Please, contact Admin");

        }//main

            }//class
