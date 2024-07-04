package com.example.helpmeiud.service;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {

    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("Archivo creado: " + myObj.getName());
            } else {
                System.out.println("Existente.");
            }
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }
}
