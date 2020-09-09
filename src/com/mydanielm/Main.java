package com.mydanielm;

interface Print {
    default void getVersion()
    {
        System.out.println("1.0.0");
    }
    void print();
}

public class Main {

    public static void main(String[] args) {
        Print book = new Book("Грокаем алгоритмы", "Адитья Бхаргава");
        book.print();
        Print journal = new Journal("Хабрахабр");
        journal.print();
        String author="";
        if( book instanceof Book) {
            author = ((Book)book).getAuthor();
        }
        System.out.println(author);
    }
}
