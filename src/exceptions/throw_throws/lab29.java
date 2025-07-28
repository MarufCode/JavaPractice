package src.exceptions.throw_throws;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class lab29 {

    public static void main(String[] args) throws Exception {
        readFile("D://new83.txt");

    }





    static void readFile(String fileName) throws Exception{

        File f = new File(fileName);
        FileReader fr = new FileReader(fileName);
        if (fileName.isEmpty()){
            throw new FileNotFoundException();
        }
        System.out.println("Not vulnerable code ");
    }
}
