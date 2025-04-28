package com.testing.list_operations;

import java.util.List;

public class ListManager {
    public static <T> void addElement(List<T> list , T element){
        list.add(element);

    }

    public static <T> void removeElement(List<T> list ,T element){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == element) {
                list.remove(i);
            }
        }
    }

    public static int getSize(List<?>list){
        return list.size();
    }


}
