package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);  // Create a Scanner object
        System.out.println("ingrese hola para continuar");
        String Name = myObject.nextLine();  // Read user input
        if (Name.equals("hola")){
            System.out.println("ingreso: " + Name);  // Output user input
        }else {
            System.out.println("no se ingreso hola, se ingreso:  "+ Name);
        }


    }
}
