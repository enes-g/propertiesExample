package org.example;

public class Main {
    public static void main(String[] args) {
        PropertiesExample propertiesExample = new PropertiesExample();
        propertiesExample.setDataProperty("name", "Enes");
        System.out.println(propertiesExample.getDataProperty("name"));
    }
}