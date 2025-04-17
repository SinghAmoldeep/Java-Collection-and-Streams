package Streams.DataStream;

import java.io.*;

public class DataStream {

    public static void storeData(String src, Student student) {
        // Extract the file name from the path
        String[] str = src.split("\\\\"); // Corrected splitting for Windows paths
        String fileName = str[str.length - 1];

        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(src))) {
            out.writeUTF(student.getName());
            out.writeInt(student.getRollNumber());
            out.writeDouble(student.getGpa());
            System.out.println("Data saved to " + fileName);
        } catch (IOException e) { // More specific exception
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    public static Student getData(String src) {
        Student student = null;
        try (DataInputStream in = new DataInputStream(new FileInputStream(src))) {
            String name = in.readUTF();
            int rollNumber = in.readInt();
            double gpa = in.readDouble();
            student = new Student(name, rollNumber, gpa);
        } catch (IOException e) { // More specific exception
            System.out.println("Error reading file: " + e.getMessage());
        }
        return student;
    }
}