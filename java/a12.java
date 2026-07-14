import java.io.*;

interface FileOperations {
    void writeFile();
    void readFile();
}

class Notes implements FileOperations {

    String fileName = "notes.txt";

    public void writeFile() {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Welcome to Java File Handling!\n");
            writer.write("Interfaces help achieve abstraction.");
            writer.close();
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public void readFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            System.out.println("\nFile Contents:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}

public class InterfaceFileHandling {
    public static void main(String[] args) {

        Notes notes = new Notes();

        notes.writeFile();
        notes.readFile();
    }
}