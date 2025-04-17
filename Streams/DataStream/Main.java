package Streams.DataStream;

public class Main {
    public static void main(String[] args) {
        String data="C:\\Users\\risha\\OneDrive\\Desktop\\BridgeLabz_WorkSpace\\Java_Collections_And_Streams\\src\\Streams\\DataStream\\Content\\data2.txt";
        Student s1 = new Student("Rishav", 1167, 9.4);

        DataStream.storeData(data, s1);

        Student s2 = DataStream.getData(data);

        System.out.println(s1);
        System.out.println(s2);
    }
}