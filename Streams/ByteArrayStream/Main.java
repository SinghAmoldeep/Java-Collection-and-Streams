package Streams.ByteArrayStream;

public class Main {
    public static void main(String[] args) {
        String sourceFile="C:\\Users\\risha\\OneDrive\\Desktop\\BridgeLabz_WorkSpace\\Java_Collections_And_Streams\\src\\Streams\\ByteArrayStream\\content\\src.jpg";
        String destinationFile="C:\\Users\\risha\\OneDrive\\Desktop\\BridgeLabz_WorkSpace\\Java_Collections_And_Streams\\src\\Streams\\ByteArrayStream\\content\\dest.jpg";

        ByteArrayStream.copyFile(sourceFile , destinationFile);
    }
}