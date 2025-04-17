package Streams.FileHandling;

public class Main {
    public static void main(String[] args) {
        String input="C:\\Users\\risha\\OneDrive\\Desktop\\BridgeLabz_WorkSpace\\Java_Collections_And_Streams\\src\\Streams\\FileHandling\\content\\Input.txt";
        String output="C:\\Users\\risha\\OneDrive\\Desktop\\BridgeLabz_WorkSpace\\Java_Collections_And_Streams\\src\\Streams\\FileHandling\\content\\Output.txt";
        FileHandler.writeFile(output, FileHandler.readFile(input));
    }
}