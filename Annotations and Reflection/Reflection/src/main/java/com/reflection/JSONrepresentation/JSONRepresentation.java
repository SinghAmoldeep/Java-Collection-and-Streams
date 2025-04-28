package com.reflection.JSONrepresentation;

import java.lang.reflect.Field;

public class JSONRepresentation {
    public static String toJson(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            try{
                Object value = field.get(obj);
                sb.append("\"").append(fieldName).append("\":");
                if (value instanceof String) {
                    sb.append("\"").append(value).append("\"");
                } else {
                    sb.append(value);
                }
                sb.append(",");
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("}");
        return sb.toString();
    }
}