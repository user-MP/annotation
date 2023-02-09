package org.example;

public class Main {
    public static void main(String[] args) {


        TableLamp lamp=new TableLamp("LED table lamp K-123", 380, 120,100);

        System.out.println("Model : "+lamp.getModel());

        lamp.showProportions();


    }
}