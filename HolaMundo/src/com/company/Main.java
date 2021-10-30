package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);  // Create a Scanner object
        System.out.println("ingrese hola para continuar");
        String Name = myObject.nextLine();  // Read user input
        System.out.println("ingreso: " + Name);  // Output user input
    }
}
