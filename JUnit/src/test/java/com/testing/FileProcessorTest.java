package com.testing;

import com.testing.file_handling.FileProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileProcessorTest {
    private String file="C:\\Users\\risha\\OneDrive\\Desktop\\BridgeLabz_WorkSpace\\Java_Collections_And_Streams\\src\\JUnit\\src\\main\\java\\com\\testing\\file_handling\\content\\file.txt";

    @Test
    void testWrite() {
        String str = "hello brother , let's party today";
        FileProcessor.writeToFile(file, str);

        Assertions.assertEquals(str,FileProcessor.readFromFile(file));
    }
    @Test
    void testThrows(){
        Assertions.assertThrows(RuntimeException.class,()->FileProcessor.readFromFile(""));
    }
}
