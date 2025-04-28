package com.reflection.methodexecutiontiming;

import java.lang.reflect.Method;

public class MethodExecutionTiming {
    public static <T> void execute(Class<T> clazz) {
        try{
            T instance = clazz.getConstructor().newInstance();
            for (Method method : clazz.getMethods()) {
                method.setAccessible(true);
                long start = System.currentTimeMillis();
                method.invoke(instance);
                long timeElapsed = System.currentTimeMillis() - start;
                System.out.println(method.getName() + " took " + timeElapsed + " ms");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        MethodExecutionTiming.execute(Sample.class);
    }
}