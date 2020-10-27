package Lab9;



import java.io.File;
import java.io.IOException;


public class ExCreateFile {
    public static void main(String[] args) {

        File myFile = new File("D:/CP_363211760010/Test.txt");
        try {
            if (myFile.createNewFile()) {
                System.out.println("New File is already created.");

            } else{
                System.out.println("Could not creat n new file.");
            }
        } catch (IOException e) {
            System.out.println("Could not create a new file.");
            e.printStackTrace();

        }

        System.out.println(myFile.getPath());
        System.out.println(myFile.canRead());
        System.out.println(myFile.canWrite());
        System.out.println(myFile.exists());
        System.out.println(myFile.getName());
        System.out.println(myFile.length());









    }//main
}//class