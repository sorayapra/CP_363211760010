package Exersice;
import java.util.ArrayList;
import java.util.Scanner;
public class mySuperCar {
    public static void main(String[] args) {
        ArrayList<Supercar> mySup = new ArrayList<Supercar>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many SuperCar?");
        int num_sup = sc.nextInt();
        //input data
        mySup = inputData(mySup,num_sup);
        //display data
        displayData(mySup);
    }
    private static void displayData(ArrayList<Supercar> mySup) {
        System.out.println("Data object below:");
        for (Supercar sup:mySup) {
            System.out.println(sup.toString());
        }
    }
    private static ArrayList<Supercar> inputData(ArrayList<Supercar> mySup, int num_sup) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please .enter student info below");
        for (int i = 0; i < num_sup; i++) {
            System.out.print("Please, enter student car brand: ");
            String car_brand = sc.nextLine();
            System.out.print("Please, enter student car color: ");
            String car_color = sc.nextLine();
            System.out.print("Please, enter student car engine size: ");
            String car_engine_size = sc.nextLine();
            System.out.print("Please, enter student max speed: ");
            String max_speed = sc.nextLine();
            System.out.print("Please, enter student country of origin: ");
            String country_of_origin = sc.nextLine();
            mySup.add(new Supercar(car_brand,car_color,Integer.parseInt(car_engine_size),max_speed,country_of_origin));
        }
        return mySup;

    }
}//class