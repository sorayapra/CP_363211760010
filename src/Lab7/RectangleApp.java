package Lab7;

public class RectangleApp {
    public static void main(String[] args){

        //create object
        Rectangle rec1 = new Rectangle();
        rec1.setLength(20.0);
        rec1.setWidth(10.0);

        System.out.print(rec1.getLength());
        System.out.print(rec1.getWidth());
        System.out.print(rec1.getArea());


        Rectangle rec2 = new Rectangle(10.0,5.0);

        System.out.print(rec2.getLength());
        System.out.print(rec2.getWidth());
        System.out.print(rec2.getArea());










    }//main
}//class
