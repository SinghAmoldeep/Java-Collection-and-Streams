package Streams.BufferedStreams;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\risha\\OneDrive\\Desktop\\BridgeLabz_WorkSpace\\Java_Collections_And_Streams\\src\\Streams\\BufferedStreams\\content\\input";
        String outputBufferedFile = "C:\\Users\\risha\\OneDrive\\Desktop\\BridgeLabz_WorkSpace\\Java_Collections_And_Streams\\src\\Streams\\BufferedStreams\\content\\buffered_output";
        String outputUnbufferedFile = "C:\\Users\\risha\\OneDrive\\Desktop\\BridgeLabz_WorkSpace\\Java_Collections_And_Streams\\src\\Streams\\BufferedStreams\\content\\unbuffered_output";

        System.out.println("\nCopying using Buffered Streams...");
        FileHandler.copyFileBuffered(inputFile, outputBufferedFile);

        // Copy file using Unbuffered Streams (for performance comparison)
        System.out.println("\nCopying using Unbuffered Streams...");
        FileHandler.copyFileUnbuffered(inputFile, outputUnbufferedFile);
    }
}