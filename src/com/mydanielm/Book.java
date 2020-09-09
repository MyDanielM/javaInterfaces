package com.mydanielm;

public class Book implements Print{
    private String name;
    private String author;
    public String getName() {return this.name; }
    public String getAuthor() {return this.author; }

    Book(String name, String author)
    {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("%s (%s)", this.name, this.author);
        System.out.println();
    }
}
