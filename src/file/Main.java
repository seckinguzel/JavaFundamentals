package file;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createFile();
        getFileInfo();
        readFile();
        writeFile();
    }

    public static void createFile() {
        File file = new File("C:\\Users\\seckin.guzel\\Documents\\filesWorkingForJavaStudy\\students.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("The file has been created.");
            } else {
                System.out.println("The file is already existed!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\Users\\seckin.guzel\\Documents\\filesWorkingForJavaStudy\\students.txt");

        if (file.exists()) {
            System.out.println("File name = " + file.getName());
            System.out.println("File path = " + file.getPath());
            System.out.println("Is the file writeable? " + file.canWrite());
            System.out.println("Is the file readable? " + file.canRead());
            System.out.println("File size = " + file.length());
        }
    }

    public static void readFile() {
        File file = new File("C:\\Users\\seckin.guzel\\Documents\\filesWorkingForJavaStudy\\students.txt");

        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\seckin.guzel\\Documents\\filesWorkingForJavaStudy\\students.txt")); //dosyamızın içine bir şeyler yazmak istiyorsak bu şekilde tanımlama yapıyoruz.
            writer.newLine();
            writer.write("Seckin Guzel");
            System.out.println("The file has been written.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
