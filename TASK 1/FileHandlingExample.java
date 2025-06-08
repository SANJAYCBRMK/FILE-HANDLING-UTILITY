import java.io.*;
import java.util.Scanner;

public class FileHandlingExample
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String fileName = "example.txt";

        try 
        {
            System.out.println("Writing to the file...");
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello! This is an example of file handling in Java.\n");
            writer.write("You can write, read, and modify files easily.\n");
            writer.close();
            System.out.println("Content written to " + fileName);
            System.out.println("\nReading from the file...");
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) 
            {
                System.out.println(line);
            }
            bufferedReader.close();
            System.out.println("\nAppending to the file...");
            FileWriter appender = new FileWriter(fileName, true);
            appender.write("Appending this new line to the existing file content.\n");
            appender.close();
            System.out.println("Content appended successfully.");
            System.out.println("\nReading the modified file...");
            reader = new FileReader(fileName);
            bufferedReader = new BufferedReader(reader);
            while ((line = bufferedReader.readLine()) != null) 
            {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) 
        {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
        System.out.println("\nFile operations completed.");
    }
}
