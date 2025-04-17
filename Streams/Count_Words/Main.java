package Streams.Count_Words;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String src= "C:\\Users\\risha\\OneDrive\\Desktop\\BridgeLabz_WorkSpace\\Java_Collections_And_Streams\\src\\Streams\\Count_Words\\content\\text.txt";
        Map<String, Integer> map = CountWords.count(src);
        System.out.println(map);
    }
}