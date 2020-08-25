package Lab3;

public class Example_For {
    public static void main(String[] args){
//        for (int i = 0; i <10; i++) {
//            System.out.println(i+" Hello");
//
//        }
            //พิมพ์เฉพาะเลขคู่
//        for (int i = 1; i <=10; i++) {
//            if (i%2 == 0) {
//                System.out.println(i);
//            }
//        }
            //x = 1-100 หารด้วย 3 5 7 9 ลงตัว
            for (int x = 1; x <=100; x++) {
                if (x%3 == 0 && x%5 == 0) {
                    System.out.println(x);
                }
            }
            for (int i = 1; i <=100 ; i++) {
                if (i%3 == 0 ){
                    if (i%5 == 0)
                        System.out.println(i);
                }
            }



        }//main
    }//class




