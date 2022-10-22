import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class file {


    public void addFile(String name){
        try {
            File myObj = new File(name+".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void addTextToFile(String fileName,String text) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(fileName+".txt");
        out.println(text);
        out.close();
    }
    public String readFile(String fileName) throws FileNotFoundException {
        File myObj = new File(fileName+".txt");
        String[] fileContents = new String[30];
        Scanner myReader = new Scanner(myObj);
        String data = myReader.nextLine();

        return data;
    }
}
