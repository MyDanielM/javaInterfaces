package com.mydanielm;

public class Journal implements Print{

    private String name;
    public String getName() {return this.name; }

    Journal(String name)
    {
        this.name = name;
    }
    @Override
    public void print() {
        System.out.printf("%s", name);
        System.out.println();
    }
}
