import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        file theFile = new file();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("give a file name to be given");

        String fileName = myScanner.nextLine();
        theFile.addFile(fileName);
        System.out.println("give the file name followed by the text you want to be added to the file");
        fileName = myScanner.nextLine();
        String theText = myScanner.nextLine();
        theFile.addTextToFile(fileName, theText);

    }
}