package com.reflection.retrieveannotations;

public class RetrieveAnnotations {
    public static void retrieveAuthor(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Author.class)) {
            Author author = clazz.getAnnotation(Author.class);
            System.out.println(author.name());
        }
    }

    public static void main(String[] args) {
        RetrieveAnnotations.retrieveAuthor(Book.class);

    }
}