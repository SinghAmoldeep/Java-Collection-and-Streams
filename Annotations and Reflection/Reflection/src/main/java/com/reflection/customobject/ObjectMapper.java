package com.reflection.customobject;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ObjectMapper { // Mapper
    public static Object toObject(Class<?> clazz, Map<String, Object> properties) {
        Object obj = null;
        try{
            obj = clazz.getDeclaredConstructor().newInstance();
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);
                field.set(obj, properties.get(field.getName()));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return obj;
    }

    public static void main(String[] args) {
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("name", "John");
        properties.put("age", 22);
        SampleClass scom = (SampleClass) ObjectMapper.toObject(SampleClass.class, properties);
        System.out.println(scom);
    }
}