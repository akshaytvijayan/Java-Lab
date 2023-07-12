/*Write a program to write to a file, then read from the file and display the contents on the console.*/
 
//package CO6Q2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class file {
 
    public static void main(String[] args) {
 
        try {
            FileWriter writer = new FileWriter("co6q2.txt",true);
            writer.write("\n new file is created");
            writer.close();
            FileReader reader = new FileReader("co6q2.txt");
            BufferedReader br= new BufferedReader(reader);
            String line;
            System.out.println("\n Data read from the file");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
 
        } catch (IOException e) {
            System.out.println("-----Error-----");
        }
 
    }
 
}
