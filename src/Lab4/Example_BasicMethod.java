package Lab4;

import java.util.Enumeration;

public class Example_BasicMethod {

    public static void  B(int num) {
        //Statement
        System.out.println("Holle B. ");


    }//B
    public static int C(int x ,int y){
        System.out.println("Holle c.");
        int sum = x + y;
        return sum;
    }//C

    public static void main(String[] args){
        System.out.println("Holle Main.");
        //call A()
        A();
        A();
        A();
        B(100);
        int sum = C(100, 200);
        System.out.println(sum);
        System.out.println(C( 500, 600));
    }//main

  public static void  A() {
      //statement
      System.out.println("Holle A.");
      B(500);
  }//A


}//class
