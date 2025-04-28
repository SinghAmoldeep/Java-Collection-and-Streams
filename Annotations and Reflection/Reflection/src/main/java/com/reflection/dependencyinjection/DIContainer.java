package com.reflection.dependencyinjection;

import java.lang.reflect.Field;

public class DIContainer {
    public static <T> T createInstanceDI(Class<T> clazz) {
        T target = null;
        try{
            target = clazz.getConstructor().newInstance();
            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(Inject.class)) {
                    field.setAccessible(true);
                    Class<?> fieldType = field.getType();
                    field.set(target, fieldType.getConstructor().newInstance());
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return target;
    }
}
