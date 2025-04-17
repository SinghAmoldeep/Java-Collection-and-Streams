package Streams.LineByLine;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text="C:\\Users\\risha\\OneDrive\\Desktop\\BridgeLabz_WorkSpace\\Java_Collections_And_Streams\\src\\Streams\\LineByLine\\content\\text.txt";
        List<String> lines = Reader.findLine(text, "error");

        for (String line : lines) {
            System.out.println(line);
        }
    }
}