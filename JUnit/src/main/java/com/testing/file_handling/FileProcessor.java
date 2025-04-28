package com.testing.file_handling;

import java.io.*;

public class FileProcessor {
    public static void writeToFile(String file ,String content){
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(file))){
            bw.write(content);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }


    }
    public static String readFromFile(String file){
        try(BufferedReader br=new BufferedReader(new FileReader(file))){
            return br.readLine();
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }


    }

}
